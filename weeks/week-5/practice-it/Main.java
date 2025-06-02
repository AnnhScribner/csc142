public class Main {
    public static void main(String[] args) {
        BankAccount b = new BankAccount("Benson");
        System.out.println(b);
        b.deposit(20.00);
        b.deposit(12);
        System.out.println(b);

        b.transactionFee(5.00);
        b.withdraw(5);
        b.withdraw(10);
        b.withdraw(15);
        b.withdraw(20);
        System.out.println(b);


        b.transactionFee(10.0);
        b.withdraw(10);
        b.withdraw(20);
        b.withdraw(30);
        b.withdraw(40);
        System.out.println(b);
    }
}
