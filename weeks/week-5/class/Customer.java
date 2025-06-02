public class Customer {

    private int custNumber;
    private String custName;
    private double custBalance;

    /**
     * Full constructor (all attributes)
     *
     * @param   custNumber      the customer number for this customer; must be 1000-9999 inclusive
     * @param   custName        the customer name for this customer; must not be empty or null
     * @param   custBalance     the starting balance for this customer
     */
    public Customer(int custNumber, String custName, double custBalance) {
        if (custNumber < 1000 || custNumber > 9999) {
            throw new IllegalArgumentException("Valid range: 1000 to 9999");
        }
        this.custNumber = custNumber;
        this.custBalance = custBalance;
        setName(custName);
    }

    /**
     * Minimal constructor
     *
     * @param   custNumber      the customer number for this customer
     */
    public Customer(int custNumber) {
        this(custNumber, "", 0.0);
    }

    /**
     * Retrieves the customer number
     *
     * @return      this customer's customer number
     */
    public int getNumber(){
        return custNumber;
    }

    /**
     * Retrieves the customer name
     *
     * @return      this customer's name
     */
    public String getName() {
        return custName;
    }

    /**
     * Retrieves the customer balance
     *
     * @return      this customer's balance
     */
    public double getBalance() {
        return custBalance;
    }

    /**
     * Updates the customer's name
     *
     * @param   custName        the updated name for this customer
     */
    public void setName(String custName) {
        if (custName == null || custName.isEmpty()) {
            throw new IllegalArgumentException("Name can't be empty or null");
        }
        this.custName = custName;
    }

    /**
     * Charges this customer a specific amount of money, increasing their balance
     *
     * @param   amtCharged      the amount to charge this customer
     * @return                  the balance after the charge
     */
    public double charge(double amtCharged) {
        custBalance += amtCharged;
        return custBalance;
    }

    /**
     * Credits this customer a specific amount of money, decreasing their balance
     *
     * @param   amtCredited     the amount to credit this customer
     * @return                  the balance after the credit
     */
    public double credit(double amtCredited) {
        custBalance -= amtCredited;
        return custBalance;
    }

    /**
     * Expresses the state of the customer in string form
     *
     * @return      a representation of the customer's state
     */
    public String toString() {
        String custInfo = "";
        custInfo += "Customer number  : " + custNumber + "\n";
        custInfo += "Customer name    : " + custName + "\n";
        custInfo += "Customer balance : $" + String.format("%,.2f\n", custBalance);
        return custInfo;
    }
}
