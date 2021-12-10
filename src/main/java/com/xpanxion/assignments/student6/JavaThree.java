package com.xpanxion.assignments.student6;

import com.xpanxion.assignments.instructor.CalculatorException;

public class JavaThree {

    public void ex1() throws DivByZeroException {
        int numer = 10;
        int denom = 0;
        int result = 0;
        try {
            result = numer / denom;
        } catch (ArithmeticException e) {
            String message = "Cannot divide by zero!";
            throw new DivByZeroException(message);
        }
    }


    public void ex2() {
        var calculator = new Calculator();
        try {
            var result = calculator.calculate(10, 0, "div");
        } catch (DivByZeroException e) {
            System.out.println(e.getMessage());
        }
    }

    public void ex3() {

    }
}
