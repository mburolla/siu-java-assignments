package com.xpanxion.assignments.instructor;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class JavaThree {

    public void ex1() {
        try {
            var result = 10 / 0;
        }
        catch (ArithmeticException ae) {
            System.out.println("Cannot divide by zero.");
        }
    }

    public void ex2() {
        var calculator = new Calculator();
        try {
            var result = calculator.calculate(10, 0, "div");
        } catch (CalculatorException ce) {
            System.out.println(ce.getMessage());
        }
    }

    public void ex3() {
        try {
            String inputLine;
            var file = new File("input-1.txt");
            try (Scanner scanner = new Scanner(file)) {
                while (scanner.hasNextLine()) {
                    inputLine = scanner.nextLine();
                    System.out.println(inputLine);
                }
            }
        }
        catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    public void ex4() {
        try {
            var personList = new ArrayList<Person>();
            String inputLine;
            var file = new File("input-2.txt");
            try (Scanner scanner = new Scanner(file)) {
                while (scanner.hasNextLine()) {
                    var stringTokenizer = new StringTokenizer(scanner.nextLine());
                    var id = Integer.parseInt(stringTokenizer.nextToken().replace(",", ""));
                    var firstName = stringTokenizer.nextToken();
                    var lastName = stringTokenizer.nextToken();
                    personList.add(new Person(id, firstName, lastName));
                }
            }

            for (Person p: personList) {
                System.out.println(p);
            }
        }
        catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    public void ex5() {
        System.out.println("Hi");
    }

    public void ex6() {

    }

    public void ex7() {

    }

    public void ex8() {

    }

    public void ex9() {

    }

    public void ex10() {

    }
}
