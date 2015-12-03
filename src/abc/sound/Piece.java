package abc.sound;



import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

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

import abc.parser.*;



public class Piece {
	private final Set<Voice> voices;
	
	
	public Piece(Set<Voice> voices) {
		this.voices = voices;

	}
	
	public List<Voice> getVoices() {
		return new ArrayList<Voice>(voices);
	}
	
	
	
	
	public SequencePlayer play() throws MidiUnavailableException, InvalidMidiDataException {
		int bpm = 0; // TODO initialize
		int tpb = 0; // TODO initialize
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
	 * 
	 * @param inputFile
	 */
	//must change return type to piece 
	public static void parse(String inputFile) throws IOException{
	    
	    String[] headerBody = fileSplitter(inputFile);
	    
	    //processing the header 
	    
	    
	    
	    String header = headerBody[0];

        try{
            CharStream stream = new ANTLRInputStream(header);
            XyzLexer lexer = new XyzLexer(stream);
            TokenStream tokens = new CommonTokenStream(lexer);
            XyzParser parser = new XyzParser(tokens);
            lexer.reportErrorsAsExceptions();
            parser.reportErrorsAsExceptions();
            ParseTree tree = parser.root();
            
            Trees.inspect(tree, parser);
            
//            //TODO call it MakePiece?
//            MakeHeader measureMaker = new MakeHeader();
//            new ParseTreeWalker().walk(measureMaker, tree);
//            //TODO, return measure?
          
        } catch (RuntimeException e){
            throw new IllegalArgumentException("not a valid Piece");
        }
        
        String body = headerBody[1];
        
        try{
            CharStream stream = new ANTLRInputStream(body);
            AbcLexer lexer = new AbcLexer(stream);
            TokenStream tokens = new CommonTokenStream(lexer);
            AbcParser parser = new AbcParser(tokens);
            lexer.reportErrorsAsExceptions();
            parser.reportErrorsAsExceptions();
            ParseTree tree = parser.root();
            
            Trees.inspect(tree, parser);
            
//            //TODO call it MakePiece?
//            MakeBody measureMaker = new MakeBody();
//            new ParseTreeWalker().walk(measureMaker, tree);
//            //TODO, return measure?
          
        } catch (RuntimeException e){
            throw new IllegalArgumentException("not a valid Piece");
        }
        
        return;
                
    }
	
	private static final String KEY_PREFIX = "K:";
	/**
	 * 
	 * @param file valid abc file 
	 * @return string array where the 0 index corresponds to the header and 1 index corresponds to
	 * the body 
	 * @throws IOException when file not found or when currentLine is null 
	 */
	private static String[] fileSplitter(String file) throws IOException{
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
            body += currentLine + "\n";
        }
        
        r.close();
        
        String[] headerBody = {header, body};
        return headerBody;
	}
	
	
	
}
