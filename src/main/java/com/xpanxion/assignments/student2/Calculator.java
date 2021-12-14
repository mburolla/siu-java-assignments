package com.xpanxion.assignments.student2;

import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.*;

public class Calculator {

    List<String> calculations = new ArrayList<>();

    Logger logger = Logger.getLogger(Calculator.class);
    ConsoleAppender ca = new ConsoleAppender();

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

    public float calculate(int firstNum, int secondNum, String operator) throws CalculatorException {
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
                result = (float)firstNum / (float)secondNum; // Using floats makes the output of result infinity. I'm uncertain how to override this to catch the error
            }
            catch (ArithmeticException e) {
                logging(0,0,0, "error");
                throw new CalculatorException(String.valueOf(firstNum) + "/" + String.valueOf(secondNum));
            }
        }
        logging(firstNum, secondNum, result, operator);
        return result;
    }

    void printCalc() {
        for(String n : calculations) {
            System.out.println(n);
        }
    }

    public void logging(int firstNum, int secondNum, float result, String operator) {
        ca.setThreshold(Level.INFO);
        ca.setLayout(new PatternLayout("%d %p [%c] - %m%n"));
        ca.activateOptions();
        Logger.getRootLogger().addAppender(ca);
        if(operator == "error") {
            logger.warn("Divide by zero error!");
        }
        else {
            String symbolicOperator = convertOperator(operator);
            logger.info(firstNum + " " + symbolicOperator + " " + secondNum + " = " + " " + result);
        }
    }

}
