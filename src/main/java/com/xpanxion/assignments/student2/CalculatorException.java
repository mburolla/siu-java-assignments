package com.xpanxion.assignments.student2;

public class CalculatorException extends Exception {
    CalculatorException(String mathLine) {
        System.out.println("Cannot divide by zero: " + mathLine + ".");
    }
}
