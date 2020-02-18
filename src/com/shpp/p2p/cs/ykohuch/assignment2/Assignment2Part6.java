package com.shpp.p2p.cs.ykohuch.assignment2;


import acm.graphics.GFillable;
import acm.graphics.GOval;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;


public class Assignment2Part6 extends WindowProgram {
    /*define constants
    * radius
    * diameter
    * number of segments
    * start x coordinate
    * start y coordinate
    * horizontal distance between segments
    * vertical distance between segments*/
    private static final  double RADIUS = 50;
    private static final double DIAMETER = RADIUS*2;
    private static final int SEGMENTS = 6;
    private static final double X = 50;
    private static final double Y = 50;
    private static final double HORIZONTAL_DISTANCE = 50;
    private static final double VERTICAL_DISTANCE = 30;

    /*basic method in which will be caterpillar placed*/
    public void run(){
        caterpillar(SEGMENTS);
    }

    /*here used a loop to place and the number of segments defined by a constant*/
    private void caterpillar(int segments) {
        for (int i= 0; i<SEGMENTS; i++){
            creatingCircle(i);
        }
    }

    /*creating the circle and define parameters for each segment of caterpillar
    * if segment is divided into two without rest he will be placed upper than odd segments*/
    private GOval creatingCircle(int number){
        GOval circle = new GOval(X+HORIZONTAL_DISTANCE*number, Y-VERTICAL_DISTANCE*(number%2), DIAMETER, DIAMETER);
        fillObj(circle, Color.GREEN);
        circle.setColor(Color.RED);
        add(circle);
        return circle;
    }

    //creating object, witch will be used for circles
    private void fillObj(GFillable obj, Color color){
        obj.setFillColor(color);
        obj.setFilled(true);
    }
}
