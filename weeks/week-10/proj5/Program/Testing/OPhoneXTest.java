/**
 * @author Anna Scribner
 * @version March 11, 2025
 *
 * A test class to test the methods in OPhoneX class
 */
package Testing;

import org.junit.jupiter.api.Test;
import src.OPhoneX;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OPhoneXTest {

    /**
     * Test the method getName() of the OPhone9 class
     */
    @Test
    void testGetName() {
        OPhoneX o = new OPhoneX();
        assertEquals("OPhoneX", o.getName());
    }

    /**
     * Test the method getPrice() of the OPhone9 class
     */
    @Test
    void testGetPrice() {
        OPhoneX o = new OPhoneX();
        assertEquals(870.00f, o.getPrice(), 0.01f);
    }

    /**
     * Test the method getScreen() of the OPhone9 class
     */
    @Test
    void testGetScreen() {
        OPhoneX o = new OPhoneX();
        assertEquals("6.7\"", o.getScreen());
    }

    /**
     * Test the method getComm() of the OPhone9 class
     */
    @Test
    void testGetComm() {
        OPhoneX o = new OPhoneX();
        assertEquals(5, o.getComm());
    }

    /**
     * Test the method getVidRes() of the OPhone9 class
     */
    @Test
    void testGetVidRes() {
        OPhoneX o = new OPhoneX();
        assertEquals("1080p", o.getVidRes());
    }

    /**
     * Test the method getCam() of the OPhone9 class
     */
    @Test
    void testGetCam() {
        OPhoneX o = new OPhoneX();
        assertEquals(12, o.getCam());
    }

    /**
     * Test the method toString() of the OPhone9 class
     */
    @Test
    void testToString() {
        OPhoneX o = new OPhoneX();
        assertEquals("OPhoneX: Price $870.00, Comm: 5G, Camera: 12MP, Screen: 6.7\", Vid Res: 1080p", o.toString());
    }
}
