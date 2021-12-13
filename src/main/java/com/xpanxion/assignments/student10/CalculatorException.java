package com.xpanxion.assignments.student10;

public class CalculatorException extends Exception{

    public CalculatorException () {}

    public int calculate(int num1, int num2, String operator) throws com.xpanxion.assignments.instructor.CalculatorException {
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
                    System.out.println(String.format("Cannot divide by zero: %s/%s", num1, num2));
                }
            }
        }
        return result;
    }
}
