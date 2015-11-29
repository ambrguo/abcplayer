package abc.sound;

/**
 * Represents a reduced fraction of positive integers.
 */
public class RatNum {
	private final int numerator;
	private final int denominator;
	/**
	 * class constructor
	 */
	public RatNum(int numerator, int denominator) {
		if (denominator == 0) throw new IllegalArgumentException();
		int gcd = gcd(numerator, denominator);
		this.numerator = numerator/gcd;
		this.denominator = denominator/gcd;
		checkRep();
	}
	// checks that the RatNum is non-negative
	private void checkRep() {
		assert numerator >= 0;
		assert denominator > 0;
	}
	
	private int gcd(int p, int q) {
		if (p < 0 || q < 0) throw new IllegalArgumentException();
		if (q == 0) return p;
		else return gcd(q, p%q);
	}
	/**
	 * @return numerator of a fraction
	 */
	public int getNumerator() {
		return numerator;
	}
	/**
	 * @return denominator of a fraction
	 */
	public int getDenominator() {
		return denominator;
	}
	/**
	 * @return double version of int numerator/int denominator
	 */
	public Double toDouble() {
		double n = (double) numerator;
		double d = (double) denominator;
		return new Double(n/d);
	}
	
	public RatNum add(RatNum rn) {
		int n = numerator*rn.denominator + denominator*rn.numerator;
		int d = denominator*rn.denominator;
		return new RatNum(n, d);
	}
	
	public RatNum subtract(RatNum rn) {
		int n = numerator*rn.denominator - denominator*rn.numerator;
		int d = denominator*rn.denominator;
		return new RatNum(n, d);
	}
	
	public RatNum multiply(RatNum rn) {
		int n = numerator*rn.numerator;
		int d = numerator*rn.denominator;
		return new RatNum(n, d);
	}
	
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
	public boolean equals(Object that) {
		if (!(that instanceof RatNum)) return false;
		RatNum rn = (RatNum) that;
		return this.numerator == rn.numerator && this.denominator == rn.denominator;
	}
	
	@Override
	public int hashCode() {
		return Integer.valueOf(numerator).hashCode()*Integer.valueOf(denominator).hashCode();
	}
}
