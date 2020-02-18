package com.shpp.p2p.cs.ykohuch.assignment2;

import com.shpp.cs.a.console.ConsoleProgram;

public class Assignment2Part1 extends ConsoleProgram {
    /*variables for the remembering user input*/
    private double a = 0;
    private double b = 0;
    private double c = 0;

    //basic function
    public void run() {
        /*get numbers from the user*/
        getNumbers();

        /*the square equation*/
        double result = b * b - 4.0 * a * c;

        //If result is greater than 0, the roots are real and different.
        if (result > 0.0) {
            // create variables for root placement
            double root1 = (-b - Math.sqrt(result)) / (2 * a);
            double root2 = (-b + Math.sqrt(result)) / (2 * a);
            //output square roots
            println("There are two roots: " + root1 + " and " + root2);

            /*If result is equal to 0, the roots are real and equal.
            *output one square root*/
        } else if (result == 0.0) {
            double rootSingle = -b / (2.0 * a);
            println("There is one root: " + rootSingle);
            //If result is less than 0, the roots are complex and different.
        } else {
            println("There are no real roots");
        }
    }

    /*here we take the data from the user and write it in the variables that were previously announced above*/
    private void getNumbers() {
         a = readDouble("Please enter a. It can not be 0 or letter:");
         b = readDouble("Please enter b: ");
         c = readDouble("Please enter b: ");
    }
}

