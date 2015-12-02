package abc.sound;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class RestTest {
	
	// Testing strategy:
	
	@Test(expected=AssertionError.class)
	public void testAssertionsEnabled() {
		assert false; // make sure assertions are enabled with VM argument: -ea
	}
	
	@Test
	public void testGetDuration() {
		Rest r = new Rest(new RatNum(1, 2));
		assertEquals(new RatNum(1, 2), r.getDuration());
	}
	
	@Test
	public void testIsNote() {
		Rest r = new Rest(new RatNum(1, 2));
		assertFalse(r.isNote());
	}
	
	@Test
	public void testIsChord() {
		Rest r = new Rest(new RatNum(1, 2));
		assertFalse(r.isChord());
	}
	
	@Test
	public void testIsRepeat() {
		Rest r = new Rest(new RatNum(1, 2));
		assertFalse(r.isRepeat());
	}
	
	@Test
	public void testPlay() {
		Rest r = new Rest(new RatNum(1, 2));
		List<PlaybackNote> playbackNotes = r.play(0, 4, new RatNum(1, 4));
		assertTrue(playbackNotes.isEmpty());
	}
}
