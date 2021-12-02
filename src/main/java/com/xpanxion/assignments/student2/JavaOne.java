package com.xpanxion.assignments.student2;

import java.util.Scanner;

public class JavaOne {

    //
    // Constructors
    //

    JavaOne() {
    }

    //
    // Public methods
    //

    public void ex1() {
        System.out.println("Enter your name: ");
        Scanner scannerExample1 = new Scanner(System.in);
        String name = scannerExample1.nextLine();
        System.out.println("Your name is " + name.toUpperCase());
    }

    public void ex2() {
        System.out.println("Enter a string: ");
        Scanner scannerExample2 = new Scanner(System.in);
        String stringLine2 = scannerExample2.nextLine();
        int upperCaseCount = 0;

        for (int i = 0; i < stringLine2.length(); i++) {
            char ithLetter = stringLine2.charAt(i);
            if (Character.isUpperCase(ithLetter)) {
                upperCaseCount++;
            }
        }
        System.out.println("Number of uppercase letters is: " + upperCaseCount);
    }

    public void ex3() {
        System.out.println("Enter a string: ");
        Scanner scannerExample3 = new Scanner(System.in);
        String stringLine3 = scannerExample3.nextLine();
        String[] tokenString = stringLine3.split(" ", 0);
        for (int i = 0; i < tokenString.length; i++) {
            if (i % 2 == 0) {
                System.out.print(tokenString[i].toUpperCase());
            } else {
                System.out.print(tokenString[i].toLowerCase());
            }
            System.out.print(" ");
        }
    }

    public void ex4() {
        System.out.println("Enter a string: ");
        Scanner scannerExample4 = new Scanner(System.in);
        String stringLine4 = scannerExample4.nextLine();
        String palindrome = "Yes";
        int phraseLength = stringLine4.length();

        for (int i = 0; i < phraseLength; i++) {
            char ithLetter = stringLine4.charAt(i);
            if (ithLetter != stringLine4.charAt(phraseLength - i - 1)) {
                palindrome = "No";
            }
        }

        System.out.println(palindrome);
    }

    public void ex5() {
        while (true) {
            System.out.println("Enter a string: ");
            Scanner scannerExample5 = new Scanner(System.in);
            String stringLine5 = scannerExample5.nextLine();
            int vowelCount = 0;
            int consonantCount = 0;

            for (int i = 0; i < stringLine5.length(); i++) {
                char ithLetter = stringLine5.charAt(i);
                if (ithLetter == 'a' || ithLetter == 'e' || ithLetter == 'i' || ithLetter == 'o' || ithLetter == 'u') {
                    vowelCount++;
                } else if (Character.isLetter(ithLetter)) {
                    consonantCount++;
                }
            }
            System.out.println("Number of vowels: " + vowelCount);
            System.out.println("Number of consonants: " + consonantCount);

            if (stringLine5.equals("quit")) {
                break;
            }
        }
    }


    public void ex6() {
        System.out.println("Enter first number: ");
        Scanner scannerExample6_1 = new Scanner(System.in);
        int firstNum6 = scannerExample6_1.nextInt();
        System.out.println("Enter second number: ");
        Scanner scannerExample6_2 = new Scanner(System.in);
        int secondNum6 = scannerExample6_2.nextInt();
        int result = firstNum6 + secondNum6;
        System.out.println("Result: " + result);
    }

    public void ex7() {
        System.out.println("Enter first number: ");
        Scanner scannerExample7_1 = new Scanner(System.in);
        int firstNum7 = scannerExample7_1.nextInt();
        System.out.println("Enter second number: ");
        Scanner scannerExample7_2 = new Scanner(System.in);
        int secondNum7 = scannerExample7_2.nextInt();
        System.out.println("Enter operation (add, sub, mul, div): ");
        Scanner scannerExample7_3 = new Scanner(System.in);
        String operator7 = scannerExample7_3.next();

        float result = 0;
        if (operator7.equals("add")) {
            result = firstNum7 + secondNum7;
        } else if (operator7.equals("sub")) {
            result = firstNum7 - secondNum7;
        } else if (operator7.equals("mul")) {
            result = firstNum7 * secondNum7;
        } else if (operator7.equals("div")) {
            result = (float) firstNum7 / (float) secondNum7;
        }
        System.out.println("Result: " + result);
    }

    public void ex8() {
        System.out.println("Enter price per square feet: ");
        Scanner scannerExample8_1 = new Scanner(System.in);
        float pricePerFt8 = scannerExample8_1.nextFloat();
        int roomArea = 0;
        int totalArea = 0;

        while (true) {
            System.out.println("Enter room dimensions (width x height): ");
            Scanner scannerExample8_2 = new Scanner(System.in);
            String roomDimensions8 = scannerExample8_2.nextLine();

            if (roomDimensions8.equals("done")) {
                break;
            }

            String[] dimensionArray = roomDimensions8.split(" x ", 2);
            roomArea = Integer.parseInt(dimensionArray[0]) * Integer.parseInt(dimensionArray[1]);
            totalArea = totalArea + roomArea;
        }
        System.out.println("Total cost: $" + (totalArea * pricePerFt8));
    }

    public void ex9() {
        double randomNum = Math.random() * 5;
        int randomInt = (int) Math.ceil(randomNum);
        while (true) {
            System.out.println("Enter a number: ");
            Scanner scannerExample9 = new Scanner(System.in);
            int numberGuess = scannerExample9.nextInt();

            if (numberGuess == randomInt) {
                break;
            }
        }
    }

    public void ex10() {
        System.out.println("Enter a string: ");
        Scanner scannerExample10 = new Scanner(System.in);
        String stringLine10 = scannerExample10.nextLine();
        String space = " ";
        String[] wordArray = stringLine10.split(" ", 0);
        for (int i = 0; i < wordArray.length; i++) {
            for (int j = 0; j < wordArray[i].length(); j++) {
                System.out.println(space.repeat(j) + wordArray[i].charAt(j));
            }
        }
    }
    //
    // Private helper methods
    //
}
