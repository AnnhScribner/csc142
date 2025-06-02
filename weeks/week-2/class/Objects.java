/*
@author Anna Scribner
@version Jan 13, 2025

Classes are bundles/units that contain definitions for:
- State (data)
- Behaviors (methods)

Objects are creates FROM classes; they store data and can be asked to do work
via their methods
 */

public class Objects {
    public static void main(String[] args) {
//         Just made an instance of a String object
        String myName = "Anna";

//        Instances methods
        System.out.println(myName.toLowerCase());
        System.out.println(myName.length());
        System.out.println(myName.toUpperCase());

//        1 (Object object)     -> Reference is created
//        2 (Object in the end) -> Object is created
//        3 (=)                 -> Binds/connect the two

//        Object object = new Object();
    }
}
