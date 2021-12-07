package com.xpanxion.assignments.student5;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.text.NumberFormat;
import java.util.*;
import java.util.stream.Collectors;

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
        title(5);
        var repository = new Repository();
        var p = repository.getPerson();
        System.out.println(p);
    }
// EX6
    public void ex6() {
        title(6);
        Calculator calc = new Calculator();
        calc.run();
    }
// EX7
    public void ex7() {
        title(7);
        var personList = Arrays.asList(
                new Person("1", "Peter", "Jones"),
                new Person("2", "John", "Smith"),
                new Person("3", "Sue", "Anderson")
        );

        List<Person> newPersonList = personList.stream()
                .map(p -> {
                    p.setLastName("xxx");
                    return p;
                })
                .collect(Collectors.toList());

        for (Person p : newPersonList) {
            System.out.println(p);
        }
    }
// EX8
    public void ex8() {
        title(8);
        var personList = Arrays.asList(
                new Person("1", "Charlie", "Jones"),
                new Person("2", "Zoey", "Smith"),
                new Person("3", "Adam", "Anderson")
        );

        personList.sort( (Comparator.comparing((Person p) -> p.getFirstName())));

        for (Person p : personList) {
            System.out.println(p);
        }
    }
// EX9
    public void ex9() {
        title(9);
        var personList = Arrays.asList(
                new Person("1", "Charlie", "Jones"),
                new Person("2", "Zoey", "Smith"),
                new Person("3", "Adam", "Anderson")
        );

        var filteredList = personList.stream()
                .filter(p -> (p.getLastName().equals("Smith")))
                .collect(Collectors.toList());

        for (Person p : filteredList) {
            System.out.println(p);
        }
    }
// EX10
    public void ex10() {
        Queue<Cat> catQueue = new LinkedList<>();

        catQueue.add(new Cat("Alice"));
        catQueue.add(new Cat("Bob"));
        catQueue.add(new Cat("Charlie"));
        catQueue.add(new Cat("Dan"));

        while (!catQueue.isEmpty()) {
            System.out.println(catQueue.toString());
            catQueue.remove();
            try{
                Thread.sleep(3000);
            } catch(Exception e) {}
        }
    }
// EX11
    public void ex11() {

    }

//
// Private methods
//
    private void add() {
        var sc = new Scanner(System.in);
        String usrName;
        String sha1 = "";
        System.out.print("Enter your username: ");
        usrName = sc.nextLine();

        System.out.print("Enter your password: ");
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-1");
            digest.reset();
            digest.update(sc.nextLine().getBytes(StandardCharsets.UTF_8));
            sha1 = String.format("%040x", new BigInteger(1, digest.digest()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        sc.close();
    }
    private void login() {

    }

    private void title(int i){
        System.out.printf("\n=============" +
                          "\n====Ex.%s====" +
                          "\n=============\n", i);
    }
//
// Overrides
//
}
