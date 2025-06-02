/**
 * @author Anna Scribner
 * @version March 11, 2025
 *
 * A test class to test the methods in OPhone8Mini class
 */

package Testing;
import org.junit.jupiter.api.Test;
import src.OPhone8Mini;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OPhone8MiniTest {

    /**
     * Test the method getName() of the OPhone8Mini class
     */
    @Test
    void testGetName(){
        OPhone8Mini o = new OPhone8Mini();
        assertEquals("OPhone8Mini", o.getName());
    }

    /**
     * Test the method getPrice() of the OPhone8Mini class
     */
    @Test
    void testGetPrice(){
        OPhone8Mini o = new OPhone8Mini();
        assertEquals(520.00f,  o.getPrice(), 0.01f);
    }

    /**
     * Test the method getScreen() of the OPhone8Mini class
     */
    @Test
    void testGetScreen(){
        OPhone8Mini o = new OPhone8Mini();
        assertEquals("4.6\"", o.getScreen());
    }

    /**
     * Test the method getComm() of the OPhone8Mini class
     */
    @Test
    void testGetComm(){
        OPhone8Mini o = new OPhone8Mini();
        assertEquals(4, o.getComm());
    }

    /**
     * Test the method getVidRes() of the OPhone8Mini class
     */
    @Test
    void testGetVidRes(){
        OPhone8Mini o = new OPhone8Mini();
        assertEquals("720p", o.getVidRes());
    }

    /**
     * Test the method getCam() of the OPhone8Mini class
     */
    @Test
    void testGetCam(){
        OPhone8Mini o = new OPhone8Mini();
        assertEquals(8, o.getCam());
    }

    /**
     * Test the method toString() of the OPhone8Mini class
     */
    @Test
    void testToString(){
        OPhone8Mini o = new OPhone8Mini();
        assertEquals("OPhone8Mini: Price $520.00, Comm: 4G, Camera: 8MP, Screen: 4.6\", Vid Res: 720p", o.toString());
    }


}
