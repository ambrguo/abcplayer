package abc.sound;

import static org.junit.Assert.*;

import java.io.IOException;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;

import org.junit.Test;

import abc.player.Main;

public class SequencePlayerTest {

    @Test 
    public void testPiece1() throws MidiUnavailableException, InvalidMidiDataException, IOException{
        SequencePlayer player = new SequencePlayer(140,12);
        
        player.addNote(new Pitch('C').toMidiNote(),0 , 12);
        player.addNote(new Pitch('C').toMidiNote(),12,12);
        player.addNote(new Pitch('C').toMidiNote(), 24, 9);
        player.addNote(new Pitch('D').toMidiNote(), 33, 3);
        player.addNote(new Pitch('E').toMidiNote(), 36, 12);
        player.addNote(new Pitch('E').toMidiNote(), 48, 9);
        player.addNote(new Pitch('D').toMidiNote(), 57, 3);
        player.addNote(new Pitch('E').toMidiNote(), 60, 9);
        player.addNote(new Pitch('F').toMidiNote(), 69, 3);
        player.addNote(new Pitch('G').toMidiNote(), 72, 24);
        player.addNote(new Pitch('C').transpose(Pitch.OCTAVE).toMidiNote(), 96, 4);
        player.addNote(new Pitch('C').transpose(Pitch.OCTAVE).toMidiNote(), 100, 4);
        player.addNote(new Pitch('C').transpose(Pitch.OCTAVE).toMidiNote(), 104, 4);
        player.addNote(new Pitch('G').toMidiNote(), 108, 4);
        player.addNote(new Pitch('G').toMidiNote(), 112, 4);
        player.addNote(new Pitch('G').toMidiNote(), 116, 4);
        player.addNote(new Pitch('E').toMidiNote(), 120, 4);
        player.addNote(new Pitch('E').toMidiNote(), 124, 4);
        player.addNote(new Pitch('E').toMidiNote(), 128, 4);
        player.addNote(new Pitch('C').toMidiNote(), 132, 4);
        player.addNote(new Pitch('C').toMidiNote(), 136, 4);
        player.addNote(new Pitch('C').toMidiNote(), 140, 4);
        player.addNote(new Pitch('G').toMidiNote(), 144, 9);
        player.addNote(new Pitch('F').toMidiNote(), 153, 3);
        player.addNote(new Pitch('E').toMidiNote(), 156, 9);
        player.addNote(new Pitch('D').toMidiNote(), 165, 3);
        player.addNote(new Pitch('C').toMidiNote(), 168, 24);
        
        System.out.println(player);
        player.play();
        System.in.read();
        
        Main.play("sample_abc/piece1.abc");
        
                
        
        
    }
    
    @Test
    public void testPiece2() throws MidiUnavailableException, InvalidMidiDataException, IOException{
        SequencePlayer player = new SequencePlayer(200,12);
        
        player.addNote(new Pitch('F').transpose(1).toMidiNote(), 0, 6);
        player.addNote(new Pitch('E').transpose(Pitch.OCTAVE).toMidiNote(), 0, 6);
        
        player.addNote(new Pitch('F').transpose(1).toMidiNote(), 6, 6);
        player.addNote(new Pitch('E').transpose(Pitch.OCTAVE).toMidiNote(), 6, 6);
        
        //rest for 6 ticks 
        
        player.addNote(new Pitch('F').transpose(1).toMidiNote(), 18, 6);
        player.addNote(new Pitch('E').transpose(Pitch.OCTAVE).toMidiNote(), 18, 6);
        
        //rest of 6 ticks 
        
        player.addNote(new Pitch('F').transpose(1).toMidiNote(), 30, 6);
        player.addNote(new Pitch('C').transpose(Pitch.OCTAVE).toMidiNote(), 30, 6);
        
        player.addNote(new Pitch('F').transpose(1).toMidiNote(), 36, 12);
        player.addNote(new Pitch('E').transpose(Pitch.OCTAVE).toMidiNote(), 36,12);
        
        player.addNote(new Pitch('G').toMidiNote(), 48, 12);
        player.addNote(new Pitch('B').toMidiNote(), 48, 12);
        player.addNote(new Pitch('G').transpose(Pitch.OCTAVE).toMidiNote(), 48, 12);
        
        //rest 12 ticks 
        
        player.addNote(new Pitch('G').toMidiNote(), 72, 12);
        
        //rest 12 ticks 
        
        player.addNote(new Pitch('C').transpose(Pitch.OCTAVE).toMidiNote(), 96, 18);
        
        player.addNote(new Pitch('G').toMidiNote(), 114, 6);
        
        //rest 12 ticks 
        
        player.addNote(new Pitch('E').toMidiNote(), 132, 12);
        
        player.addNote(new Pitch('E').toMidiNote(), 144, 6);
        
        player.addNote(new Pitch('A').toMidiNote(), 150, 12);
        
        player.addNote(new Pitch('B').toMidiNote(), 162, 12);
        
        player.addNote(new Pitch('B').transpose(-1).toMidiNote(), 174, 6);
        
        player.addNote(new Pitch('A').toMidiNote(), 180, 12);
        
        player.addNote(new Pitch('G').toMidiNote(), 192, 8);
        
        player.addNote(new Pitch('E').transpose(Pitch.OCTAVE).toMidiNote(), 200, 8);
        
        player.addNote(new Pitch('G').transpose(Pitch.OCTAVE).toMidiNote(), 208, 8);
        
        player.addNote(new Pitch('A').transpose(Pitch.OCTAVE).toMidiNote(), 216, 12);
        
        player.addNote(new Pitch('F').transpose(Pitch.OCTAVE).toMidiNote(), 228, 6);
        
        player.addNote(new Pitch('G').transpose(Pitch.OCTAVE).toMidiNote(), 234, 6);
        
        //rest 6 ticks 
        
        player.addNote(new Pitch('E').transpose(Pitch.OCTAVE).toMidiNote(), 246, 12);
        
        player.addNote(new Pitch('C').transpose(Pitch.OCTAVE).toMidiNote(), 258, 6);
        
        player.addNote(new Pitch('D').transpose(Pitch.OCTAVE).toMidiNote(), 264, 6);
        
        player.addNote(new Pitch('B').toMidiNote(), 270, 9);
        
        //rest 9 ticks 
        
        System.out.println(player);
        player.play();
        System.in.read();
        
        
        Main.play("sample_abc/piece2.abc");
        
    }
    
    //@Test
    //public void test() {
    //    fail("Not yet implemented");
    //}
    

}
