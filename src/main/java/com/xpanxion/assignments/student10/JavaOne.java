package com.xpanxion.assignments.student10;


import java.util.Locale;
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
        // Test.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Student 10: ex1.");
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Your name in upper case is: ");
        System.out.print(name.toUpperCase(Locale.ROOT));
    }

    public void ex2() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Student 10: ex2.");
        System.out.print("Enter a string: ");
        String string = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            char letter = string.charAt(i);
            if(Character.isUpperCase(letter)) {
                count++;
            }
        }
        System.out.print("Number of upper case letters: "+ count);

    }

    public void ex3() {
        System.out.println("Student 10: ex3.");
    }

    //
    // Private helper methods
    //
}
