package abc.sound;

/**
 * Playable represents a piece of music being played
 * @author Jessica
 *
 */
public interface Playable {
    // Datatype definition: Playable = Note(p: Pitch, d: Duration) + 
    //  Rest(d: Duration) + Chord(n: Set<Note>)+ Tuplet(t: List<Playable>)
    
    
    // TODO: play()
    
    /**
     * @return duration of Playable as a rational number RatNum
     */
	public RatNum getDuration();
	
	/**
	 * @return if a Playable is a Chord
	 */
	public boolean isChord();
	
	/**
	 * @return if a Playable is a Note
	 */
	public boolean isNote();
}
