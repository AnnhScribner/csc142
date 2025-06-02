/**
 * @author Anna Scribner
 * @version Jan 24, 2025
 */

public class Pizza {
    // ------------------------------------------------------------------------------------
    // ENUMERATE TYPES
    // -------------------------------------------------------------------------------------
    public enum PizzaType {CHEESE, PEPPERONI, VEGGIE}

    ;

    public enum PizzaSize {SMALL, MEDIUM, LARGE, XL}

    ;

    // ------------------------------------------------------------------------------------
    // CONSTANTS
    // -------------------------------------------------------------------------------------

    // PUBLIC means it is going to be available to the outside world
    // So, anybody who's using the class can get to this thing

    // STATIC means it's available whether or not you have an object
    // instantiated. So, we'll be able to get to these constants from
    // the class name even if they haven't created an object of this type

    // FINAL means you cant change de value once you've assigned it. So, in this
    // case, once you've assigned it on this line you are done. You can't go and
    // try to change it.

    public static final int SMALL_DIAM = 9;
    public static final int MEDIUM_DIAM = 12;
    public static final int LARGE_DIAM = 16;
    public static final int XL_DIAM = 18;

    // ------------------------------------------------------------------------------------
    // PRIVATE DATA
    // -------------------------------------------------------------------------------------
    private PizzaType type;
    private PizzaSize size;
    private boolean thinCrust;
    private String specInstruct;


    // ------------------------------------------------------------------------------------
    // CONSTRUCTORS
    // -------------------------------------------------------------------------------------

    /**
     * Full constructor for objects of class Pizza
     */
    public Pizza(PizzaType type, PizzaSize size, boolean thinCrust, String specInstruct) {
        this.type = type; // This -> I am talking about an object reference and then
        // drilling down to the type
        // -> this.type = type basically means "Hey! takes this type (Pizza(Pizza type)) and
        // assign it to the objects type private data (private PizzaType type)"
        this.size = size;
        this.thinCrust = thinCrust;
        this.specInstruct = specInstruct;
    }

    /**
     * Type and Size constructor for objects of class Pizza
     */
    public Pizza(PizzaType type, PizzaSize size) {
//        this.type = type;
//        this.size = size;
//        this.thinCrust = false;
//        this.specInstruct = "";
        // instead of repeating code I can do...
        this(type, size, false, "");
    }

    /**
     * Empty constructor for objects of class Pizza
     */
    public Pizza() {
        this(PizzaType.PEPPERONI, PizzaSize.LARGE);
    }

    // ------------------------------------------------------------------------------------
    // ACCESSORS
    // -------------------------------------------------------------------------------------

    /**
     * Gets the pizza type
     *
     * @return the type of pizza
     */
    public PizzaType getType() {

        return type;
    }

    /**
     * Gets the pizza size
     *
     * @return the type of pizza
     */
    public PizzaSize getSize() {

        return size;
    }

    /**
     * Gets whether thin crust is specified
     *
     * @return thin crust desired
     */
    public boolean getThinCrust() {

        return thinCrust;
    }

    /**
     * Gets the special instructions associated with the pizza
     *
     * @return special instructions
     */
    public String getInstruct() {

        return specInstruct;
    }

    /**
     * Gets the special instructions associated with the pizza
     *
     * @return special instructions
     */
//    public double getArea() {
//        double diameter, area;
//        if (size == PizzaSize.SMALL) diameter = SMALL_DIAM;
//        else if (size == PizzaSize.MEDIUM) diameter = MEDIUM_DIAM;
//        else if (size == PizzaSize.LARGE) diameter = LARGE_DIAM;
//        else diameter = XL_DIAM;
//
//        return Math.pow(diameter / 2.0) * 3.14;
//    }
}
