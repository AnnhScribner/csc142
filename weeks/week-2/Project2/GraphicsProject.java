/**
 * A program that uses DrawingPanel and the Graphics library to
 * create a graphical display featuring a star and a space-themed scene.
 *
 * @author Anna Scribner
 * @version Jan 25, 2025
 */

import java.awt.Graphics;
import java.awt.Color;

public class GraphicsProject {

    public static final int PANEL_SIZE = 400;
    public static final int LINE_INCREMENTS = 20;
    public static final int NUMBER_OF_SECTION = 8;
    public static final Color COLOR_START = Color.MAGENTA;
    public static final Color COLOR_END = Color.BLUE;

    public static void main(String[] args) {
        drawStar();
        space();
    }

    /**
     * Creates a square canvas with size PANEL_SIZE and displays a star in the
     * center of the canvas with a radius equals to half of the PANEL_SIZE
     */
    public static void drawStar() {
        DrawingPanel drawingPanel = new DrawingPanel(PANEL_SIZE, PANEL_SIZE);
        drawingPanel.setBackground(Color.BLACK);
        Graphics g = drawingPanel.getGraphics();
        double radius = PANEL_SIZE / 2.0;
        drawStar(g, (int) radius, (int) radius, radius);

    }

    /**
     * Displays a star with specified radius and specified x and y for location
     *
     * @param g      This is the graphic object to draw with
     * @param x      int x position
     * @param y      int y position
     * @param radius double radius of the star
     */
    public static void drawStar(Graphics g, int x, int y, double radius) {
        for (int i = 0; i < LINE_INCREMENTS * NUMBER_OF_SECTION; i++) {
            int line = i % LINE_INCREMENTS;
            int section = i / LINE_INCREMENTS;
            double angle1 = 360.0 / NUMBER_OF_SECTION * section;
            double angle2 = 360.0 / NUMBER_OF_SECTION * (section + 1);

            // first end point
            int x1 = (int) (x + (radius * Math.cos(Math.toRadians(angle1))));
            int y1 = (int) (y - (radius * Math.sin(Math.toRadians(angle1))));

            // second endpoint
            int x2 = (int) (x + (radius * Math.cos(Math.toRadians(angle2))));
            int y2 = (int) (y - (radius * Math.sin(Math.toRadians(angle2))));

            double p = (double) line / LINE_INCREMENTS;
            double xPointA = lerp(x1, x, p);
            double yPointA = lerp(y1, y, p);
            double xPointB = lerp(x, x2, p);
            double yPointB = lerp(y, y2, p);

            g.setColor(color(p));
            g.drawLine((int) xPointA, (int) yPointA, (int) xPointB, (int) yPointB);

            try {
                Thread.sleep(100);
            } catch (InterruptedException ignored) {
            }
        }


    }

    /**
     * Creates a canvas with size PANEL_SIZE * 2, PANEL_SIZE + 200
     * and displays a space-themed scene
     */
    public static void space() {
        DrawingPanel drawingPanel = new DrawingPanel(PANEL_SIZE * 2, PANEL_SIZE + 200);
        drawingPanel.setBackground(Color.BLACK);
        Graphics g = drawingPanel.getGraphics();

        drawRocket(g);

        drawPlanet(Color.YELLOW, 560, 50, 150, g);
        drawPlanet(Color.BLUE, 350, 350, 110, g);
        drawPlanet(Color.RED, 320, 140, 40, g);
        drawPlanet(Color.GRAY, 650, 470, 250, g);

        drawSpacecraft(g);

        drawStar(g, 445, 210, 20);
        drawStar(g, 670, 380, 7);
        drawStar(g, 60, 60, 5);
        drawStar(g, 200, 460, 3);
        drawStar(g, 500, 460, 2);
        drawStar(g, 260, 60, 3);
        drawStar(g, 45, 570, 5);
        drawStar(g, 200, 460, 3);
        drawStar(g, 350, 300, 1);
        drawStar(g, 450, 570, 1);
        drawStar(g, 775, 40, 1);
        drawStar(g, 545, 290, 1);
        drawStar(g, 40, 260, 1);
        drawStar(g, 475, 50, 1);
    }

    /**
     * Displays a rocket image
     *
     * @param g This is the graphic object to draw with
     */
    public static void drawRocket(Graphics g) {
        // draws the base of the rocket
        g.setColor(Color.GRAY);
        g.fillRect(100, 300, 80, 20);

        // draws the left side of the jet
        int[] xPointLeft = {100, 140, 115};
        int[] yPointLeft = {320, 320, 380};
        int nPoints = 3;
        g.setColor(Color.PINK);
        g.fillPolygon(xPointLeft, yPointLeft, nPoints);

        // draws the right side of the jet
        int[] xPointRight = {140, 180, 165};
        int[] yPointRight = {320, 320, 380};
        g.setColor(Color.GREEN);
        g.fillPolygon(xPointRight, yPointRight, nPoints);

        // draws the body part of the rocket
        g.setColor(Color.WHITE);
        g.fillRect(100, 160, 80, 140);

        // draws the window in the rocket
        g.setColor(Color.ORANGE);
        g.fillRect(120, 200, 40, 40);

        // draws the top part of the rocket
        g.setColor(Color.BLUE);
        int[] xPointTop = {100, 140, 180};
        int[] yPointTop = {160, 100, 160};
        g.fillPolygon(xPointTop, yPointTop, nPoints);
    }

    /**
     * Displays a filled circle (planet) in a specified x and y for position and with a
     * specified size
     *
     * @param color color of the planet
     * @param x     int x position
     * @param y     int y position
     * @param size  int size
     * @param g     This is the graphic object to draw with
     */
    public static void drawPlanet(Color color, int x, int y, int size, Graphics g) {
        g.setColor(color);
        g.fillOval(x, y, size, size);
    }

    /**
     * Displays a spacecraft
     *
     * @param g This is the graphic object to draw with
     */
    public static void drawSpacecraft(Graphics g) {
        // draws the body of the spacecraft
        g.setColor(Color.MAGENTA);
        g.fillOval(575, 300, 70, 20);
        g.setColor(Color.WHITE);
        g.drawOval(575, 300, 70, 20);

        // draws the top part of the spacecraft
        g.setColor(Color.MAGENTA);
        g.fillOval(600, 280, 20, 40);

        // draws the legs of the spacecraft
        g.setColor(Color.BLUE);
        g.drawLine(600, 320, 600, 340);
        g.drawLine(618, 320, 618, 340);
    }

    /**
     * Creates a new color
     *
     * @param progress double progress that represents the percent (0-1) of the position from start to end
     *
     * @return the new color that was created
     */
    public static Color color(double progress) {
        int rStart = COLOR_START.getRed();
        int gStart = COLOR_START.getGreen();
        int bStart = COLOR_START.getBlue();

        int rEnd = COLOR_END.getRed();
        int gEnd = COLOR_END.getGreen();
        int bEnd = COLOR_END.getBlue();

        double newR = lerp(rStart, rEnd, progress);
        double newG = lerp(gStart, gEnd, progress);
        double newB = lerp(bStart, bEnd, progress);

        return new Color((int) (newR), (int) (newG), (int) (newB));
    }

    /**
     * Linearly Interpolate from start to end
     *
     * @param start    double start
     * @param end      double end
     * @param progress double progress that represents the percent (0-1) of the position from start to end
     *
     * @return the answer of the Linearly Interpolate
     */
    public static double lerp(double start, double end, double progress) {
        return start + progress * (end - start);
    }
}
