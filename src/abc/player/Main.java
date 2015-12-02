package abc.player;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import abc.sound.Piece;
import abc.sound.Voice;
import abc.sound.Measure;

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
    private static final String INDEX_PREFIX = "X:";
    private static final String VOICE_PREFIX = "V:";

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
        String composer;
        
        
        String currentLine;
        BufferedReader r = new BufferedReader(new FileReader(file));
        String currentVoice;
        Map<String, List<Measure>> voiceMeasures = new HashMap<String, List<Measure>>();
        Set<String> voicesNames = new HashSet<String>();
        boolean inHeader = true;
        while ( (currentLine = r.readLine()) != null){
                if (currentLine.startsWith(VOICE_PREFIX)){
                     
                    
                    if (inHeader && !voicesNames.contains(currentLine.substring(2).trim())){
                        
  
                    }
                }
                else if (currentLine.startsWith(COMPOSER_PREFIX)){
                    if (inHeader){
                        composer = currentLine.substring(2).trim();
                        
                    }
                    
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
                else if (currentLine.startsWith(INDEX_PREFIX)){
                    
                } 
            
            
            else { 
                if (inHeader){
                    inHeader = false;
                }
                
                
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
