package abc.sound;

import java.util.Optional;

public class Playback {
	private Optional<Pitch> pitch;
	private Optional<Accidental> accidental;
	private RatNum duration;
	
	public Playback(Optional<Pitch> pitch, Optional<Accidental> accidental, RatNum duration) {
		this.pitch = pitch;
		this.accidental = accidental;
		this.duration = duration;
		checkRep();
	}
	
	public boolean hasPitch() {
		return pitch.isPresent();
	}
	
	public boolean hasAccidental() {
		return accidental.isPresent();
	}
	
	public RatNum getDuration() {
		return duration;
	}
	
	private void checkRep() {
		if (pitch.isPresent()) assert accidental.isPresent();
	}
}
