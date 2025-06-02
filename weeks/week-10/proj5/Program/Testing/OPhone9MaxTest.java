/**
 * @author Anna Scribner
 * @version March 11, 2025
 *
 * A test class to test the methods in OPHone9Max class
 */

package Testing;
import org.junit.jupiter.api.Test;
import src.OPhone9Max;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OPhone9MaxTest {

    /**
     * Test the method getName() of the OPhone9Max class
     */
    @Test
    void testGetName(){
        OPhone9Max o = new OPhone9Max();
        assertEquals("OPhone9Max", o.getName());
    }

    /**
     * Test the method getPrice() of the OPhone9Max class
     */
    @Test
    void testGetPrice(){
        OPhone9Max o = new OPhone9Max();
        assertEquals(760.00f,  o.getPrice(), 0.01f);
    }

    /**
     * Test the method getScreen() of the OPhone9Max class
     */
    @Test
    void testGetScreen(){
        OPhone9Max o = new OPhone9Max();
        assertEquals("6.5\"", o.getScreen());
    }

    /**
     * Test the method getComm() of the OPhone9Max class
     */
    @Test
    void testGetComm(){
        OPhone9Max o = new OPhone9Max();
        assertEquals(5, o.getComm());
    }

    /**
     * Test the method getVidRes() of the OPhone9Max class
     */
    @Test
    void testGetVidRes(){
        OPhone9Max o = new OPhone9Max();
        assertEquals("1080p", o.getVidRes());
    }

    /**
     * Test the method getCam() of the OPhone9Max class
     */
    @Test
    void testGetCam(){
        OPhone9Max o = new OPhone9Max();
        assertEquals(10, o.getCam());
    }

    /**
     * Test the method toString() of the OPhone9Max class
     */
    @Test
    void testToString(){
        OPhone9Max o = new OPhone9Max();
        assertEquals("OPhone9Max: Price $760.00, Comm: 5G, Camera: 10MP, Screen: 6.5\", Vid Res: 1080p", o.toString());
    }
}
