package abc.sound;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class NoteTest {
	
	// Testing strategy:
	
	@Test(expected=AssertionError.class)
    public void testAssertionsEnabled() {
        assert false; // make sure assertions are enabled with VM argument: -ea
    }
	
	@Test
	public void testGetPitch() {
		Note n = new Note(new Pitch('C'), new RatNum(1, 4), Accidental.NONE);
		Note m = new Note(new Pitch('C'), new RatNum(1, 8), Accidental.NONE);
		Pitch nPitch = n.getPitch();
		Pitch mPitch = m.getPitch();
		assertEquals(nPitch, mPitch);
	}
	
	@Test
	public void testGetDuration() {
		Note n = new Note(new Pitch('C'), new RatNum(1, 4), Accidental.NONE);
		Note m = new Note(new Pitch('G'), new RatNum(1, 4), Accidental.NONE);
		RatNum nDuration = n.getDuration();
		RatNum mDuration = m.getDuration();
		assertEquals(nDuration, mDuration);		
	}
	
	@Test
	public void testGetAccidental() {
		Note n = new Note(new Pitch('B'), new RatNum(1, 4), Accidental.FLAT);
		Note m = new Note(new Pitch('E'), new RatNum(1, 4), Accidental.FLAT);
		Accidental nAccidental = n.getAccidental();
		Accidental mAccidental = m.getAccidental();
		assertEquals(nAccidental, mAccidental);
	}
	
	@Test
	public void testIsNote() {
		Note n = new Note(new Pitch('C'), new RatNum(1, 4), Accidental.NONE);
		assertTrue(n.isNote());
	}
	
	@Test
	public void testIsChord() {
		Note n = new Note(new Pitch('C'), new RatNum(1, 4), Accidental.NONE);
		assertFalse(n.isChord());
	}
	
	@Test
	public void testIsRepeat() {
		Note n = new Note(new Pitch('C'), new RatNum(1, 4), Accidental.NONE);
		assertFalse(n.isRepeat());
	}
	
}
