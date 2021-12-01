package com.xpanxion.assignments.student7;

import java.util.Scanner;
import java.util.StringTokenizer;

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
        var scanner = new Scanner(System.in);

        System.out.print("Enter a String: ");

        String userString = scanner.nextLine();

        var stringTokenizer = new StringTokenizer(userString, " ");

        int numOfString = 0;
        String newString = "";

        while (stringTokenizer.hasMoreTokens()) {
            if (numOfString%2 == 1) {
                newString += stringTokenizer.nextToken();
                newString += " ";
                numOfString++;
            }
            else if (numOfString%2 == 0) {
                newString += stringTokenizer.nextToken().toUpperCase();
                newString += " ";
                numOfString++;
            }

        }

        System.out.println(newString);
    }

    //
    // Private helper methods
    //
}
