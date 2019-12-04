package com.shpp.p2p.cs.ykohuch.assignment2;
        import acm.graphics.GRect;
        import com.shpp.cs.a.graphics.WindowProgram;
        import java.awt.Color;

public class Assignment2Part5 extends WindowProgram{
    /* The number of rows and columns in the grid, respectively. */
    private static final int NUM_ROWS = 5;
    private static final int NUM_COLS = 6;

    /* The width and height of each box. */
    private static final double BOX_SIZE = 40;

    /* The horizontal and vertical spacing between the boxes. */
    private static final double BOX_SPACING = 10;

    //basic function
    public void run(){

        for (int y= 0; y < NUM_COLS*BOX_SIZE; y+=BOX_SIZE){
            for (int x = 0; x < NUM_ROWS*BOX_SIZE; x+=BOX_SIZE){
                /*I created two GRect of different colors that partially overlap.
                 *Thus forming spaces*/

                //first square
                GRect box = new GRect(y, x, BOX_SIZE, BOX_SIZE);
                box.setFilled(true);
                box.setFillColor(Color.WHITE);
                box.setColor(Color.WHITE);
                box.setLocation(250+ y,130+ x);
                add(box);

                //second square
                //it is offset
                GRect box2 = new GRect(y, x, BOX_SIZE-BOX_SPACING, BOX_SIZE-BOX_SPACING);
                box2.setFilled(true);
                box2.setFillColor(Color.BLACK);
                box2.setLocation(260+ y,140+ x);
                add(box2);
            }
        }
    }
}
