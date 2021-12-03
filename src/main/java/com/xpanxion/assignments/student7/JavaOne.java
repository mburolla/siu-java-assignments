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

    public void ex6() {
        var scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.println("Result: " + (num1 + num2));
    }

    public void ex7() {
        var scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter Operation(add, sub, div, mul): ");

        String operand1 = scanner.next();

        String operand = operand1.toUpperCase();

        if (operand.equals("ADD")) {
            System.out.println("Result: " + (num1 + num2));
        }
        else if (operand.equals("SUB")) {
            System.out.println("Result: " + (num1 - num2));
        }
        else if (operand.equals("DIV")) {
            System.out.println("Result: " + (num1 / num2));
        }
        else if (operand.equals("MUL")) {
            System.out.println("Result: " + (num1 * num2));
        }

    }

    public void ex8() {
    var scanner = new Scanner(System.in);

        System.out.print("Enter price per square feet: ");
        float pricePerFoot = scanner.nextFloat();
        scanner.nextLine();

        String dimensions = "";
        //int dimensionsTotal = 1;
        int finalDimensions = 0;



        //Separates width and height value then multiplies them//
        while(!dimensions.equals("done")) {

             System.out.print("Enter room dimensions (width x height): ");
             dimensions = scanner.nextLine();

             if (dimensions.equals("done")) {
                 break;
             }

             var tokenizer = new StringTokenizer(dimensions, " ");

             int dimensionsTotal = 1;
             while (tokenizer.hasMoreTokens()) {
                 var token = tokenizer.nextToken(); // 10 x 10
                 if (!token.equals("x")) {
                    int currentToken = Integer.parseInt(token);
                    dimensionsTotal *= currentToken;
                }
            }
            finalDimensions += dimensionsTotal;
        }

        double finalCost = finalDimensions * pricePerFoot;
        String finalCostToString = Double.toString(finalCost);

        System.out.println("Total cost: $" + finalCostToString);
    }

    public void ex9() {
          var scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int userInput = scanner.nextInt();

        double randomInt = Math.random()*10;
        System.out.println(Math.round(randomInt));
    }



    //
    // Private helper methods
    //
}
