public class Main {
    public static void main(String[] args){
        Student s = new Student("Bobby", "bobb@gmail.com", 20);
        s.setId("123456789");
        s.recordCourseCompletion("Algebra II", 3.9);
        s.recordCourseCompletion("Geometry I", 3.7);

        System.out.println(s);

        Person p = new Student("Susie", "suz@gmail.com", 35);
        // 1: does this work?
        // 2: Why?
        // 3: If i wanna print p, what is going to happen?
    }
}
