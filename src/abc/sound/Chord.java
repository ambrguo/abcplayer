package abc.sound;

import java.util.Set;
import java.util.Map;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 * Represents a chord in the music
 */
public class Chord implements Playable {
	// Abstraction function: Chord represents a chord consisting of the set notes.
    // Rep invariant: notes contains at least 2 non-null notes
	// Safety from rep exposure: - all fields are private and final
	//							 - getNotes() returns a defensively copied set with an unmodifiableSet wrapper 
	
	private final Set<Note> notes;
	
	/**
	 * Constructs a Chord with set notes
	 * @param notes set of notes to be played simultaneously in the chord
	 */
	public Chord(Set<Note> notes) {
		this.notes = new HashSet<Note>(notes);
		checkRep();
	}
	
	/**
	 * @return the set of notes in the chord
	 */
	public Set<Note> getNotes() {
		return Collections.unmodifiableSet(new HashSet<Note>(notes));
	}
	
	@Override
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
	
	@Override
    public boolean isNote() {
        return false;
    }
	
	@Override
	public boolean isChord() {
	    return true;
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
	public boolean equals(Object that) {
		if (!(that instanceof Chord)) return false;
		Chord thatChord = (Chord) that;
		return notes.equals(thatChord.notes);
	}
	
	@Override
	public int hashCode() {
		int hc = 1;
		for (Note note : notes) {
			hc *= note.hashCode();
		}
		return hc;
	}
    
	/**
	 * Checks the rep invariant
	 */
    private void checkRep() {
		assert notes.size() >= 2;
		for (Note note : notes) {
			assert note != null;
		}
	}

 
}
