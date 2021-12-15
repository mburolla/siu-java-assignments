package com.xpanxion.assignments.student1;

import org.apache.log4j.*;

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
        PropertyConfigurator.configure("log4j.properties");

        this.firstNum = firstNum;
        this.secondNum = secondNum;
        this.operation = operation;
    }

    public int getResult() {
        return result;
    }

    public void performCalculations() throws CalculatorException {
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
                if (secondNum == 0) {
                    logger.warn("Cannot divide by zero");
                        throw new CalculatorException("cannot divide by zero: " + firstNum + " / " + secondNum);
                }

                result = firstNum / secondNum;

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
