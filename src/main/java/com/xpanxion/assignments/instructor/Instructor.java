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

    public void ex3() {
        int result = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int operand1 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter second number: ");
        int operand2 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter operation (add, sub, mul, div): ");
        String operation = scanner.nextLine();

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

        String outString = String.format("Result: %s", result);
        System.out.println(outString);
    }

    //
    // Private helper methods
    //


}
