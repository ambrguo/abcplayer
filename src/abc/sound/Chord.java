package abc.sound;

import java.util.List;
import java.util.ArrayList;

/**
 * Represents a chord in the music
 */
public class Chord implements Playable {
	// Abstraction function: Chord represents a chord consisting of the set notes
    // Rep invariant: notes contains at least 2 non-null notes
	// Safety from rep exposure: - all fields are private and final
	//							 - getNotes() returns a defensively copied set with an unmodifiableSet wrapper 
	
	private final List<Note> notes;
	
	/**
	 * Constructs a Chord with set notes
	 * @param notes2 set of notes to be played simultaneously in the chord
	 */
	public Chord(List<Note> notes2) {
		this.notes = new ArrayList<Note>(notes2);
		checkRep();
	}
	
	/**
	 * @return the set of notes in the chord
	 */
	public List<Note> getNotes() {
	    return new ArrayList<Note>(notes);
	}
	
	/**
	 * @return the duration of the chord, as determined by the duration of the first note of the chord
	 */
	@Override
	public RatNum getDuration() {
	    RatNum first = notes.get(0).getDuration();
		return first;
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
	public List<List<Playback>> play() {
		List<List<Playback>> playChord = new ArrayList<List<Playback>>();
		List<Playback> chordPlayback = new ArrayList<>();
		for (Note note : notes) {
			for (List<Playback> notePlayback : note.play()) {
				chordPlayback.add(notePlayback.get(0));
			}
		}
		playChord.add(chordPlayback);
		return playChord;
	}
	
	@Override
	public boolean equals(Object thatObject) {
		if (!(thatObject instanceof Chord)) return false;
		Chord that = (Chord) thatObject;
		return notes.equals(that.notes);
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
