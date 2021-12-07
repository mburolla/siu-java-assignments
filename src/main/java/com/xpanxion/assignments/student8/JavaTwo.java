package com.xpanxion.assignments.student8;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class JavaTwo {

    JavaTwo() {}

    Scanner scanner = new Scanner(System.in);

    public void ex1() {

        ArrayList<Person> listOfPersons = new ArrayList<Person>();
        String userInput;

        while(true) {
            System.out.print("Enter Person: ");
            userInput = scanner.nextLine();

            if (userInput.equals("done")) {
                break;
            }

            StringTokenizer stringTokenizer = new StringTokenizer(userInput);
            int id = Integer.parseInt(stringTokenizer.nextToken().replace(",", ""));
            String firstName = stringTokenizer.nextToken();
            String lastName = stringTokenizer.nextToken();

            listOfPersons.add(new Person(id, firstName, lastName));
        }

        for (Person person : listOfPersons) {
            System.out.println(person);
        }
    }
}
