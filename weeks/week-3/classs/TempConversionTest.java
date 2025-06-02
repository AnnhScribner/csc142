import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The test class TempConversionTest.
 *
 * @author Anna Scribner
 * @version Jan 24, 2025
 */
public class TempConversionTest {

    @Test
    public void testFToC() {
    }

    @Test
    public void testFToK() {
    }

    @Test
    public void testCToF() {
    }

    @Test
    public void testCToK() {
    }

    @Test
    public void testKToF() {
        // 3rd parameter: tells us expected and actual should be within that value
        assertEquals(212.0, TempConversion.kToF(373.15), 0.0001);

        // testing the exception
        // assertThrows(expected, actual);
        assertThrows(IllegalArgumentException.class, () ->
                                            TempConversion.kToF(-0.01));
    }

    @Test
    public void testKToC() {
    }
}