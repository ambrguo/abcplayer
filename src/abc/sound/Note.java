package abc.sound;
/*
 * implementation of Playable
 */
public class Note implements Playable {
	// Abstraction function: Note represents a note with Pitch pitch that lasts for duration beats.
    // Rep invariant: pitch is non-null, duration > 0
	// Safety from rep exposure: all fields are private and final 
	
	private final Pitch pitch;
	private final RatNum duration;
	
	// Rep invariant: pitch is non-null, duration > 0
	private void checkRep() {
		assert pitch != null;
		assert duration.getNumerator() > 0;
	}
	
	public Note(Pitch pitch, RatNum duration) {
		this.pitch = pitch;
		this.duration = duration;
		checkRep();
	}
	
	public Pitch getPitch() {
		return pitch;
	}
	
	public RatNum getDuration() {
		return duration;
	}
	
	public boolean isNote(){
	    return true;
	}

    public boolean isChord() {
        return false;
    }
}
