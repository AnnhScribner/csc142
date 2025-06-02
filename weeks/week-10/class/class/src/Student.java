public class Student implements Comparable<Student>{
    private String name;
    private String id;
    private int credits;
    private double gpa;

    public Student(String name, String id, int credits, double gpa) {
        this.name = name;
        this.id = id;
        this.credits = credits;
        this.gpa = gpa;
    }

    @Override
    public int compareTo(Student other){
        return name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return String.format("ID: %s,\n" +
                "Name: %s,\n" +
                "Credit: %d,\n" +
                "GPA: %.1f", id, name, credits, gpa);
    }
}