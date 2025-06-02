public class Mammal extends Animal {

    public Mammal(String name, int yearBorn) {
        super(name, yearBorn);
    }

    @Override
    public String getMovement() {
        return "walks on four limbs";
    }

    @Override
    public String getBodyCovering() {
        return "fur/hair";
    }

    // additional method -> i'm not overriding
    public String getFeedYoung() {
        return "milk";
    }

    @Override
    public String toString() {
        return super.toString() + "\nFeed Young: " + getFeedYoung();
    }

}
