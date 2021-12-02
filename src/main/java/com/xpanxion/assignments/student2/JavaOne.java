package com.xpanxion.assignments.student2;

import java.util.Scanner;

public class JavaOne {

    //
    // Constructors
    //

    JavaOne() {}

    //
    // Public methods
    //

    public void ex1() {
        // test test
        System.out.println("Enter your name: ");
        Scanner scannerExample1 = new Scanner(System.in);
        String name = scannerExample1.nextLine();
        System.out.println("Your name is " + name.toUpperCase());
    }

    public void ex2() {
        System.out.println("Student 2: ex2.");
    }

    public void ex3() {
        System.out.println("Student 2: ex3.");
    }

    //
    // Private helper methods
    //
}
