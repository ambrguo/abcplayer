package abc.sound;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Tests the RatNum class.
 */
public class RatNumTest {
	
	// Testing strategy:
	
	@Test(expected=AssertionError.class)
    public void testAssertionsEnabled() {
        assert false; // make sure assertions are enabled with VM argument: -ea
    }
	
	@Test
	public void testEquals() {
		RatNum rn1 = new RatNum(8, 2);
		RatNum rn2 = new RatNum(12, 3);
		assertEquals(rn1, rn2);
	}
	
	@Test
	public void testEqualsZero() {
		RatNum rn1 = new RatNum(0, 9);
		RatNum rn2 = new RatNum(0, 1);
		assertEquals(rn1, rn2);
	}
	
	@Test
	public void testEqualsOne() {
		RatNum rn1 = new RatNum(1, 1);
		RatNum rn2 = new RatNum(Integer.MAX_VALUE, Integer.MAX_VALUE);
		assertEquals(rn1, rn2);
	}
}
