package com.xpanxion.assignments.student2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaThree {

    public static void ex1() {

        try {
            var result = 10 / 0;
        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        }

    }

    public static void ex2() throws CalculatorException {
        var calculator = new Calculator();
        var result = calculator.calculate(10,0,"div"); // Catch this error.
    }

}
