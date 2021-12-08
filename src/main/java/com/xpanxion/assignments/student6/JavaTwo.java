package com.xpanxion.assignments.student6;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashMap;
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

    public void ex2() {
        HashMap<Integer, Person> personHashMap = new HashMap<>();

        Person p1 = new Person(1, "Peter", "Jones");
        Person p2 = new Person(2, "John", "Smith");
        Person p3 = new Person(3, "Mary", "Jane");

        personHashMap.put(1, p1);
        personHashMap.put(2, p2);
        personHashMap.put(3, p3);

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Person ID: ");
            String input = sc.nextLine();
            if (input.equals("done")) {
                break;
            }
            System.out.println(personHashMap.get(Integer.parseInt(input)));
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

    public void ex5() {
        var repository = new Repository();
        var p = repository.getPerson();
        System.out.println(p);
    }

    public void ex6() {
        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();

        while(true) {
            System.out.println("Enter First Number: ");
            String firstNum = sc.nextLine();
            if(firstNum.equals("done")) {
                break;
            }

            System.out.println("Enter Second Number: ");
            String secondNum = sc.nextLine();
            if(secondNum.equals("done")) {
                break;
            }

            System.out.println("Enter Operation(add, sub, mul, div): ");
            String operation = sc.nextLine();
            int result = calculator.calculate(Integer.parseInt(firstNum), Integer.parseInt(secondNum), operation);
            System.out.println("Result: " + result);
        }

        for (String s : calculator.getHistory()) {
            System.out.println(s);
        }


    }
}
