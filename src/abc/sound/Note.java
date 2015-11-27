package abc.sound;

public class Note implements Playable {
	// Abstraction function: Note represents a note with pitch pitch that lasts for duration beats.
	// Safety from rep exposure: 
	
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
}
