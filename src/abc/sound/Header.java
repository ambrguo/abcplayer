package abc.sound;

import java.util.ArrayList;
import java.util.List;

/**
 * Stores data from the header of an abc file 
 */
public class Header {
	
	// Required header fields
	private final int index;
	private final String title;
	private final String keySignature;
	
	// Optional header fields
    private String composer;
    private RatNum defaultLength; 
    private RatNum meter; 
    private int tempo;
    private List<String> voices;
    
    // Default header field values 
    public static final RatNum DEFAULT_METER = new RatNum(4, 4); 
    public static final RatNum DEFAULT_LENGTH = new RatNum(1, 8);
    public static final int DEFAULT_TEMPO = 100;
    public static final String DEFAULT_COMPOSER = "unknown";
    
    /**
     * Initializes a new Header 
     * @param indexNumber index number of abc file
     * @param title non-null title
     * @param keySignature non-null key signature 
     */
    public Header(int index, String title, String keySignature)
    {
        this.index = index; 
        this.title = title; 
        this.keySignature = keySignature; 
        
        this.setMeter(DEFAULT_METER);
        this.setDefaultLength(DEFAULT_LENGTH);
        this.setTempo(DEFAULT_TEMPO);
        this.setComposer(DEFAULT_COMPOSER);
        
        this.voices = new ArrayList<>();
    }
    
    public int getIndexNumber() {
    	return index;
    }
    
    public String getTitle()
    {
        return title; 
    }
    
	public String getKeySignature() {
		return keySignature;
	}
	
	public void setMeter(RatNum meter) {
		this.meter = meter;
	}
	
	public void setDefaultLength(RatNum defaultLength) {
		this.defaultLength = defaultLength;
	}
	
	public void setTempo(int tempo) {
		this.tempo = tempo;
	}
	
	public void setComposer(String composer) {
		this.composer = composer;
	}
	
	public void setVoice(String voice) {
		voices.add(voice);
	}
}
