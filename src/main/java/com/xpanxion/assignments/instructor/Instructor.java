package com.xpanxion.assignments.instructor;

import java.util.Scanner;

public class Instructor {

    //
    // Constructor
    //

    Instructor() {}

    //
    // Methods
    //

    public void ex1() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        String outString = String.format("Your name in upper case is: %s.", name.toUpperCase());
        System.out.println(outString);
    }

    public void ex2() {
        System.out.println("Instructor 1: ex2.");
    }

    public void ex3() {
        System.out.println("Instructor 2: ex3.");
    }
}
