package abc.sound;

import static org.junit.Assert.*;

import org.junit.Test;

public class HeaderTest {
    
    @Test(expected=AssertionError.class)
    public void testAssertionsEnabled() {
        assert false; // make sure assertions are enabled with VM argument: -ea
    }
    
    
    
    

    @Test
    public void testDefaultHeader() {
        Header testHeader1 = new Header(1, "hello world", Key.C_SHARP_MAJOR);
        assertEquals(testHeader1.getKeySignature(), Key.C_SHARP_MAJOR);
        
        
    }

}
