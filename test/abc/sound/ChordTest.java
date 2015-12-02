package abc.sound;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class ChordTest {

	// Testing strategy:
	
	@Test(expected=AssertionError.class)
    public void testAssertionsEnabled() {
        assert false; // make sure assertions are enabled with VM argument: -ea
    }
	
	@Test
	public void testGetNotes() {
		Note a = new Note(new Pitch('A'), new RatNum(1, 8), Accidental.NONE);
		Note b = new Note(new Pitch('B'), new RatNum(1, 8), Accidental.NONE);
		Note c = new Note(new Pitch('C'), new RatNum(1, 8), Accidental.NONE);
		Set<Note> notes = new HashSet<Note>();
		notes.add(a);
		notes.add(b);
		notes.add(c);
		Chord chord = new Chord(notes);
		assertEquals(notes, chord.getNotes());
	}
	
	@Test
	public void testGetDuration() {
		Note a = new Note(new Pitch('A'), new RatNum(1, 8), Accidental.NONE);
		Note b = new Note(new Pitch('B'), new RatNum(1, 4), Accidental.NONE);
		Note c = new Note(new Pitch('C'), new RatNum(3, 8), Accidental.NONE);
		Set<Note> notes = new HashSet<Note>();
		notes.add(a);
		notes.add(b);
		notes.add(c);
		Chord chord = new Chord(notes);
		assertEquals(c.getDuration(), chord.getDuration());
	}
	
	@Test
	public void testIsNote() {
		Note a = new Note(new Pitch('A'), new RatNum(1, 8), Accidental.NONE);
		Note b = new Note(new Pitch('B'), new RatNum(1, 8), Accidental.NONE);
		Note c = new Note(new Pitch('C'), new RatNum(1, 8), Accidental.NONE);
		Set<Note> notes = new HashSet<Note>();
		notes.add(a);
		notes.add(b);
		notes.add(c);
		Chord chord = new Chord(notes);
		assertFalse(chord.isNote());
	}
	
	@Test
	public void testIsChord() {
		Note a = new Note(new Pitch('A'), new RatNum(1, 8), Accidental.NONE);
		Note b = new Note(new Pitch('B'), new RatNum(1, 8), Accidental.NONE);
		Note c = new Note(new Pitch('C'), new RatNum(1, 8), Accidental.NONE);
		Set<Note> notes = new HashSet<Note>();
		notes.add(a);
		notes.add(b);
		notes.add(c);
		Chord chord = new Chord(notes);
		assertTrue(chord.isChord());
	}
	
	@Test
	public void testIsRepeat() {
		Note a = new Note(new Pitch('A'), new RatNum(1, 8), Accidental.NONE);
		Note b = new Note(new Pitch('B'), new RatNum(1, 8), Accidental.NONE);
		Note c = new Note(new Pitch('C'), new RatNum(1, 8), Accidental.NONE);
		Set<Note> notes = new HashSet<Note>();
		notes.add(a);
		notes.add(b);
		notes.add(c);
		Chord chord = new Chord(notes);
		assertFalse(chord.isRepeat());
	}
	
	@Test
	public void testPlay() {
		Note a = new Note(new Pitch('A'), new RatNum(1, 8), Accidental.NONE);
		Note b = new Note(new Pitch('B'), new RatNum(1, 8), Accidental.NONE);
		Note c = new Note(new Pitch('C'), new RatNum(1, 8), Accidental.NONE);
		Set<Note> notes = new HashSet<Note>();
		notes.add(a);
		notes.add(b);
		notes.add(c);
		Chord chord = new Chord(notes);
		List<PlaybackNote> playbackNotes = chord.play(0, 4, new RatNum(1, 4));
		assertEquals(3, playbackNotes.size());
	}
} 
