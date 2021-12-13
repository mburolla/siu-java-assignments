package com.xpanxion.assignments.student2;

import javax.swing.text.html.Option;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;

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
        }
        catch (Exception e) {
            return;
        }

        for(Person n : people) {
            System.out.println(n);
        }
    }

    public static void ex5() {
        var peopleList = Arrays.asList(
                new Person(1, "Alice", "Jones"),
                new Person(2, "Bob", "Smith"),
                new Person(3, "Charlie", "Brown")
        );

        try {
            BufferedWriter bw = new BufferedWriter(
                    new FileWriter("C:\\Users\\b0j04cn\\output-1.txt"));
            for(Person n : peopleList) {
                bw.write(n.getId() + ", " + n.getFirstName() + " " + n.getLastName() + "\n");
            }
            bw.close();
        }
        catch(Exception e) {
            return;
        }

    }

    public static void ex6() {
        var personRepository = new PersonRepository();
        var person = personRepository.getPerson(4);
        if(person.isPresent()) {
            var firstName = person.get().getFirstName();
            System.out.println(firstName);
        }
    }

    public static void ex7() {

    }



}
