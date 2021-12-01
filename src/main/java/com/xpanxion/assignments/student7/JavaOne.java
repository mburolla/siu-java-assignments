package com.xpanxion.assignments.student7;

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
        var scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");

        String userName = scanner.nextLine();
        System.out.println("Your name in uppercase is: " + userName.toUpperCase());
    }

    public void ex2() {
        var scanner = new Scanner(System.in);
        int totalNumOfCaps = 0;

        System.out.print("Enter a String:");

        String randomString = scanner.nextLine();

        for (int i=0; i <randomString.length();i++) {
        if (randomString.charAt(i) == randomString.toUpperCase().charAt(i)) {
            totalNumOfCaps++;
        }
        }
        System.out.println("Number of uppercase letters: " + (totalNumOfCaps -1));
    }

    public void ex3() {
        System.out.println("Student 7: ex3.");
    }

    //
    // Private helper methods
    //
}
