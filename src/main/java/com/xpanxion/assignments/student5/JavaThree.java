package com.xpanxion.assignments.student5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
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
        List<String> personInfo = readFileByLine("input-1.txt");
        personInfo.forEach(System.out::println);
    }
// Ex4 File to People
    public void ex4() {
        List<String> personInfo = readFileByLine("input-2.txt");
        List<Person> personList= new ArrayList<>();
        for (String person: personInfo) {
            List<String> personInfoSplit = Arrays.stream(person.split(" ")).toList();
                personList.add(new Person(Integer.valueOf(personInfoSplit.get(0)), personInfoSplit.get(1), personInfoSplit.get(2)));
        }
        personList.forEach(System.out::println);
    }

// Ex5 People to file
    public void ex5() {
        // Write peopleList to output-1.txt
        String filePath = "output-1.txt";
        var peopleList = Arrays.asList(
                new Person(1, "Alice", "Jones"),
                new Person(2, "Bob", "Smith"),
                new Person(3, "Charlie", "Brown")
        );

    }
//    private methods
    private void writeListToFile(List<Person> people){

    }
    // read filePath text file by line into ArrayList.
    private List<String> readFileByLine(String filePath) {
        List<String> fileLines = new ArrayList<>();
        try (BufferedReader read = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = read.readLine()) != null) {
                fileLines.add(line);
            }
        } catch (Exception ioe) {
            ioe.printStackTrace();
        }
        return fileLines;
    }
}
