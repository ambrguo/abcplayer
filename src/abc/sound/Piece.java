package abc.sound;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;

//import org.antlr.v4.gui.Trees;
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
	        return true;
	    }
	    return false;
	}
	/**
	 * Constructs a Piece with set voices
	 * @param voices set of voices in the piece
	 */
	public Piece(Set<Voice> voices, Header header) {
		this.voices = voices;
		this.header = header;
		//checkRep();
	}
	
	/**
	 * @return the set of voices in the Piece
	 */
	public Set<Voice> getVoices() {
		return Collections.unmodifiableSet(new HashSet<Voice>(voices));
	}
	
	/**
	 * ticks needed 
	 * @return ticks int
	 */
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
//		if (a < 0 || b < 0) throw new IllegalArgumentException();
		int gcd = gcd(a, b);
		return a*b/gcd;
	}
	
	private int gcd(int p, int q) {
//		if (p < 0 || q < 0) throw new IllegalArgumentException();
		if (q == 0) return p;
		else return gcd(q, p%q);
	}
	/**
	 * maps accidental to its semitones transpose 
	 * @param a Accidental 
	 * @return semitones transpose 
	 */
	private int transposeAccidental(Accidental a){
	    int semitones = 0;
	    switch (a) {
	    case NONE: break;
	    case NATURAL: break;
	    case SHARP: semitones = 1;
	    break;
	    case FLAT: semitones = -1;
	    break;
	    case DOUBLESHARP: semitones = 2;
	    break;
	    case DOUBLEFLAT: semitones = -2;
	    break;
	    }
	    return semitones;
	}
	
	/**
	 * checks if pitch is of a class that would be affected by the key signature
	 * maps to the key signature changes and returns the semitones transposed 
	 * @param p pitch 
	 * @return semitones int 
	 */
	private int transposeKeySignature(Pitch p) {
	    Key k = this.header.getKeySignature();
	    
	    String letter;
	    
	    String check = p.toString();
	    
	    if (check.contains("C")){
	        letter = "C";
	    } else if (check.contains("D")){
	        letter = "D";
	    } else if (check.contains("E")){
	        letter = "E";
	    } else if (check.contains("F")){
	        letter = "F";
	    } else if (check.contains("G")){
	        letter = "G";    
	    } else if (check.contains("A")){
	        letter = "A";
	    } else if (check.contains("B")){
	        letter = "B";
	    } else {
	        return 0;
	    }
	    
	    
	    Map<String, Accidental> map = KeySwitch.keySwitch(k);
	    
	    if (map.keySet().contains(letter)){
	        Accidental a = map.get(letter);
	        return transposeAccidental(a);
	    }
	    
	    return 0;
	}

	/**
	 * 
	 * @return Squenceplayer of all the notes in the piece 
	 * @throws MidiUnavailableException
	 * @throws InvalidMidiDataException
	 */
	public SequencePlayer play() throws MidiUnavailableException, InvalidMidiDataException {
		int bpm = header.getTempo();
		System.out.println(bpm);
		
		int tpb = computeTicks();
		System.out.println("tpb:" + tpb);

	
		SequencePlayer sp = new SequencePlayer(bpm, tpb);
		
		int tick;
		
		for (Voice v : this.getVoices()){
		    tick = 0;
		    for (List<Playback> list : v.play()){
		        int span = new Double(list.get(0).getDuration().toDouble()*tpb).intValue();
		        for (Playback p : list){
		            if (p.hasPitch()){
		                //is something being played 
		                int transpose = 0;
		                Pitch pitch = p.getPitch();
		                int numTicks = new Double(p.getDuration().toDouble()*tpb).intValue();
		                if (p.getAccidental() != Accidental.NONE){
		                    transpose = transposeAccidental(p.getAccidental());  
		                } else {
		                    transpose = transposeKeySignature(pitch);
		                }
		                sp.addNote(pitch.transpose(transpose).toMidiNote(), tick, numTicks);
		            } else if (!p.hasPitch()){
		                //is rest 
		                break;
		            }
		        }
		        tick += span ;
		    }
		}
		
		return sp;
		
		
	}
	
	/**
	 * Parse a piece.
	 * 
	 * @param inputFile file of piece to parse.  Require every measure to end with a barline. 
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
}
	
//	/**
//	 * Checks the rep invariant
//	 */
//	private void checkRep() {
//		assert !voices.isEmpty();
//		for (Voice v : voices) {
//			assert v != null;
//			assert this.header.getVoices().contains(v.getName());
//		}
//	
//	}
//}
