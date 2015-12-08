package abc.sound;

import java.util.ArrayList;
import java.util.List;

public class Voice {
	
	private final List<Measure> measures;
	private final String name;

	
	
	public Voice(List<Measure> measures, String name) {
		this.measures = measures;
		this.name = name;

	}
	
	public String getName() {
	    return name;
	}
	
	
	public List<PlaybackNote> play() {
		// TODO handle repeats
		List<PlaybackNote> playbackNotes = new ArrayList<PlaybackNote>();
		return playbackNotes;
	}
	
	
}
