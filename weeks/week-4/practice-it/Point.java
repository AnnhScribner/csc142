public class Point {
    // ------------------------------------------------------------------------------------
    // PRIVATE DATA
    // -------------------------------------------------------------------------------------

    private int x;
    private int y;

    // Constructor
    public Point(int xx, int y) {
        this.x = xx;
        this.y = y;
    }
    public void flip() {
        int saveX = x;
        x = -y;
        y = -saveX;
    }
    public int manhattanDistance(Point other){
//        int xOtherPoint = other.getX();
//        int yOtherPoint = other.getY();
        return Math.abs(x - other.x) + Math.abs(y - other.y);
    }
    public boolean isVertical(Point other){
        return x == other.x;
    }
    public double slope(Point other){
        if (other.x == x){
            throw new IllegalArgumentException();
        }
        return (double)(other.y - y) / (other.x - x);
    }
    public boolean isCollinear(Point p1, Point p2){
        double slopePoint1ToPoint2 = p1.slope(p2) * 10000.0;
        double slopePointToPoint1 = this.slope(p1) * 10000.0;
        return Math.round(slopePoint1ToPoint2) == Math.round(slopePointToPoint1);
    }



    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }


    @Override
    public String toString() {
        return "\nx = " + x +
                "\ny = " + y;
    }


    public int quadrant() {
        if (x > 0 && y > 0) {
            return 1;
        }
        if (x < 0 && y > 0) {
            return 2;
        }
        if (x < 0 && y < 0) {
            return 3;
        }
        if (x > 0 && y < 0) {
            return 4;
        }

        return 0;
    }


}
