package com.shpp.p2p.cs.ykohuch.assignment2;

import com.shpp.cs.a.console.ConsoleProgram;

public class Assignment2Part1 extends ConsoleProgram {

    //basic function
    public void run() {

        //get numbers from the user
        double a = readDouble("Please enter a: ");

        double b = readDouble("Please enter b: ");

        double c = readDouble("Please enter b: ");

        //the square equation
        double result = b * b - 4.0 * a * c;

        //If result is greater than 0, the roots are real and different.
        if (result > 0.0) {

            // create variables for root placement
            double root1 = (-b + Math.sqrt(result)) / (2 * a);
            double root2 = (-b - Math.sqrt(result)) / (2 * a);

            //output square roots
            println("There are two roots: " + root1 + " and " + root2);

            //If result is equal to 0, the roots are real and equal.
        } else if (result == 0.0) {

            //output one square root
            double root1 = -b / (2.0 * a);
            println("There is one root: " + root1);

            //If result is less than 0, the roots are complex and different.
        } else {
            println("There are no real roots");
        }
    }
}

