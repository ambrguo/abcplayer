package abc.player;


//import java.io.BufferedReader;
//import java.io.FileReader;
import java.io.IOException;
//import java.util.HashMap;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Map;
//import java.util.Set;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;

import abc.sound.Piece;
import abc.sound.SequencePlayer;
//import abc.sound.Voice;
//import abc.sound.Measure;

/**
 * Main entry point of your application.
 */
public class Main {
    
//    private static final String COMPOSER_PREFIX = "C:";
//    private static final String KEY_PREFIX = "K:";
//    private static final String DURATION_PREFIX = "L:";
//    private static final String METER_PREFIX = "M:";
//    private static final String TEMPO_PREFIX = "Q:";
//    private static final String TITLE_PREFIX = "T:";
//    private static final String INDEX_PREFIX = "X:";
//    private static final String VOICE_PREFIX = "V:";

    /**
     * Plays the input file using Java MIDI API and displays
     * header information to the standard output stream.
     * 
     * (Your code should not exit the application abnormally using
     * System.exit().)
     * 
     * @param file the name of input abc file
     * @throws IOException 
     * @throws InvalidMidiDataException 
     * @throws MidiUnavailableException 
     */
    public static void play(String file) throws IOException, MidiUnavailableException, InvalidMidiDataException {

        Piece piece = Piece.parse(file);
        SequencePlayer sp = piece.play();
        sp.play();
        System.in.read();
        

    }

    public static void main(String[] args) throws IOException, MidiUnavailableException, InvalidMidiDataException {
        // CALL play() HERE USING ARGS

        
        String file = "sample_abc/tuplet.abc";
        
        play(file);
        
    }
}
