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
		int lcm = -1;
		for (int i = 0; i < measures.size(); i++) {
			int t = measures.get(i).computeTicks();
			if (i == 0) lcm = t;
			else {
				lcm = lcm(lcm, t);
			}
		}
		return lcm;
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
	
	public List<PlaybackNote> play() {
		// TODO handle repeats
		int ticks = 0;
		List<PlaybackNote> playbackNotes = new ArrayList<PlaybackNote>();
		return playbackNotes;
	}
	
	
}
