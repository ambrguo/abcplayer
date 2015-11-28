package abc.sound;
/*
 * Implementation of Playable
 */
import java.util.Set;
import java.util.Map;
import java.util.HashSet;
import java.util.Collections;
import java.util.HashMap;

public class Chord implements Playable {
	// Abstraction function: Chord represents a chord consisting of the set notes.
    // Rep invariant: notes contains at least 2 non-null notes
	// Safety from rep exposure: all fields are private and final
	
	private final Set<Note> notes;
	private void checkRep() {
		assert notes.size() >= 2;
		for (Note note : notes) {
			assert note != null;
		}
	}
	/**
	 * class constructor
	 */
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
	
	public boolean isChord(){
	    return true;
	}

    public boolean isNote() {
        return false;
    }
}
