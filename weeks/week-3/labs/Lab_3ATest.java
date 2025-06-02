import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Lab_3ATest {

    @Test
    void daysInMonth() {
        assertEquals(31, Lab_3A.daysInMonth(1));
        assertEquals(28, Lab_3A.daysInMonth(2));
        assertEquals(31, Lab_3A.daysInMonth(3));
        assertEquals(30, Lab_3A.daysInMonth(4));
        assertEquals(31, Lab_3A.daysInMonth(5));
        assertEquals(30, Lab_3A.daysInMonth(6));
        assertEquals(31, Lab_3A.daysInMonth(7));
        assertEquals(31, Lab_3A.daysInMonth(8));
        assertEquals(30, Lab_3A.daysInMonth(9));
        assertEquals(31, Lab_3A.daysInMonth(10));
        assertEquals(30, Lab_3A.daysInMonth(11));
        assertEquals(31, Lab_3A.daysInMonth(12));
        assertEquals(-99, Lab_3A.daysInMonth(0));
        assertEquals(-99, Lab_3A.daysInMonth(13));
        assertEquals(-99, Lab_3A.daysInMonth(-2));
    }
}