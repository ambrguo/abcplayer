package abc.sound;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a note in the music
 */
public class Note implements Playable {
	// Abstraction function: Note represents a note with Pitch pitch and Accidental accidental that lasts for duration beats.
    // Rep invariant: pitch is non-null, accidental is non-null duration > 0
	// Safety from rep exposure: all fields are private and final 
	
	private final Pitch pitch;
	private final RatNum duration;
	private Accidental accidental;
	
	/**
	 * Constructs a Note with Pitch pitch, RatNum duration, and Accidental accidental
	 * @param pitch the pitch of the note
	 * @param duration the length of the note in beats
	 * @param accidental the accidental of the note
	 */
	public Note(Pitch pitch, RatNum duration, Accidental accidental) {
		this.pitch = pitch;
		this.duration = duration;
		this.accidental = accidental;
		checkRep();
	}
	
	/**
	 * @return the pitch of the note
	 */
	public Pitch getPitch() {
		return pitch;
	}
	
	/**
	 * @return the accidental of the note
	 */
	public Accidental getAccidental() {
		return accidental;
	}
	
	public void setAccidental(Accidental a) {
		accidental = a;
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
    public boolean isTuplet() {
    	return false;
    }
    
    @Override
    public boolean isRepeat() {
    	return false;
    }
    
    @Override
    public List<PlaybackNote> play(int startTick, int numTicks, RatNum defaultLength) {
    	List<PlaybackNote> playbackNotes = new ArrayList<PlaybackNote>();
    	switch (accidental) {
    		case NONE: playbackNotes.add(new PlaybackNote(pitch, startTick, numTicks));
    			break;
    		case DOUBLESHARP: playbackNotes.add(new PlaybackNote(pitch.transpose(2), startTick, numTicks));
    			break;
    		case SHARP: playbackNotes.add(new PlaybackNote(pitch.transpose(1), startTick, numTicks));
    			break;
    		case NATURAL: playbackNotes.add(new PlaybackNote(pitch, startTick, numTicks));
    			break;
    		case FLAT: playbackNotes.add(new PlaybackNote(pitch.transpose(-1), startTick, numTicks));
    			break;
    		case DOUBLEFLAT: playbackNotes.add(new PlaybackNote(pitch.transpose(-2), startTick, numTicks));
    			break;
    	}
    	return playbackNotes;
    }
    
    @Override
    public boolean equals(Object that) {
    	if (!(that instanceof Note)) return false;
    	Note thatNote = (Note) that;
    	return (this.pitch).equals(thatNote.pitch) && (this.duration).equals(thatNote.duration)
    			&& (this.accidental).equals(thatNote.accidental);
    }
    
    @Override
    public int hashCode() {
    	return pitch.hashCode()*duration.hashCode();
    }
    
    /**
     * Checks the rep invariant
     */
	private void checkRep() {
		assert pitch != null;
		assert accidental != null;
		assert duration.getNumerator() > 0;
	}
}
