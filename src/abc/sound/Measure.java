package abc.sound;

import java.util.List;



import java.util.ArrayList;
import java.util.Collections;

/**
 * Represents a bar of music
 */
public class Measure {
	// Abstraction function: Represents a bar of music. List playables maps to the list of Playable objects associated with the measure. beginRepeat maps to 
	//							whether or not a begin repeat bar is associated with the measure. endRepeat maps to whether or not an end repeat is associated 
	//							with the measure. hasAlternateEnding maps to whether or not the repeated section has a different ending when it is played the 
	//							second time.
	// Rep invariant: - playables must be non-empty and non-null
	//				  - hasAlternateEnding can be true iff endRepeat is true
	// Safety from rep exposure: - all fields are private and final
	//							 - getPlayables() returns a defensively copied list with an unmodifiableList wrapper
	
	private final List<Playable> playables;
	private final boolean beginRepeat;
	private final boolean endRepeat;
	private final boolean firstAlternate;
	private final boolean secondAlternate;
	
	public Measure(List<Playable> playables, boolean beginRepeat, boolean endRepeat, boolean firstAlternate, boolean secondAlternate) {
		if (beginRepeat || endRepeat || firstAlternate || secondAlternate) {
			playables.add(new Repeat(beginRepeat, endRepeat, firstAlternate, secondAlternate, 0));
		}
		this.playables = playables;
		this.beginRepeat = beginRepeat;
		this.endRepeat = endRepeat;
		this.firstAlternate = firstAlternate;
		this.secondAlternate = secondAlternate;
	}
	
	public List<Playable> getPlayables() {
		return Collections.unmodifiableList(new ArrayList<Playable>(playables));
	}
	
	public boolean getBeginRepeat() {
		return beginRepeat;
	}
	
	public boolean getEndRepeat() {
		return endRepeat;
	}
	
	public boolean getFirstAlternate() {
		return firstAlternate;
	}
	
	public boolean getSecondAlternate() {
		return secondAlternate;
	}
	
	public int computeTicks() {
		int lcm = -1;
		for (int i = 0; i < playables.size(); i++) {
			int d = playables.get(i).getDuration().getDenominator();
			if (i == 0) lcm = d;
			else {
				lcm = lcm(lcm, d);
			}
		}
		return lcm;
	}
	
	public List<List<Playback>> play() {
	    List<List<Playback>> playbacks = new ArrayList<List<Playback>>();
	    for (Playable p : playables ){
	        playbacks.addAll(p.play());
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
	public boolean equals(Object that){
	    if (!(that instanceof Measure)) return false;
	    Measure thatObject = (Measure) that;
	    if (!(thatObject.playables.size() == this.playables.size())) return false;
	    for (int counter = 0; counter < this.playables.size(); counter++ ){
	        if (!thatObject.playables.get(counter).equals(this.playables.get(counter))) return false;
        }
        return true;
	}
	
	@Override
	public int hashCode() {
	    int mult = 1;
        for (Playable p: this.playables){
            mult *= p.hashCode();
        }
        return mult;
	}
}
