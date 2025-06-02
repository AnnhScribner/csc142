// A BankAccount keeps track of a user's money balance and ID,
// and counts how many transactions (deposits/withdrawals) are made.

public class BankAccount {
    private String id;
    private double balance;
    private int transactions;

    // Constructs a BankAccount object with the given id, and
    // 0 balance and transactions.
    public BankAccount(String id) {
        this.id = id;
        setBalance(0.0);
        this.transactions = 0;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // returns the field values
    public double getBalance() {
        return balance;
    }

    public String getID() {
        return id;
    }

    public String getTransactions() {
        return Integer.toString(transactions);
    }

    // Adds the amount to the balance if it is between 0-500.
    // Also counts as 1 transaction.
    public void deposit(double amount) {
        if (amount > 0 && amount <= 500) {
            balance += amount;
            transactions += 1;
        } else {
            System.out.println("Deposit can't be succeeded");
        }
    }

    // Subtracts the amount from the balance if the user has enough money.
    // Also counts as 1 transaction.
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            transactions += 1;
        } else {
            System.out.println("Withdraw can't be succeeded");
        }
    }

    public void transfer(BankAccount bankAccount, double moneyToTransfer) {
        double fee = 5.0;
        if ((moneyToTransfer < (balance - fee)) && (moneyToTransfer > fee)) {
            balance -= moneyToTransfer + fee;
            bankAccount.deposit(moneyToTransfer);
            transactions += 1;
        }
        else if ((balance - fee < moneyToTransfer) && (balance - fee > fee)){
            bankAccount.deposit(balance - fee);
            setBalance(0);
            transactions += 1;
        }
    }
}