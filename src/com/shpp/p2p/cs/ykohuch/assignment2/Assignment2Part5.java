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

    /* The start point for build the table*/
    private static final double START_X = NUM_COLS*(BOX_SIZE+BOX_SPACING)/2;
    private static final double START_Y = NUM_ROWS*(BOX_SIZE+BOX_SPACING)/2;

    //basic function
    public void run(){
        makeRows(NUM_ROWS, NUM_COLS);
    }

    /*here, rows of ready-made boxes are created*/
    private void makeRows(int numRows, int numCols) {
        for (int i = 0; i < numRows; i++) {
            makeColumns(i, numCols);
        }
    }

    /*here, placed the line of boxes*/
    private void makeColumns(int numRows, int numCols) {
        for (int j = 0; j < numCols; j++) {
            makeColumnsBoxes(numRows,j);
        }
    }

    /*the boxes parameters are specified here */
    private void makeColumnsBoxes(int j, int numRows) {
        GRect box = new GRect((getWidth()/2- START_X) + numRows * (BOX_SIZE+BOX_SPACING), (getHeight()/2-START_Y ) + j * (BOX_SIZE+BOX_SPACING), BOX_SIZE, BOX_SIZE);
        box.setFilled(true);
        box.setFillColor(Color.BLACK);
        add(box);
    }
}
