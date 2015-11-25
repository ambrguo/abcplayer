package abc.sound;

/**
 * Represents a reduced fraction of positive integers.
 *
 */
public class RatNum {
	private final int numerator;
	private final int denominator;
	
	public RatNum(int numerator, int denominator) {
		if (denominator == 0) {
			throw new IllegalArgumentException();
		}
		int gcd = computeGCD(numerator, denominator);
		this.numerator = numerator/gcd;
		this.denominator = denominator/gcd;
	}
	
	private int computeGCD(int n, int m) {
		if (n < 0 || m < 0) {
			throw new IllegalArgumentException();
		}
		if (m == 0) {
			return m;
		}
		else {
			return computeGCD(m, n%m);
		}
	}
	
	public int getNumerator() {
		return numerator;
	}
	
	public int getDenominator() {
		return denominator;
	}
	
	public Double getDouble() {
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
