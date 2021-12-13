package com.xpanxion.assignments.student3;

import java.util.Scanner;
import java.util.StringTokenizer;

public class JavaThree {

    JavaThree(){}

    public void ex1(){
        int result;
        var scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        while (true) {
            System.out.print("Enter an equation: ");
            var input = scanner.nextLine();

            if(input.equals("done")){
                break;
            } else {
                var stringTokenizer = new StringTokenizer(input);
                var operand1 = Integer.parseInt(stringTokenizer.nextToken().replace(" ", ""));
                var operator = stringTokenizer.nextToken().replace(" ", "");
                var operand2 = Integer.parseInt(stringTokenizer.nextToken());

                try {
                    result = calculator.calculate(operand1, operand2, operator);

                    System.out.println("Result: " + result);
                } catch (CalculatorException calculatorException){
                    ;
                }
            }
        }

        calculator.getHistory().forEach(System.out::println);
    }

    public void ex2() {
        var calculator = new Calculator();
        try {
            var result = calculator.calculate(10, 0, "/"); // Catch this error.
        } catch (CalculatorException calculatorException){
            System.out.println(calculatorException.getMessage());
        }
    }
}
