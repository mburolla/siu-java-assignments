package com.xpanxion.assignments.student7;

import java.util.*;

public class Calculator {

    private final List<String> history;

    public Calculator () {
        history = new ArrayList<>();
    }

    public void calculate(int num1, int num2, String operand) {

        String firstNum = Integer.toString(num1);
        String secondNum = Integer.toString(num2);
        String operator = "";
        int result = 0;
        String resultString = Integer.toString(result);

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
    }


    public List<String> getHistory() {
       return history;
    }
}
