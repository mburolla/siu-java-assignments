package com.xpanxion.assignments.student1;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    //private variables
    private final int firstNum;
    private final int secondNum;
    private final String operation;
    private int result;

    //create data storage for tokens
    private static final List<String> history = new ArrayList<>();

    //Constructor
    public Calculator(int firstNum, int secondNum, String operation) {
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
                result = firstNum / secondNum;
                history.add(firstNum + " / " + secondNum + " = " + result);
            }
        }
    }

    //create method to print history
    public void printHistory() {
        history.forEach(System.out::println);
    }
}
