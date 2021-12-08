package com.xpanxion.assignments.student1;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    //private variables
    private int firstNum;
    private int secondNum;
    private String operation;
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
        switch(operation) {
            case "add":
                result = firstNum + secondNum;
                history.add(firstNum + " + " + secondNum + " = " + result);
                break;
            case "sub":
                result = firstNum - secondNum;
                history.add(firstNum + " - " + secondNum + " = " + result);
                break;
            case "mul":
                result = firstNum * secondNum;
                history.add(firstNum + " * " + secondNum + " = " + result);
                break;
            case "div":
                result = firstNum / secondNum;
                history.add(firstNum + " / " + secondNum + " = " + result);
                break;
        }
    }

    //create method to print history
    public void printHistory() {
        history.forEach(el -> System.out.println(el));
    }
}
