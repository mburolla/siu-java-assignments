package com.xpanxion.assignments.student8;

import java.util.ArrayList;
import org.apache.log4j.*;


public class Calculator {

    // Data
    static final Logger logger = Logger.getLogger(Calculator.class);
    private ArrayList<String> history;

    // Constructor

    public Calculator() {
        this.history = new ArrayList<>();
    }

    // Public Methods

    public void logging() {

    }

    public int calculate(int a, int b, String operation) throws CalculatorException {
        int result = 0;
        String op = "";
        switch (operation) {
            case "add" -> {
                op = "+";
                result = add(a, b);
                infoLogger(a, b, op, result);
            }
            case "sub" -> {
                op = "-";
                result = sub(a, b);
                infoLogger(a, b, op, result);
            }
            case "mul" -> {
                op = "*";
                result = mul(a, b);
                infoLogger(a, b, op, result);
            }
            case "div" -> {
                op = "/";
                try {
                    if ( b == 0) {
                        throw new CalculatorException();
                    }
                    result = div(a, b);
                    infoLogger(a, b, op, result);
                } catch (CalculatorException ce) {
                    logger.warn("YOU CANNOT DIVIDE BY ZERO!!!");
                    System.out.printf(ce.getMessage() + " %s %s %s", a, op, b);
                }
            }
        }
        history.add(String.valueOf(a) + " " + op + " " + String.valueOf(b) + " = " + String.valueOf(result));
        return result;
    }

    // Accessors

    public void getHistory() {
        System.out.println("\nCALCULATOR HISTORY: ");
        for (String record : history) {
            System.out.println(record);
        }
    }

    // Private Methods

    private int add(int a, int b) {
        return a + b;
    }

    private int sub(int a, int b) {
        return a - b;
    }

    private int mul(int a, int b) {
        return a * b;
    }

    private int div(int a, int b) {
        return a / b;
    }

    private void infoLogger(int a, int b, String op, int result) {
        String strOp = String.format("%s %s %s = %s", a, op, b, result);
        logger.info("Performed subtraction operation: " + strOp);
    }



}
