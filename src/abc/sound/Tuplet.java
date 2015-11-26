package abc.sound;

import java.util.List;

public class Tuplet implements Playable {
	// Abstraction function:
	// Safety from rep exposure:
	
	private final TupletType type;
	private final List<Note> notes;
	
	// Rep invariant:
	private void checkRep() {
		// TODO: check that there are no rests (chords are allowed)
	}
	
	public Tuplet(TupletType type, List<Note> notes) {
		this.type = type;
		this.notes = notes;
		checkRep();
	}
	
	public RatNum getDuration() {
		return new RatNum(0, 1); // placeholder
	}
}
