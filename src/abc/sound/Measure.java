package abc.sound;

import java.util.List;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import abc.parser.AbcLexer;
import abc.parser.AbcParser;
import abc.parser.MakeMeasure;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Represents a bar of music
 */
public class Measure {
	// Abstraction function: Represents a bar of music. List playables maps to the list of Playable objects associated with the measure. beginRepeat maps to 
	//							whether or not a begin repeat bar is associated with the measure. endRepeat maps to whether or not an end repeat is associated 
	//							with the measure. hasAlternateEnding maps to whether or not the repeated section has a different ending when it is played the 
	//							second time.
	// Rep invariant: - playables must be non-empty and non-null
	//				  - hasAlternateEnding can be true iff endRepeat is true
	// Safety from rep exposure: - all fields are private and final
	//							 - getPlayables() returns a defensively copied list with an unmodifiableList wrapper
	
	private final List<Playable> playables;
	private final boolean beginRepeat;
	private final boolean endRepeat;
	private final boolean hasAlternateEnding;
	
	public Measure(List<Playable> playables, boolean beginRepeat, boolean endRepeat, boolean hasAlternateEnding) {
		if (beginRepeat || endRepeat) {
			playables.add(0, new Repeat(beginRepeat, endRepeat, hasAlternateEnding, 0));
		}
		this.playables = playables;
		this.beginRepeat = beginRepeat;
		this.endRepeat = endRepeat;
		this.hasAlternateEnding = hasAlternateEnding;
	}
	
	public List<Playable> getPlayables() {
		return Collections.unmodifiableList(new ArrayList<Playable>(playables));
	}
	
	public boolean getBeginRepeat() {
		return beginRepeat;
	}
	
	public boolean getEndRepeat() {
		return endRepeat;
	}
	
	public boolean getHasAlternateEnding() {
		return hasAlternateEnding;
	}
	
	public List<PlaybackNote> play(int startTick, int numTicks, RatNum defaultLength) {
		List<Playable> toPlay = new ArrayList<Playable>(playables);
		List<PlaybackNote> playbackNotes = new ArrayList<PlaybackNote>();
 		if (toPlay.get(0).isRepeat()) {
 			toPlay.remove(0);
 		}
 		// TODO handle changing startTicks
 		// TODO handle accidentals
		for (Playable playable : toPlay) {
			playbackNotes.addAll(playable.play(startTick, numTicks, defaultLength));
		}
		return playbackNotes;
	}
	/*
	public static Measure parse(String input){
        try{
            CharStream stream = new ANTLRInputStream(input);
            AbcLexer lexer = new AbcLexer(stream);
            TokenStream tokens = new CommonTokenStream(lexer);
            AbcParser parser = new AbcParser(tokens);
            lexer.reportErrorsAsExceptions();
            parser.reportErrorsAsExceptions();
            ParseTree tree = parser.root();
            
            //TODO call it MakePiece?
            MakeMeasure measureMaker = new MakeMeasure();
            new ParseTreeWalker().walk(measureMaker, tree);
           
            
            
        } catch (RuntimeException e){
            throw new IllegalArgumentException("not a valid Piece");
        }
    }*/
}
