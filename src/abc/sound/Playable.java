package abc.sound;

import java.util.List;

/**
 * Playable represents a piece of music being played.
 */
public interface Playable {
    // Datatype definition: Playable = Note (p: Pitch, d: Duration) + Rest (d: Duration) 
	//								 + Chord (n: Set<Note>) + Tuplet (t: List<Playable>)
        
    /**
     * @return duration of the Playable object as a rational number RatNum
     */
	public RatNum getDuration();
	
	/**
	 * @return true if the Playable object is a Chord
	 */
	public boolean isChord();
	
	/**
	 * @return true if the Playable object is a Note
	 */
	public boolean isNote();
	
	/**
	 * @param start tick at which the SequencePlayer will begin playing the Playable object
	 * @param ticks number of ticks in a default note
	 * @param defaultLength length of a default note
	 * @return a list of PlaybackNote objects containing the data needed to play the Playable object
	 */
	public List<PlaybackNote> play(int start, int ticks, RatNum defaultLength);
}
