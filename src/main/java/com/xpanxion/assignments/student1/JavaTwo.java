package com.xpanxion.assignments.student1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class JavaTwo {

    //
    // Constructors
    //

    JavaTwo() {}

    //
    // Public methods
    //

    public void ex1() {
        Scanner scanner = new Scanner(System.in);
        List<Person> people = new ArrayList<>();
        //while user has not entered 'done'
        while (true) {
            //prompt use to enter a list of people
            System.out.print("Enter Person (first last): ");
            //store each token in varibles (first, last)
            String firstName = scanner.next();
            String lastName;

            if (firstName.equals("done")) {
                break;
            }

            lastName = scanner.next();
            people.add(new Person(firstName, lastName));
        }

        people.forEach(p -> System.out.println("id=" + p.getUserID() + ", firstName=" + p.getFirstName() + ", lastName=" + p.getLastName()));
    }

    //
    // Private helper methods
    //
}
