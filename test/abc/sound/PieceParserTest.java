package abc.sound;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class PieceParserTest {
    /**
     * 1) accidental : DOUBLESHARP, SHARP, NATURAL, FLAT, DOUBLEFLAT, NONE
     * 2) duration : x, x/x, x/, /x, /, none
     * 3) chord: notes = same duration, notes = different duration
     * 4) octave: lowercase, ''', ','
     * 5) tuplet: duplet, triplet, quadruplet
     * 6) voices: 1, 1+
     */
    @Test
    public void test1() throws IOException { //accidental, duration, 1 voice     
        Pitch p = new Pitch('C');
        p = p.transpose(12);
            
        Note first = new Note(new Pitch('C'), new RatNum(2,1), Accidental.SHARP);
        Note sharp = new Note(new Pitch('C'), new RatNum(1,1), Accidental.SHARP);
        Note sTranspose = new Note(p, new RatNum(1,2), Accidental.SHARP);
        Note flat = new Note(new Pitch('C'), new RatNum(1,1), Accidental.FLAT);
        Note natural = new Note(new Pitch('C'), new RatNum(3,4), Accidental.NATURAL);
        Note none = new Note(new Pitch('C'), new RatNum(1,1), Accidental.NONE );
        Note none7 = new Note(new Pitch('A'), new RatNum(1,7), Accidental.NONE );
        Note doubleF = new Note(new Pitch('C'), new RatNum(1,1), Accidental.DOUBLEFLAT ); 
        Note doubleF2 = new Note(new Pitch('C'), new RatNum(2,1), Accidental.DOUBLEFLAT );
        Note doubleS =  new Note(new Pitch('C'), new RatNum(1,1), Accidental.DOUBLESHARP);
        
        List<Playable> one = new ArrayList<Playable>();
        List<Playable> two = new ArrayList<Playable>();
        List<Playable> three = new ArrayList<Playable>();
        
        one.add(first); one.add(sTranspose); one.add(flat); one.add(natural);
        two.add(none); two.add(none); two.add(doubleF); two.add(doubleF2);
        three.add(none7); three.add(doubleS); three.add(doubleS); three.add(sharp);
        
        Measure m = new Measure(one, false, false, false, false);
        Measure m2 = new Measure(two, false, false, false, false);
        Measure m3 = new Measure(three, false, false, false, false);
        
        List<Measure> measures = new ArrayList<Measure>();
        measures.add(m); measures.add(m2); measures.add(m3);
        
        Voice voice = new Voice(measures, "DEFAULT_VOICE");
        Set<Voice> voiceSet = new HashSet<Voice>();
        voiceSet.add(voice);
        
        Header header = Header.parse("sample_abc/test_piece_1.abc");
        Header headerCheck = new Header(1, "test1", Key.C_MAJOR);
        Piece piece = Piece.parse("sample_abc/test_piece_1.abc");
        
        Piece checkPiece = new Piece(voiceSet, header); 
        
        assertTrue(checkPiece.equals(piece));  
    }/*
    @Test
    public void test2() throws IOException { //octave, chord, tuplet     
        Pitch c3 = new Pitch('C');
        c3 = c3.transpose(12).transpose(12).transpose(12);
        Pitch a1 = new Pitch('A');
        a1 = a1.transpose(-12);
        Pitch c = new Pitch('C');
            
        Note first = new Note(a1, new RatNum(2,1), Accidental.NONE);
        Note second = new Note(c3, new RatNum(1,1), Accidental.NONE);
        Note third = new Note(c, new RatNum(1,1), Accidental.NONE);
                
        List<Playable> one = new ArrayList<Playable>();
        List<Playable> two = new ArrayList<Playable>();
        
        one.add(first); one.add(second); one.add(third); one.add(third);
        two.add(third); two.add(third); two.add(third); two.add(third);
        
        Measure m = new Measure(one, false, false, false, false);
        Measure m2 = new Measure(two, false, false, false, false);
        
        List<Measure> measures = new ArrayList<Measure>();
        measures.add(m); measures.add(m2); 
        
        Voice voice = new Voice(measures, "DEFAULT_VOICE");
        Set<Voice> voiceSet = new HashSet<Voice>();
        voiceSet.add(voice);
        
        Header header = Header.parse("sample_abc/test_piece_1.abc");
        Header headerCheck = new Header(1, "test1", Key.C_MAJOR);
        Piece piece = Piece.parse("sample_abc/test2.abc");
        
        Piece checkPiece = new Piece(voiceSet, header); 
        
        assertTrue(checkPiece.equals(piece));  
    }*/
    


}
