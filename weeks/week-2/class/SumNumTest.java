/*
@author Anna
@version Jan 13, 2025
 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumNumTest {
    //    @Test goes above each test method
    //    Write a test method for each method from the class we're testing
    @Test
    void sumNumOneParameters() {
        //    SumNum(4)
        //    assertEquals(expected, actual);
        //    assertEquals(10, call the method);
        assertEquals(15, SumNum.sumNum(5));
        assertEquals(10, SumNum.sumNum(4));
        assertEquals(0, SumNum.sumNum(-3));
        assertEquals(0, SumNum.sumNum(0));
    }

    @Test
    void sumNumTwoParameters() {
        //    SumNum(4)
        //    assertEquals(expected, actual);
        //    assertEquals(10, call the method);
        assertEquals(15, SumNum.sumNum(1, 5));
        assertEquals(10, SumNum.sumNum(1, 4));
        assertEquals(14, SumNum.sumNum(2, 5));
    }

    @Test
    void sumNumThreeParameters() {
        //    SumNum(4)
        //    assertEquals(expected, actual);
        //    assertEquals(10, call the method);
        assertEquals(9, SumNum.sumNum(1, 5, 2));
        assertEquals(0, SumNum.sumNum(-10, 10, 5));

    }

}