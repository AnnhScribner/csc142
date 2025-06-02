// @author Anna Scribner
// @version Jan 27, 2025

public class Donut {
    public enum Filling {
        NO_FILLING, BAVARIAN_CREAM, STRAWBERRY_JAM, NUTELLA
    }

    // state - data
    // a field - flavor
    private String flavor;
    private double price;
    private int calories;
    private Filling filling;
    private boolean hasNuts;


    // behaviors - methods (constructor)
    // - method is the same name as the class
    // - has NO return type
    // - should be Capitalized
    // - same name as the class



    public void setHasNuts(boolean hasNuts) {
        this.hasNuts = hasNuts;
    }

    public void setFilling(Filling filling) {
        this.filling = filling;
    }

    public boolean getHasNuts() {
        return hasNuts;
    }

    public Filling getFilling() {
        return filling;
    }

    @Override
    public String toString() {
        return String.format("Flavor: %s, Price: $%.2f, " +
                        "Calories: %d, Filling: %s, Has Nuts: %s",
                flavor, price, calories, filling, hasNuts);
    }


    public Donut(String flavor) {
        // this() -> call my own constructor
        //this.flavor = flavor; // this refers to our own statement -> String flavor <- from the beginning
        this("Strawberry", 2.00, 150);
    }

    // overload Donut methods
    public Donut(String flavor, double price, int calories) {
        if (flavor.isEmpty() || flavor == null) {
            throw new IllegalArgumentException("Flavor must be specified");
        }
        this.flavor = flavor;
        setPrice(price);
        setCalories(calories);
    }

    // Accessor methods (getter methods)
    public String getFlavor() {
        return flavor;
    }

    public double getPrice() {
        return price;
    }

    public int getCalories() {
        return calories;
    }

    // Mutator method (setter methods)
    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("NO free donuts! (no negative price)");
        }
        this.price = price;
    }

    public void setCalories(int calories) {
        if (calories < 0) {
            throw new IllegalArgumentException("Calories cannot be negative");
        }
        this.calories = calories;
    }
}

// toString method comes from Object class
// String version of our object
//    @Override
//    public String toString() {
//        return "\nFlavor: " + flavor +
//                "\nPrice: $" + price +
//                "\nCalories: " + calories;
//    }
//}
