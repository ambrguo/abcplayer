package abc.sound;

/**
 * Represents a voice in the music
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Voice {
	// Abstraction function: measures maps to the list of measures in the voice, name is the identifier of the voice
	// Rep invariant: measures does not contain null measures
	// Safety form rep exposure: All fields are private and final; getMeasure defensively copies measures
	
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
		checkRep();
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
                indexFirstAlternate = index;
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
    
    /**
     * @param a non-negative integer
     * @param b non-negative integer
     * @return lcm of a and b
     */
	private int lcm(int a, int b) {
		if (a < 0 || b < 0) throw new IllegalArgumentException();
		int gcd = gcd(a, b);
		return a*b/gcd;
	}
	
	/**
	 * @param p non-negative integer
	 * @param q non-negative integer
	 * @return gcd of p and q
	 */
	private int gcd(int p, int q) {
		if (p < 0 || q < 0) throw new IllegalArgumentException();
		if (q == 0) return p;
		else return gcd(q, p%q);
	}
	
	/**
	 * Checks the rep invariant
	 */
	private void checkRep() {
		for (Measure m : measures) {
			assert m != null;
		}
	}
}
