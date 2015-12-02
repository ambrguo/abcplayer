package abc.sound;

import java.util.ArrayList;
import java.util.List;

public class Voice {
	
	private final List<Measure> measures;

	
	public Voice(List<Measure> measures) {
		this.measures = measures;

	}
	
	
	public List<PlaybackNote> play() {
		// TODO handle repeats
		List<PlaybackNote> playbackNotes = new ArrayList<PlaybackNote>();
		return playbackNotes;
	}
	
	
}
