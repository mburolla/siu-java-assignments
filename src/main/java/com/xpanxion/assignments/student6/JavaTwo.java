package com.xpanxion.assignments.student6;

import java.text.NumberFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

    public void ex10() throws InterruptedException {
        Queue<Cat> catQueue = new LinkedList<Cat>();
        catQueue.add(new Cat("Alice"));
        catQueue.add(new Cat("Bob"));
        catQueue.add(new Cat("Charlie"));
        catQueue.add(new Cat("Dan"));

        while(!catQueue.isEmpty()) {
            System.out.println(catQueue);
            catQueue.remove();
            TimeUnit.SECONDS.sleep(3);
        }

    }
}
