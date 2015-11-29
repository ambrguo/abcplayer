package abc.sound;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents an immutable Tuplet object. A tuplet is a consecutive group of notes that are to be played 
 * for a duration that is either greater or less than the sum of the individual notes within that group.
 * This class only handles duplets (2 notes in the time of 3 notes), triplets (3 notes in the time of 2 notes),
 * and quadruplets (4 notes in the time of 3 notes). A tuplet may not contain rests, but it may contain chords.
 * A tuplet may have notes and chords of different lengths.
 */
public class Tuplet implements Playable {
	// Abstraction function: Tuplet represents a tuplet that consists of a list of Playables.
    // Rep invariant: playables consists of either 2, 3, or 4 Playables of type Chord or Note
	// Safety from rep exposure: all fields are private and final

	private final List<Playable> playables;
	private final TupletType type;

	public Tuplet(TupletType type, List<Playable> playables) {
		this.type = type;
		this.playables = playables;
		checkRep();
	}
	
	@Override
	public RatNum getDuration() {
		RatNum duration = new RatNum(0, 1);
		switch (type) {
			case DUPLET: for (Playable p : playables) {
				duration.add(p.getDuration().multiply(new RatNum(3, 2))); 
				}
				break;
			case TRIPLET: for (Playable p : playables) {
				duration.add(p.getDuration().multiply(new RatNum(2, 3)));
			 	}
				break;
			case QUADRUPLET: for (Playable p : playables) {
				duration.add(p.getDuration().multiply(new RatNum(3, 4)));
			 	}
				break;
		}
		return duration;
	}
	
	@Override
    public boolean isChord() {
        return false;
    }
	
	@Override
    public boolean isNote() {
        return false;
    }
	
	@Override
	public List<PlaybackNote> play(int start, int ticks, RatNum defaultLength) {
		List<PlaybackNote> playbackNotes = new ArrayList<PlaybackNote>();
		int now = start;
		for (Playable playable : playables) {
			playbackNotes.addAll(playable.play(now, ticks, defaultLength));
			int increment = 0; // TODO calculate
			now += increment;
		}
		return playbackNotes;
	}
    
	private void checkRep() {
		assert playables.size() >= 2 && playables.size() <= 4;
	    for (Playable playable:playables){
	        assert (playable.isChord() || playable.isNote());
	    }
	}
}
