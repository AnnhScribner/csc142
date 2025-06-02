/**
 * @author Anna Scribner
 * @version Feb 7, 2025
 * <p>
 * This class represents a circle with a color, center position, and radius.
 * It includes methods to get and update its properties, as well as draw it.
 */

import java.awt.Color;
import java.awt.Graphics;

public class Circle {

    private Color color;
    private double centerX;
    private double centerY;
    private double radius;

    /**
     * Creates a circle with a given color, center coordinates, and radius.
     *
     * @param color The color of the circle.
     * @param centerX X coordinate of the center.
     * @param centerY Y coordinate of the center.
     * @param radius Radius of the circle.
     */
    public Circle(Color color, double centerX, double centerY, double radius) {
        setColor(color);
        setCenterX(centerX);
        setCenterY(centerY);
        setRadius(radius);
    }

    /**
     * Returns the color of the circle.
     *
     * @return color The current color.
     */
    public Color getColor() {
        return color;
    }

    /**
     * Returns the X coordinate of the circle’s center.
     *
     * @return center X position
     */
    public double getCenterX() {
        return centerX;
    }

    /**
     * Returns the Y coordinate of the circle’s center.
     *
     * @return center Y position
     */
    public double getCenterY() {
        return centerY;
    }

    /**
     * Returns the radius of the circle.
     *
     * @return radius of the circle.
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Sets the color of the circle.
     *
     * @param color The new color.
     * @throws IllegalArgumentException if the color is null.
     */
    public void setColor(Color color) {
        if (color == null) {
            throw new IllegalArgumentException("Color cannot be null");
        }
        this.color = color;
    }

    /**
     * Sets the X coordinate of the circle’s center.
     *
     * @param centerX The new X coordinate.
     */
    public void setCenterX(double centerX) {
        this.centerX = centerX;
    }

    /**
     * Sets the Y coordinate of the circle’s center.
     *
     * @param centerY The new Y coordinate.
     */
    public void setCenterY(double centerY) {
        this.centerY = centerY;
    }

    /**
     * sets the radius of the circle.
     *
     * @param radius The new radius.
     * @throws IllegalArgumentException if the radius is negative.
     */
    public void setRadius(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("Radius cannot be negative");
        }
        this.radius = radius;
    }

    /**
     * draws the circle at the correct position on a graphics panel.
     *
     * @param graphics The graphics object used for drawing.
     * @param drawSize The size of the drawing area.
     *
     * @throws IllegalArgumentException if the graphics is null.
     * @throws IllegalArgumentException if the drawSize < 1.
     */
    public void draw(Graphics graphics, int drawSize) {
        if (graphics == null) {
            throw new IllegalArgumentException("Graphic cannot be null");
        }
        if (drawSize < 1){
            throw new IllegalArgumentException("Drawing size cannot be less then 1");
        }
        double graphicX1 = Circle.cartesianXToGraphicsX(drawSize, centerX);
        double graphicY1 = Circle.cartesianYToGraphicsY(drawSize, centerY);
        graphicX1 -= radius;
        graphicY1 -= radius;

        graphics.setColor(color);
        graphics.fillOval((int) graphicX1, (int) graphicY1, (int) (radius * 2), (int) (radius * 2));
    }

    /**
     * Returns a string representation of the circle with its center, radius, and color.
     * Useful for debugging
     *
     * @return a formatted string describing the circle.
     */
    public String toString() {
        return String.format("Circle centered at (%.4f, %.4f) with radius %.4f and color %s",
                centerX, centerY, radius, color);
    }

    /**
     * Converts X position from cartesian coordinates to graphics coordinates
     *
     * @param drawWidth The width of the drawing area.
     * @param x The X coordinate in Cartesian space.
     * @return the adjusted X coordinate for the graphics panel.
     */
    private static double cartesianXToGraphicsX(int drawWidth, double x) {
        return x + (drawWidth / 2);

    }

    /**
     * Converts Y position from cartesian coordinates to graphics coordinates
     *
     * @param drawHeight The height of the drawing area.
     * @param y The Y coordinate in Cartesian space.
     * @return The adjusted Y coordinate for the graphics panel.
     */
    private static double cartesianYToGraphicsY(int drawHeight, double y) {
        return (drawHeight / 2) - y;
    }
}
