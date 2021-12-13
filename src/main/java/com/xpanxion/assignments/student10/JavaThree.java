package com.xpanxion.assignments.student10;

public class JavaThree {

    public void ex1 () {
        System.out.println("Student 10: ex 1");

        try {
            var result = 10 / 0;
        }
        catch (Exception e) {
            System.out.println("Cannot divide by zero");
        }
    }

    public void ex2 () throws com.xpanxion.assignments.instructor.CalculatorException {
        System.out.println("Student 10: ex 2");

        var calculator = new CalculatorException();
        var result = calculator.calculate(10, 0, "div"); // Catch this error.
    }
}
