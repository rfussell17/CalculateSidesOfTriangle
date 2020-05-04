package com.rfussell;

/**
 * Class: CalculateSides.java
 * Purpose: To calculate missing sides of a triangle and determine if it is a right triangle.
 * @author: Robin Fussell
 * Date:  October 10, 2019
 * Version 1.0

This program runs a method that takes input of the length of  2 sides of a triangle, it then
calculates what the length of remaining sides is. The second half of this program is a boolean
method that takes input of 3 parameters, and determines if the triangle is a right triangle or not.
 * */

public class CalculateSides {

    public static void ComputeLengthsA() {

        double a = 48; double c = 80;
        double b = Math.sqrt((c * c) - (a * a));
        System.out.println("Length of remaining sides (a= 48, c= 80) : " + b);
    }
    public static void ComputeLengthsB(){
        double a= 84; double c = 91;
        double b = Math.sqrt((c * c) - (a * a));
        System.out.println("Length of remaining sides (a= 84, c= 91) : " + b);
    }

    public static boolean isRightTriangle1(double a, double b, double c) {

        if (c == Math.sqrt((b * b) + (a * a))) {
            return true;
        }
        return false;
    }
}
