package com.xpanxion.assignments.student10;

import com.xpanxion.assignments.instructor.CalculatorException;
import org.apache.log4j.*;
import java.util.ArrayList;
import java.util.List;

public class Calculator {


    private final List<String> calcList;

    public Calculator () { this.calcList = new ArrayList<String>();}

    public List<String> getCalcList(){return calcList;}

    public int calculate(int num1, int num2, String operator) throws CalculatorException{
        Logger logger = Logger.getLogger(Calculator.class);

        int result = 0;
        String operation = "";
        switch (operator) {
            case "add" -> {
                result = num1 + num2;
                operation = ("+");

            }
            case "sub" -> {
                result = num1 - num2;
                operation = ("-");
            }
            case "mul" -> {
                result = num1 * num2;
                operation = ("*");
            }
            default -> {
                try {
                    result = num1 / num2;
                    operation = "/";
                } catch (ArithmeticException ae) {
                    var message = String.format("Cannot divide by zero: %s / %s.", num1, num2);
                    logger.warn(message, ae);
                    throw new CalculatorException(message);

                }
            }
        }
        var entry = String.format("%s %s %s = %s", String.valueOf(num1), operation, String.valueOf(num2), result);
        calcList.add(entry);
        logger.info(entry);
        return result;

    }

}
