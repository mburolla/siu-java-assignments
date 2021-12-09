package com.xpanxion.assignments.student3;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private List<String> history = new ArrayList<String>();

    public Calculator(){

    }

    public int calculate (int operand1, int operand2, String op){
        int result = 0;
        switch (op) {
            case "+" -> result = operand1 + operand2;
            case "-" -> result = operand1 - operand2;
            case "*" -> result = operand1 * operand2;
            case "/" -> result = operand1 / operand2;
            default -> System.out.println("Invalid Operator");
        }

        history.add(String.format("%s %s %s = %s", operand1, op, operand2, result));
        return result;
    }


    public List<String> getHistory() {
        return history;
    }
}
