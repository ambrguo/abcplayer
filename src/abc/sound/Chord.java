package abc.sound;

import java.util.Set;
import java.util.Map;
import java.util.HashSet;
import java.util.Collections;
import java.util.HashMap;

public class Chord implements Playable {
	// Abstraction function:
	// Safety from rep exposure:
	
	private Set<Note> notes;
	
	// Rep invariant:
	private void checkRep() {
		assert notes.size() >= 2;
	}
	
	public Chord(Set<Note> notes) {
		this.notes = new HashSet<Note>(notes);
		checkRep();
	}
	
	public Set<Note> getNotes() {
		return new HashSet<Note>(notes);
	}
	
	public RatNum getDuration() {
		Map<Double, RatNum> durations = new HashMap<>();
		for (Note note : notes) {
			RatNum rn = note.getDuration();
			Double d = rn.toDouble();
			durations.put(d, rn);
		}
		Double max = Collections.max(durations.keySet());
		return durations.get(max);
	}
}
