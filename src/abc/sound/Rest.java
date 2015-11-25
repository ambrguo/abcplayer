package abc.sound;

import java.util.List;

public class Rest implements Playable {
	private final RatNum duration;
	
	public Rest(RatNum duration) {
		this.duration = duration;
	}
	
	public RatNum getDuration() {
		return duration;
	}
	
	public List<SequencePlayer> play() {
		
	}
}
