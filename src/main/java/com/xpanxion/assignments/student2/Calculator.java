package com.xpanxion.assignments.student2;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    List<String> calculations = new ArrayList<>();

    void storeCalc(String calculation) {
        calculations.add(calculation);
    }

    String convertOperator(String operator) {
        if (operator.equals("add")) {
            return "+";
        } else if (operator.equals("sub")) {
            return "-";
        } else if (operator.equals("mul")) {
            return "*";
        } else if (operator.equals("div")) {
            return "/";
        } else {
            return null;
        }
    }

    float calculate(String operator, int firstNum, int secondNum) {
        float result = 0;
        if (operator.equals("+")) {
            result = firstNum + secondNum;
        } else if (operator.equals("-")) {
            result = firstNum - secondNum;
        } else if (operator.equals("*")) {
            result = firstNum * secondNum;
        } else if (operator.equals("/")) {
            result = (float) firstNum / (float) secondNum;
        }
        return result;
    }

    void printCalc() {
        for(String n : calculations) {
            System.out.println(n);
        }
    }

}
