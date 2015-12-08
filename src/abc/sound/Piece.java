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
		List<Integer> ticks = new ArrayList<>();
		for (Voice voice : voices) {
			ticks.add(Integer.valueOf(voice.computeTicks()));
		}
		return Collections.max(ticks);
	}
	
	public SequencePlayer play() throws MidiUnavailableException, InvalidMidiDataException {
		int bpm = header.getTempo();
		int tpb = computeTicks();
		SequencePlayer sp = new SequencePlayer(bpm, tpb);
		for (Voice voice : voices) {
			List<PlaybackNote> playbackNotes = voice.play();
			for (PlaybackNote playbackNote: playbackNotes) {
				sp.addNote(playbackNote.pitch().toMidiNote(), playbackNote.start(), playbackNote.ticks());
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
       
        try{
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
          
        } catch (RuntimeException e){
            throw new IllegalArgumentException("not a valid Piece");
        }
        
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
