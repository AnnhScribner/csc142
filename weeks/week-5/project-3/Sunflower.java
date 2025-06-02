/**
 * @author Anna Sribner
 * @verison Feb 7, 2025
 * <p>
 * A class that creates a sunflower using circles.
 * The sunflower has a big center circle, and smaller circles (petals)
 * <p>
 * that are exactly half the size of the center and positioned
 * tangentially around it.
 */

import java.awt.Color;
import java.awt.Graphics;

public class Sunflower {
    private static final Color COLOR_CENTER = new Color(97, 54, 23);
    private static final Color COLOR_PETALS = new Color(252, 206, 1);
    private static final Color COLOR_BACKGROUND_TOP = new Color(218, 227, 243);
    private static final Color COLOR_BACKGROUND_BOTTOM = new Color(143, 170, 220);

    private int drawingSize;
    private int centerRadius;
    private int petalCount;
    private DrawingPanel drawingPanel;


    /**
     * Creates a sunflower with a given canvas size, center radius, and number of petals.
     *
     * @param drawingSize  Size of the canvas (square dimensions).
     * @param centerRadius Radius of the sunflower’s center.
     * @param petalCount   Number of petals around the center.
     * @throws IllegalArgumentException if the drawSize < 1.
     * @throws IllegalArgumentException if the radius < 0.
     */
    public Sunflower(int drawingSize, int centerRadius, int petalCount) {
        if (drawingSize < 1) {
            throw new IllegalArgumentException("Drawing size cannot be less than 1px");
        }
        if (centerRadius < 0) {
            throw new IllegalArgumentException("Radius cannot be negative");
        }
        this.drawingSize = drawingSize;
        this.centerRadius = centerRadius;
        this.petalCount = petalCount;

        this.drawingPanel = new DrawingPanel(drawingSize, drawingSize);
    }

    /**
     * Draws the sunflower:
     * - Creates a gradient background
     * - Draws the center circle
     * - Adds petals around it
     */
    public void draw() {
        Graphics graphics = drawingPanel.getGraphics();

        drawGradientBackground(graphics);

        // draw center of the flower
        Circle circle = new Circle(COLOR_CENTER, 0, 0, centerRadius);
        circle.draw(graphics, drawingSize);

        // draw the petals
        double radiusPetal = centerRadius / 2; // petal (50% of the center)
        double distance = centerRadius + radiusPetal;
        for (int i = 0; i < petalCount; i++) {
            double angle = ((2 * Math.PI) / petalCount) * i;
            double centerX = distance * Math.cos(angle);
            double centerY = distance * Math.sin(angle);
            circle = new Circle(COLOR_PETALS, centerX, centerY, radiusPetal);
            circle.draw(graphics, drawingSize);
            sleepHalfSecond();
        }
    }

    /**
     * Setting background gradient color and drawing the background
     *
     * @param graphics graphic object
     * @throws IllegalArgumentException if the graphics is null.
     */
    private void drawGradientBackground(Graphics graphics) {
        if (graphics == null) {
            throw new IllegalArgumentException("Graphic cannot be null");
        }

        int redTop = COLOR_BACKGROUND_TOP.getRed();
        int greenTop = COLOR_BACKGROUND_TOP.getGreen();
        int blueTop = COLOR_BACKGROUND_TOP.getBlue();

        int redBottom = COLOR_BACKGROUND_BOTTOM.getRed();
        int greenBottom = COLOR_BACKGROUND_BOTTOM.getGreen();
        int blueBottom = COLOR_BACKGROUND_BOTTOM.getBlue();

        for (int i = 0; i < drawingSize; i++) {
            // blend the colors smoothly from top to bottom
            double lerpRed = redTop + ((double) i / drawingSize) * (redBottom - redTop);
            double lerpGreen = greenTop + ((double) i / drawingSize) * (greenBottom - greenTop);
            double lerpBlue = blueTop + ((double) i / drawingSize) * (blueBottom - blueTop);

            Color color = new Color((int) lerpRed, (int) lerpGreen, (int) lerpBlue);

            graphics.setColor(color);
            graphics.drawLine(0, i, drawingSize, i);
        }
    }

    /**
     * Pauses for 0.5 seconds to create a delay effect while drawing petals.
     */
    private void sleepHalfSecond() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
        }
    }
}
