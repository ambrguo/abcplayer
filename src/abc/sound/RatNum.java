package abc.sound;

/**
 * Represents a reduced fraction of positive integers.
 */
public class RatNum {
	private final int numerator;
	private final int denominator;
	
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
	
	public int getNumerator() {
		return numerator;
	}
	
	public int getDenominator() {
		return denominator;
	}
	
	public Double toDouble() {
		double n = (double) numerator;
		double d = (double) denominator;
		return new Double(n/d);
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
