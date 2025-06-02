//@author Anna Scribner
//@version Jan 30, 2025

public class Student {
    private String name;
    private int id;
    private int units;

    // constructor
    public Student(String name, int id) {
        setName(name);
        setId(id);
        this.units = 0;
    }

    // getters and setters
    public void setName(String name) {
        if (name == null){
            throw new IllegalArgumentException("Name can't be empty");
        }
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUnits(int units) {
        this.units = units;
    }

    public String getName() {
        return name;
    }

    public int getID() {
        return id;
    }

    public int getUnits() {
        return units;
    }

    // methods
    public void incrementUnits(int units) {
        setUnits(this.units += units);
    }

    public boolean hasEnoughUnits() {
        return getUnits() >= 180;
    }

    @Override
    public String toString() {
        return String.format("%s (#%d)", name, id);
    }
}
