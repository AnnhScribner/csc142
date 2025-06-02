import java.awt.Graphics;
import java.awt.Color;

/**
 * A program that creates a canvas and draw
 * green circles
 *
 * @author Anna Scribner
 * @version Jan 15, 2025
 */
public class Lab2 {
    public static void main(String[] args) {
        circleLoops();


    }

    public static void circleLoops() {
        // Set drawing panel object and create the panel's size
        DrawingPanel drawingPanel = new DrawingPanel(250, 250);

        // Set pen/material to draw
        Graphics g = drawingPanel.getGraphics();

        int numberOfCircles = 10;
        int circleDiameter = 50;
        int xStart = 10;
        int xCoordinator = xStart;
        int yCoordinator = 5;
        for (int i = 0; i < numberOfCircles; i++) {
            g.setColor(Color.GREEN);
            g.fillOval(xCoordinator, yCoordinator, circleDiameter, circleDiameter);
            g.setColor(Color.BLACK);
            g.drawOval(xCoordinator, yCoordinator, circleDiameter, circleDiameter);
            xCoordinator += 20;
            yCoordinator += 20;

        }

        g.drawRect(xStart, 5, circleDiameter + (20 * (numberOfCircles - 1)) , circleDiameter + (20 * (numberOfCircles - 1)));
    }
}
