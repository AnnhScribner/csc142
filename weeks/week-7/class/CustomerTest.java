import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    public void testConstructors() {
        // Create instance of class to test the method
        Customer costumerTest = new Customer(1111, "Test Customer", 1.23);

        // customer number
        assertEquals(1111, costumerTest.getNumber());
        assertEquals("Test Customer", costumerTest.getName());
        assertEquals(1.23, costumerTest.getBalance());

    }

    public void testConstroctorPreconditions(){
        assertThrows(IllegalArgumentException.class, () -> new Customer(222));
    }

    @Test
    void getNumber() {
    }

    @Test
    void getName() {
    }

    @Test
    void getBalance() {
    }

    @Test
    void setName() {
    }

    @Test
    void charge() {
    }

    @Test
    void credit() {
    }

    @Test
    void testToString() {
    }
}