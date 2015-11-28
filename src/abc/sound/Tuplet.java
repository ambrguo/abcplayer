package abc.sound;

import java.util.List;
/*
 * implementation of Playable
 */
public class Tuplet implements Playable {
	// Abstraction function: Tuple represents a tuplet 
    // that consists of a list of Playables 
    // Rep invariant: playables consists of either 2, 3, or 4 Playables 
    //                of type Chord or Note
	// Safety from rep exposure: all fields are private and final

	private final List<Playable> playables;
	
	
	private void checkRep() {
		assert (playables.size()==2|playables.size()==3| playables.size()==4);
	    for (Playable playable:playables){
	        assert (playable.isChord()|playable.isNote());
	    }
	    
	}
	/**
	 * class constructor
	 */
	public Tuplet(/*TupletType type,*/ List<Playable> playables) {
		//this.type = type;
		this.playables = playables;
		checkRep();
	}
	
	public RatNum getDuration() {
		return new RatNum(0, 1); // placeholder
	}

    public boolean isChord() {
        return false;
    }

    public boolean isNote() {
        return false;
    }
}
