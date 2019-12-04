package com.shpp.p2p.cs.ykohuch.assignment2;


import acm.graphics.GFillable;
import acm.graphics.GLabel;
import acm.graphics.GRect;
import com.shpp.cs.a.graphics.WindowProgram;
import java.awt.*;


public class Assignment2Part4 extends WindowProgram{

    //define constants
    //public static final int APPLICATION_HEIGHT = 600;
    public static final int PART_WIDTH = 100;
    public static final int PART_HEIGHT = 200;


    //basic function
    public void run(){

        //define constants
        // for centering
        int x = getWidth()/3 - PART_WIDTH/3;
        int y = getHeight()/2 - PART_HEIGHT/2;
        int w = PART_WIDTH;
        int h = PART_HEIGHT;

        //call the flag particles
        //flag of Italy
        add (creatingFlag(Color.GREEN, x, y, w, h));
        add (creatingFlag(Color.WHITE, x+ w, y, w, h));
        add (creatingFlag(Color.RED, x+w*2, y, w, h));

        //creating the label
        GLabel italy = new GLabel("Flag of Italy");
        italy.setFont("Verdana-16");
        italy.setColor(Color.BLACK);
        add(italy, 450, 420);
    }

    //creating the flag
    private GRect creatingFlag(Color color, double x, double y, double w, double h){
        GRect first = new GRect(x, y, w+ 2,h+ 2);
        fillObj(first, color);
        first.setColor(color);
        return first;
    }

    //creating object, witch will be used for parts of flag
    private void fillObj(GFillable obj, Color color){
        obj.setFillColor(color);
        obj.setFilled(true);
    }
}
