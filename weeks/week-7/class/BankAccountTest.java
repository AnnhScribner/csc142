import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class BankAccountTest {

    @Test
    void deposit() {
        BankAccount b = new BankAccount("123");
        assertEquals(0, b.getBalance());
        assertEquals("0", b.getTransactions());

        b.deposit(10);
        assertEquals(10, b.getBalance());
        assertEquals("1", b.getTransactions());
    }

    @Test
    void withdraw() {
        BankAccount b = new BankAccount("123");
        assertEquals(0, b.getBalance());
        assertEquals("0", b.getTransactions());

        b.deposit(100);
        assertEquals(100, b.getBalance());
        assertEquals("1", b.getTransactions());

        b.withdraw(10);
        assertEquals(90, b.getBalance());
        assertEquals("2", b.getTransactions());
    }

    @Test
    void transfer(){
        BankAccount ben = new BankAccount("A");
        ben.deposit(90.00);
        BankAccount mar = new BankAccount("B");
        mar.deposit(25);

        ben.transfer(mar, 20);
        assertEquals(65, ben.getBalance()); // check
        assertEquals(45, mar.getBalance()); // check

        ben.transfer(mar, 10);
        assertEquals(50, ben.getBalance()); // check
        assertEquals(55, mar.getBalance()); // check

        ben.transfer(mar, -1);
        assertEquals(50, ben.getBalance()); // check
        assertEquals(55, mar.getBalance()); // check

        mar.transfer(ben, 39.00);
        assertEquals(89, ben.getBalance());
        assertEquals(11, mar.getBalance());

        mar.transfer(ben, 50.00);
        assertEquals(95, ben.getBalance());
        assertEquals(0, mar.getBalance());

        mar.transfer(ben,  1.00);
        assertEquals(95, ben.getBalance());
        assertEquals(0, mar.getBalance());

        ben.transfer(mar, 88.00);
        assertEquals(2, ben.getBalance());
        assertEquals(88, mar.getBalance());

        ben.transfer(mar,  1.00);
        assertEquals(2, ben.getBalance());
        assertEquals(88, mar.getBalance());




    }
}