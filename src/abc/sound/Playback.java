package abc.sound;

import java.util.Optional;

public class Playback {
	private Optional<Pitch> pitch;
	private final Accidental accidental;
	private final RatNum duration;
	
	public Playback(Optional<Pitch> pitch, Accidental accidental, RatNum duration) {
		this.pitch = pitch;
		this.accidental = accidental;
		this.duration = duration;
		
	}
	
	public boolean hasPitch() {
		return pitch.isPresent();
	}
	
	public Pitch getPitch() {
	    return pitch.get();
	}
	
	public Accidental getAccidental() {
		return accidental;
	}
	
	public RatNum getDuration() {
		return duration;
	}
	
//	private void checkRep() {
//		if (pitch.isPresent()) assert accidental.isPresent();
//	}
}
