package com.xpanxion.assignments.student5;

import java.text.NumberFormat;
import java.util.*;

public class JavaTwo {
    //
    // Data members
    //

    //
    // Constructors
    //
    JavaTwo() {}
    //
    // Public methods
    //

// EX1
    public void ex1() {
        var sc = new Scanner(System.in);
        List<Person> people = new ArrayList<>();

        title(1);

        while (true) {
            System.out.print("Enter Person (id, firstName lastName): ");
            String input = sc.nextLine();

            if (input.equalsIgnoreCase("done")) break;

            String[] splitInput = input.split("([, ])+");
            if (splitInput.length!=3) continue;

            people.add(new Person(splitInput[0], splitInput[1], splitInput[2]));
        }
        people.stream().forEach(p -> System.out.println(p.toString()));

        sc.close();
    }
// EX2
    public void ex2() {
        var sc = new Scanner(System.in);
        HashMap<Integer, Person> personMap = new HashMap<>();

        personMap.put(Integer.valueOf(1), new Person("1", "Peter", "Jones"));
        personMap.put(Integer.valueOf(2), new Person("2", "John", "Smith"));
        personMap.put(Integer.valueOf(3), new Person("3", "Mary", "Jane"));

        title(2);

        while (true) {
            System.out.print("Enter Person ID: ");
            String input = sc.nextLine();

            if (input.equalsIgnoreCase("done")) break;

            try {
                if (!personMap.containsKey(Integer.valueOf(input))) {
                    System.out.println("Invalid ID");
                    continue;
                }
            } catch (Exception e){
                System.out.println("Invalid Entry");
                continue;
            }

            System.out.println(personMap.get(Integer.valueOf(input)).toString());
        }
        sc.close();
    }
// EX3
    public void ex3() {
        Product product;

        title(3);

        var invoice =  new Invoice(1);

        invoice.addProduct(new Product(111,"Mustard", 2.00));
        invoice.addProduct(new Product(222,"Ketchup", 3.00));
        invoice.addProduct(new Product(333,"Franks Hot Sauce", 4.00));
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        System.out.println("Total cost: " + formatter.format(invoice.getTotalCost()));
    }
// EX4
    public void ex4() {
        //Don't repeat code :)
        ex3();
    }
// EX5
    public void ex5() {
        var repository = new Repository();
        var p = repository.getPerson();
        System.out.println(p);
    }
    //
    // Private methods
    //
    private void title(int i){
        System.out.printf("\n=============" +
                          "\n====Ex.%s====" +
                          "\n=============\n", i);
    }
    //
    // Overrides
    //
}
