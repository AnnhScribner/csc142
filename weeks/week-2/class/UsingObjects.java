/*
@author Anna Scribner
@version Jan 15, 2025
 */

import java.awt.Graphics;
import java.awt.Color;

public class UsingObjects {
    public static void main(String[] args) {
        // Setting the object(canvas) and setting size of the panel
//        DrawingPanel dp = new DrawingPanel(400, 400);

        // Set size of the panel
        //dp.setSize(250, 250);

        // Set pen/material to draw
//        Graphics g = dp.getGraphics();

//        g.setColor(Color.RED); // Set color
        // Take 4 parameters:
        // 1. Starting x coordinate
        // 2. Starting y coordinate
        // 3. Width of out circle
        // 4. Height of our circle
//
//        g.fillOval(0, 0, 200, 200); // fill
//        g.setColor(Color.BLUE);
//        g.drawOval(0, 0, 200, 200); // draw
//
//        g.setColor(Color.GREEN);
//        g.fillRect(200, 200, 100, 50);
//
//        // rgb - to create colors
//        g.setColor(new Color(80, 90, 100));
//        g.fillRect(100, 300,50, 50);

// ------------------------------------------------------------------------------------------------
        // Creates a drawing panel of size 400 by 400
        // Draws a circle that is: green, solid (filled in),
        // in the center of the drawing panel, has a radius of 200

        // Create a canvas with 400 x 400 size
        DrawingPanel dp = new DrawingPanel(400, 400);

        // Set pen/material to draw
        Graphics g = dp.getGraphics();

        // Set color
        g.setColor(Color.GREEN);

        g.fillOval(0,0,400, 400);









    }
}
