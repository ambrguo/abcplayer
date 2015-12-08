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
	@Override
    public boolean equals(Object p){
        if (!(p instanceof Voice)) return false;
        Voice v = (Voice) p;
        for (int i = 0; i < this.measures.size(); ++i){
            System.out.println("hi");
            if (!this.measures.get(i).equals(v.getMeasure().get(i))){
                return false;
            }
        }
        if (v.getName().equals(this.name)){
            return true;
        }
        return false; 
    }
    
    @Override 
    public int hashCode() {
        return this.name.length();
    }
	
}
