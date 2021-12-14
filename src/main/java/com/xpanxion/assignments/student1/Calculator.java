package com.xpanxion.assignments.student1;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    //private variables
    private final int firstNum;
    private final int secondNum;
    private final String operation;
    private int result;
    private Logger logger;

    //create data storage for tokens
    private static final List<String> history = new ArrayList<>();

    //Constructor
    public Calculator(int firstNum, int secondNum, String operation) {

        System.out.println("**** Logging ****");
        logger = Logger.getLogger(Calculator.class);

        ConsoleAppender consoleAppender = new ConsoleAppender();
        consoleAppender.setThreshold(Level.INFO);
        consoleAppender.setLayout(new PatternLayout("%d %p [%c] = %m%n"));
        consoleAppender.activateOptions();
        Logger.getRootLogger().addAppender(consoleAppender);

        this.firstNum = firstNum;
        this.secondNum = secondNum;
        this.operation = operation;
    }

    public int getResult() {
        return result;
    }

    public void performCalculations() {
        switch (operation) {
            case "add" -> {
                result = firstNum + secondNum;
                history.add(firstNum + " + " + secondNum + " = " + result);
            }
            case "sub" -> {
                result = firstNum - secondNum;
                history.add(firstNum + " - " + secondNum + " = " + result);
            }
            case "mul" -> {
                result = firstNum * secondNum;
                history.add(firstNum + " * " + secondNum + " = " + result);
            }
            case "div" -> {
                try {
                    if (secondNum == 0) {
                        logger.warn("Cannot divide by zero");
                        throw new CalculatorException(firstNum, secondNum, "/");
                    }
                    result = firstNum / secondNum;
                } catch(CalculatorException ignored) {
                    //catch ignored
                }
                history.add(firstNum + " / " + secondNum + " = " + result);
            }
        }

        logger.info(history);
    }

    //create method to print history
    public void printHistory() {
        history.forEach(System.out::println);
    }
}
