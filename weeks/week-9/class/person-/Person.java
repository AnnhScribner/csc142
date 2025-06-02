public class Person {
    // instance variables
    private String id;
    private String name;
    private String email;

    // constructor
    public Person(String name, String email){
        this.id = "";
        this.name = name;
        this.email = email;
    }

    //other methods
    public boolean validId(String id){
        return true;
    }

    public void setId(String id){
        if(!validId(id)){
            throw new IllegalArgumentException("Invalid ID; check ID specifications");
        }
        this.id = id;
    }

    public String getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(){
        this.email = email;
    }

    public String toString(){
        String info = "";
        info += "Id     = " + id + "\n";
        info += "Name   = " + name + "\n";
        info += "Email  = " + email + "\n";
        return info;
    }

}
