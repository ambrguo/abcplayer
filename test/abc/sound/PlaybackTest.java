package abc.sound;

import java.util.Optional;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PlaybackTest {
    /**
     * hasPitch
     * 1) True
     * 2) False
     */
    /**
     * getPitch
     * 1) A-G
     * 2) a-g
     * 3) ",", "'"
     */
   /**
    * getAccidental
    * 1) Sharp 2) Doublesharp 3) Flat 4) Doubleflat 5) Natural 6) None
    */
    /**
     * getDuration
     * 1) integer
     * 2) fraction
     * 
     * 
     */
    
    @Test //has pitch
    public void testPlaybackPitchTrue() {
        Playback p = new Playback(Optional.of(new Pitch('C')), Accidental.NONE, new RatNum(1,4));
        
        assertTrue(p.hasPitch());
    }
    
    @Test 
    public void testPlaybackPitchFalse() {
        Playback p = new Playback(Optional.empty(), Accidental.NONE, new RatNum(1,4));
        
        assertFalse(p.hasPitch());
    }
    
    @Test //get Pitch 
    public void testPlaybackGetPitch() {
        Playback p = new Playback(Optional.of(new Pitch('C')), Accidental.NONE, new RatNum(1,4));
        
        assertEquals(p.getPitch(), new Pitch('C'));
    }
    
    @Test 
    public void testPlaybackGetPitchLower() {
        Playback p = new Playback(Optional.of(new Pitch('C').transpose(Pitch.OCTAVE)), Accidental.NONE, new RatNum(1,4));
        assertEquals(p.getPitch(), new Pitch('C').transpose(Pitch.OCTAVE));
    }
    
    @Test 
    public void testPlaybackGetPitchOctaveLower() {
        Playback p = new Playback(Optional.of(new Pitch('C').transpose(3*Pitch.OCTAVE)), Accidental.NONE, new RatNum(1,4));
        
        assertEquals(p.getPitch(), new Pitch('C').transpose(3*Pitch.OCTAVE));
    }
    
    @Test 
    public void testPlaybackGetAccidentalNone(){
        Playback p = new Playback(Optional.of(new Pitch('C')), Accidental.NONE, new RatNum(1,4));
        
        assertEquals(p.getAccidental(), Accidental.NONE);
    }
    
    @Test 
    public void testPlaybackGetAccidentalSharp(){
        Playback p = new Playback(Optional.of(new Pitch('C')), Accidental.SHARP, new RatNum(1,4));
        
        assertEquals(p.getAccidental(), Accidental.SHARP);
    }
    
    @Test 
    public void testPlaybackGetAccidentalDoubleSharp(){
        Playback p = new Playback(Optional.of(new Pitch('C')), Accidental.DOUBLESHARP, new RatNum(1,4));
        
        assertEquals(p.getAccidental(), Accidental.DOUBLESHARP);
    }
    
    @Test 
    public void testPlaybackGetAccidentalFlat(){
        Playback p = new Playback(Optional.of(new Pitch('C')), Accidental.FLAT, new RatNum(1,4));
        
        assertEquals(p.getAccidental(), Accidental.FLAT);
    }
    
    @Test 
    public void testPlaybackGetAccidentalDoubleFlat(){
        Playback p = new Playback(Optional.of(new Pitch('C')), Accidental.DOUBLEFLAT, new RatNum(1,4));
        
        assertEquals(p.getAccidental(), Accidental.DOUBLEFLAT);
    }
    
    @Test 
    public void testPlaybackGetAccidentalNatural(){
        Playback p = new Playback(Optional.of(new Pitch('C')), Accidental.NATURAL, new RatNum(1,4));
        
        assertEquals(p.getAccidental(), Accidental.NATURAL);
    }
    
    @Test 
    public void testPlaybackGetDuration(){
        Playback p = new Playback(Optional.of(new Pitch('C')), Accidental.NATURAL, new RatNum(1,4));
        
        assertEquals(p.getDuration(),new RatNum(1,4) );
    }
    
    @Test 
    public void testPlaybackGetDurationInt(){
        Playback p = new Playback(Optional.of(new Pitch('C')), Accidental.NATURAL, new RatNum(2,1));
        
        assertEquals(p.getDuration(),new RatNum(2,1) );
    }
    
    
    
    
}


