package com.xpanxion.assignments.student8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class JavaThree {

    JavaThree() {}

    Scanner scanner = new Scanner(System.in);

    public void ex1() {
        try {
            var result = 10 / 0;
        }
        catch(ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }

    }

    public void ex2() throws CalculatorException {
        var calculator = new Calculator();
        var result = calculator.calculate(10, 0, "div");
    }

    public void ex3() {
        try {
            BufferedReader br = new BufferedReader(
                    new FileReader("input-1.txt")
            );
            String s;
            while((s = br.readLine()) != null) {
                System.out.println(s);
            }
            br.close();
        } catch (Exception e) {
            System.out.println(e);;
        }
    }

}
