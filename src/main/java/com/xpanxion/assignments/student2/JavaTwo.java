package com.xpanxion.assignments.student2;

import java.text.NumberFormat;
import java.util.Scanner;
import java.util.*;
import java.util.ArrayList;
import java.util.stream.Collectors;

class Person {

    int id;
    String firstName;
    String lastName;

    //
    // Constructors
    //

    Person(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String toString() {
        return "Person{id=" + id + ", firstName='" + firstName + "', lastName='" + lastName + "'}";
    }

}

class Invoice extends Base {

    int invoiceId;
    private final List<Product> products = new ArrayList<>();

    Invoice(int invoiceId) {
        super();
        this.invoiceId = invoiceId;
    }

    void addProduct(Product product) {
        products.add(product);
    }

    double getTotalCost() {
        double i = 0;
        for(Product n : products) {
            i = i + n.getProductCost();
        }
        return i;
    }
}

class Product extends Base {

    private final int productId;
    private final String productName;
    private final double productCost;

    Product(int productId, String productName, double productCost) {
        super();
        this.productId = productId;
        this.productName = productName;
        this.productCost = productCost;
    }

    double getProductCost() {
        return productCost;
    }
}

abstract class Base {

    String id;

    Base() {

    }
}

interface DataAccess {
    String getPerson();
}

class Repository implements DataAccess {

    public String getPerson() {
        return "{id= 1, firstName='John', lastName='Doe'}";
    }

}

class Calculator {

    List<String> calculations = new ArrayList<>();

    void storeCalc(String calculation) {
        calculations.add(calculation);
    }

    void printCalc() {
        for(String n : calculations) {
            System.out.println(n);
        }
    }

}

public class JavaTwo {

    //
    // Constructors
    //

    JavaTwo() {
    }

    //
    // Public methods
    //

    public static void ex1() {
        List<Person> people = new ArrayList<>();

        while(true) {
            System.out.print("Enter Person: ");
            Scanner scannerExample1 = new Scanner(System.in);
            String name = scannerExample1.nextLine();

            if(name.equals("done")) {
                break;
            }

            String[] nameArray = name.split(" ", 3);
            int correctedNum = Integer.parseInt(nameArray[0].replace(",", ""));
            Person newPerson = new Person(correctedNum, nameArray[1], nameArray[2]);
            people.add(newPerson);
        }

        for(Person n : people) {
            System.out.println(n);
        }
    }

    public static void ex2() {
        Map<Integer, String> people = new HashMap<>();
        people.put(1, "Peter Jones");
        people.put(2, "John Smith");
        people.put(3, "Mary Jane");

        while(true) {
            System.out.print("Enter Person ID: ");
            Scanner scannerExample2 = new Scanner(System.in);
            String idNumber = scannerExample2.nextLine();

            if(idNumber.equals("done")) {
                break;
            }

            int correctedId = Integer.parseInt(idNumber);

            String[] nameArray = people.get(correctedId).split(" ", 2);
            System.out.println("{id=" + correctedId + ", firstName='" + nameArray[0] + "', lastName='" + nameArray[1] + "'}");
        }
    }

    public static void ex3() {
        var invoice =  new Invoice(1);
        invoice.addProduct(new Product(111,"Mustard", 2.00));
        invoice.addProduct(new Product(222,"Ketchup", 3.00));
        invoice.addProduct(new Product(333,"Franks Hot Sauce", 4.00));
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        System.out.println("Total cost: " + formatter.format(invoice.getTotalCost()));
    }

    public static void ex4() {
        var invoice =  new Invoice(1);
        invoice.addProduct(new Product(111,"Mustard", 2.00));
        invoice.addProduct(new Product(222,"Ketchup", 3.00));
        invoice.addProduct(new Product(333,"Franks Hot Sauce", 4.00));
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        System.out.println("Total cost: " + formatter.format(invoice.getTotalCost()));
    }

    public static void ex5() {
        var repository = new Repository();
        var p = repository.getPerson();
        System.out.println(p);
    }

    public static void ex6() {

        Calculator calc = new Calculator();
        String operatorSymbol = null;

        while(true) {
            System.out.print("Enter first number: ");
            Scanner scannerExample7_1 = new Scanner(System.in);
            String firstEntry = scannerExample7_1.next();
            if(firstEntry.equals("done")) {
                calc.printCalc();
                break;
            }
            System.out.print("Enter second number: ");
            Scanner scannerExample7_2 = new Scanner(System.in);
            String secondEntry = scannerExample7_2.next();
            System.out.print("Enter operation (add, sub, mul, div): ");
            Scanner scannerExample7_3 = new Scanner(System.in);
            String operator = scannerExample7_3.next();
            

            int firstNum = Integer.parseInt(firstEntry);
            int secondNum = Integer.parseInt(secondEntry);

            float result = 0;
            if (operator.equals("add")) {
                result = firstNum + secondNum;
                operatorSymbol = "+";
            } else if (operator.equals("sub")) {
                result = firstNum - secondNum;
                operatorSymbol = "-";
            } else if (operator.equals("mul")) {
                result = firstNum * secondNum;
                operatorSymbol = "*";
            } else if (operator.equals("div")) {
                result = (float) firstNum / (float) secondNum;
                operatorSymbol = "/";
            }
            System.out.println("Result: " + result);
            calc.storeCalc(firstEntry + " " + operatorSymbol + " " + secondEntry + " = " + result);
        }
    }

    public static void ex7() {
        var personList = Arrays.asList(
                new Person(1, "Peter", "Jones"),
                new Person(2, "John", "Smith"),
                new Person(3, "Sue", "Anderson")
        );

        List<Person> newPersonList = personList.stream().map(p -> {
            Person obj = new Person(p.id, p.firstName, "xxx");
            return obj;
                })
                .collect(Collectors.toList());

        for (Person p : newPersonList) {
            System.out.println(p);
        }
    }
    //
    // Private helper methods
    //

}
