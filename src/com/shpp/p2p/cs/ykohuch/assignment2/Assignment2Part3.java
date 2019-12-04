package com.shpp.p2p.cs.ykohuch.assignment2;


import acm.graphics.GOval;
import com.shpp.cs.a.graphics.WindowProgram;


import java.awt.*;

public class Assignment2Part3 extends WindowProgram {
    /* Constants controlling the relative positions of the
     * three toes to the upper-left corner of the pawprint.
     *
     * (Yes, I know that actual pawprints have four toes.
     * Just pretend it's a cartoon animal. ^_^)
     */
    private static final double FIRST_TOE_OFFSET_X = 0;
    private static final double FIRST_TOE_OFFSET_Y = 20;
    private static final double SECOND_TOE_OFFSET_X = 30;
    private static final double SECOND_TOE_OFFSET_Y = 0;
    private static final double THIRD_TOE_OFFSET_X = 60;
    private static final double THIRD_TOE_OFFSET_Y = 20;

    /* The position of the heel relative to the upper-left
     * corner of the pawprint.
     */
    private static final double HEEL_OFFSET_X = 20;
    private static final double HEEL_OFFSET_Y = 40;

    /* Each toe is an oval with this width and height. */
    private static final double TOE_WIDTH = 20;
    private static final double TOE_HEIGHT = 30;

    /* The heel is an oval with this width and height. */
    private static final double HEEL_WIDTH = 40;
    private static final double HEEL_HEIGHT = 60;

    /* The default width and height of the window. These constants will tell Java to
     * create a window whose size is *approximately* given by these dimensions. You should
     * not directly use these constants in your program; instead, use getWidth() and
     * getHeight(), which return the *exact* width and height of the window.
     */
    public static final int APPLICATION_WIDTH = 270;
    public static final int APPLICATION_HEIGHT = 220;

    //basic function
    public void run() {
        //set width and height of the window
        int x = getWidth()/3 - APPLICATION_WIDTH/3;
        int y = getHeight()/2 - APPLICATION_HEIGHT/2;

        //locate the paws
        drawPawprint(20, 20);
        drawPawprint(180, 70);
    }

    /**
     * Draws a pawprint. The parameters should specify the upper-left corner of the
     * bounding box containing that pawprint.
     *
     * @param x The x coordinate of the upper-left corner of the bounding box for the pawprint.
     * @param y The y coordinate of the upper-left corner of the bounding box for the pawprint.
     */
    private void drawPawprint(double x, double y) {

        /*creating a fingers
         *creating first finger. And set the parameters*/
        GOval firstFinger = new GOval(FIRST_TOE_OFFSET_X+ x, FIRST_TOE_OFFSET_Y+ y, TOE_WIDTH, TOE_HEIGHT);
        firstFinger.setColor(Color.black);
        firstFinger.setFilled(true);
        firstFinger.setFillColor(Color.black);
        add(firstFinger);

        //creating second finger. And set the parameters
        GOval secondFinger = new GOval(SECOND_TOE_OFFSET_X+ x, SECOND_TOE_OFFSET_Y+ y, TOE_WIDTH, TOE_HEIGHT);
        secondFinger.setColor(Color.black);
        secondFinger.setFilled(true);
        secondFinger.setFillColor(Color.black);
        add(secondFinger);

        //creating third finger. And set the parameters
        GOval thirdFinger = new GOval(THIRD_TOE_OFFSET_X+ x, THIRD_TOE_OFFSET_Y+ y, TOE_WIDTH, TOE_HEIGHT);
        thirdFinger.setColor(Color.black);
        thirdFinger.setFilled(true);
        thirdFinger.setFillColor(Color.black);
        add(thirdFinger);

        //creating a foot
        //set the parameters of the foot
        GOval foot = new GOval(HEEL_OFFSET_X+ x, HEEL_OFFSET_Y+ y, HEEL_WIDTH, HEEL_HEIGHT);
        foot.setColor(Color.black);
        foot.setFilled(true);
        foot.setFillColor(Color.black);
        add(foot);
    }
}