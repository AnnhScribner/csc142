//@author Anna Scribner
//@version Jan 29, 2025

public class Purchase {

    // public -> accessible outside my class
    // final -> to make TAX_RATE constant
    // static -> it means I don't need instance (object) to reference
    // calling -> ClassName.methodName();
    public static final double TAX_RATE = 0.1035;

    private Donut donut;
    private int donutCount;

    // constructor
    public Purchase(Donut donut, int donutCount) {
        setDonut(donut);
        setDonutCount(donutCount);
    }

    public void setDonut(Donut donut) {
        if (donut == null) {
            throw new IllegalArgumentException("Donut must not be null.");
        }
        this.donut = donut;
    }

    public void setDonutCount(int donutCount) {
        if (donutCount < 0) {
            throw new IllegalArgumentException("There's NO negative donuts.");
        }
        this.donutCount = donutCount;
    }

    public Donut getDonut() {
        return donut;
    }

    public int getDonutCount() {
        return donutCount;
    }

    public double getTotalCost() {
        return donut.getPrice() * donutCount;
    }

    public static double calcTotalCost(double price, int count){
        double subtotal = price * count;
        double tax = subtotal * TAX_RATE;
        return subtotal + tax;
    }

    @Override
    public String toString() {
        return String.format("Donut: %s, Donut Count: %d",
                donut.getFlavor(), donutCount);
    }
}
