package com.xpanxion.assignments.student7;
import java.util.*;
import org.apache.log4j.*;


public class Calculator {

    private final List<String> history;
    static final Logger logger = Logger.getLogger(Calculator.class);

    ConsoleAppender consoleAppender = new ConsoleAppender();



    public Calculator () {
        history = new ArrayList<>();
    }

    public String calculate(int num1, int num2, String operand) throws CalculatorException {

        String firstNum = Integer.toString(num1);
        String secondNum = Integer.toString(num2);
        String operator = "";
        int result = 0;
        String resultString = Integer.toString(result);

        consoleAppender.setThreshold(Level.INFO);
        consoleAppender.setLayout(new PatternLayout("%d [%p|%c|%C{1}] %m%n"));
        consoleAppender.activateOptions();
        Logger.getRootLogger().addAppender(consoleAppender);

            try {
                if (num2 == 0 && operand.equalsIgnoreCase("div")) {
                    throw new CalculatorException("Cannot divide by zero: " + num1 + "/" + num2);
                }
            }
             catch (CalculatorException e) {
                logger.warn(e.getMessage(), e);
            }


        switch (operand) {
            case "ADD" -> {
                operator = "+";
                result = (num1 + num2);
            }
            case "SUB" -> {
                operator = "-";
                result = (num1 - num2);
            }
            case "DIV" -> {
                operator = "/";
                result = (num1 / num2);
            }
            case "MUL" -> {
                operator = "*";
                result = (num1 * num2);
            }
        }
        String calculation = String.format("%s %s %s = %s",num1, operator, num2, resultString);
        history.add(calculation);
        logger.info("calculation: " + calculation);
        System.out.println("Result: " + result);
        return ("Result: " + result);
    }


    public List<String> getHistory() {
       return history;
    }


}
