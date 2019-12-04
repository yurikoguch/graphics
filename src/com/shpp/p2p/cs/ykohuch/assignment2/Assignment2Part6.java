package com.shpp.p2p.cs.ykohuch.assignment2;


import acm.graphics.GFillable;
import acm.graphics.GOval;
import acm.graphics.GRectangle;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;

public class Assignment2Part6 extends WindowProgram {

    public void run(){
        //define constants
        double r = 50;
        double d = r*2;
        double x = getWidth()/3 - d;
        double y = getHeight()/2 - d;

        //create parts of the caterpillar
        //First part
        GOval circleOne = creatingCircle(Color.GREEN, x, y, r);
        add(circleOne);
        GRectangle boundsOfcircleOne = circleOne.getBounds();

        //Second part
        GOval circleTwo = creatingCircle(Color.GREEN, boundsOfcircleOne.getX() + r, boundsOfcircleOne.getY() - r, r);
        add(circleTwo);

        //Third part
        GOval circleThree = creatingCircle(Color.GREEN, x+d, y, r);
        add(circleThree);
        GRectangle boundsOfCircleThree = circleOne.getBounds();

        //Fourth part
        GOval circleFour = creatingCircle(Color.GREEN, boundsOfCircleThree.getX() + (d+r), boundsOfCircleThree.getY() - r,r);
        add(circleFour);

        //Fifth parth
        GOval circleFive = creatingCircle(Color.GREEN, x+(d*2), y, r);
        add(circleFive);
        GRectangle boundsOfCircleFive = circleOne.getBounds();

        //Sixth part
        GOval circleSix = creatingCircle(Color.GREEN, boundsOfCircleFive.getX() + (d*2+r), boundsOfCircleFive.getY() - r,r);
        add(circleSix);
    }

    //creating the circle
    private GOval creatingCircle(Color color, double x, double y, double r){
        GOval circle = new GOval(x, y, r*2, r*2);
        fillObj(circle, color);
        circle.setColor(Color.RED);
        return circle;
    }

    //creating object, witch will be used for circles
    private void fillObj(GFillable obj, Color color){
        obj.setFillColor(color);
        obj.setFilled(true);
    }
}
