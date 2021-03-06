package abc.sound;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class TupletTest {
    
    @Test(expected=AssertionError.class)
    public void testAssertionsEnabled() {
        assert false; // make sure assertions are enabled with VM argument: -ea
    }
    /**
     * getDuration
     * 1) duplet 2) triplet 3) quadruplet
     */
    @Test
    public void testGetDuration() {
        List<Playable> playables = new ArrayList<>();
        playables.add(new Note(new Pitch('C'), new RatNum(1, 4), Accidental.NONE));
        playables.add(new Note(new Pitch('D'), new RatNum(1, 4), Accidental.NONE));
        Tuplet test = new Tuplet(playables);
        RatNum rational = test.getDuration();
        assertEquals(rational, new RatNum(3,4));
    }
    /**
     * isNote
     * False
     */
    @Test
    public void testIsNote(){
        List<Playable> playables = new ArrayList<>();
        playables.add(new Note(new Pitch('C'), new RatNum(1, 4), Accidental.NONE));
        playables.add(new Note(new Pitch('D'), new RatNum(1, 4), Accidental.NONE));
        Tuplet test = new Tuplet(playables);
        assertFalse(test.isNote());
    }
    /**
     * isChord
     * false
     */
    @Test
    public void testIsChord(){
        List<Playable> playables = new ArrayList<>();
        playables.add(new Note(new Pitch('C'), new RatNum(1, 4), Accidental.NONE));
        playables.add(new Note(new Pitch('D'), new RatNum(1, 4), Accidental.NONE));
        Tuplet test = new Tuplet(playables);
        assertFalse(test.isChord());
    }
    /**
     * isRepeat
     * false
     */
    @Test
    public void testIsRepeat(){
        List<Playable> playables = new ArrayList<>();
        playables.add(new Note(new Pitch('C'), new RatNum(1, 4), Accidental.NONE));
        playables.add(new Note(new Pitch('D'), new RatNum(1, 4), Accidental.NONE));
        Tuplet test = new Tuplet(playables);
        assertFalse(test.isRepeat());
    }

}
