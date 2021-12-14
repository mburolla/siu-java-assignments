package com.xpanxion.assignments.student1;

public class CalculatorException extends Exception {

    CalculatorException(int firstNum, int secondNum, String operation) {
        System.out.println("Cannot divide by zero: " + firstNum + " " + operation + " " + secondNum);
    }


}
