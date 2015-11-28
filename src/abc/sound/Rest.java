package abc.sound;
/*
 * Implementation of Playable
 */
public class Rest implements Playable {
	// Abstraction function: Rest represents a rest that lasts for duration beats.  
	// Safety from rep exposure: all fields are private and final
	
	private final RatNum duration;
	
	// Rep invariant: duration > 0
	private void checkRep() {
		assert duration.getNumerator() > 0;
	}
	/**
	 * class constructor
	 */
	public Rest(RatNum duration) {
		this.duration = duration;
		checkRep();
	}
	public RatNum getDuration() {
		return duration;
	}

    public boolean isChord() {
        return false;
    }

    public boolean isNote() {
        return false;
    }
}
