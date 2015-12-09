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
		int lcm = -1;
		for (int i = 0; i < ticks.size(); i++) {
			int t = ticks.get(i);
			if (i == 0) lcm = t;
			else {
				lcm = lcm(lcm, t);
			}
		}
		return lcm;
	}
	
	public List<List<Playback>> play() {
	    Integer indexBeginRepeat = 0;
	    Integer indexFirstAlternate = null;
	    List<List<Playback>> playbacks = new ArrayList<List<Playback>>();
	    int numMeasures = measures.size();
	    for (int index = 0; index < numMeasures; index++){
	        Measure measure = measures.get(index);
	        List<List<Playback>> add = measure.play();
            playbacks.addAll(add);
	        if (measure.getBeginRepeat()){
	            indexBeginRepeat = index;
	            
	        }
	        if (measure.getEndRepeat()){
	            
	            
	            if (indexFirstAlternate != null){
	                for (int innerIndex = indexBeginRepeat; innerIndex < indexFirstAlternate; innerIndex++){
	                    Measure innerMeasure = measures.get(innerIndex);
	                    List<List<Playback>> innerAdd = innerMeasure.play();
	                    playbacks.addAll(innerAdd);
	                }
	            } else {
	                for (int innerIndex = indexBeginRepeat; innerIndex <= index; innerIndex++){
                        Measure innerMeasure = measures.get(innerIndex);
                        List<List<Playback>> innerAdd = innerMeasure.play();
                        playbacks.addAll(innerAdd);
                    }
	            }
	            indexBeginRepeat = index+1;
	            indexFirstAlternate = null;
	            
	            
	        }
	        if (measure.getFirstAlternate()){
	            indexFirstAlternate = index;
	        }
	        
	        
	    }
	    return playbacks;
	}
	
	private int lcm(int a, int b) {
		if (a < 0 || b < 0) throw new IllegalArgumentException();
		int gcd = gcd(a, b);
		return a*b/gcd;
	}
	
	private int gcd(int p, int q) {
		if (p < 0 || q < 0) throw new IllegalArgumentException();
		if (q == 0) return p;
		else return gcd(q, p%q);
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
