// This Bear class is a subclass of Animal class
public class Bear extends Mammal{

    public Bear(String name, int yearBorn){
        // The first line has to ALWAYS relies on the parent class/superclass
        super(name, yearBorn);
    }

    @Override
    public String getSound(){
        return "rawr!";
    }

    @Override
    public String getDiet(){
        return "salmon, barries, honey";
    }
    
}
