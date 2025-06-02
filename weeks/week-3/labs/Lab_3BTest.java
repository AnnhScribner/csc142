//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class Lab_3BTest {
//
//    @Test
//    void seeMovie() {
//        // testing very interested for any movie less than 5.00 with any numbers of star
//        assertEquals("very interested", Lab_3B.seeMovie(4.99, 1));
//        assertEquals("very interested", Lab_3B.seeMovie(4.99, 2));
//        assertEquals("very interested", Lab_3B.seeMovie(1.00, 3));
//        assertEquals("very interested", Lab_3B.seeMovie(0.99, 4));
//        assertEquals("very interested", Lab_3B.seeMovie(0.99, 5));
//
//        // testing very interested for cost of a movie less than 12 and number of start = 5
//        assertEquals("very interested", Lab_3B.seeMovie(0.99, 5));
//        assertEquals("very interested", Lab_3B.seeMovie(11.99, 5));
//        assertEquals("very interested", Lab_3B.seeMovie(5.00, 5));
//
//        // testing sort-of interested for cost greater than 12 and number of start = 5
//        assertEquals("sort-of interested", Lab_3B.seeMovie(12.00, 5));
//        assertEquals("sort-of interested", Lab_3B.seeMovie(20.00, 5));
//
//        // testing sort-of interested for costs between 5 and 11.99 and number of starts between 2 and 4
//        assertEquals("sort-of interested", Lab_3B.seeMovie(5.00, 2));
//        assertEquals("sort-of interested", Lab_3B.seeMovie(11.99, 4));
//
//        // testing not interested for anything else
//        assertEquals("not interested", Lab_3B.seeMovie(5.00, 1));
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//    }
//}