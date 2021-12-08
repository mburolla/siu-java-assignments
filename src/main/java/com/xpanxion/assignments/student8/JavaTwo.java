package com.xpanxion.assignments.student8;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class JavaTwo {

    JavaTwo() {}

    Scanner scanner = new Scanner(System.in);

    public void ex1() {

        ArrayList<Person> listOfPersons = new ArrayList<>();
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

    public void ex2() {

        HashMap<Integer, Person> hashMapOfPersons = new HashMap<>();

        Person p1 = new Person(1, "Peter", "Jones");
        Person p2 = new Person(2, "John", "Smith");
        Person p3 = new Person(3, "Mary", "Jane");

        hashMapOfPersons.put(p1.getId(), p1);
        hashMapOfPersons.put(p2.getId(), p2);
        hashMapOfPersons.put(p3.getId(), p3);

        while(true) {
            System.out.print("Enter Person ID: ");
            String userInput = scanner.nextLine();

            if (userInput.equals("done"))
                break;

            int requestedID = Integer.parseInt(userInput);

            System.out.println(hashMapOfPersons.get(requestedID));
        }

    }

    public void ex3() {
        var invoice =  new Invoice(1);
        invoice.addProduct(new Product(111,"Mustard", 2.00));
        invoice.addProduct(new Product(222,"Ketchup", 3.00));
        invoice.addProduct(new Product(333,"Franks Hot Sauce", 4.00));
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        System.out.println("Total cost: " + formatter.format(invoice.getTotalCost()));
    }

    public void ex4() {
        var invoice =  new Invoice(1);
        invoice.addProduct(new Product(111,"Mustard", 2.00));
        invoice.addProduct(new Product(222,"Ketchup", 3.00));
        invoice.addProduct(new Product(333,"Franks Hot Sauce", 4.00));
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        System.out.println("Total cost: " + formatter.format(invoice.getTotalCost()));
    }
}
