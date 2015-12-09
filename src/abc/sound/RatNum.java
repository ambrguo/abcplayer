package abc.sound;

/**
 * Represents a reduced fraction of positive integers.
 */
public class RatNum {
	// Abstraction function: RatNum represents a reduced fraction of positive integers, with numerator numerator and denominator denominator
	// Rep invariant: numerator >= 0, denominator > 0
	// Safety from rep exposure: All fields are private and final
	
	private final int numerator;
	private final int denominator;
	
	/**
	 * Constructs a RatNum with numerator numerator and denominator denominator
	 * 
	 * @param numerator non-negative numerator
	 * @param denominator positive denominator
	 */
	public RatNum(int numerator, int denominator) {
		if (denominator == 0) throw new IllegalArgumentException();
		int gcd = gcd(numerator, denominator);
		this.numerator = numerator/gcd;
		this.denominator = denominator/gcd;
		checkRep();
	}
	
	/**
	 * @return the numerator of the RatNum
	 */
	public int getNumerator() {
		return numerator;
	}
	/**
	 * @return the denominator of the RatNum
	 */
	public int getDenominator() {
		return denominator;
	}
	/**
	 * @return the value of int numerator/int denominator as a Double
	 */
	public Double toDouble() {
		double n = (double) numerator;
		double d = (double) denominator;
		return new Double(n/d);
	}
	
	/**
	 * Adds two RatNum objects
	 * 
	 * @param rn the RatNum to add
	 * @return the sum of this and rn
	 */
	public RatNum add(RatNum rn) {
		int n = numerator*rn.denominator + denominator*rn.numerator;
		int d = denominator*rn.denominator;
		return new RatNum(n, d);
	}
	
	/**
	 * Subtracts two RatNum objects
	 * 
	 * @param rn the RatNum to subtract from this
	 * @return the difference of this and rn
	 */
	public RatNum subtract(RatNum rn) {
		int n = numerator*rn.denominator - denominator*rn.numerator;
		int d = denominator*rn.denominator;
		return new RatNum(n, d);
	}
	
	/**
	 * Multiplies two RatNum objects
	 * 
	 * @param rn the RatNum to multiply
	 * @return the product of this and rn
	 */
	public RatNum multiply(RatNum rn) {
		int n = numerator*rn.numerator;
		int d = denominator*rn.denominator;
		return new RatNum(n, d);
	}
	
	/**
	 * Divides two RatNum objects
	 * 
	 * @param rn the RatNum to divide this by
	 * @return the quotient of this and rn
	 */
	public RatNum divide(RatNum rn) {
		int n = numerator*rn.denominator;
		int d = denominator*rn.numerator;
		return new RatNum(n, d);
	}
	
	@Override
	public String toString() {
		return numerator + "/" + denominator;
	}
	
	@Override
	public boolean equals(Object thatObject) {
		if (!(thatObject instanceof RatNum)) return false;
		RatNum that = (RatNum) thatObject;
		return this.numerator == that.numerator && this.denominator == that.denominator;
	}
	
	@Override
	public int hashCode() {
		return Integer.valueOf(numerator).hashCode()*Integer.valueOf(denominator).hashCode();
	}
	
	// HELPER METHODS
	
	/**
	 * Computes the gcd of two integers p,q using Euclid's algorithm
	 * 
	 * @param p non-negative integer
	 * @param q non-negative integer
	 * @return the greatest common denominator of p and q
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
		assert numerator >= 0;
		assert denominator > 0;
	}
}
