package com.shpp.p2p.cs.ykohuch.assignment2;
import acm.graphics.GOval;
import acm.graphics.GRect;
import com.shpp.cs.a.graphics.WindowProgram;
import java.awt.*;

import static java.awt.Color.black;

public class Assignment2Part2 extends WindowProgram {

    public static final int APPLICATION_WIDTH = 300;
    public static final int APPLICATION_HEIGHT = 300;

    //basic function
    public void run(){
        addTheCircles();
        addTheRectifier();
    }

    //set the parameters for circles, and replace them
    private void addTheCircles(){

        //add first circle
        GOval first = new GOval(0, 0,  APPLICATION_WIDTH/3, APPLICATION_HEIGHT/3 );
        first.setColor(Color.black);
        first.setFilled(true);
        first.setFillColor(Color.black);
        add(first);

        //add second circle
        GOval second = new GOval(200, 0,  APPLICATION_WIDTH/3, APPLICATION_HEIGHT/3 );
        second.setColor(Color.black);
        second.setFilled(true);
        second.setFillColor(Color.black);
        add(second);

        //add third circle
        GOval third = new GOval(0, 175,  APPLICATION_WIDTH/3, APPLICATION_HEIGHT/3 );
        third.setColor(Color.black);
        third.setFilled(true);
        third.setFillColor(Color.black);
        add(third);

        //add fourth circle
        GOval fourth = new GOval(200, 175,  APPLICATION_WIDTH/3, APPLICATION_HEIGHT/3 );
        fourth.setColor(Color.black);
        fourth.setFilled(true);
        fourth.setFillColor(Color.black);
        add(fourth);
    }

    //set parameters for a rectifier and replace him
    private void addTheRectifier() {
        GRect center = new GRect(APPLICATION_WIDTH-250, APPLICATION_HEIGHT-250, 200, 175);
        center.setColor(Color.white);
        center.setFilled(true);
        center.setFillColor(Color.white);
        add(center);
    }
}


