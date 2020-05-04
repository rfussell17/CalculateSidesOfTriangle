package com.rfussell;

import static com.rfussell.CalculateSides.isRightTriangle1;
import static com.rfussell.CalculateSides.ComputeLengthsA;
import static com.rfussell.CalculateSides.ComputeLengthsB;

public class Test {
    public static void main(String[] args) {
        ComputeLengthsA();
        ComputeLengthsB();
        System.out.println(isRightTriangle1(45,55,75));
        System.out.println(isRightTriangle1(28,45,53));
    }
}
