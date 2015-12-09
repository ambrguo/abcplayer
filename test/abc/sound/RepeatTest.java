package abc.sound;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

public class RepeatTest {
    
    @Test(expected=AssertionError.class)
    public void testAssertionsEnabled() {
        assert false; // make sure assertions are enabled with VM argument: -ea
    }
    
    /**
     * getIsBeginRepeat
     * 1) True
     * 2) False
     */
    @Test
    public void testGetIsBeginRepeatTrue(){
        Repeat test = new Repeat(true, false, false, false, 0);
        assertTrue(test.getIsBeginRepeat());
    }
    @Test
    public void testGetIsBeginRepeatFalse(){
        Repeat test = new Repeat(false, false, false, false, 0);
        assertFalse(test.getIsBeginRepeat());
    }
    /**
     * getIsEndRepeat
     * 1) True
     * 2) False
     */
    @Test
    public void testGetIsEndRepeatTrue(){
        Repeat test = new Repeat(false, true, false, false, 0);
        assertTrue(test.getIsEndRepeat());
    }
    @Test
    public void testGetIsEndRepeatFalse(){
        Repeat test = new Repeat(false, false, false, false, 0);
        assertFalse(test.getIsEndRepeat());
    }
    /**
     * getIsFirstAlternate
     * 1) True
     * 2) False
     */
    @Test
    public void testIsFirstAlternateTrue(){
        Repeat test = new Repeat(false, false, true, false, 0);
        assertTrue(test.getIsFirstAlternate());
    }
    @Test
    public void testIsFirstAlternateFalse(){
        Repeat test = new Repeat(false, false, false, false, 0);
        assertFalse(test.getIsFirstAlternate());
    }
    
    /**
     * getIsSecondAlternate
     * 1) True
     * 2) False
     */
    @Test
    public void testIsSecondAlternateTrue(){
        Repeat test = new Repeat(false, false, false, true, 0);
        assertTrue(test.getIsSecondAlternate());
    }
    @Test
    public void testIsSecondAlternateFalse(){
        Repeat test = new Repeat(false, false, false, false, 0);
        assertFalse(test.getIsSecondAlternate());
    }
    /**
     * counter
     * 1) 0
     * 2) 0+
     */
    @Test
    public void testCounter0(){
        Repeat test = new Repeat(false, false, false, false, 0);
        assertTrue(0 == test.counter());
    }
    @Test
    public void testCounter0Plus(){
        Repeat test = new Repeat(false, false, false, false, 1);
        assertTrue(1 == test.counter());
    }
    /**
     * hit
     * 1) 0
     * 2) 0+
     */
    @Test
    public void testHit0(){
        Repeat test = new Repeat(false, false, false, false, 0);
        test.hit();
        assertTrue(1 == test.counter());
    }
    @Test
    public void testHit0Plus(){
        Repeat test = new Repeat(false, false, false, false, 1);
        test.hit();
        assertTrue(2 == test.counter());
    }
    /**
     * getDuration
     * 1) RatNum(0,1)
     */
    @Test
    public void testGetDuration(){
        Repeat test = new Repeat(false, false, false, false, 1);
        assertTrue(test.getDuration().equals(new RatNum(0,1)));
    }
    /**
     * isNote
     * 1) False
     */
    @Test
    public void testIsNote(){
        Repeat test = new Repeat(false, false, false, false, 1);
        assertFalse(test.isNote());
    }
    /**
     * isChord
     * 1) False
     */
    @Test
    public void testIsChord(){
        Repeat test = new Repeat(false, false, false, false, 1);
        assertFalse(test.isChord());
    }
    /**
     * isRepeat
     * 1) True
     */
    @Test
    public void testIsRepeat(){
        Repeat test = new Repeat(false, false, false, false, 1);
        assertTrue(test.isRepeat());
    }

}
