package abc.sound;

import java.util.Optional;

/**
 * Playback is an intermediary object that stores pitch, accidental, and duration data for future use in 
 * scheduling notes in the SequencePlayer
 */
public class Playback {
	private Optional<Pitch> pitch;
	private final Accidental accidental;
	private final RatNum duration;
	
	/**
	 * Creates a playback
	 * @param pitch an optional field that is specified for notes, chords, and tuplets and unspecified for rests and repeats
	 * @param accidental accidental
	 * @param duration duration of the Playback
	 */
	public Playback(Optional<Pitch> pitch, Accidental accidental, RatNum duration) {
		this.pitch = pitch;
		this.accidental = accidental;
		this.duration = duration;
		
	}
	
	/**
	 * @return true if the playback has a pitch
	 */
	public boolean hasPitch() {
		return pitch.isPresent();
	}
	
	/**
	 * Requires that hasPitch() is true
	 * @return pitch
	 */
	public Pitch getPitch() {
	    return pitch.get();
	}
	
	/**
	 * @return accidental
	 */
	public Accidental getAccidental() {
		return accidental;
	}
	
	/**
	 * @return duration
	 */
	public RatNum getDuration() {
		return duration;
	}
	
}
