package com.xpanxion.assignments.student7;

import java.lang.reflect.Array;
import java.text.NumberFormat;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

        for (Person person : people) {
            System.out.println(person);
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

    public void ex6() {
        var scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        while(true) {
            System.out.print("Enter first number: ");
            String num1String = scanner.nextLine();

            if (num1String.equals("done")) {
                for ( String s: calculator.getHistory()) {
                    System.out.println(s);
                };
                break;
            }
            int num1 = Integer.parseInt(num1String);


            System.out.print("Enter second number: ");
            String num2String = scanner.nextLine();
            int num2 = Integer.parseInt(num2String);

            System.out.print("Enter Operation(add, sub, div, mul): ");
            String operand1 = scanner.nextLine();
            String operand = operand1.toUpperCase();

            calculator.calculate(num1, num2, operand);

            switch (operand) {
                case "ADD" -> System.out.println("Result: " + (num1 + num2));
                case "SUB" -> System.out.println("Result: " + (num1 - num2));
                case "DIV" -> System.out.println("Result: " + (num1 / num2));
                case "MUL" -> System.out.println("Result: " + (num1 * num2));
            }
        }

    }

    public void ex7() {

        var personList = Arrays.asList(
                new Person(1, "Peter", "Jones"),
                new Person(2, "John", "Smith"),
                new Person(3, "Sue", "Anderson")
        );

        List<Person> newPersonList = personList.stream()
                .map(p -> new Person(p.getId(), p.getFirstName(), "xxx"))
                .toList();


        for (Person p : newPersonList) {
            System.out.println(p);
        }
    }

    public void ex8() {
        var personList = Arrays.asList(
                new Person(1, "Charlie", "Jones"),
                new Person(2, "Zoey", "Smith"),
                new Person(3, "Adam", "Anderson")
        );

        List<Person> newPersonList = personList.stream()
                .sorted(Comparator.comparing(Person::getFirstName))
                .collect(Collectors.toList());

        for (Person p : newPersonList) {
            System.out.println(p);
        }
    }


}
