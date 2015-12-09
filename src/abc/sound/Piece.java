package abc.sound;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;

import org.antlr.v4.gui.Trees;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
//import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import abc.parser.*;

/**
 * Piece is a top-level abstraction representing a piece of music.
 */
public class Piece {
	// Abstraction function: Piece represents a piece of music with set voices mapping to the voices in the piece
	// Rep invariant: voices is a non-empty set of non-null voices
	// Safety from rep exposure: - all fields are private and final
	//							 - getVoices() returns a defensively copied set with an unmodifiableSet wrapper 
	
	private final Set<Voice> voices;
	private final Header header;
	/**
	 * @return if a piece is equal to piece
	 */
	@Override
	public boolean equals (Object p){
	    if (!(p instanceof Piece))return false;
	    Piece piece = (Piece)p;
	    
	    if (this.voices.equals(piece.getVoices())){
	        System.out.println("works");
	        return true;
	    }
	    System.out.println("no");
	    return false;
	}
	/**
	 * Constructs a Piece with set voices
	 * @param voices set of voices in the piece
	 */
	public Piece(Set<Voice> voices, Header header) {
		this.voices = voices;
		this.header = header;
		checkRep();
	}
	
	/**
	 * @return the set of voices in the Piece
	 */
	public Set<Voice> getVoices() {
		return Collections.unmodifiableSet(new HashSet<Voice>(voices));
	}
	
	public int computeTicks() {
		List<Integer> tickList = new ArrayList<>();
		for (Voice voice : voices) {
			tickList.add(voice.computeTicks());
		}
		int lcm = -1;
		for (int i = 0; i < tickList.size(); i++) {
			int t = tickList.get(i);
			if (i == 0) lcm = t;
			else {
				lcm = lcm(lcm, t);
			}
		}
		return lcm;
	}
	
	private int lcm(int a, int b) {
		if (a < 0 || b < 0) throw new IllegalArgumentException();
		int gcd = gcd(a, b);
		return a*b/gcd;
	}
	
	private int gcd(int p, int q) {
		if (p < 0 || q < 0) throw new IllegalArgumentException();
		if (q == 0) return p;
		else return gcd(q, p%q);
	}
	
	public SequencePlayer play() throws MidiUnavailableException, InvalidMidiDataException {
		int bpm = header.getTempo();
		int tpb = computeTicks();
		Set<Note> keysignotes; //do something about matching the keysig to the set of notes with accidentals
		SequencePlayer sp = new SequencePlayer(bpm, tpb);
		
		int tick;
		
		for (Voice voice : voices) {
		    tick = 0;
		    Object indexStartRepeat = null; 
		    Object indexEndRepeat = null;
		    Object indexFirstAlternate = null;
		    Object indexSecondAlternate = null;
		    for (int index = 0; index < voice.getMeasure().size(); index++){
		        Measure measure = voice.getMeasure().get(index);
		        if (measure.getBeginRepeat()){
		            indexStartRepeat = index;
		            for (Playable p: measure.getPlayables()){
		           
		                if (p.isRepeat()) continue;
		                if (p.isNote()){
		                    int transpose = 0;
		                    Note note = (Note) p;
		                    int num_ticks = p.getDuration().multiply(new RatNum(tpb,1)).toDouble().intValue();
		                    if (note.getAccidental()!=Accidental.NONE){
		                        //TODO something about changing semitones with transpose 
		                    } else {
		                        if (keysignotes.contains(note)){
		                            //TODO change transpose based on the ones in the keysignature 
		                        }
		                    }
		                    sp.addNote(note.getPitch().transpose(transpose).toMidiNote(), tick, num_ticks);
		                    
		                }
		            }
		        }
		        if (measure.getEndRepeat()){
		            indexEndRepeat = index;
		            
		        } 
		        if (measure.getFirstAlternate()){
		            indexFirstAlternate = index;
		        }
		        if (measure.getSecondAlternate()){
		            indexSecondAlternate = index;
		        }
		        
		    }
			
		}
		return sp;
	}
	
	/**
	 * Parse a piece.
	 * @param inputFile file of piece to parse
	 */
	//must change return type to piece 
	
	public static Piece parse(String inputFile) throws IOException{
	    
	    String[] headerBody = fileSplitter(inputFile);
	    
	    // Process header 	    
	    Header head;
	    Set<Voice> voicesSet;

        head = Header.parse(inputFile);
        
        String body = headerBody[1];
       
        /*try{*/
            CharStream stream = new ANTLRInputStream(body);
            AbcLexer lexer = new AbcLexer(stream);
            TokenStream tokens = new CommonTokenStream(lexer);
            AbcParser parser = new AbcParser(tokens);
            lexer.reportErrorsAsExceptions();
            parser.reportErrorsAsExceptions();
            ParseTree tree = parser.root();
            
            //Trees.inspect(tree, parser);
            
            MakeBody bodyMaker = new MakeBody();
            new ParseTreeWalker().walk(bodyMaker, tree);
            
            voicesSet = bodyMaker.getVoices();
          
        /*} catch (RuntimeException e){
            throw new IllegalArgumentException("not a valid Piece");
        }*/
        
        Piece piece = new Piece(voicesSet, head);
        return piece;
                
    }
	
	private static final String KEY_PREFIX = "K:";
	
	/**
	 * Splits the file into header and body.
	 * @param file valid abc file 
	 * @return string array where the 0 index corresponds to the header and 1 index corresponds to
	 * the body 
	 * @throws IOException when file not found or when currentLine is null 
	 */
	public static String[] fileSplitter(String file) throws IOException {
	    String header = "";
	    String body = "";
	    String currentLine;
        BufferedReader r = new BufferedReader(new FileReader(file));
        
        while ((currentLine = r.readLine()) != null){
            if (!currentLine.startsWith(KEY_PREFIX)){
                header += currentLine + "\n";
            } else {
                header += currentLine + "\n";
                break;
            }
        }
        
        body += "\n";
        while ((currentLine = r.readLine()) != null){
            body +=  currentLine + "\n";
        }
        
        
        r.close();
        
        String[] headerBody = {header, body};
        return headerBody;
	}
	
	/**
	 * Checks the rep invariant
	 */
	private void checkRep() {
		assert !voices.isEmpty();
		for (Voice v : voices) {
			assert v != null;
			assert this.header.getVoices().contains(v.getName());
		}
	
	}
}
