package com.xpanxion.assignments.student1;

public class JavaThree {

    JavaThree() {};

    public void ex1() {
        try {
            var result = 10 / 0;
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
