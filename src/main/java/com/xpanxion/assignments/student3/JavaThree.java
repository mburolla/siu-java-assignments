package com.xpanxion.assignments.student3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class JavaThree {

    JavaThree(){}

    public void ex1() {
        int result;
        var scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        while (true) {
            System.out.print("Enter an equation: ");
            var input = scanner.nextLine();

            if(input.equals("done")){
                break;
            } else {
                var stringTokenizer = new StringTokenizer(input);
                var operand1 = Integer.parseInt(stringTokenizer.nextToken().replace(" ", ""));
                var operator = stringTokenizer.nextToken().replace(" ", "");
                var operand2 = Integer.parseInt(stringTokenizer.nextToken());

                try {
                    result = calculator.calculate(operand1, operand2, operator);

                    System.out.println("Result: " + result);
                } catch (CalculatorException calculatorException){
                    ;
                }
            }
        }

        calculator.getHistory().forEach(System.out::println);
    }

    public void ex2() {
        //calculator exception again
        var calculator = new Calculator();
        try {
            var result = calculator.calculate(10, 0, "/"); // Catch this error.
        } catch (CalculatorException calculatorException){
            System.out.println(calculatorException.getMessage());
        }
    }

    public void ex3() {
        //reader
        try {
            var reader = new BufferedReader(new FileReader("C:\\Users\\K0I0134\\Desktop\\input-1.txt"));
            String s;
            while ((s = reader.readLine()) != null)
                System.out.println(s);
        } catch (Exception exception){
            return;
        }
    }

    public void ex4() {
        //read and assign persons
        var peopleArray = new ArrayList<Person>();

        try {
            var reader = new BufferedReader(new FileReader("C:\\Users\\K0I0134\\Desktop\\input-2.txt"));
            String s;
            while ((s = reader.readLine()) != null){
                var stringTokenizer = new StringTokenizer(s);
                var id = Integer.parseInt(stringTokenizer.nextToken().replace(",", ""));
                var firstName = stringTokenizer.nextToken().replace(",", "");
                var lastName = stringTokenizer.nextToken();

                peopleArray.add(new Person(id, firstName, lastName));
            }
        } catch (Exception exception){
            return;
        }

        for (Person p: peopleArray){
            System.out.println(p);
        }
    }

    public void ex5(){
        //write assigned people
        var peopleList = Arrays.asList(
                new Person(1, "Alice", "Jones"),
                new Person(2, "Bob", "Smith"),
                new Person(3, "Charlie", "Brown")
        );

        try {
            try (var writer = new FileWriter("C:\\Users\\K0I0134\\Desktop\\output-1.txt")) {
                for (Person p : peopleList) {
                    var string = String.format("%s, %s %s \n", p.getId(), p.getFirstname(), p.getLastname());
                    writer.write(string);
                }
            }
        } catch (Exception exception){
            return;
        }
    }

    public void ex6(){
        var personRepository = new PersonRepository();
        var person = personRepository.getPerson(4);
        person.ifPresent(p -> System.out.println(p.getFirstname()));
    }

    public void ex7(){
        System.out.println("Person test added");
    }

    public void ex8(){

    }

    public void ex9(){

    }
}
