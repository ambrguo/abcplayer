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
	/**
	 * getNumerator
	 * 1) 0
	 * 2) 1 (default)
	 * 3) 1+
	 */
	@Test
    public void testGetNumerator0() {
        RatNum rn1 = new RatNum(0, 4);
        assertTrue(rn1.getNumerator() == 0);
    }
	@Test
    public void testGetNumerator1() {
        RatNum rn1 = new RatNum(1, 4);
        assertTrue(rn1.getNumerator() == 1);
    }
	@Test
    public void testGetNumerator1Plus() {
        RatNum rn1 = new RatNum(17, 4);
        assertTrue(rn1.getNumerator() == 17);
    } 
	/**
	 * getDenominator
	 * 1) 1
	 * 2) 2 (default)
	 * 3) 2+
	 */
	@Test
    public void testGetDenominator1() {
        RatNum rn1 = new RatNum(3, 1);
        assertTrue(rn1.getDenominator() == 1);
    }
    @Test
    public void testGetDenominator2() {
        RatNum rn1 = new RatNum(1, 2);
        assertTrue(rn1.getDenominator() == 2);
    }
    @Test
    public void testGetDenominator2Plus() {
        RatNum rn1 = new RatNum(17, 4);
        assertTrue(rn1.getDenominator() == 4);
    }
	/**
	 * add
	 * 1) common denominator
	 * 2) no common denominator
	 */
	@Test
    public void testAddCommon() {
        RatNum rn1 = new RatNum(3, 4);
        RatNum rn2 = new RatNum(2,4);
        RatNum product = rn1.add(rn2);
        assertEquals(product, new RatNum(5,4));
    }
    @Test
    public void testAddNotCommon() {
        RatNum rn1 = new RatNum(3, 4);
        RatNum rn2 = new RatNum(2,3);
        RatNum product = rn1.add(rn2);
        assertEquals(product, new RatNum(17,12));
    }
	/**
	 * subtract
	 * 1) common denominator
	 * 2) no common denominator
	 */
	@Test
    public void testSubtractCommon() {
        RatNum rn1 = new RatNum(3, 4);
        RatNum rn2 = new RatNum(2,4);
        RatNum product = rn1.subtract(rn2);
        assertEquals(product, new RatNum(1,4));
    }
    @Test
    public void testSubtractNotCommon() {
        RatNum rn1 = new RatNum(3, 4);
        RatNum rn2 = new RatNum(2,3);
        RatNum product = rn1.subtract(rn2);
        assertEquals(product, new RatNum(1,12));
    }
	/**
	 * multiply
	 * 1) common denominator
	 * 2) no common denominator
	 */
	@Test
    public void testMultiplyCommon() {
        RatNum rn1 = new RatNum(3, 4);
        RatNum rn2 = new RatNum(3,4);
        RatNum product = rn1.multiply(rn2);
        assertEquals(product, new RatNum(9,16));
    }
	@Test
    public void testMultiplyNotCommon() {
        RatNum rn1 = new RatNum(3, 4);
        RatNum rn2 = new RatNum(2,3);
        RatNum product = rn1.multiply(rn2);
        assertEquals(product, new RatNum(1,2));
    }
	/**
	 * divide
	 * 1) common denominator
	 * 2) no common denominator
	 */
	@Test
    public void testDivideCommon() {
        RatNum rn1 = new RatNum(3, 4);
        RatNum rn2 = new RatNum(6,4);
        RatNum product = rn1.divide(rn2);
        assertEquals(product, new RatNum(1,2));
    }
	@Test
    public void testDivideNotCommon() {
        RatNum rn1 = new RatNum(3, 4);
        RatNum rn2 = new RatNum(2,7);
        RatNum product = rn1.multiply(rn2);
        assertEquals(product, new RatNum(3,14));
    }
	/**
	 * toString
	 * 1) fraction
	 */
	@Test
    public void testToString() {
        RatNum rn1 = new RatNum(8, 2);
        assertTrue(rn1.toString().equals("4/1"));
    }
	/**
	 * equals
	 * 1) equals
	 * 2) not equals
	 */
	@Test
    public void testEquals() {
        RatNum rn1 = new RatNum(8, 2);
        RatNum rn2 = new RatNum(12, 3);
        assertTrue(rn1.equals(rn2));
    }
    @Test
    public void testEqualsZero() {
        RatNum rn1 = new RatNum(0, 9);
        RatNum rn2 = new RatNum(0, 1);
        assertTrue(rn1.equals(rn2));
    }
    @Test
    public void testEqualsOne() {
        RatNum rn1 = new RatNum(1, 1);
        RatNum rn2 = new RatNum(Integer.MAX_VALUE, Integer.MAX_VALUE);
        assertTrue(rn1.equals(rn2));
    }
    @Test
    public void testNotEquals() {
        RatNum rn1 = new RatNum(1, 1);
        RatNum rn2 = new RatNum(2, 1);
        assertFalse(rn1.equals(rn2));
    }
	/**
	 * hashCode
	 * 1) equal objects have same hashCode
	 */
    @Test
    public void testHashCodeEquals() {
        RatNum rn1 = new RatNum(12, 16);
        RatNum rn2 = new RatNum(3, 4);
        assertEquals(rn1.hashCode(), rn2.hashCode());
    }
    @Test
    public void testHashCodeNotEquals() {
        RatNum rn1 = new RatNum(11, 16);
        RatNum rn2 = new RatNum(3, 4);
        assertFalse(rn1.hashCode() == rn2.hashCode());
    }
}
