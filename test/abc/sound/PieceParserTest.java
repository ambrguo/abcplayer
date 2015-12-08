package abc.sound;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class PieceParserTest {

    @Test
    public void Piece1() throws IOException {
        Header header = Header.parse("sample_abc/piece1.abc");
    
        
        Header headerCheck = new Header(1, "Piece No.1", Key.C_MAJOR);
        headerCheck.setMeter(new RatNum(4,4));
        headerCheck.setDefaultLength(new RatNum(1,4));
        headerCheck.setTempo(140);
        
        assertEquals(header, headerCheck);
        
//        Note note = new Note(new Pitch('C'), header.getDefaultLength(), Accidental.NONE );
//        
//        List<Playable> playables = new ArrayList<Playable>();
//        playables.add(note);
//        playables.add(note);
//        playables.add(note);
//        playables.add(note);
//        
//        Measure measure = new Measure(playables, false, false, false);
//        
//        List<Measure> measures = new ArrayList<Measure>();
//        measures.add(measure);
//        
//        Voice voice = new Voice(measures, "DEFAULT_VOICE");
//        
//        Set<Voice> voiceSet = new HashSet<Voice>();
//        voiceSet.add(voice);
//        
//        Piece checkPiece = new Piece(voiceSet, header); 
//        
//        System.out.println(header.toString());
//        
//        //assertEquals(checkPiece, piece);
//                
        
        
        
    }

}
