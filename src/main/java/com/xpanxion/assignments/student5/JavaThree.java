package com.xpanxion.assignments.student5;

public class JavaThree {
    // Constructor
    public JavaThree() {}
// Ex1 Divide by Zero
    public void ex1() {
        try {
            var result = 10 /0;
            System.out.println(result);
        } catch (Exception DivideByZeroException) {
            System.out.println("Cannot divide by zero.");
        }
    }
}
