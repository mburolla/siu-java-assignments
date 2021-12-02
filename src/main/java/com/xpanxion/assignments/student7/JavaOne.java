package com.xpanxion.assignments.student7;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
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

    public void ex4(){
        var scanner = new Scanner(System.in);

        System.out.println("Enter a palindrome: ");
        String userInput = scanner.nextLine();
        String forwards = "";
        String backwards = "";


        for (int i=0;i<userInput.length();i++) {
            forwards += userInput.charAt(i);
        }
        for (int i=0;i<forwards.length();i++){
            backwards += userInput.charAt((userInput.length()-1)-i);
        }

        if (forwards.equals(backwards)) {
            System.out.println("Input is a palindrome");
        }
        else
            System.out.println("Input is not a palindrome");


    }

    public void ex5() {
        var scanner = new Scanner(System.in);
        String userInput;
        int vowels = 0;
        int consonants = 0;

        do {
            System.out.print("Enter a string: ");
            userInput = scanner.nextLine();

            char currentChar = ' ';

            for (int i = 0; i < userInput.length(); i++) {
                currentChar = userInput.toUpperCase().charAt(i);


                switch (currentChar) {
                    case 'A':
                    case 'E':
                    case 'I':
                    case 'O':
                    case 'U':
                        vowels += 1;
                        consonants -= 1;
                    default:
                        if (currentChar == ' ') {
                            consonants -= 1;
                        }
                        consonants += 1;

                }

            }
            if (!userInput.equals("quit")) {
             System.out.println("Number of vowels: " + vowels);
                System.out.println("Number of consonants:" + consonants);
            }
        }
        while (!userInput.equals("quit"));

    }

    //
    // Private helper methods
    //
}
