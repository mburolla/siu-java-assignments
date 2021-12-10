package com.xpanxion.assignments.student5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaThree {
    // Constructor
    public JavaThree() {}
// Ex1 Divide by Zero
    public void ex1() {
        try {
            var result = 10 / 0;
            System.out.println(result);
        } catch (Exception DivideByZeroException) {
            System.out.println("Cannot divide by zero.");
        }
    }
// Ex2 Calculator Exception
    public void ex2() throws CalculatorException {
        var calculator = new Calculator();
        var result = calculator.calculate(10, 0, "div"); // Catch this error.
        System.out.println(result);
    }
// Ex3 Read File
    public void ex3() {
        try {
            BufferedReader read = new BufferedReader(new FileReader("input-1.txt"));
            String line;
            while ((line = read.readLine()) != null) {
                System.out.println(line);
            }
            read.close();
        } catch (Exception fileNotFound) {
            System.out.println("File was not found at that location.");
            fileNotFound.printStackTrace();
        }
    }
// Ex4 File to People
    public void ex4() {
        List<Person> people = new ArrayList<>();
        try {
            BufferedReader read = new BufferedReader(new FileReader("input-2.txt"));
            String line;
            while ((line = read.readLine()) != null) {
                List<String> person = Arrays.stream(line.split(" ")).toList();
                people.add(new Person(person.get(0), person.get(1), person.get(2)));
            }
            read.close();
            people.stream().forEach(System.out::println);
        } catch (Exception fileNotFound) {
            System.out.println("File was not found at that location.");
            fileNotFound.printStackTrace();
        }

    }
}
