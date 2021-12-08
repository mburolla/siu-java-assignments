package com.xpanxion.assignments.student10;

import java.text.NumberFormat;
import java.util.*;
import java.util.stream.Collectors;

public class JavaTwo {



    JavaTwo() {
    }

    public void ex1 () {
        List<Person> personList = new ArrayList(0);
        Scanner scanner = new Scanner(System.in);


        while (true){
            System.out.println("Enter person: ");
            String input = scanner.nextLine();
            if(input.equals("done")){
                break;
            }
            String inputArray [] = input.split(" ");
            Person person = new Person(Integer.parseInt(inputArray[0]), inputArray[1], inputArray[2]);
            personList.add(person);

        }
        for (Person person : personList){
            //System.out.println("Person{id="+person.getId()+", firstname="+person.getFirstName() +", lastname=" +person.getLastName()+"}");
            System.out.println(person);
        }

    }

    public void ex2 () {
        HashMap<Integer, Person> personMap = new HashMap<>();
        Person person1 = new Person(1, "Peter", "Jones");
        Person person2 = new Person(2, "John", "Smith");
        Person person3 = new Person(3, "Mary","Jane");
        personMap.put(1,person1);
        personMap.put(2,person2);
        personMap.put(3,person3);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter person ID: ");
            String input = scanner.next();
            if (input.equals("done")) {
                break;
            }
            int inputNum = Integer.parseInt(input);
            System.out.println(personMap.get(inputNum));
        }
    }

    public void ex3 () {
        var invoice =  new Invoice(1);
        invoice.addProduct(new Product(111,"Mustard", 2.00));
        invoice.addProduct(new Product(222,"Ketchup", 3.00));
        invoice.addProduct(new Product(333,"Franks Hot Sauce", 4.00));
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        System.out.println("Total cost: " + formatter.format(invoice.getTotalCost()));
    }

    public void ex4 () {
        var invoice =  new Invoice(1);
        invoice.addProduct(new Product(111,"Mustard", 2.00));
        invoice.addProduct(new Product(222,"Ketchup", 3.00));
        invoice.addProduct(new Product(333,"Franks Hot Sauce", 4.00));
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        System.out.println("Total cost: " + formatter.format(invoice.getTotalCost()));
    }

    public void ex5 () {
        var repository = new Repository();
        var p = repository.getPerson();
        System.out.println(p);
    }

    public void ex6 () {
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();
        System.out.println("Student 10: ex6.");

        while (true) {
            System.out.print("Enter a number: ");
            String next = scanner.next();
            if (next.equals("done")){
                break;
            }
            else {
                int num1 = Integer.parseInt(next);
                calc.setNum1(num1);
                System.out.print("Enter another number: ");
                int num2 = scanner.nextInt();
                calc.setNum2(num2);
                System.out.print("Enter an operation(add, sub, mul, div): ");
                String operator = scanner.next();
                calc.setOperator(operator);
                int result = calc.calculate();
                System.out.println("Result: " + result);
            }
        }
        for (String operation: calc.getList()){
            System.out.println(operation);
        }
    }

    public void ex7 () {
        var personList = Arrays.asList(
                new Person(1, "Peter", "Jones"),
                new Person(2, "John", "Smith"),
                new Person(3, "Sue", "Anderson")
        );


        List<Person> newPersonList = personList.stream()
                .map(person -> new Person(person.getId(), person.getFirstName(), "xxx"))
                .collect(Collectors.toList());

        for (Person p : newPersonList) {
            System.out.println(p);
        }
    }
}
