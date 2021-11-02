package com.xpanxion.assignments.instructor;

import java.util.Scanner;
import java.util.ArrayList;
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

            // Parse input.
            var stringTokenizer = new StringTokenizer(inString);
            var id = Integer.parseInt(stringTokenizer.nextToken().replace(",", ""));
            var firstName = stringTokenizer.nextToken();
            var lastName = stringTokenizer.nextToken();

            // Build list.
            personList.add(new Person(id, firstName, lastName));
        }

        for (Person p: personList) { // For each.
            System.out.println(p);
        }
    }

    /**
     *
     */
    public void ex2() {

    }

    /**
     *
     */
    public void ex3() {

    }

    /**
     *
     */
    public void ex4() {

    }

    /**
     *
     */
    public void ex5() {

    }

    /**
     *
     */
    public void ex6() {

    }

    /**
     *
     */
    public void ex7() {

    }

    /**
     *
     */
    public void ex8() {

    }

    /**
     *
     */
    public void ex9() {

    }

    /**
     *
     */
    public void ex10() {

    }
}
