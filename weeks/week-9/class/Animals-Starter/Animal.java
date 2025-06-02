import java.time.LocalDate;

public class Animal {
    
    //---------------------------------------------------------------
    //      STATIC METHODS
    //---------------------------------------------------------------
    public static int calcAge(int yearBorn) {

        return LocalDate.now().getYear() - yearBorn;
    }

    //---------------------------------------------------------------
    //      INSTANCE DATA
    //---------------------------------------------------------------
    private String  name;
    private int     yearBorn;
    private String  movement;
    private String  sound;
    private String  diet;
    private String  bodyCovering;
    
    //---------------------------------------------------------------
    //      CONSTRUCTORS
    //---------------------------------------------------------------
    public Animal(String name, int yearBorn) {
        setName(name);
        setYearBorn(yearBorn);
    }
    
    //---------------------------------------------------------------
    //      GET METHODS
    //---------------------------------------------------------------
    public String getName() {
        return name;
    }
    
    public String getMovement() {
        return "various movements";
    }

    public String getSound() {
        return "various sounds";
    }

    public String getDiet() {
        return "various diets";
    }
    
    public String getBodyCovering() {
        return "various body coverings";
    }
    
    //---------------------------------------------------------------
    //      SET METHODS
    //---------------------------------------------------------------
    public void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("name cannot be null");
        }
        this.name = name;
    }
    
    public void setYearBorn(int yearBorn) {
        if (yearBorn < 0) {
            throw new IllegalArgumentException("yearBorn can't be negative");
        }
        this.yearBorn = yearBorn;
    }
        
    //---------------------------------------------------------------
    //      OTHER METHODS
    //---------------------------------------------------------------

    public int calcAge() {
        return calcAge(yearBorn);
    }

    public String toString() { 
        return   String.format("Class: %s\nName: %s\nAge: %d\nMovement: %s\nSound: %s\nDiet: %s\nBody Covering: %s",
                        getClass().getName(), getName(), calcAge(), getMovement(),
                        getSound(), getDiet(), getBodyCovering());
        // return   "Class: "          + Animal               + "\n" + 
                 // "Name: "           + getName()            + "\n" + 
                 // "Age: "            + calcAge()            + "\n" + 
                 // "Movement: "       + getMovement()        + "\n" + 
                 // "Sound: "          + getSound()           + "\n" + 
                 // "Diet: "           + getDiet()            + "\n" + 
                 // "Body Covering: "  + getBodyCovering();
    }
}
