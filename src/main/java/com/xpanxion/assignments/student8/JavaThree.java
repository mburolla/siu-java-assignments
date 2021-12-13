package com.xpanxion.assignments.student8;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

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

}
