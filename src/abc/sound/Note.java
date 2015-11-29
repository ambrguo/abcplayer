package abc.sound;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a note in the music
 */
public class Note implements Playable {
	// Abstraction function: Note represents a note with Pitch pitch that lasts for duration beats
    // Rep invariant: pitch is non-null, duration > 0
	// Safety from rep exposure: all fields are private and final 
	
	private final Pitch pitch;
	private final RatNum duration;
	
	public Note(Pitch pitch, RatNum duration) {
		this.pitch = pitch;
		this.duration = duration;
		checkRep();
	}
	
	public Pitch getPitch() {
		return pitch;
	}
	
	@Override 
	public RatNum getDuration() {
		return duration;
	}
	
	@Override 
	public boolean isNote(){
	    return true;
	}

    @Override 
    public boolean isChord() {
        return false;
    }
    
    @Override
    public List<PlaybackNote> play(int startTick, int numTicks, RatNum defaultLength) {
    	List<PlaybackNote> playbackNotes = new ArrayList<PlaybackNote>();
    	// TODO accidentals
    	playbackNotes.add(new PlaybackNote(pitch, startTick, numTicks));
    	return playbackNotes;
    }
    
	private void checkRep() {
		assert pitch != null;
		assert duration.getNumerator() > 0;
	}
}
