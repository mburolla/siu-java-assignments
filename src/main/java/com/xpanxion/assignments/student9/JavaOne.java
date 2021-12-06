package com.xpanxion.assignments.student9;

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
        System.out.print("Enter your name >");
        var scanner = new Scanner(System.in);
        var name = scanner.nextLine();
        System.out.printf("Your name in upper case is > %s ",name.toUpperCase());
    }

    public void ex2() {
        System.out.println("Student 9: ex2.");
    }

    public void ex3() {
        System.out.println("Student 9: ex3.");
    }

    //
    // Private helper methods
    //
}
