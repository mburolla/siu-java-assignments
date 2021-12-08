package com.xpanxion.assignments.student2;

import java.text.NumberFormat;
import java.util.Scanner;
import java.util.*;

class Person {

    private final int id;
    private final String firstName;
    private final String lastName;

    //
    // Constructors
    //

    Person(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String outputPerson() {
        return "{id=" + id + ", firstName='" + firstName + "', lastName='" + lastName + "'}";
    }

}

class Invoice {

    int invoiceId;
    private final List<Product> products = new ArrayList<>();

    Invoice(int invoiceId) {
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

class Product {

    private final int productId;
    private final String productName;
    private final double productCost;

    Product(int productId, String productName, double productCost) {
        this.productId = productId;
        this.productName = productName;
        this.productCost = productCost;
    }

    double getProductCost() {
        return productCost;
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
            System.out.println(n.outputPerson());
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

    public static void ex3() {

    }

    //
    // Private helper methods
    //

}
