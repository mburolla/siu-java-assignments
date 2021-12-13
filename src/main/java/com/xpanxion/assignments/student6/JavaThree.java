package com.xpanxion.assignments.student6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class JavaThree {

    public void ex1() throws DivByZeroException {
        int numer = 10;
        int denom = 0;
        int result = 0;
        try {
            result = numer / denom;
        } catch (ArithmeticException e) {
            String message = "Cannot divide by zero!";
            throw new DivByZeroException(message);
        }
    }


    public void ex2() {
        var calculator = new Calculator();
        try {
            var result = calculator.calculate(10, 0, "div");
        } catch (DivByZeroException e) {
            System.out.println(e.getMessage());
        }
    }

    public void ex3() throws FileNotFoundException {
        try {
        File file = new File("input-1.txt");
        Scanner sc = new Scanner(file);
        while(sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void ex4() {
        try {
            List<Person> people = new ArrayList<>();
            File file = new File("input-2.txt");
            try (Scanner sc = new Scanner(file)) {
                while(sc.hasNextLine()) {
                  String updatedString = sc.nextLine().replaceAll(",", "");
                  String [] updateHolder = updatedString.split(" ");

                  int id = Integer.parseInt(updateHolder[0]);
                  String firstName = updateHolder[1];
                  String lastName = updateHolder[2];
                  people.add(new Person(id, firstName, lastName));
                }
            }
            people.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
