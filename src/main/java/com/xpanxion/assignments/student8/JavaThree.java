package com.xpanxion.assignments.student8;

public class JavaThree {

    JavaThree() {}

    public void ex1() {
        try {
            var result = 10 / 0;
        }
        catch(ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }

    }

}
