package abc.sound;

import java.util.ArrayList;
import java.util.List;

public class Repeat implements Playable {
	// Abstraction function: TODO
	// Rep invariant: TODO
	// Safety from rep exposure: TODO
	
	private final boolean isBeginRepeat;
	private final boolean isEndRepeat;
	private final boolean hasAlternateEnding;
	private final int counter;
	
	public Repeat(boolean isBeginRepeat, boolean isEndRepeat, boolean hasAlternateEnding, int counter) {
		this.isBeginRepeat = isBeginRepeat;
		this.isEndRepeat = isEndRepeat;
		this.hasAlternateEnding = hasAlternateEnding;
		this.counter = counter;
	}
	
	public boolean getIsBeginRepeat() {
		return isBeginRepeat;
	}
	
	public boolean getIsEndRepeat() {
		return isEndRepeat;
	}
	
	public boolean hasAlternateEnding() {
		return hasAlternateEnding;
	}
	
	public Integer counter() {
		return counter;
	}
	
	public Repeat hit() {
		return new Repeat(isBeginRepeat, isEndRepeat, hasAlternateEnding, counter+1);
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
}
