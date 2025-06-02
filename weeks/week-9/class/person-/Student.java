// This class is a subclass.
// This Student class is a subclass of Person.
// It extends Person class and adds new functionalities in this subclass
public class Student extends Person {
    // instance variables
    private String[] coursesTaken = new String[30];
    private double[] courseGrades = new double[30];
    private int nextCourseIndex;

    // Constructor
    public Student(String name, String email, int age) {
        // The first line has to ALWAYS relies on the parent class/super class
        // (in this case Person class)
        super(name, email);
    }

    // Other methods
    public void recordCourseCompletion(String courseName, double courseGrade) {
        coursesTaken[nextCourseIndex] = courseName;
        courseGrades[nextCourseIndex] = courseGrade;
        nextCourseIndex++;
    }

    public double getAverageGrade() {
        double gradeTotal = 0.0;
        for (int course = 0; course < nextCourseIndex; course++) {
            gradeTotal += courseGrades[course];
        }
        if (nextCourseIndex == 0) {
            return -99.0;
        } else {
            return gradeTotal / nextCourseIndex;
        }
    }

    // override method
    public boolean validId(String id) {
        boolean validId = true;
        if (id.length() != 9) {
            validId = false;
        } else {
            for (int letterPos = 0; letterPos < id.length(); letterPos++) {
                if (id.charAt(letterPos) < '0' || id.charAt(letterPos) > '9') {
                    validId = false;
                }
            }
        }
        return validId;
    }

    // toString override method -> I subtituted whatever was in Person class
    public String toString() {
        String info = "";
        info += "Student has completed " + nextCourseIndex + " courses so far\n";
        info += "Current grade average is " + getAverageGrade();
        return info;
    }
}
