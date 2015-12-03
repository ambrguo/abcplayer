package abc.sound;

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
    private String meter;
    private int tempo;  
    
    // Default header field values 
    public static final String DEFAULT_METER = "4/4"; 
    public static final RatNum DEFAULT_LENGTH = new RatNum(1, 8);
    public static final int DEFAULT_TEMPO = 100;
    public static final String DEFAULT_COMPOSER = "unknown";
    
    /**
     * Initializes a new Header 
     * @param title non-null title
     * @param keySignature non-null key signature 
     * @param indexNumber index number of abc file
     */
    public Header(String title, String keySignature, int index)
    {
        this.index = index; 
        this.title = title; 
        this.keySignature = keySignature; 
        
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
	
	// TODO set optional fields
}
