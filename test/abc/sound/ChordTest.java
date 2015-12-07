package abc.sound;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class ChordTest {
    @Test(expected=AssertionError.class)
    public void testAssertionsEnabled() {
        assert false; // make sure assertions are enabled with VM argument: -ea
    }
    
    /**
     * getNotes
     * 1) 1 note
     * 2) 2 notes
     * 3) 2+ notes
     */
    
    @Test
    public void testGetNotes2() {
        Note a = new Note(new Pitch('A'), new RatNum(1, 8), Accidental.NONE);
        Note b = new Note(new Pitch('B'), new RatNum(1, 8), Accidental.NONE);
        Set<Note> notes = new HashSet<Note>();
        notes.add(a);
        notes.add(b);
        Chord chord = new Chord(notes);
        assertEquals(notes, chord.getNotes());
    }
    @Test
    public void testGetNotes2Plus() {
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
    /**
     * getDuration
     * 1) notes in chord same length
     * 2) notes in chord different length
     */
    @Test
    public void testGetDurationSame() {
        Note a = new Note(new Pitch('A'), new RatNum(1, 8), Accidental.NONE);
        Note b = new Note(new Pitch('B'), new RatNum(1, 8), Accidental.NONE);
        Set<Note> notes = new HashSet<Note>();
        notes.add(a);
        notes.add(b);
        Chord chord = new Chord(notes);
        assertEquals(a.getDuration(), chord.getDuration());
        assertEquals(b.getDuration(), chord.getDuration());
    }
    @Test
    public void testGetDurationDifferent() {
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
    /**
     * isNotes
     * 1) False
     */
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
    /**
     * isChord
     * 1) True
     */
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
    /**
     * isRepeat
     * 1) False
     */
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
    
    /**
     * play
     * 1) 2 notes in chord
     * 2) 2 + notes in chord
     * 3) notes of different duration
     * 4) notes of same Duration
     */
    @Test
    public void testPlay2NotesSameDuration() {
        Note a = new Note(new Pitch('A'), new RatNum(1, 8), Accidental.NONE);
        Note b = new Note(new Pitch('B'), new RatNum(1, 8), Accidental.NONE);
        Set<Note> notes = new HashSet<Note>();
        notes.add(a);
        notes.add(b);
        Chord chord = new Chord(notes);
        List<PlaybackNote> playbackNotes = chord.play(0, 8, new RatNum(1, 4));
        assertEquals(2, playbackNotes.size());
    }
    @Test
    public void testPlay2PlusNotesDifferentDuration() {
        Note a = new Note(new Pitch('A'), new RatNum(1, 8), Accidental.NONE);
        Note b = new Note(new Pitch('B'), new RatNum(1, 8), Accidental.NONE);
        Note c = new Note(new Pitch('C'), new RatNum(3, 4), Accidental.NONE);
        Set<Note> notes = new HashSet<Note>();
        notes.add(a);
        notes.add(b);
        notes.add(c);
        Chord chord = new Chord(notes);
        List<PlaybackNote> playbackNotes = chord.play(0, 8, new RatNum(1, 4));
        assertEquals(3, playbackNotes.size());
    }

}
