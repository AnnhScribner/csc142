/*
Program to test Lab2 file

@author Anna Scribner
@version Jan 14, 2025
 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PadStringTest {

    @Test
    void padString() {
        assertEquals("   hello", PadString.padString("hello", 8));
        assertEquals("congratulations", PadString.padString("congratulations", 10));
        assertEquals("    ", PadString.padString("", 4));
        assertEquals("Anna", PadString.padString("Anna", 2));
    }
}