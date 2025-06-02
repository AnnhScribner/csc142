import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PointTest {

    @Test
    void flip() {
        Point point = new Point(4, 17);
        point.flip();
        Assertions.assertEquals(-17, point.getX());
        Assertions.assertEquals(-4, point.getY());

        point = new Point(5, -3);
        point.flip();
        Assertions.assertEquals(3, point.getX());
        Assertions.assertEquals(-5, point.getY());

    }

    @Test
    void quadrant() {
        Point point = new Point(2, 5);
        Assertions.assertEquals(1, point.quadrant());

        point = new Point(-2, -5);
        Assertions.assertEquals(3, point.quadrant());

        point = new Point(-2, 7);
        Assertions.assertEquals(2, point.quadrant());

        point = new Point(9, -8);
        Assertions.assertEquals(4, point.quadrant());

        point = new Point(0,0);
        Assertions.assertEquals(0, point.quadrant());
    }

    @Test
    void manhattanDistance(){
        Point point1 = new Point(2, 4);
        Point point2 = new Point(2, 4);
        int distance = point1.manhattanDistance(point2);

        Assertions.assertEquals(0, distance);

        point1 = new Point(2, 4);
        point2 = new Point(1, 3);
        distance = point1.manhattanDistance(point2);

        Assertions.assertEquals(2, distance);
    }

    @Test
    void isVertical(){
        Point point1 = new Point(5, 10);
        Point point2 = new Point (5, 567);
        Assertions.assertEquals(true, point1.isVertical(point2));

        point1 = new Point(87, 10);
        point2 = new Point (-12, 9);
        Assertions.assertEquals(false, point1.isVertical(point2));
    }
    @Test
    void slope(){
        Point point1 = new Point(0, 0);
        Point point2 = new Point (10, 0);
        Assertions.assertEquals(0.0, point1.slope(point2));

        point1 = new Point(0, 0);
        point2 = new Point (10, 10);
        Assertions.assertEquals(1.0, point1.slope(point2));

        point1 = new Point(0, 0);
        point2 = new Point (20, 10);
        Assertions.assertEquals(0.5, point1.slope(point2));
    }
}