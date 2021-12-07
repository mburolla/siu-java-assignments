package com.xpanxion.assignments.student5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculator {
    private List<String> history;

    public Calculator() {
    }

    public void run() {
        int num1;
        int num2;
        int result;
        String input;
        String operation;

        history = new ArrayList<String>();
        var sc = new Scanner(System.in);

        while (true) {
            result = 0;
            System.out.print("Enter first number: ");
            input = sc.nextLine();
            if (input.equalsIgnoreCase("done")) break;
            num1 = Integer.parseInt(input);
            System.out.print("Enter second number: ");
            input = sc.nextLine();
            if (input.equalsIgnoreCase("done")) break;
            num2 = Integer.parseInt(input);
            System.out.print("Enter operation (add, sub, mul, div): ");
            input = sc.nextLine();
            if (input.equalsIgnoreCase("done")) break;
            operation = input.toLowerCase();
            switch (operation) {
                case "add" -> {
                    result = num1 + num2;
                    operation = " + ";
                }
                case "sub" -> {
                    result = num1 - num2;
                    operation = " - ";
                }
                case "mul" -> {
                    result = num1 * num2;
                    operation = " * ";
                }
                case "div" -> {
                    result = num1 / num2;
                    operation = " / ";
                }
                default -> System.out.println("Invalid Number!");
            }
            System.out.println("Result: " + result);
            history.add(new String(num1 + operation + num2 + " = " + result) );
        }
        history.stream().forEach(p -> {System.out.println(p.toString());});
        sc.close();
    }
}
