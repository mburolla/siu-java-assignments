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

    float calculate(int firstNum, int secondNum, String operator) throws CalculatorException {
        float result = 0;
        if (operator.equals("add")) {
            result = firstNum + secondNum;
        } else if (operator.equals("sub")) {
            result = firstNum - secondNum;
        } else if (operator.equals("mul")) {
            result = firstNum * secondNum;
        } else if (operator.equals("div")) {
            try {
                result = firstNum / secondNum;
            }
            catch (ArithmeticException e) {
                throw new CalculatorException(String.valueOf(firstNum) + "/" + String.valueOf(secondNum));
            }
        }
        return result;
    }

    void printCalc() {
        for(String n : calculations) {
            System.out.println(n);
        }
    }

}
