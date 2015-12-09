package abc.sound;

import java.util.List;

/**
 * Represents a tuplet, a consecutive group of notes that are to be played for a duration that is either greater or less than 
 * the sum of the individual notes within that group. This class only handles duplets (2 notes in the time of 3 notes), triplets 
 * (3 notes in the time of 2 notes), and quadruplets (4 notes in the time of 3 notes). A tuplet may not contain rests, but it may 
 * contain chords. A tuplet may have notes and chords of different lengths.
 */
public class Tuplet implements Playable {
    // Abstraction function: Tuplet represents a tuplet of type type that is mapped by a list of Playable objects playables
    // Rep invariant: playables consists of either 2, 3, or 4 Playable objects of type Chord or Note
    // Safety from rep exposure: all fields are private and final

    private final List<Playable> playables;
    /*private final TupletType type;*/

    public Tuplet(List<Playable> playables) {
        /*this.type = type;*/
        this.playables = playables;
        checkRep();
    }

    @Override
    public RatNum getDuration() {
        RatNum duration = new RatNum(0, 1);
        if (playables.size() == 2) {
            for (Playable p : playables) {
                duration = duration.add(p.getDuration().multiply(new RatNum(3, 2)));
            }
        } else if (playables.size() == 3) {
            for (Playable p : playables) {
                duration = duration.add(p.getDuration().multiply(new RatNum(2, 3)));
            }
        } else if (playables.size() == 4) {
            for (Playable p : playables) {
                duration = duration.add(p.getDuration().multiply(new RatNum(3,4)));
            }
        } 
        return duration;
    }
    
    @Override
    public boolean isNote() {
        return false;
    }

    @Override
    public boolean isChord() {
        return false;
    }
    
    @Override
    public boolean isTuplet() {
    	return true;
    }

    @Override
    public boolean isRepeat() {
        return false;
    }

    private void checkRep() {
        assert playables.size() >= 2 && playables.size() <= 4;
        for (Playable playable : playables) {
            assert(playable.isChord() || playable.isNote());
        }
    }
    
    @Override 
    public boolean equals(Object that){
        if (!(that instanceof Tuplet)) return false;
        Tuplet thatObject = (Tuplet) that;
        if (!(thatObject.playables.size() == this.playables.size())) return false;
        for (int counter = 0; counter < this.playables.size(); counter++ ){
            if (!thatObject.playables.get(counter).equals(this.playables.get(counter))) return false;
        }
        return true;
        
    }
    
    @Override
    public int hashCode(){
        int mult = 1;
        for (Playable p: this.playables){
            mult *= p.hashCode();
        }
        return mult;
    }
}
