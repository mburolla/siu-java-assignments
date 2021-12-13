package com.xpanxion.assignments.student6;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
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

    public void ex5() {

        var peopleList = Arrays.asList(
                new Person(1, "Alice", "Jones"),
                new Person(2, "Bob", "Smith"),
                new Person(3, "Charlie", "Brown")
        );

        try {
            try (FileWriter fileWriter = new FileWriter("output-1.txt")) {
                String personString = "";
                for (Person p : peopleList) {
                    personString = p.getId() + ", " + p.getFirstName() + " " + p.getLastName() + "\n";
                    fileWriter.write(personString);
                    System.out.println(personString);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void ex6() {
        var personRepository = new PersonRepository();
        var person = personRepository.getPerson(1);
        person.ifPresent(p -> System.out.println(p.getFirstName()));
    }

    public void ex7() {
        //example is in test/java/student6
    }

    public void ex8() {
        //example is in test/java/student6
    }

    public void ex9() {
        Logger logger = Logger.getLogger(Calculator.class);

        ConsoleAppender c = new ConsoleAppender();
        c.setThreshold(Level.INFO);
        c.setLayout(new PatternLayout("%d %p [%c] - %m%n"));
        c.activateOptions();
        Logger.getRootLogger().addAppender(c);
        int result = 0;
        try {
            Calculator calculator = new Calculator();
            result = calculator.calculate(1,1, "div");
            logger.info(c);
            System.out.println(result);
        } catch (DivByZeroException e) {
            c.setThreshold(Level.WARN);
            c.setLayout(new PatternLayout("%d %p [%c] - %m%n"));
            c.activateOptions();
            Logger.getRootLogger().addAppender(c);
            logger.warn(c);
            System.out.println(e.getMessage());
        }
    }
}
