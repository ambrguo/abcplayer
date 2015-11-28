package abc.sound;

/**
 * Playable represents a piece of music being played
 * @author Jessica
 *
 */
public interface Playable {
    // Datatype definition: Playable = Note(p: Pitch, d: Duration) + 
    //  Rest(d: Duration) + Chord(n: Set<Note>)+ Tuplet(t: List<Playable)
	
	public RatNum getDuration();
	// TODO: play()
}
