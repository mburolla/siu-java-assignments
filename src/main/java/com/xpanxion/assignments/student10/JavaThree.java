package com.xpanxion.assignments.student10;

public class JavaThree {

    public void ex1 () {
        try {
            var result = 10 / 0;
        }
        catch (Exception e) {
            System.out.println("Cannot divide by zero");
        }
    }
}
