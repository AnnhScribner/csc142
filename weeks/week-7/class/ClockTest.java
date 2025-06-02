import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClockTest {

    @Test
    void advance() {
        Clock time = new Clock(6, 27, "PM");

        assertEquals("6:27 PM", time.toString());

        time.advance(1);
        assertEquals("6:28 PM", time.toString());

        time.advance(30);
        assertEquals("6:58 PM", time.toString());

        time.advance(5);
        assertEquals("7:03 PM", time.toString());

        time.advance(60);
        assertEquals("8:03 PM", time.toString());

        time.advance(128);
        assertEquals("10:11 PM", time.toString());

        time.advance(180);
        assertEquals("1:11 AM", time.toString());

        time.advance(1440);
        assertEquals("1:11 AM", time.toString());

        time.advance(21075);
        assertEquals("4:26 PM", time.toString());

    }
}