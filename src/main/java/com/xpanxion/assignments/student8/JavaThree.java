package com.xpanxion.assignments.student8;

import java.io.*;
import java.util.*;

public class JavaThree {

    JavaThree() {}

    Scanner scanner = new Scanner(System.in);

    public void ex1() {
        try {
            var result = 10 / 0;
        }
        catch(ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }

    }

    public void ex2() throws CalculatorException {
        var calculator = new Calculator();
        var result = calculator.calculate(10, 0, "div");
    }

    public void ex3() {
        try {
            BufferedReader br = new BufferedReader(
                    new FileReader("input-1.txt")
            );
            String s;
            while((s = br.readLine()) != null) {
                System.out.println(s);
            }
            br.close();
        } catch (Exception e) {
            System.out.println(e);;
        }
    }

    // ex 4
    public void ex4() {
        try {
            File file = new File("input-2.txt");
            ArrayList<Person> personsFromFile = new ArrayList<>();
            Scanner fileScanner = new Scanner(file);
            while(fileScanner.hasNextLine()) {
                StringTokenizer st = new StringTokenizer(fileScanner.nextLine());
                int id = Integer.parseInt(st.nextToken().replace(",", ""));
                String firstName = st.nextToken();
                String lastName = st.nextToken();
                personsFromFile.add(new Person(id, firstName, lastName));
            }
            fileScanner.close();
            personsFromFile.forEach(System.out::println);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public void ex5() throws IOException {
        var peopleList = Arrays.asList(
                new Person(1, "Alice", "Jones"),
                new Person(2, "Bob", "Smith"),
                new Person(3, "Charlie", "Brown")
        );

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("output-1.txt")
            );
            for (Person p : peopleList) {
                String personStr = String.format("%s, %s %s \n", p.getId(), p.getFirstName(), p.getLastName());
                bw.write(personStr);
                }
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void ex6() {
        var personRepo = new PersonRepository();
        Optional<Person> maybePersonExists = personRepo.getPerson(4);
        maybePersonExists.ifPresent(p -> System.out.println(p.getFirstName()));
    }

    public void ex7() {}

    public void ex8() {}

    public void ex9() throws CalculatorException {
        var c = new Calculator();
        c.calculate(2, 3, "add");
        c.calculate(10, 6, "sub");
        c.calculate(8, 8, "mul");
        c.calculate(10, 2, "div");
        c.calculate(10, 0, "div");
    }

}
