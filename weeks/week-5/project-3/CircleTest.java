/**
 * @author Anna Scribner
 * @version Feb 7, 2025
 * <p>
 * Unit tests for the Circle class.
 */

import org.junit.jupiter.api.Test;

import java.awt.Color;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CircleTest {

    /**
     * Tests that getColor() correctly returns the circle's assigned color.
     */
    @Test
    void getColor() {
        Circle circle;
        circle = new Circle(Color.RED, 0, 0, 10);
        assertEquals(Color.RED, circle.getColor());

        circle = new Circle(Color.BLUE, 0, 0, 10);
        assertEquals(Color.BLUE, circle.getColor());

        circle = new Circle(Color.GREEN, 0, 0, 10);
        assertEquals(Color.GREEN, circle.getColor());

    }

    /**
     * Tests that getCenterX() correctly returns the circle's X-coordinate.
     *
     */
    @Test
    void getCenterX() {
        Circle circle;
        circle = new Circle(Color.RED, 0, 2, 10);
        assertEquals(0, circle.getCenterX());

        circle = new Circle(Color.RED, 10, 2, 10);
        assertEquals(10, circle.getCenterX());

        circle = new Circle(Color.RED, -3.5, 2, 10);
        assertEquals(-3.5, circle.getCenterX());
    }

    /**
     * Tests that getCenterY() correctly returns the circle's Y-coordinate.
     */
    @Test
    void getCenterY() {
        Circle circle;
        circle = new Circle(Color.RED, 2, 0, 10);
        assertEquals(0, circle.getCenterY());

        circle = new Circle(Color.RED, 2, 15, 10);
        assertEquals(15, circle.getCenterY());

        circle = new Circle(Color.RED, 2, -2.5, 10);
        assertEquals(-2.5, circle.getCenterY());
    }

    /**
     * Tests that getRadius() correctly returns the circle's radius.
     */
    @Test
    void getRadius() {
        Circle circle;
        circle = new Circle(Color.RED, 0, 0, 0);
        assertEquals(0, circle.getRadius());

        circle = new Circle(Color.RED, 0, 0, 10);
        assertEquals(10, circle.getRadius());
    }

    /**
     * Tests that setColor() updates the circle's color correctly.
     */
    @Test
    void setColor() {
        Circle circle;
        circle = new Circle(Color.RED, 0, 0, 10);
        circle.setColor(Color.BLUE);
        assertEquals(Color.BLUE, circle.getColor());

        circle.setColor(Color.GREEN);
        assertEquals(Color.GREEN, circle.getColor());

        circle = new Circle(Color.RED, 0, 0, 10);
        circle.setColor(Color.BLACK);
        assertEquals(Color.BLACK, circle.getColor());
    }

    /**
     * Tests that setCenterX() correctly updates the X-coordinate.
     */
    @Test
    void setCenterX() {
        Circle circle;
        circle = new Circle(Color.RED, 0, 2, 10);
        circle.setCenterX(5.6);
        assertEquals(5.6, circle.getCenterX());

        circle.setCenterX(-8.1);
        assertEquals(-8.1, circle.getCenterX());

        circle = new Circle(Color.RED, -3.5, 2, 10);
        circle.setCenterX(0);
        assertEquals(0, circle.getCenterX());
    }

    /**
     * Tests that setCenterY() correctly updates the Y-coordinate.
     */
    @Test
    void setCenterY() {
        Circle circle;
        circle = new Circle(Color.RED, 2, 0, 10);
        circle.setCenterY(-6.2);
        assertEquals(-6.2, circle.getCenterY());

        circle.setCenterY(0);
        assertEquals(0, circle.getCenterY());

        circle = new Circle(Color.RED, 2, 10, 10);
        assertEquals(10, circle.getCenterY());
    }

    /**
     * Tests that setRadius() correctly updates the circle's radius.
     */
    @Test
    void setRadius() {
        Circle circle;
        circle = new Circle(Color.RED, 0, 0, 0);
        circle.setRadius(10);
        assertEquals(10, circle.getRadius());

        circle.setRadius(1);
        assertEquals(1, circle.getRadius());
    }

    /**
     * Tests the toString() method to ensure correct formatting.
     */
    @Test
    void testToString() {
        Circle circle;
        circle = new Circle(Color.GREEN, 10, 10, 10);
        String expected = "Circle centered at (10.0000, 10.0000) with radius 10.0000 and color java.awt.Color[r=0,g=255,b=0]";
        assertEquals(expected, circle.toString());

        circle = new Circle(Color.BLUE, -10, -20, 5);
        expected = "Circle centered at (-10.0000, -20.0000) with radius 5.0000 and color java.awt.Color[r=0,g=0,b=255]";
        assertEquals(expected, circle.toString());

        circle = new Circle(Color.RED, -3.2, 40.8, 2.6);
        expected = "Circle centered at (-3.2000, 40.8000) with radius 2.6000 and color java.awt.Color[r=255,g=0,b=0]";
        assertEquals(expected, circle.toString());

        circle = new Circle(Color.BLACK, 1.78, -34.9, 15.32);
        expected = "Circle centered at (1.7800, -34.9000) with radius 15.3200 and color java.awt.Color[r=0,g=0,b=0]";
        assertEquals(expected, circle.toString());

    }
}