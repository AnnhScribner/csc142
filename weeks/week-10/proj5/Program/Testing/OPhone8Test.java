/**
 * @author Anna Scribner
 * @version March 11, 2025
 *
 * A test class to test methods in OPhone8 class
 */

package Testing;
import org.junit.jupiter.api.Test;
import src.OPhone8;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OPhone8Test {

    /**
     * Test the method getName() of the OPhone8 class
     */
    @Test
    void testGetName(){
        OPhone8 o = new OPhone8();
        assertEquals("OPhone8", o.getName());
    }

    /**
     * Test the method getPrice() of the OPhone8 class
     */
    @Test
    void testGetPrice(){
        OPhone8 o = new OPhone8();
        assertEquals(470.00, o.getPrice());
    }

    /**
     * Test the method getScreen() of the OPhone8 class
     */
    @Test
    void testGetScreen(){
        OPhone8 o = new OPhone8();
        assertEquals("5.5\"", o.getScreen());
    }

    /**
     * Test the method getComm() of the OPhone8 class
     */
    @Test
    void testGetComm(){
        OPhone8 o = new OPhone8();
        assertEquals(4, o.getComm());
    }

    /**
     * Test the method getVidRes() of the OPhone8 class
     */
    @Test
    void testGetVidRes(){
        OPhone8 o = new OPhone8();
        assertEquals("720p", o.getVidRes());
    }

    /**
     * Test the method getCam() of the OPhone8 class
     */
    @Test
    void testGetCam(){
        OPhone8 o = new OPhone8();
        assertEquals(8, o.getCam());
    }

    /**
     * Test the method toString() of the OPhone8 class
     */
    @Test
    void testToString(){
        OPhone8 o = new OPhone8();
        assertEquals("OPhone8: Price $470.00, Comm: 4G, Camera: 8MP, Screen: 5.5\", Vid Res: 720p", o.toString());
    }
}
