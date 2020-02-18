package com.shpp.p2p.cs.ykohuch.assignment2;
import acm.graphics.GOval;
import acm.graphics.GRect;
import com.shpp.cs.a.graphics.WindowProgram;
import java.awt.*;
import static java.awt.Color.black;

public class Assignment2Part2 extends WindowProgram {

    public static final int APPLICATION_WIDTH = 300;
    public static final int APPLICATION_HEIGHT = 300;
    public static final int DIAMETER = 100;
    public static final int RADIUS = DIAMETER/2;
    public static final int SQUARE_WIDTH = 200;
    public static final int SQUARE_HEIGHT = 175;

   /* basic function
      in which circles and squares are added*/
    public void run(){
        addTheCircles();
        addTheRectifier();
    }

    /*set the parameters for circles, and replace them
    * here we placed four circles */
    private void addTheCircles(){
        add(basicCircle(0,0, RADIUS));
        add(basicCircle(getWidth()-DIAMETER,0, RADIUS));
        add(basicCircle(0,getHeight()-DIAMETER, RADIUS));
        add(basicCircle(getWidth()-DIAMETER,getHeight()-DIAMETER, RADIUS));
    }

    /*the circle on the basis of which all circles in the method addTheCircles will be added*/
    private GOval basicCircle(int x, int y, int radius){
        GOval circle = new GOval(x, y, DIAMETER , DIAMETER);
        circle.setColor(black);
        circle.setFilled(true);
        circle.setFillColor(Color.black);
        return circle;
    }

    //set parameters for a rectifier and replace him
    private void addTheRectifier() {
        GRect center = new GRect(getWidth()-APPLICATION_WIDTH + RADIUS, getHeight()-APPLICATION_HEIGHT+SQUARE_HEIGHT-DIAMETER, SQUARE_WIDTH, SQUARE_HEIGHT);
        center.setColor(Color.white);
        center.setFilled(true);
        center.setFillColor(Color.white);
        add(center);
    }
}


