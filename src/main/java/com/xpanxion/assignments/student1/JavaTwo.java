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
            //prompt use to enter a list of people
            System.out.print("Enter Person (id first last): ");
            //store each token in varibles (first, last)
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

//    public void ex2() {
//        Scanner scanner = new Scanner(System.in);
//        //create HashMap whose key is an Integer and value is a Person
//        HashMap<Integer, Person> map = new HashMap<Integer, Person>();
//        map.put()
//        //while user is not "done"
//        while(true) {
//            //prompt user to enter a person id and store in variable
//            System.out.print("Enter Person ID: ");
//            var userID = scanner.nextInt();
//
//            // use id to look up the Person object of that id
//
//            //print user info, if found
//        }
//    }

    //
    // Private helper methods
    //
}
