public class Point {
    private int x;   // Each Point object has
    private int y;   // an int x and y inside.

    // Constructor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // These accessors return the Point's x and y coordinates.
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // Shifts this point's x/y by the given amounts.
    public void translate(int dx, int dy) {
        x = x + dx;
        y = y + dy;
    }

    // Returns this point's distance from (0, 0).
    public double distanceFromOrigin() {
        return Math.sqrt(x * x + y * y);
    }

    // A string version of the Point that is suitable for printing.
    public String toString() {
        return String.format("(" + x + ", " + y + ")");
    }
}