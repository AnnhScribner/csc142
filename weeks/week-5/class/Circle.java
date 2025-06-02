public class Circle {
    private static final double PI = 3.14159;

    private double r;

    public double getRadius(){
        return r;
    }
    public Circle(double r){
        this.r = r;
    }
    public double area(){
        return PI * r * r;
    }
    public double circumference(){
        return 2 * PI * r;
    }
    public String toString(){
        return String.format("Circle{radius=%.1f}", r);
    }

}
