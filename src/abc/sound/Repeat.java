package abc.sound;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a repeat in the music
 * 
 * Repeat is a less-obvious implementation of the Playable interface compared to a Note or a Chord, but this design decision
 * is critical for our representations of Measure, Voice, and Piece. By designating Repeat as a Playable object, we are able 
 * to group it with other Playable objects (notes, rests, chords, tuplets) to effectively represent measures in the music.
 */
public class Repeat implements Playable {
	// Abstraction function: isBeginRepeat maps to whether or not the repeat is a begin repeat. isEndRepeat maps to whether or not
	//							the repeat is an end repeat. hasAlternateEnding maps to whether or not the repeat has an alternate 
	//							ending to be played the second time. counter maps to the number of times the repeat object has been 
	//							encountered.
	// Rep invariant: hasAlternateEnding == true iff isEndRepeat == true, counter >= 0
	// Safety from rep exposure: all fields are private and final
	
	private final boolean isBeginRepeat;
	private final boolean isEndRepeat;
	private final boolean hasAlternateEnding;
	private final int counter;
	
	/**
	 * Constructs a Repeat
	 * @param isBeginRepeat if Repeat is a begin repeat
	 * @param isEndRepeat if Repeat is an end repeat
	 * @param hasAlternateEnding if Repeat is an end repeat that has an alternate ending
	 * @param counter number of times the repeat object has been encountered
	 */
	public Repeat(boolean isBeginRepeat, boolean isEndRepeat, boolean hasAlternateEnding, int counter) {
		this.isBeginRepeat = isBeginRepeat;
		this.isEndRepeat = isEndRepeat;
		this.hasAlternateEnding = hasAlternateEnding;
		this.counter = counter;
		checkRep();
	}
	
	/**
	 * @return true if Repeat is a begin repeat
	 */
	public boolean getIsBeginRepeat() {
		return isBeginRepeat;
	}
	
	/**
	 * @return true if Repeat is an end repeat
	 */
	public boolean getIsEndRepeat() {
		return isEndRepeat;
	}
	
	/**
	 * @return true if Repeat is an end repeat that has an alternate ending
	 */
	public boolean hasAlternateEnding() {
		return hasAlternateEnding;
	}
	
	/**
	 * @return the number of times the repeat object has been encountered
	 */
	public int counter() {
		return counter;
	}
	
	/**
	 * @return Repeat with updated counter
	 */
	public Repeat hit() {
		Repeat r = new Repeat(isBeginRepeat, isEndRepeat, hasAlternateEnding, counter+1);
		checkRep();
		return r;
	}

	@Override
	public RatNum getDuration() {
		return new RatNum(0, 1);
	}
	
	@Override
	public boolean isNote() {
		return false;
	}
	
	@Override
	public boolean isChord() {
		return false;
	}
	
	@Override
	public boolean isRepeat() {
		return true;
	}

	@Override
	public List<PlaybackNote> play(int startTick, int numTicks, RatNum defaultLength) {
		return new ArrayList<PlaybackNote>(); 
	}
	
	/**
	 * Checks the rep invariant
	 */
	private void checkRep() {
		if (hasAlternateEnding == true) assert isEndRepeat == true;
		assert counter >= 0;
	}
}
