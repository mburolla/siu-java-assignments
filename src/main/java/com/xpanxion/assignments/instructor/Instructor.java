package com.xpanxion.assignments.instructor;

import java.util.Scanner;
import java.util.StringTokenizer;

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
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inString = scanner.nextLine();

        int numUpperCaseLetters = 0;
        for (int i = 0; i < inString.length(); i++) {
            if (Character.isUpperCase(inString.charAt(i))) {
                numUpperCaseLetters++;
            }
        }
        System.out.println(String.format("Number of uppercase letters: %s.", numUpperCaseLetters));
    }

    public void ex3() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inString = scanner.nextLine();

        var st = new StringTokenizer(inString);
        int wordCount = 0;
        var outString = "";
        while (st.hasMoreTokens()) {
            if (wordCount % 2 == 1) {
                outString += st.nextToken();
            } else {
                outString += st.nextToken().toUpperCase();
            }
            outString += " ";
            wordCount++;
        }
        System.out.println(outString);
    }

    public void ex4() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inString = scanner.nextLine();


    }


















    public void ex10() {
        int result = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int operand1 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter second number: ");
        int operand2 = scanner.nextInt();
        scanner.nextLine();

        result = operand1 + operand2;
        String outString = String.format("Result: %s", result);
        System.out.println(outString);
    }

    public void ex11() {
        int result = 0;
        var scanner = new Scanner(System.in); // Type inference.

        System.out.print("Enter first number: ");
        var operand1 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter second number: ");
        var operand2 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter operation (add, sub, mul, div): ");
        var operation = scanner.nextLine();

        switch (operation) {
            case "add" -> {
                result = operand1 + operand2;
            }
            case "sub" -> {
                result = operand1 - operand2;
            }
            case "mul" -> {
                result = operand1 * operand2;
            }
            case "div" -> {
                result = operand1 / operand2;
            }
        }

        var outString = String.format("Result: %s", result);
        System.out.println(outString);
    }

    //
    // Private helper methods
    //


}
