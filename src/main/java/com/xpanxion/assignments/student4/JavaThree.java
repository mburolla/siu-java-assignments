package com.xpanxion.assignments.student4;

import org.apache.log4j.*;
import org.w3c.dom.ls.LSOutput;

import java.io.*;

import java.util.Arrays;

public class JavaThree {


    public void ex1() {
        try {
            var result = 10 / 0;
        } catch (ArithmeticException ae) {
            System.out.println("Cannot divide by zero.");
        }
    }


    public void ex2() {
        var calculator = new Calculator();
        try {
            var result = calculator.calculate(10, 0, "div");
        } catch (IOException | CalculatorException e) {
            e.printStackTrace();
        }
    }


    public void ex3() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\e0m0bk0\\Desktop\\Test\\Input-1.txt"));
            String s;
            while ((s = br.readLine()) != null) {           //BufferedReader returns null when reaches empty line in .txt so
                System.out.println(s);
            }
            br.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void ex4() {
        Person person = new Person();
        String[] array = new String[5];
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\e0m0bk0\\Desktop\\Test\\input2.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                int i = 0;
                array[i] = line;
                i++;
                String[] prodStr = line.split(",");
                person.id = Integer.parseInt(prodStr[0]);
                var name = prodStr[1].split(" ");
                person.firstName = name[0];
                person.lastName = name[1];
                System.out.println(person);
            }
            br.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }


    public void ex5() {
        var peopleList = Arrays.asList(
                new Person(1, "Alice", "Jones"),
                new Person(2, "Bob", "Smith"),
                new Person(3, "Charlie", "Brown"));
        try {
            FileWriter writer = new FileWriter("C:\\Users\\e0m0bk0\\Desktop\\Test\\Output-1.txt");
            for (Person str : peopleList) {
                String s = String.format("%s, %s %s", str.id, str.firstName, str.lastName);
                System.out.println(s);
            }
            writer.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    public void ex6() {
        var personRepository = new PersonRepository(); //
        var person = personRepository.getPerson(4);
        if (person.isPresent()) {        // value is present inside Optional
            System.out.println("Value found - " + person.get().getFirstName());
        }
        else {                           // value is absent
            System.out.println("Optional is empty");
        }

    }

    }




