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

    }

    public void ex2() {
        //prompt user to enter a string
        System.out.print("Enter a string: ");

        //read string input from user
        Scanner scanner = new Scanner(System.in);
        String userString = scanner.nextLine();

        //create count variable
        int capitalLetters = 0;

        //loop string and count amount of capital letters
        for (int i = 0; i < userString.length(); i++) {
            char currentChar = userString.charAt(i);
            if (Character.isUpperCase(currentChar)) {
                capitalLetters++;
            }
        }
        //return count of capital letters
        System.out.println("Number of uppercase letters: " + capitalLetters);

    }

    public void ex3() {
        System.out.println("Student 1: ex3.");
    }

    //
    // Private helper methods
    //
}
