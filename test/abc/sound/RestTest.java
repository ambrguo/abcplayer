package abc.sound;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class RestTest {
	
	// Testing strategy    
	
	@Test(expected=AssertionError.class)
	public void testAssertionsEnabled() {
		assert false; // make sure assertions are enabled with VM argument: -ea
	}
	/**
	 * getDuration
	 * 1) 0 < x < 1
	 * 2) x > 1
	 */
	@Test
    public void testGetDuration0() {
        Rest r = new Rest(new RatNum(7, 11));
        assertTrue(r.getDuration().toString().equals("7/11"));
    }
	@Test
    public void testGetDurationGreaterThan1() {
        Rest r = new Rest(new RatNum(2, 1));
        assertEquals(new RatNum(2,1), r.getDuration());
    }
	/**
	 * isNote
	 * 1) False
	 */
	@Test
    public void testIsNote() {
        Rest r = new Rest(new RatNum(2, 1));
        assertFalse(r.isNote());
    }
	/**
	 * isChord
	 * 1) False
	 */
	@Test
    public void testIsChord() {
        Rest r = new Rest(new RatNum(1, 2));
        assertFalse(r.isChord());
    }
	/**
	 * isRepeat
	 * 1) False
	 */
	@Test
	public void testIsRepeat() {
		Rest r = new Rest(new RatNum(1, 2));
		assertFalse(r.isRepeat());
	}

	/**
	 * equals
	 * 1) equals
	 * 2) not equals
	 */
	@Test
    public void testEquals() {
        Rest r = new Rest(new RatNum(1, 2));
        Rest r1 = new Rest(new RatNum(1, 2));
        assertTrue(r.equals(r1));
    }
	@Test
    public void testNotEquals() {
        Rest r = new Rest(new RatNum(1, 2));
        Rest r1 = new Rest(new RatNum(7, 2));
        assertFalse(r.equals(r1));
    }
	/**
	 * hashCode
	 * 1) equal objects, same hashCode
	 */
	@Test
    public void testHashCodeEquals() {
        Rest r = new Rest(new RatNum(1, 2));
        Rest r1 = new Rest(new RatNum(1, 2));
        assertEquals(r.hashCode(), r1.hashCode());
    }
	@Test
    public void testHashCodeNotEquals() {
        Rest r = new Rest(new RatNum(1, 2));
        Rest r1 = new Rest(new RatNum(7, 2));
        assertFalse(r.hashCode() == r1.hashCode());
    }
}
