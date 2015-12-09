package abc.sound;

import java.util.List;

/**
 * An immutable data type that represents a fundamental element of music that can appear in the body of a piece, 
 * as specified in the ABC subset for 6.005
 */
public interface Playable {
    // Datatype definition: Playable = Note (p: Pitch, d: Duration, a: Accidental) + Rest (d: Duration) 
	//								 + Chord (n: Set<Note>) + Tuplet (t: List<Playable>)
	//								 + Repeat (br: boolean, er: boolean, ha: boolean, c: int)
        
    /**
     * @return the duration of the Playable object as a reduced fraction of positive integers
     */
	public RatNum getDuration();
	
	/**
	 * @return true if the Playable object is a Note
	 */
	public boolean isNote();
	
	/**
	 * @return true if the Playable object is a Chord
	 */
	public boolean isChord();
	
	/**
	 * @return true if the Playable object is a Tuplet
	 */
	public boolean isTuplet();
	
	/**
	 * @return true if the Playable object is a Repeat
	 */
	public boolean isRepeat();
	
	/**
	 * @return list of Playbacks to be scheduled
	 */
	public List<List<Playback>> play();

	/**
	 * @return whether or not a playable is equal to another playable
	 */
	public boolean equals(Object p);
	/**
	 * @return hashCode of object
	 */
	public int hashCode();
}
