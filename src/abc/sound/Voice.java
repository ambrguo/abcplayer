package abc.sound;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Voice {
	
	private final List<Measure> measures;
	private final String name;	
	
	/**
	 * Constructs a voice
	 * @param measures list of measures in the voice
	 * @param name name of the voice
	 */
	public Voice(List<Measure> measures, String name) {
		this.measures = measures;
		this.name = name;

	}
	
	/**
	 * @return the list of measures in the voice
	 */
	public List<Measure> getMeasure() {
		return Collections.unmodifiableList(new ArrayList<Measure>(measures));
	}
	
	/**
	 * @return the name of the voice
	 */
	public String getName() {
	    return name;
	}
	
	/**
	 * @return the lcm of the ticks computed for the measures in the voice
	 */
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
	
	/**
	 * @return the Playback objects created by the play methods of the measure in the voice
	 */
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
	        if (measure.getFirstAlternate()){
                System.out.println("first alt hit at" + index);
                indexFirstAlternate = index;
            }
	        if (measure.getEndRepeat()){
	            
	            
	            if (indexFirstAlternate != null){
	                System.out.println("first alternate:" +indexFirstAlternate);
	                for (int innerIndex = indexBeginRepeat; innerIndex < indexFirstAlternate; innerIndex++){
	                    System.out.println("non null" + innerIndex);
	                    Measure innerMeasure = measures.get(innerIndex);
	                    List<List<Playback>> innerAdd = innerMeasure.play();
	                    playbacks.addAll(innerAdd);
	                }
	            } else {
	                
	                for (int innerIndex = indexBeginRepeat; innerIndex <= index; innerIndex++){
	                    System.out.println("null" + innerIndex);
                        Measure innerMeasure = measures.get(innerIndex);
                        List<List<Playback>> innerAdd = innerMeasure.play();
                        playbacks.addAll(innerAdd);
                    }
	            }
	            indexBeginRepeat = index+1;
	            indexFirstAlternate = null;
	            
	            
	        }
	        	        
	    }
	    return playbacks;
	}
	
	@Override
    public boolean equals(Object thatObject){
        if (!(thatObject instanceof Voice)) return false;
        Voice that = (Voice) thatObject;
        for (int i = 0; i < this.measures.size(); ++i){
            if (!this.measures.get(i).equals(that.getMeasure().get(i))){
                return false;
            }
        }
        if (that.getName().equals(this.name)){
            return true;
        }
        return false; 
    }
    
    @Override 
    public int hashCode() {
        return this.name.length();
    }
    
	// HELPER METHODS
    
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
}
