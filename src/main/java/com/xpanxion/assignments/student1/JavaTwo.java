package com.xpanxion.assignments.student1;

import java.util.*;

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
            //prompt used to enter a list of people
            System.out.print("Enter Person (id first last): ");
            //store each token in variables (first, last)
            String id = scanner.next();
            String firstName;
            String lastName;

            if (id.equals("done")) {
                break;
            }
            firstName = scanner.next();
            lastName = scanner.next();
            people.add(new Person(id,firstName, lastName));
        }

        people.forEach(p -> System.out.println("id=" + p.getUserID() + ", firstName=" + p.getFirstName() + ", lastName=" + p.getLastName()));
    }

    public void ex2() {
        Scanner scanner = new Scanner(System.in);
        //create HashMap whose key is an Integer and value is a Person
        HashMap<Integer, Person> map = new HashMap<Integer, Person>();
        map.put(1, new Person("1", "Peter", "Jones"));
        map.put(2, new Person("2", "John", "Smith"));
        map.put(3, new Person("3", "Mary", "Jane"));

        map.forEach((k,v) -> System.out.println(k + " " + v.getFirstName() + " " + v.getLastName()));

        //while user is not "done"
        while(true) {
            //prompt user to enter a person id and store in variable
            System.out.print("Enter Person ID: ");
            String userID = scanner.next();

            if (userID.equals("done")) break;

            if (isInt(userID)) {
                // use id to look up the Person object of that id
                var getPerson = map.get(Integer.parseInt(userID));
                //print user info, if found
                System.out.println("id=" + getPerson.getUserID() + ", firstName=" + getPerson.getFirstName() + ", lastName=" + getPerson.getLastName());
            }

        }
    }

    //
    // Private helper methods
    //

    public static boolean isInt(String str) {

        try {
            int x = Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }

    }
}
