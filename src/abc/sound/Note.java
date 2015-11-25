package abc.sound;

import java.util.List;

public class Note implements Playable {
	private final Pitch pitch;
	private final RatNum duration;
	
	private Note(Pitch pitch, RatNum duration) {
		this.pitch = pitch;
		this.duration = duration;
	}
	
	public Pitch getPitch() {
		return pitch;
	}
	
	public RatNum getDuration() {
		return duration;
	}
		
	public List<SequencePlayer> play() {
		
	}
}
