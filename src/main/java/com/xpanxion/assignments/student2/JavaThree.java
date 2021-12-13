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
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        }

    }

    public static void ex2() throws CalculatorException {
        var calculator = new Calculator();
        var result = calculator.calculate(10, 0, "div"); // Catch this error.
    }

    public static void ex3() {
        try {
            BufferedReader br = new BufferedReader(
                    new FileReader("C:\\Users\\b0j04cn\\input-1.txt"));
            String text;
            while ((text = br.readLine()) != null) {
                System.out.println(text);
            }
            br.close();
        } catch (Exception e) {
            return;
        }
    }

    public static void ex4() {
        List<Person> people = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(
                    new FileReader("C:\\Users\\b0j04cn\\input-2.txt"));
            String text;
            while ((text = br.readLine()) != null) {
                String[] nameArray = text.split(" ", 3);
                int correctedNum = Integer.parseInt(nameArray[0].replace(",", ""));
                Person newPerson = new Person(correctedNum, nameArray[1], nameArray[2]);
                people.add(newPerson);
            }
            br.close();
        } catch (Exception e) {
            return;
        }

        for(Person n : people) {
            System.out.println(n);
        }
    }
}
