package com.xpanxion.assignments.student8;

import java.util.ArrayList;

public class Calculator {

    // Data

    private ArrayList<String> history;

    // Constructor

    public Calculator() {
        this.history = new ArrayList<>();
    }

    // Public Methods
    public int calculate(int a, int b, String operation) throws CalculatorException {
        int result = 0;
        String op = "";
//        if (operation.equals("add")) {
//            op = "+";
//            result = add(a, b);
//        } else if (operation.equals("sub")) {
//            op = "-";
//            result = sub(a, b);
//        } else if (operation.equals("mul")) {
//            op = "*";
//            result = mul(a, b);
//        } else if (operation.equals("div")) {
//            op = "/";
//            result = div(a, b);
//        }

        switch (operation) {
            case "add" -> {
                op = "+";
                result = add(a, b);
            }
            case "sub" -> {
                op = "-";
                result = sub(a, b);
            }
            case "mul" -> {
                op = "*";
                result = mul(a, b);
            }
            case "div" -> {
                op = "/";
                try {
                    if ( b == 0) {
                        throw new CalculatorException();
                    }
                result = div(a, b);
                } catch (CalculatorException ce) {
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



}
