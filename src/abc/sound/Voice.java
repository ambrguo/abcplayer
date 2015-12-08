package abc.sound;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Voice {
	
	private final List<Measure> measures;
	private final String name;

	
	
	public Voice(List<Measure> measures, String name) {
		this.measures = measures;
		this.name = name;

	}
	
	public List<Measure> getMeasure() {
		return Collections.unmodifiableList(new ArrayList<Measure>(measures));
	}
	
	public String getName() {
	    return name;
	}
	
	public int computeTicks() {
		List<Integer> ticks = new ArrayList<>();
		for (Measure m : measures) {
			ticks.add(Integer.valueOf(m.computeTicks()));
		}
		return Collections.max(ticks);
	}
	
	public List<PlaybackNote> play() {
		// TODO handle repeats
		int ticks = 0;
		List<PlaybackNote> playbackNotes = new ArrayList<PlaybackNote>();
		return playbackNotes;
	}
	
	
}
