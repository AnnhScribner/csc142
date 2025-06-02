import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void getName() {
        Student s = new Student("Anna", 1234);
        assertEquals("Anna", s.getName());

        s = new Student("Rocne", 2098);
        assertEquals("Rocne", s.getName());

        s = new Student("Banana", 8651);
        assertEquals("Banana", s.getName());

        s = new Student("", 8651);

        //assertThrows(IllegalArgumentException.class, () -> new Student("", 1234));

    }

    @Test
    void getID() {
        Student s = new Student("Anna", 1234);
        assertEquals(1234, s.getID());

        s = new Student("Anna", 9876);
        assertEquals(9876, s.getID());

    }

    @Test
    void getUnits() {
        Student s = new Student("Anna", 1234);
        assertEquals(0, s.getUnits());

    }

    @Test
    void incrementUnits() {
        Student s = new Student("Anna", 1234);
        s.incrementUnits(10);
        assertEquals(10, s.getUnits());

        s.incrementUnits(80);
        assertEquals(90, s.getUnits());

        s.incrementUnits(20);
        assertEquals(110, s.getUnits());
    }

    @Test
    void hasEnoughUnits() {
        Student s = new Student("Anna", 1234);
        assertEquals(false, s.hasEnoughUnits());

        s = new Student("Anna", 1234);
        s.incrementUnits(100);
        assertEquals(false, s.hasEnoughUnits());

        s = new Student("Anna", 1234);
        s.incrementUnits(180);
        assertEquals(true, s.hasEnoughUnits());


    }

    @Test
    void testToString() {
        Student s = new Student("Marty", 1234);
        assertEquals(true, s.equals(s) );
    }
}