package com.xpanxion.assignments.student7;

import java.lang.reflect.Array;
import java.text.NumberFormat;
import java.util.*;

public class JavaTwo {

    public void ex1() {
        var scanner = new Scanner(System.in);
        ArrayList<Person> people = new ArrayList<Person>();


        System.out.print("Enter Person: ");
        String userInput = scanner.nextLine();

        while(!userInput.equals("done")) {

            String[] stringArray = userInput.split(",");
            int id = Integer.parseInt(stringArray[0]);
            String firstName = "";
            String lastName = "";

            //Split full name and initialize to first and last name
            String fullName = stringArray[1].toString();
            String[] fullNameSplit = fullName.split(" ");
            firstName = fullNameSplit[1];
           lastName = fullNameSplit[2];

           Person person = new Person(id, firstName, lastName);
           people.add(person);

            System.out.print("Enter Person: ");
            userInput = scanner.nextLine();
        }

        if (userInput.equals("done")) {
            for (Person person : people) {
                System.out.println(person);
            }
        }
    }

    public void ex2() {
        var scanner = new Scanner(System.in);
        HashMap<String, Person> people = new HashMap<String, Person>();
        String userInput = "";

        people.put("1", new Person(1,"Peter", "Jones"));
        people.put("2", new Person(2, "John", "Smith"));
        people.put("3", new Person(3, "Mary", "Jane"));

        while(true) {
            System.out.print("Enter Person ID: ");
            userInput = scanner.nextLine();
            if (userInput.equals("done")) {
                break;
            }
            System.out.println(people.get(userInput));
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

    public void ex5() {
        var repository = new Repository();
        var p = repository.getPerson();
        System.out.println(p);
    }
}
