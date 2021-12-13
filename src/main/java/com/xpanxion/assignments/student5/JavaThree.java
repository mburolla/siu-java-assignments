package com.xpanxion.assignments.student5;

import java.io.*;
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
    public void ex5() throws IOException {
        // Write peopleList to output-1.txt
        String filePath = "src\\main\\java\\com\\xpanxion\\assignments\\student5\\output-1.txt";
        var peopleList = Arrays.asList(
                new Person(1, "Alice", "Jones"),
                new Person(2, "Bob", "Smith"),
                new Person(3, "Charlie", "Brown")
        );
        writeListToFile(peopleList, filePath);
    }
// Ex6 Optional Person
    public void ex6() {
        var personRepository = new PersonRepository();
        var person = personRepository.getPerson(4);
        person.ifPresentOrElse(p -> System.out.println(p.getFirstName()),
                () -> {System.out.println("Person Not Found");}
        );
    }


//    private methods
    private void writeListToFile(List<Person> people, String filePath) throws IOException {
        try (BufferedWriter write = new BufferedWriter(new FileWriter(filePath))){
            people.stream().forEach(person -> {
                try {
                    write.write(person.infoToFile());
                } catch (IOException ioe) {
                    ioe.printStackTrace();
                }
            });
        }
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
