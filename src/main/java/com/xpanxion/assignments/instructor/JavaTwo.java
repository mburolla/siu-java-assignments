package com.xpanxion.assignments.instructor;

import java.util.*;
import java.text.NumberFormat;
import java.util.stream.Collectors;
import java.util.concurrent.TimeUnit;

public class JavaTwo {

    /**
     * Person List
     */
    public void ex1() {
        var personList = new ArrayList<Person>();

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter Person: ");
            var inString = scanner.nextLine();
            if (inString.equals("done")) {
                break;
            }

            // Parse input.
            var stringTokenizer = new StringTokenizer(inString);
            var id = Integer.parseInt(stringTokenizer.nextToken().replace(",", ""));
            var firstName = stringTokenizer.nextToken();
            var lastName = stringTokenizer.nextToken();

            // Build list.
            personList.add(new Person(id, firstName, lastName));
        }

        for (Person p: personList) { // For each.
            System.out.println(p);
        }
    }

    /**
     * Person HashMap
     */
    public void ex2() {
        var hashMap = new HashMap<Integer, Person>();

        var p1 = new Person(1, "Peter", "Jones");
        var p2 = new Person(2, "John", "Smith");
        var p3 = new Person(3, "Mary", "Jane");

        hashMap.put(1, p1);
        hashMap.put(2, p2);
        hashMap.put(3, p3);

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter Person ID: ");
            var inString = scanner.nextLine();
            if (inString.equals("done")) {
                break;
            }
            System.out.println(hashMap.get(Integer.parseInt(inString)));
        }
    }

    /**
     * Invoices and Products.
     */
    public void ex3() {
        var invoice =  new Invoice(1);
        invoice.addProduct(new Product(111,"Mustard", 2.00));
        invoice.addProduct(new Product(222,"Ketchup", 3.00));
        invoice.addProduct(new Product(333,"Franks Hot Sauce", 4.00));
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        System.out.println("Total cost: " + formatter.format(invoice.getTotalCost()));
    }

    /**
     * Refactor Invoice and Products
     */
    public void ex4() {
        var invoice =  new Invoice(1);
        invoice.addProduct(new Product(111,"Mustard", 2.00));
        invoice.addProduct(new Product(222,"Ketchup", 3.00));
        invoice.addProduct(new Product(333,"Franks Hot Sauce", 4.00));
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        System.out.println("Total cost: " + formatter.format(invoice.getTotalCost()));
    }

    /**
     * Repository Interface
     */
    public void ex5() {
        var repository = new Repository();
        var p = repository.getPerson();
        System.out.println(p);
    }

    /**
     * OOP Calclator
     */
    public void ex6() throws CalculatorException {
        var scanner = new Scanner(System.in); // Type inference.
        var calculator = new Calculator();

        while (true) {
            System.out.print("Enter first number: ");
            var operand1 = scanner.nextLine();
            if (operand1.equals("done")) {
                break;
            }

            System.out.print("Enter second number: ");
            var operand2 = scanner.nextLine();
            if (operand1.equals("done")) {
                break;
            }

            System.out.print("Enter operation (add, sub, mul, div): ");
            var operation = scanner.nextLine();
            var result = calculator.calculate(Integer.parseInt(operand1), Integer.parseInt(operand2), operation);

            var outString = String.format("Result: %s", result);
            System.out.println(outString);
        }

        // Print history.
        for(String s: calculator.getHistory()) {
            System.out.println(s);
        }
    }

    /**
     * Redact Last Name
     */
    public void ex7() {
        var personList = Arrays.asList(
                new Person(1, "Peter", "Jones"),
                new Person(2, "John", "Smith"),
                new Person(3, "Sue", "Anderson")
        );

        var newPersonList = personList.stream().map(p -> {
                return new Person(p.getId(), p.getFirstName(), "xxx");
            }).collect(Collectors.toList());

        for (Person p : newPersonList) {
            System.out.println(p);
        }
    }

    /**
     * Sort People
     */
    public void ex8() {
        var personList = Arrays.asList(
                new Person(1, "Charlie", "Jones"),
                new Person(2, "Zoey", "Smith"),
                new Person(3, "Adam", "Anderson")
        );

        personList.sort(Comparator.comparing((Person p) -> p.getFirstName()));

        for (Person p : personList) {
            System.out.println(p);
        }
    }

    /**
     * Filter People
     */
    public void ex9() {
        var personList = Arrays.asList(
                new Person(1, "Charlie", "Jones"),
                new Person(2, "Zoey", "Smith"),
                new Person(3, "Adam", "Anderson")
        );

        var filteredList = personList.stream().filter(x -> x.getLastName().equals("Smith")).collect(Collectors.toList());

        for (Person p : filteredList) {
            System.out.println(p);
        }
    }

    /**
     * Cat Queue
     */
    public void ex10() throws InterruptedException {
        Queue<Cat> catQueue = new LinkedList<Cat>();
        catQueue.add(new Cat("Alice"));
        catQueue.add(new Cat("Bob"));
        catQueue.add(new Cat("Charlie"));
        catQueue.add(new Cat("Dan"));

        while (!catQueue.isEmpty()) {
            System.out.println(catQueue);
            catQueue.remove();
            TimeUnit.SECONDS.sleep(3);
        }
    }
}
