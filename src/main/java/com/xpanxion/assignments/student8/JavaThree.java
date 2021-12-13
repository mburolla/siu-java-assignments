package com.xpanxion.assignments.student8;

import java.util.Scanner;

public class JavaThree {

    JavaThree() {}

    Scanner scanner = new Scanner(System.in);

    public void ex1() {
        try {
            var result = 10 / 0;
        }
        catch(ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }

    }

    public void ex2() throws CalculatorException {
        var calculator = new Calculator();
        var result = calculator.calculate(10, 0, "div");
    }

}
