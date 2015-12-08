package abc.sound;

import java.util.HashSet;
import java.util.Set;

/**
 * Stores data from the header of an abc file 
 * 
 * methods: 
 * getIndex
 * getTitle
 * getKeySignature 
 * 
 * getComposer 
 * getDefaultLength
 * getMeter 
 * getTempo
 * getVoices 
 */
public class Header {
    
    /*
     * Abstraction function:
     * Header represents different descriptive elements of a piece including
     * composer, length, meter, tempo, voices, index, title, and key signature 
     * Rep invariant: the values of each field are either the default values or 
     * have been entered 
     * Rep Exposure: fields are private and final; getter methods perform defensive 
     * copying to prevent exposure 
     */
	
	// Required header fields
	private final int index;
	private final String title;
	private final Key keySignature;
	
	// Optional header fields
    private String composer;
    private RatNum defaultLength; 
    private RatNum meter; 
    private int tempo;
    private Set<String> voices;
    
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
    public Header(int index, String title, Key keySignature)
    {
        this.index = index; 
        this.title = title; 
        this.keySignature = keySignature; 
        
        this.setMeter(DEFAULT_METER);
        this.setDefaultLength(DEFAULT_LENGTH);
        this.setTempo(DEFAULT_TEMPO);
        this.setComposer(DEFAULT_COMPOSER);
        
        this.setVoice(new HashSet<>());
    }
    
    /**
     * observer
     * @return index int of piece 
     */
    public int getIndexNumber() {
    	return index;
    }
    
    /**
     * observer
     * @return title string of the piece 
     */
    public String getTitle()
    {
        return title; 
    }
    
    /**
     * observer
     * @return keySignature key of the piece 
     */
	public Key getKeySignature() {
		return keySignature;
	}
	
	/**
	 * observer
	 * @return meter RatNum of the piece 
	 */
	public RatNum getMeter(){
        RatNum returnmeter = this.meter;
        return returnmeter;
    }
    
	/**
	 * observer
	 * @return defaultLength RatNum of the piece 
	 */
    public RatNum getDefaultLength() {
        RatNum returndefaultLen = this.defaultLength;
        return returndefaultLen;
    }
     /**
      * observer
      * @return Composer string 
      */
    public String getComposer() {
        String returncomposer = this.composer;
        return returncomposer;
    }
    
    /**
     * observer
     * @return tempo int 
     */
    public int getTempo(){
        int returntempo = this.tempo;
        return returntempo;
    }
    
    /**
     * observer 
     * @return voices List<String>
     */
    public Set<String> getVoices() {
        Set<String> returnvoices = this.voices;
        return returnvoices;
    }
	
    /**
     * mutator -- sets the meter to something non-default 
     * @param meter RatNum 
     */
	public void setMeter(RatNum meter) {
		this.meter = meter;
	}
	
	/**
	 * mutator -- sets the default length to something non-default 
	 * @param defaultLength RatNum 
	 */
	public void setDefaultLength(RatNum defaultLength) {
		this.defaultLength = defaultLength;
	}
	
	/**
	 * mutator -- sets the tempo if the tempo of the header is specified 
	 * @param tempo
	 */
	public void setTempo(int tempo) {
		this.tempo = tempo;
	}
	
	/**
	 * sets the composer if the composer of the piece is specified 
	 * mutator 
	 * @param composer
	 */
	public void setComposer(String composer) {
		this.composer = composer;
	}
	
	/**
	 * adds additional voices to the piece, if specified. 
	 * @param voice
	 */
	public void setVoice(Set<String> v) {
		for (String voice : v) {
			voices.add(voice);
		}
	}
	
	
}
