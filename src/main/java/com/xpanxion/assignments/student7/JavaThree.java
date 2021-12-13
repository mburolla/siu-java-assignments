package com.xpanxion.assignments.student7;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;

public class JavaThree {

    public void ex1() {
        try {
            var result = 10 / 0;
        } catch (Exception e) {
            System.out.println("Cannot divide by zero.");
        }
    }

    public void ex2() throws CalculatorException {
        var calculator = new Calculator();
        calculator.calculate(10, 0, "div");
    }

    public void ex3() {
        try {
            var reader = new BufferedReader(new FileReader("C:\\Users\\Austi\\IdeaProjects\\sia-java-assignments\\input-1.txt"));
            String s;
            while((s = reader.readLine()) != null) {
                System.out.println(s);

            }
            reader.close();
        } catch (Exception e) {
            return;
        }
    }

    public void ex4() {

        ArrayList<Person> people = new ArrayList<Person>();

        try {
            var reader = new BufferedReader(new FileReader("C:\\Users\\Austi\\IdeaProjects\\sia-java-assignments\\input-2.txt"));
            String s;
            while((s=reader.readLine()) != null) {

                String[] sSplit = s.split(",");
                int userId = Integer.parseInt(sSplit[0]);

                String personName = sSplit[1];
                String[] splitPersonName = personName.split(" ");

                people.add(new Person(userId, splitPersonName[1], splitPersonName[2]));
            }

        }
        catch (Exception e) {
        return;
        }
        for (Person p : people) {
            System.out.println(p);
        }
    }
}


