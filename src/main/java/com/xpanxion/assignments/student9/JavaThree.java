package com.xpanxion.assignments.student9;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;

import java.io.*;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import java.util.Scanner;

public class JavaThree {

    public void ex1(){
        try{
            var result = 10 / 0;
        } catch (ArithmeticException e){
            System.out.println("cannot divide by zero ");
        }
    }

    public void ex2() throws CalculatorException {
        var calculator = new Calculator();
        var result = calculator.calculate(10, 0, "div");
        System.out.println(result);
    }

    public void ex3(){
        try{
            var myFile = new FileReader("input-1.txt");
            try(var scanner = new Scanner(myFile)){
                while(scanner.hasNextLine()){
                    var display = scanner.nextLine();
                    System.out.println(display);
                }
            }
        } catch (FileNotFoundException IO){
            System.out.println("unable to find file");
            IO.printStackTrace();
        }
    }

    public void ex4(){
        var personList = new ArrayList<Person>();
        try{
            var myFile = new FileReader("input-2.txt");
            try(var reader = new Scanner(myFile)) {
            while(reader.hasNextLine()) {
                var display = reader.nextLine();
                String[] splits = display.split(",");
                var idTemp = Integer.parseInt(splits[0]);
                var fullName = splits[1];
                String[] nameSplit = fullName.trim().split(" ");
                var firstName = nameSplit[0];
                var lastName = nameSplit[1];
                personList.add(new Person(idTemp, firstName, lastName));
            }
            }
        } catch (FileNotFoundException IO){
            System.out.println("unable to find file");
            IO.printStackTrace();
        }
        personList.forEach(System.out::println);
    }

    public void ex5(){
        var peopleList = Arrays.asList(
                new Person(1, "Alice", "Jones"),
                new Person(2, "Bob", "Smith"),
                new Person(3, "Charlie", "Brown")
        );

        try(var writer = new PrintWriter(new BufferedWriter(new FileWriter("output-1.txt")))){
            for (var person : peopleList){
                writer.append(person.toString()).append("\n");
                System.out.println(person);
            }
        } catch (IOException ex){
            System.err.println(ex.getMessage());
        }
    }

    public void ex6(){
        var personRepository = new PersonRepository();
        var person = personRepository.getPerson(3);
        if(person.isPresent()){
            System.out.println(person.get().getFirstName());
        } else {
            System.out.print("Invalid. No Person with given id");
        }
    }

    public void ex7() {

/*        //Arrange
        var newPerson = new Person();
        // Act
        newPerson.setFirstName("Bill");
        // Assert
        //Assertions.assertFalse(newPerson.validateFirstNameEmpty());*/
    }

    public void ex8() {
/*        @Test
        public void shouldPerformAdd(){
            // Arrange
            var addCalculator = new Calculator();
            // Act
            addCalculator.setOperation("add");
            //Assert
            Assertions.assertTrue(addCalculator.isOperationAdd());
        }

        @Test
        public void shouldPerformSub(){
            // Arrange
            var subCalculator = new Calculator();
            // Act
            subCalculator.setOperation("sub");
            //Assert
            Assertions.assertTrue(subCalculator.isOperationSub());
        }

        @Test
        public void shouldPerformMul(){
            // Arrange
            var mulCalculator = new Calculator();
            // Act
            mulCalculator.setOperation("mul");
            //Assert
            Assertions.assertTrue(mulCalculator.isOperationMul());
        }

        @Test
        public void shouldPerformDiv(){
            // Arrange
            var divCalculator = new Calculator();
            // Act
            divCalculator.setOperation("div");
            //Assert
            Assertions.assertTrue(divCalculator.isOperationDiv());
        }*/
    }

        public void ex9(){
            System.out.println("Logging for ex9");
            var logger = Logger.getLogger(JavaThree.class);
            var consoleAppender = new ConsoleAppender();
            consoleAppender.setThreshold(Level.WARN);
            consoleAppender.setLayout(new PatternLayout("%d %p [%c] - %m%n"));
            consoleAppender.activateOptions();
            Logger.getRootLogger().addAppender(consoleAppender);

                try{
                    var calculator = new Calculator();
                    var result = calculator.calculate(10, 0, "div");
                    System.out.println(result);
                } catch (CalculatorException e){
                    logger.warn(e.getMessage(),e);
                }
        }
    }

