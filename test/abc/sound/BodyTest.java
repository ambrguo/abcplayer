package abc.sound;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class BodyTest {
    /**
     * 1) accidental : DOUBLESHARP, SHARP, NATURAL, FLAT, DOUBLEFLAT, NONE
     * 2) duration : x, x/x, x/, /x, /, none
     * 3) chord: notes = same duration, notes = different duration
     * 4) octave: A-G, a-g, ''', ','
     * 5) tuplet: duplet, triplet, quadruplet, notes, chords
     * 6) voices: 1, 1+
     * 7) measure: repeats, no repeats
     */
    @Test
    public void test1() throws IOException { //accidentals, durations, 1 voice     
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
        Note natural2 = new Note(new Pitch('C'), new RatNum(1,1), Accidental.NATURAL);
        List<Playable> one = new ArrayList<Playable>();
        List<Playable> two = new ArrayList<Playable>();
        List<Playable> three = new ArrayList<Playable>();
        
        one.add(first); one.add(sTranspose); one.add(flat); one.add(natural);
        two.add(none); two.add(none); two.add(doubleF); two.add(doubleF2);
        three.add(none7); three.add(doubleS); three.add(natural2); three.add(natural2);
        
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

    }
    @Test
    public void test2() throws IOException { //octave, chord    
        Pitch c3 = new Pitch('C'); c3 = c3.transpose(12).transpose(12).transpose(12);
        Pitch a1 = new Pitch('A'); a1 = a1.transpose(-12);
        Pitch c = new Pitch('C'); 
        Pitch e = new Pitch('E'); e = e.transpose(12);
        Pitch eR = new Pitch('E');
        Pitch g = new Pitch('G');
        Pitch f= new Pitch ('F');
        
        Note first = new Note(a1, new RatNum(2,1), Accidental.NONE);
        Note second = new Note(c3, new RatNum(1,1), Accidental.NONE);
        Note third = new Note(c, new RatNum(1,1), Accidental.NONE);
                
        List<Playable> one = new ArrayList<Playable>();
        List<Playable> two = new ArrayList<Playable>();
        List<Playable> three = new ArrayList<Playable>();
        
        List<Note> ch = new ArrayList<Note>();
        ch.add(new Note(c, new RatNum(2,1), Accidental.NONE));
        ch.add(new Note(e, new RatNum(1,1), Accidental.NONE));
        Chord chord = new Chord(ch);
        
        List<Note> chord2 = new ArrayList<Note>();
        chord2.add(new Note(g, new RatNum(3,4),Accidental.NONE));
        chord2.add(new Note(eR, new RatNum(1,1), Accidental.FLAT));
        chord2.add(new Note(f, new RatNum(1,2),Accidental.NONE));
        Chord c2 = new Chord(chord2);
        
        
        one.add(first); one.add(second); one.add(third); one.add(third);
        two.add(third); two.add(third); two.add(third); two.add(third);
        three.add(chord); three.add(c2);
        
        Measure m = new Measure(one, false, false, false, false);
        Measure m2 = new Measure(two, false, false, false, false);
        Measure m3 = new Measure(three, false, false, false, false);
        
        List<Measure> measures = new ArrayList<Measure>();
        measures.add(m); measures.add(m2); measures.add(m3);
        
        Voice voice = new Voice(measures, "DEFAULT_VOICE");
        Set<Voice> voiceSet = new HashSet<Voice>();
        voiceSet.add(voice);
        
        Header header = Header.parse("sample_abc/test2.abc");
        Piece piece = Piece.parse("sample_abc/test2.abc");
        
        Piece checkPiece = new Piece(voiceSet, header); 
        
        assertTrue(checkPiece.equals(piece));  
    }
    @Test
    public void test3() throws IOException { //tuplets, voices    
        Pitch a = new Pitch('A');
        Pitch b = new Pitch('B');
        RatNum x = new RatNum(1,1);
        Accidental y = Accidental.NONE;
       
        Note an = new Note(a, x, y);
        Note bn = new Note(b, x, y);
        
        List<Playable> quad = new ArrayList<Playable>();
        
        quad.add(an); quad.add(bn); quad.add(an); quad.add(bn);
        
        Tuplet quadruplet = new Tuplet(quad);
        
        List<Playable> one3 = new ArrayList<Playable>();
        
        one3.add(quadruplet);
        
        Measure m3 = new Measure(one3, false, false, false, false);
       
        List<Measure> measure1 = new ArrayList<Measure>();
        
        measure1.add(m3);
        
        Voice voice = new Voice(measure1, "DEFAULT_VOICE");
        Set<Voice> voiceSet = new HashSet<Voice>();
        voiceSet.add(voice);
        
        Header header = Header.parse("sample_abc/sample3.abc");
        Piece piece = Piece.parse("sample_abc/sample3.abc");
        
        Piece checkPiece = new Piece(voiceSet, header); 
        
        assertTrue(checkPiece.equals(piece));  
    }
    @Test
    public void test4() throws IOException { //reeats  
        Pitch a = new Pitch('A');
        Pitch b = new Pitch('B');
        Pitch c = new Pitch('C');
        Pitch d = new Pitch('D');
        Pitch e = new Pitch('E');
        Pitch f = new Pitch('F');
        Pitch g = new Pitch('G');
        RatNum x = new RatNum(1,1);
        Accidental y = Accidental.NONE;
       
        Note an = new Note(a, x, y);
        Note bn = new Note(b, x, y);
        Note cn = new Note(c, x, y);
        Note dn = new Note(d, x, y);
        Note en = new Note(e, x, y);
        Note fn = new Note(f, x, y);
        Note gn = new Note(g, x, y);
        
        List<Playable> one = new ArrayList<Playable>();
        List<Playable> two = new ArrayList<Playable>();
        List<Playable> three = new ArrayList<Playable>();
        
        one.add(cn); one.add(dn); one.add(en); one.add(fn);
        two.add(gn); two.add(an); two.add(bn); two.add(cn);
        three.add(fn); three.add(en); three.add(dn); three.add(cn);
        
        Measure m = new Measure(one, true, false, false, false);
        Measure m2 = new Measure(two, false, true, true, false);
        Measure m3 = new Measure(three, false, false, false, true);
        
        List<Measure> measures = new ArrayList<Measure>();
        measures.add(m); measures.add(m2); measures.add(m3);
        
        Voice voice = new Voice(measures, "DEFAULT_VOICE");
        Set<Voice> voiceSet = new HashSet<Voice>();
        voiceSet.add(voice);
        
        Header header = Header.parse("sample_abc/test3.abc");
        Piece piece = Piece.parse("sample_abc/test3.abc");
        
        Piece checkPiece = new Piece(voiceSet, header); 
        
        assertTrue(checkPiece.equals(piece));  

    }

}
