/**
 * @author Anna Scribner
 * @version March 11, 2025
 *
 * A test class to test the methods in OPhone9 class
 */
package Testing;

import org.junit.jupiter.api.Test;
import src.OPhone9;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OPhone9Test {

    /**
     * Test the method getName() of the OPhone9 class
     */
    @Test
    void testGetName() {
        OPhone9 o = new OPhone9();
        assertEquals("OPhone9", o.getName());
    }

    /**
     * Test the method getPrice() of the OPhone9 class
     */
    @Test
    void testGetPrice() {
        OPhone9 o = new OPhone9();
        assertEquals(630.00, o.getPrice());
    }

    /**
     * Test the method getScreen() of the OPhone9 class
     */
    @Test
    void testGetScreen() {
        OPhone9 o = new OPhone9();
        assertEquals("5.6\"", o.getScreen());
    }

    /**
     * Test the method getComm() of the OPhone9 class
     */
    @Test
    void testGetComm() {
        OPhone9 o = new OPhone9();
        assertEquals(5, o.getComm());
    }

    /**
     * Test the method getVidRes() of the OPhone9 class
     */
    @Test
    void testGetVidRes() {
        OPhone9 o = new OPhone9();
        assertEquals("1080p", o.getVidRes());
    }

    /**
     * Test the method getCam() of the OPhone9 class
     */
    @Test
    void testGetCam() {
        OPhone9 o = new OPhone9();
        assertEquals(10, o.getCam());
    }

    /**
     * Test the method toString() of the OPhone9 class
     */
    @Test
    void testToString() {
        OPhone9 o = new OPhone9();
        assertEquals("OPhone9: Price $630.00, Comm: 5G, Camera: 10MP, Screen: 5.6\", Vid Res: 1080p", o.toString());
    }
}
