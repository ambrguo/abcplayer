package abc.sound;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Chord implements Playable {
	private List<Note> notes;
		
	public Chord(List<Note> notes) {
		this.notes = new ArrayList<Note>(notes);
		checkRep();
	}
	
	public List<Note> getNotes() {
		return new ArrayList<Note>(notes);
	}
	
	public RatNum getDuration() {
		Map<Double, RatNum> durations = new HashMap<>();
		for (Note note : notes) {
			durations.put(note.getDuration().getDouble(), note.getDuration());
		}
		Double max = Collections.max(durations.keySet());
		return durations.get(max);
	}
	
	public List<SequencePlayer> play() {
		
	}
	
	private void checkRep() {
		assert notes.size() >= 2;
	}
}
