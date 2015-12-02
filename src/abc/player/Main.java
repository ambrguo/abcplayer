package abc.player;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Main entry point of your application.
 */
public class Main {
    
    private static final String COMPOSER_PREFIX = "C:";
    private static final String KEY_PREFIX = "K:";
    private static final String DURATION_PREFIX = "L:";
    private static final String METER_PREFIX = "M:";
    private static final String TEMPO_PREFIX = "Q:";
    private static final String TITLE_PREFIX = "T:";
    private static final String INDEX_NUMBER = "X:";

    /**
     * Plays the input file using Java MIDI API and displays
     * header information to the standard output stream.
     * 
     * (Your code should not exit the application abnormally using
     * System.exit().)
     * 
     * @param file the name of input abc file
     * @throws IOException 
     */
    public static void play(String file) throws IOException {
        String currentLine;
        BufferedReader r = new BufferedReader(new FileReader(file));
        while ( (currentLine = r.readLine()) != null){
            if (currentLine.startsWith(COMPOSER_PREFIX)){
                
            }
            else if (currentLine.startsWith(DURATION_PREFIX)){
                
            }
            else if (currentLine.startsWith(KEY_PREFIX)){
                
            }
            else if (currentLine.startsWith(METER_PREFIX)){
                
            }
            else if (currentLine.startsWith(TEMPO_PREFIX)){
                
            }
            else if (currentLine.startsWith(TITLE_PREFIX)){
                
            }
            else if (currentLine.startsWith(INDEX_NUMBER)){
                
            }
            else { //if hits this, then is a part of the music
                
            }
            
        }
        
            
        r.close();

    }

    public static void main(String[] args) throws IOException {
        // CALL play() HERE USING ARGS
        //right now i'm assuming that each of the args is a file to play...
        for (String file: args){
            play(file);
        }
    }
}
