package abc.sound;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a rest in the music
 */
public class Rest implements Playable {
	// Abstraction function: Rest represents a rest that lasts for duration beats
	// Rep invariant: duration > 0
	// Safety from rep exposure: all fields are private and final
	
	private final RatNum duration;
	
	/**
	 * Constructs a rest with RatNum duration
	 * @param duration the length of the rest in beats
	 */
	public Rest(RatNum duration) {
		this.duration = duration;
		checkRep();
	}
	
	@Override
	public RatNum getDuration() {
		return duration;
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
		return false;
	}
    
	@Override
    public List<PlaybackNote> play(int start, int ticks, RatNum defaultLength) {
    	return new ArrayList<PlaybackNote>();
    }
	
	@Override
	public boolean equals(Object that) {
		if (!(that instanceof Rest)) return false;
		Rest thatRest = (Rest) that;
		return (this.duration).equals(thatRest.duration);
	}
	
	@Override
	public int hashCode() {
		return duration.hashCode();
	}
    
	/**
	 * Checks the rep invariant
	 */
	private void checkRep() {
		assert duration.getNumerator() > 0;
	}
}
