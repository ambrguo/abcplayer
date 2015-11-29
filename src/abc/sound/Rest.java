package abc.sound;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents an immutable Rest object.
 */
public class Rest implements Playable {
	// Abstraction function: Rest represents a rest that lasts for duration beats
	// Rep invariant: duration > 0
	// Safety from rep exposure: all fields are private and final
	
	private final RatNum duration;

	public Rest(RatNum duration) {
		this.duration = duration;
		checkRep();
	}
	
	@Override
	public RatNum getDuration() {
		return duration;
	}
	
	@Override
    public boolean isChord() {
        return false;
    }

	@Override
    public boolean isNote() {
        return false;
    }
    
	@Override
    public List<PlaybackNote> play(int start, int ticks, RatNum defaultLength) {
    	return new ArrayList<PlaybackNote>();
    }
    
	private void checkRep() {
		assert duration.getNumerator() > 0;
	}
}
