package abc.sound;
import abc.parser.*;


import java.util.ArrayList;
import java.util.List;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

public class Piece {
	private final List<Voice> voices;
	
	public Piece(List<Voice> voices) {
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
	
	public static Piece parse(String input){
	    try{
	        CharStream stream = new ANTLRInputStream(input);
	        AbcLexer lexer = new AbcLexer(stream);
	        TokenStream tokens = new CommonTokenStream(lexer);
	        AbcParser parser = new AbcParser(tokens);
	        lexer.reportErrorsAsExceptions();
	        parser.reportErrorsAsExceptions();
	        ParseTree tree = parser.root();
	        
	        //TODO call it MakePiece?
	        MakePiece pieceMaker = new MakePiece();
	        new ParseTreeWalker().walk(pieceMaker, tree);
	       
	        
	        
	    } catch (RuntimeException e){
	        throw new IllegalArgumentException("not a valid Piece");
	    }
	}
	
	
}
