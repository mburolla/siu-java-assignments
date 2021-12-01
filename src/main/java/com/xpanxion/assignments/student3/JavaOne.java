package com.xpanxion.assignments.student3;

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
        System.out.println("Student 3: ex1.");

        String name;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please Enter Name: ");
        name = scanner.nextLine();

        System.out.println("Your Name in Upper Case is: " + name.toUpperCase());
    }

    public void ex2() {
        System.out.println("Student 3: ex2.");
    }

    public void ex3() {
        System.out.println("Student 3: ex3.");
    }

    //
    // Private helper methods
    //
}
