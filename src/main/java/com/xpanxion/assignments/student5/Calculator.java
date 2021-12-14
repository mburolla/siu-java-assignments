package com.xpanxion.assignments.student5;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculator {
    private List<String> history;
    private double num1;
    private double num2;
    private double result;
    private String input;
    private String operation;
    private Logger logger;

    public Calculator() {
        logger = Logger.getLogger(Calculator.class);
        ConsoleAppender ca = new ConsoleAppender();
        ca.setThreshold(Level.INFO);
        ca.setLayout(new PatternLayout("%d %p [%c] - %m%n"));
        ca.activateOptions();
        Logger.getRootLogger().addAppender(ca);

        history = new ArrayList<>();
    }

    public void run() throws CalculatorException {
        var sc = new Scanner(System.in);

        while (true) {
            result = 0;
            System.out.print("Enter first number: ");
            input = sc.nextLine();
            if (input.equalsIgnoreCase("done")) break;
            num1 = Double.parseDouble(input);
            System.out.print("Enter second number: ");
            input = sc.nextLine();
            if (input.equalsIgnoreCase("done")) break;
            num2 = Double.parseDouble(input);
            System.out.print("Enter operation (add, sub, mul, div): ");
            input = sc.nextLine();
            if (input.equalsIgnoreCase("done")) break;
            operation = input.toLowerCase();
            result = calculate(num1, num2, operation);
            System.out.println("Result: " + result);
        }
        history.stream().forEach(System.out::println);
        sc.close();
    }

    public double calculate(double num1,double num2,String operation) throws CalculatorException {
        switch (operation) {
            case "add" -> {
                operation = " + ";
                result = num1 + num2;
            }
            case "sub" -> {
                operation = " - ";
                result = num1 - num2;
            }
            case "mul" -> {
                operation = " * ";
                result = num1 * num2;
            }
            case "div" -> {
                operation = " / ";
                if (num2 == 0 ) {
                    var notByZeroMessage = "Cannot divide by zero";
                    logger.warn(notByZeroMessage);
                    throw new CalculatorException(notByZeroMessage);
                }
                else result = num1 / num2;
            }
            default -> System.out.println("Invalid Number!");
        }
        var record = num1 + operation + num2 + " = " + result;
        logger.info(record);
        history.add(record);

        return result;
    }
}
