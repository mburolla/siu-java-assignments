package com.xpanxion.assignments.student6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class JavaTwo {

    public void ex1() {
        List<Person> persons = new ArrayList<>();

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Person: ");
            String input = sc.nextLine();
            if (input.equals("done")) {
                break;
            }

            String updatedInput = input.replaceAll(",", " ");
            String [] inputHolder = updatedInput.split(" ");
            int id = parseInt(inputHolder[0]);
            String firstName = inputHolder[2];
            String lastName = inputHolder[3];

            persons.add(new Person(id, firstName, lastName));
        }

        for (Person p : persons) {
            System.out.println(p);
        }

    }
}
