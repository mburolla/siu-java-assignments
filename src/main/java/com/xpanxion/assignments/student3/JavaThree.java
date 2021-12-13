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
                } catch (ArithmeticException arithmeticException){
                    System.out.println("Cannot divide by zero");
                }
            }
        }

        calculator.getHistory().forEach(System.out::println);
    }
}
