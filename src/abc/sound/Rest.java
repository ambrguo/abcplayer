package abc.sound;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
	public boolean isTuplet() {
		return false;
	}

	@Override
	public boolean isRepeat() {
		return false;
	}
	
	@Override
	public List<List<Playback>> play() {
		List<List<Playback>> playRest = new ArrayList<List<Playback>>();
		List<Playback> restPlayback = new ArrayList<>();
		restPlayback.add(new Playback(Optional.empty(), Accidental.NONE, duration));
		playRest.add(restPlayback);
		return playRest;
	}
	
	@Override
	public boolean equals(Object thatObject) {
		if (!(thatObject instanceof Rest)) return false;
		Rest that = (Rest) thatObject;
		return (this.duration).equals(that.duration);
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
