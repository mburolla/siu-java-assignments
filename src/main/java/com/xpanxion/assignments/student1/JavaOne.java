package com.xpanxion.assignments.student1;

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
        //prompt user to enter name
        System.out.print("Enter you name: ");

        //gather user input
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();

        //return name in upper case
        System.out.println("Your name in upper case is: " + userName.toUpperCase());
//        System.out.println("Student 1: ex1.");

    }

    public void ex2() {
        System.out.println("Student 1: ex2.");
    }

    public void ex3() {
        System.out.println("Student 1: ex3.");
    }

    //
    // Private helper methods
    //
}
