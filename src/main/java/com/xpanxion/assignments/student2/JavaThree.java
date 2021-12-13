package com.xpanxion.assignments.student2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaThree {

    public static void ex1() {

        try {
            var result = 10 / 0;
        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        }

    }

    public static void ex2() throws CalculatorException {
        var calculator = new Calculator();
        var result = calculator.calculate(10,0,"div"); // Catch this error.
    }

    public static void ex3() {
        try {
            BufferedReader br = new BufferedReader(
                    new FileReader("C:\\Users\\b0j04cn\\input-1.txt"));
            String text;
            while((text = br.readLine()) != null) {
                System.out.println(text);
            }
            br.close();
        }
        catch(Exception e) {
                return;
        }

    }
}
