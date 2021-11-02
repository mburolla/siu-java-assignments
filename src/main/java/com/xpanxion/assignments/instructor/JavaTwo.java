package com.xpanxion.assignments.instructor;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class JavaTwo {

    /**
     * Person List
     */
    public void ex1() {
        var personList = new ArrayList<Person>();

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter Person: ");
            var inString = scanner.nextLine();

            if (inString.equals("done")) {
                break;
            }

            var stringTokenizer = new StringTokenizer(inString);
            var id = Integer.parseInt(stringTokenizer.nextToken().replace(",", ""));
            var firstName = stringTokenizer.nextToken();
            var lastName = stringTokenizer.nextToken();

            personList.add(new Person(id, firstName, lastName));
        }

        for (Person p: personList) {
            System.out.println(p);
        }
    }
}
