package com.xpanxion.assignments.student10;


import java.io.*;
import java.io.FileNotFoundException;
import java.util.*;

public class JavaThree {

    public void ex1 () {
        System.out.println("Student 10: ex 1");

        try {
            var result = 10 / 0;
        }
        catch (Exception e) {
            System.out.println("Cannot divide by zero");
        }
    }

    public void ex2 () throws com.xpanxion.assignments.instructor.CalculatorException {
        System.out.println("Student 10: ex 2");

        var calculator = new CalculatorException();
        var result = calculator.calculate(10, 0, "div"); // Catch this error.
    }

    public void ex3 () {
        System.out.println("Student 10: ex 3");
        File myFile = new File("input-1.txt");

        try (BufferedReader br = new BufferedReader(new FileReader(myFile))){
            while (br.ready()) {
                String line = br.readLine();
                System.out.println(line);
            }
        }
        catch (Exception e) {
                System.out.println("An error occurred");
        }
    }

    public void ex4 () {
        System.out.println("Student 10: ex 4");
        File myFile = new File("input-2.txt");
        ArrayList personList = new ArrayList();

        try (BufferedReader br = new BufferedReader(new FileReader(myFile))){
            while (br.ready()) {
                String line = br.readLine();
                String firstSplit [] = line.split(",");
                int id = Integer.parseInt(firstSplit[0]);
                String secondSplit [] = firstSplit[1].split(" ");
                String firstName = secondSplit[1];
                String lastName = secondSplit[2];
                personList.add(new Person(id, firstName, lastName));
            }
        }
        catch (Exception e) {
            System.out.println("An error occurred");
        }
        for (Object p : personList) {
            System.out.println(p);
        }
    }

    public void ex5 () throws IOException {
        System.out.println("Student 10: ex 5");

        var peopleList = Arrays.asList(
                new Person(1, "Alice", "Jones"),
                new Person(2, "Bob", "Smith"),
                new Person(3, "Charlie", "Brown")
        );

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("output-1.txt"));
            for (Person p : peopleList){
                bw.write(String.format("%s, %s %s\n", p.getId(), p.getFirstName(), p.getLastName()));
            }
            bw.close();
        }
        catch (Exception e){
            System.out.println("An error has occurred");
        }
    }

    public void ex6 () {
        System.out.println("Student 10: ex 6");

        var personRepository = new PersonRepository();
        var person = personRepository.getPerson(4);
        person.ifPresent(p -> System.out.println(p.getFirstName()));

    }

}
