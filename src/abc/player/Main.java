package abc.player;


import java.io.BufferedReader;
//import java.io.BufferedReader;
//import java.io.FileReader;
import java.io.IOException;
//import java.util.HashMap;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Map;
//import java.util.Set;
import java.io.InputStreamReader;

import java.util.Optional;

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
        System.out.println(piece.getHeaderToString());
        SequencePlayer sp = piece.play();
        System.out.println(sp);
        sp.play();
        System.in.read();
        

    }

    public static void main(String[] args) throws IOException, MidiUnavailableException, InvalidMidiDataException {
        final BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        Optional<String> currentFile = Optional.empty();
        
        while (true) {
            final String input = in.readLine();
            
            if (input.isEmpty()) {
                return; // exits the program
            } else {
                currentFile = Optional.of(input.trim());
                try {
                    play(currentFile.get());
                } catch (Exception e){
                    throw new RuntimeException("please enter a valid piece");
                }
            }

        
        
        
    }
    }
}
