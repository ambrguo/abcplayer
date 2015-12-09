package abc.sound;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class HeaderTest {
    
    @Test(expected=AssertionError.class)
    public void testAssertionsEnabled() {
        assert false; // make sure assertions are enabled with VM argument: -ea
    }
    
    @Test
    public void abc_song() throws IOException {
    	Header header = Header.parse("sample_abc/abc_song.abc");
    	
    	Header myHeader = new Header(1, "Alphabet Song", Key.D_MAJOR);
    	myHeader.setComposer("Traditional Kid's Song");
    	myHeader.setMeter(new RatNum(4, 4));
    	myHeader.setDefaultLength(new RatNum(1, 4));
    	myHeader.setTempo(100);
    	
    	assertEquals(header, myHeader);
    }
    
    @Test
    public void furElise() throws IOException{
    	Header header = Header.parse("sample_abc/fur_elise.abc");
    	
    	Header myHeader = new Header(1, "Bagatelle No.25 in A, WoO.59", Key.A_MINOR);
    	myHeader.setComposer("Ludwig van Beethoven");
    	myHeader.setMeter(new RatNum(3, 8));
    	myHeader.setDefaultLength(new RatNum(1, 16));
    	myHeader.setTempo(280);
    	
    	Set<String> myVoices = new HashSet<>();
    	myVoices.addAll(Arrays.asList("1", "2"));
    	myHeader.setVoice(myVoices);
    	
    	assertEquals(header, myHeader);
    }
    
    @Test
    public void invention() throws IOException {
    	Header header = Header.parse("sample_abc/invention.abc");
    	
    	Header myHeader = new Header(1868, "Invention no. 1", Key.C_MAJOR);
    	myHeader.setComposer("Johann Sebastian Bach");
    	myHeader.setMeter(new RatNum(4, 4));
    	myHeader.setDefaultLength(new RatNum(1, 8));
    	myHeader.setTempo(140);
    	
    	Set<String> myVoices = new HashSet<>();
    	myVoices.addAll(Arrays.asList("1", "2"));
    	myHeader.setVoice(myVoices);
    	
    	assertEquals(header, myHeader);
    }
    
    @Test
    public void little_night_music() throws IOException {
    	Header header = Header.parse("sample_abc/little_night_music.abc");
    	
    	Header myHeader = new Header(1, "Little Night Music Mvt. 1", Key.G_MAJOR);
    	myHeader.setComposer("Wolfgang Amadeus Mozart");
    	myHeader.setMeter(new RatNum(4, 4));
    	myHeader.setDefaultLength(new RatNum(1, 8));
    	myHeader.setTempo(280);
    	
    	assertEquals(header, myHeader);
    }
    
    @Test
    public void paddy() throws IOException {
    	Header header = Header.parse("sample_abc/paddy.abc");
    	
    	Header myHeader = new Header(1, "Paddy O'Rafferty", Key.D_MAJOR);
    	myHeader.setComposer("Trad.");
    	myHeader.setMeter(new RatNum(6, 8));
    	myHeader.setTempo(200);
    	
    	assertEquals(header, myHeader);
    }
    
    @Test
    public void piece1() throws IOException {
        Header header = Header.parse("sample_abc/piece1.abc");
        
        Header myHeader = new Header(1, "Piece No.1", Key.C_MAJOR);
        myHeader.setMeter(new RatNum(4,4));
        myHeader.setDefaultLength(new RatNum(1,4));
        myHeader.setTempo(140);
        
        assertEquals(header, myHeader);
    }
    
    @Test
    public void piece2() throws IOException {
    	Header header = Header.parse("sample_abc/piece2.abc");
    	
    	Header myHeader = new Header(1, "Piece No.2", Key.C_MAJOR);
    	myHeader.setMeter(new RatNum(4, 4));
    	myHeader.setDefaultLength(new RatNum(1, 8));
    	myHeader.setTempo(200);
    	
    	assertEquals(header, myHeader);
    }
    
    @Test
    public void prelude() throws IOException {
    	Header header = Header.parse("sample_abc/prelude.abc");
    	
    	Header myHeader = new Header(8628, "Prelude BWV 846 no. 1", Key.C_MAJOR);
    	myHeader.setComposer("Johann Sebastian Bach");
    	myHeader.setMeter(new RatNum(4, 4));
    	myHeader.setDefaultLength(new RatNum(1, 16));
    	myHeader.setTempo(280);
    	
    	Set<String> myVoices = new HashSet<>();
    	myVoices.addAll(Arrays.asList("1", "2", "3"));
    	myHeader.setVoice(myVoices);
    	
    	assertEquals(header, myHeader);
    }
    
    @Test
    public void sample1() throws IOException {
    	Header header = Header.parse("sample_abc/sample1.abc");
    	
    	Header myHeader = new Header(1, "sample 1", Key.C_MAJOR);
    	
    	assertEquals(header, myHeader);
    }
    
    @Test
    public void sample2() throws IOException {
    	Header header = Header.parse("sample_abc/sample2.abc");
    	
    	Header myHeader = new Header(8, "Chord", Key.C_MAJOR);
    	
    	assertEquals(header, myHeader);
    }
    
    @Test
    public void sample3() throws IOException {
    	Header header = Header.parse("sample_abc/sample3.abc");
    	
    	Header myHeader = new Header(1, "voices", Key.C_MINOR);
    	
    	assertEquals(header, myHeader);
    }
    
    @Test
    public void scale() throws IOException {
    	Header header = Header.parse("sample_abc/scale.abc");
    	
    	Header myHeader = new Header(1, "Simple scale", Key.C_MAJOR);
    	myHeader.setComposer("Unknown");
    	myHeader.setMeter(new RatNum(4, 4));
    	myHeader.setDefaultLength(new RatNum(1, 4));
    	myHeader.setTempo(120);
    	
    	assertEquals(header, myHeader);
    }
    
    @Test
    public void test_piece_1() throws IOException {
    	Header header = Header.parse("sample_abc/test_piece_1.abc");
    	
    	Header myHeader = new Header(1, "test1", Key.C_MAJOR);
    	
    	assertEquals(header, myHeader);
    }
    
    @Test
    public void waxies_dargle() throws IOException {
    	Header header = Header.parse("sample_abc/waxies_dargle.abc");
    	
    	Header myHeader = new Header(2167, "Waxie's Dargle", Key.G_MAJOR);
    	myHeader.setMeter(new RatNum(4, 4));
    	myHeader.setDefaultLength(new RatNum(1, 8));
    	myHeader.setTempo(360);
    	
    	assertEquals(header, myHeader);
    }
}
