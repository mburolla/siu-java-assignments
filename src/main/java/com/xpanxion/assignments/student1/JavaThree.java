package com.xpanxion.assignments.student1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class JavaThree {

    //
    // Constructors
    //

    JavaThree() {}

    //
    // Public methods
    //

    public void ex1() {
        try {
            var result = 10/ 0;
        } catch (Exception e) {
            System.out.println("Cannot divide by zero.");
        }
    }

    public void ex2() {
        var calculator = new Calculator(10, 0, "div");
        calculator.performCalculations(); // Catch this error.
    }

    public void ex3() {
        //write to file
        try {
            BufferedWriter bw = new BufferedWriter(
                new FileWriter("C:\\Users\\k0n03h5\\Desktop\\Test\\input-1.txt"));
            bw.write("This is line 1 from input-1.txt.\n");
            bw.write("This is line 2 from input-1.txt.\n");
            bw.write("This is line 3 from input-1.txt.\n");
            bw.write("This is line 4 from input-1.txt.\n");
            bw.write("This is line 5 from input-1.txt.\n");
            bw.close();
        } catch (Exception ex) {
            return;
        }

        //read from file
        try {
            BufferedReader br = new BufferedReader(
                    new FileReader("C:\\Users\\k0n03h5\\Desktop\\Test\\input-1.txt"));
            String s;
            while((s = br.readLine()) != null) {
                System.out.println(s); // write to console
            }
            br.close();
        } catch(Exception ex) {
            return;
        }
    }

    public void ex4() {
        //data structure to hold Person objects
        ArrayList<Person> people = new ArrayList<Person>();

        Scanner scanner = new Scanner(System.in);
        String id, firstName, lastName;

        //write file input-2.txt with fields id, firstName, lastName
        try {
            BufferedWriter bw = new BufferedWriter(
                    new FileWriter("C:\\Users\\k0n03h5\\Desktop\\Test\\input-2.txt"));
            bw.write("1 John Doe\n");
            bw.write("2 Mary Smith\n");
            bw.write("3 Peter Jones\n");
            bw.write("4 Bill Gates\n");
            bw.write("5 Steve Jobs\n");
            bw.close();
        } catch (Exception ex) {
            return;
        }

        //read file named input-2.txt
        try {
            BufferedReader br = new BufferedReader(
                    new FileReader("C:\\Users\\k0n03h5\\Desktop\\Test\\input-2.txt"));

            String s;

            while ((s = br.readLine()) != null) {
                //for each line extract id, firstName, lastName
                var personInfo = s.split(" ");
                id = personInfo[0];
                firstName = personInfo[1];
                lastName = personInfo[2];

                //create new Person object
                Person person = new Person(id, firstName, lastName);
                people.add(person);
            }
            br.close();
        } catch (Exception ex) {
            return;
        }

        //display list on the console
        for (Person person : people) {
            System.out.println(person);
        }
    }

    public void ex5() {
        var peopleList = Arrays.asList(
                new Person("1", "Alice", "Jones"),
                new Person("2", "Bob", "Smith"),
                new Person("3", "Charlie", "Brown")
        );

        //iterate through peopleList
        //write each person to output-1.txt
        try {
            BufferedWriter bw = new BufferedWriter(
                    new FileWriter("C:\\Users\\k0n03h5\\Desktop\\Test\\output-1.txt"));
            
            for (var person : peopleList) {
                bw.write(Integer.toString(person.getUserID()) + ", ");
                bw.write(person.getFirstName() + " ");
                bw.write(person.getLastName() + "\n");
            }
            bw.close();
        } catch (Exception ex) {
            return;
        }


        try {
            BufferedReader br = new BufferedReader(
                    new FileReader("C:\\Users\\k0n03h5\\Desktop\\Test\\output-1.txt"));

            String s;

            while((s = br.readLine()) != null) {
                System.out.println(s);
            }
            br.close();
        } catch(Exception ex) {
            return;
        }

    }

    public void ex6() {
        var personRepository = new PersonRepository();
        var person = personRepository.getPerson(3);
        System.out.println(person.get().getFirstName());
    }

    public void ex7() {

    }

    //
    // Private helper methods
    //

}
