package com.xpanxion.assignments.instructor;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    //
    // Data members
    //

    private final List<String> history;

    //
    // Constructors
    //

    public Calculator() {
        this.history = new ArrayList<String>();
    }

    //
    // Methods
    //

    public int calculate(int operand1, int operand2, String operation) throws CalculatorException {
        int retval = 0;
        String strOperation = "";
        switch (operation) {
            case "add" -> {
                retval = operand1 + operand2;
                strOperation = "+";
            }
            case "sub" -> {
                retval = operand1 - operand2;
                strOperation = "-";
            }
            case "mul" -> {
                retval = operand1 * operand2;
                strOperation = "*";
            }
            case "div" -> {
                try {
                    retval = operand1 / operand2;
                    strOperation = "/";
                } catch (ArithmeticException ae) {
                    var message = String.format("Cannot divide by zero: %s / %s.", operand1, operand2);
                    throw new CalculatorException(message);
                }
            }
        }

        var strHistory = String.format("%s %s %s = %s", String.valueOf(operand1), strOperation, String.valueOf(operand2), retval );
        history.add(strHistory);
        return retval;
    }

    public List<String> getHistory() {
        return history;
    }
}
