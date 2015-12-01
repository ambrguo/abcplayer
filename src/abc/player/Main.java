package abc.player;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Main entry point of your application.
 */
public class Main {

    /**
     * Plays the input file using Java MIDI API and displays
     * header information to the standard output stream.
     * 
     * (Your code should not exit the application abnormally using
     * System.exit().)
     * 
     * @param file the name of input abc file
     */
    public static void play(String file) {
        // YOUR CODE HERE
    }

    public static void main(String[] args) throws IOException {
        // CALL play() HERE USING ARGS
        //right now i'm assuming that each of the args is a file to play...
        for (String file: args){
            String currentLine;
            BufferedReader r = new BufferedReader(new FileReader(file));
            while ( (currentLine = r.readLine()) != null){
                
            }
        }
    }
}
