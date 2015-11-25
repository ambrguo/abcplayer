package abc.sound;

import java.util.List;

public interface Playable {
	
	public RatNum getDuration();
	
	public List<SequencePlayer> play();
}
