package abc.sound;

public class Note implements Playable {
	// Abstraction function:
	// Safety from rep exposure:
	
	private final Pitch pitch;
	private final RatNum duration;
	
	// Rep invariant:
	private void checkRep() {
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
