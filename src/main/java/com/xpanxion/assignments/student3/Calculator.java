package com.xpanxion.assignments.student3;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private List<String> history = new ArrayList<String>();
    private Logger logger = Logger.getLogger(Calculator.class);

    public Calculator(){

    }

    public int calculate (int operand1, int operand2, String op) throws CalculatorException{
        int result = 0;
        switch (op) {
            case "+" -> result = operand1 + operand2;
            case "-" -> result = operand1 - operand2;
            case "*" -> result = operand1 * operand2;
            case "/" -> {
               try {
                   result = operand1 / operand2;
               }catch (ArithmeticException arithmeticException){
                   var error = String.format("Cannot divide by 0: %s / %s", operand1, operand2);
                   logger.warn("Cannot divide by zero");
               }
            }
            default -> System.out.println("Invalid Operator");
        }

        history.add(String.format("%s %s %s = %s", operand1, op, operand2, result));
        logger.info(result);
        return result;
    }


    public List<String> getHistory() {
        return history;
    }
}
