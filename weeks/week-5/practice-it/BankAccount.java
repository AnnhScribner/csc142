public class BankAccount {
    private String id;
    private double balance;
    private int transactions;

    public BankAccount(String id) {
        setID(id);
        this.balance = 0.0;
        this.transactions = 0;
    }

    public void setID(String id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setTransactions(int transactions) {
        this.transactions = transactions;
    }

    public String getID() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public int getTransactions() {
        return transactions;
    }


    public void deposit(double amount) {
        if (amount > 0 && amount < 500) {
            balance += amount;
            transactions += 1;
        }
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            transactions += 1;
        }
    }

    public boolean transactionFee(double feeAmount) {
        // *1 for first transaction
        //*2 for second transaction ..
        double totalFee = 0.0;
        for (int i = 1; i <= transactions; i++){
            totalFee += feeAmount * i;
        }
        balance -= totalFee;
            if (balance < 0.0) {
                balance = 0.0;
            }
        return balance > 0.0;
    }

    public String toString() {
        if (balance < 0) {
            return String.format("%s, -$%.2f", id, Math.abs(balance));
        }
        return String.format("ID: %s, Balance: $%.2f, Transaction: %d", id, balance, transactions);
    }
}
