package abc.sound;

public class Rest implements Playable {
	// Abstraction function:
	// Safety from rep exposure:
	
	private final RatNum duration;
	
	// Rep invariant:
	private void checkRep() {
		assert duration.getNumerator() > 0;
	}
	
	public Rest(RatNum duration) {
		this.duration = duration;
		checkRep();
	}
	
	public RatNum getDuration() {
		return duration;
	}
}
