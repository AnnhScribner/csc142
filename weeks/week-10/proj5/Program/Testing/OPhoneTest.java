/**
 * @author Anna Scribner
 * @version March 11, 2025
 *
 * A test class to test the methods in OPhone class
 */

package Testing;
import src.OPhone;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OPhoneTest {

    /**
     * Test the method getPrice() of the OPhone class
     */
    @Test
    void testGetPrice(){
        OPhone o = new OPhone();
        assertEquals(790, o.getPrice());
    }

    /**
     * Test the method getName() of the OPhone class
     */
    @Test
    void testGetName(){
        OPhone o = new OPhone();
        assertEquals("OPhone", o.getName());
    }

    /**
     * Test the method getComm() of the OPhone class
     */
    @Test
    void testGetComm(){
        OPhone o = new OPhone();
        assertEquals(4, o.getComm());
    }

    /**
     * Test the method getCam() of the OPhone class
     */
    @Test
    void testGetCam(){
        OPhone o = new OPhone();
        assertEquals(8, o.getCam());
    }

    /**
     * Test the method toString() of the OPhone class
     */
    @Test
    void testToString(){
        OPhone o = new OPhone();
        assertEquals("OPhone: Price $790.00, Comm: 4G, Camera: 8MP", o.toString());
    }
}
