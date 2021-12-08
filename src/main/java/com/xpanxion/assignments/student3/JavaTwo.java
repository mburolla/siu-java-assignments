package com.xpanxion.assignments.student3;

import java.text.NumberFormat;
import java.util.*;
import java.util.stream.Collectors;

public class JavaTwo {

    JavaTwo() {}

    public void ex1(){
        //enter people based on id, firstname, and lastname and put into array
        var peopleArray = new ArrayList<Person>();

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter Person: ");
            String string = scanner.nextLine();
            if (string.equals("done"))
                break;


            StringTokenizer stringTokenizer = new StringTokenizer(string);
            int id = Integer.parseInt(stringTokenizer.nextToken().replace(",", ""));
            String firstName = stringTokenizer.nextToken();
            String lastName = stringTokenizer.nextToken();

            peopleArray.add(new Person(id, firstName, lastName));
        }

        for (Person p: peopleArray){
            System.out.println(p);
        }
    }

    public void ex2(){
        //hashMap to find person by id
        Map hashMap = new HashMap<Integer, Person>();

        Person p1 = new Person(1, "Peter", "Jones");
        Person p2 = new Person(2, "John", "Smith");
        Person p3 = new Person(3, "Mary", "Jane");

        hashMap.put(1, p1);
        hashMap.put(2, p2);
        hashMap.put(3, p3);

        while(true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter Person ID: ");
            String string = scanner.nextLine();
            if (string.equals("done"))
                break;

            System.out.println(hashMap.get(Integer.parseInt(string)));
        }
    }

    public void ex3_4(){
        //product cost and base class extension
       var invoice =  new Invoice(1);
        invoice.addProduct(new Product(111,"Mustard", 2.00));
        invoice.addProduct(new Product(222,"Ketchup", 3.00));
        invoice.addProduct(new Product(333,"Franks Hot Sauce", 4.00));
        //invoice.addProduct(new Product(444, "bbq", 3.75));
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        System.out.println("Total cost: " + formatter.format(invoice.getTotalCost()));
    }

    public void ex5(){
        //repository
        var repository = new Repository();
        var p = repository.getPerson();
        System.out.println(p);

    }

    public void ex6() {
        //oop calculator
        int x, y, z = 0;
        String op, input;
        var history = new ArrayList<String>();

        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        do {
            op = "";
            System.out.print("Enter First Number: ");
            input = scanner.nextLine();
            if (input.equals("done"))
                break;
            x = Integer.parseInt(input);

            System.out.print("Enter Second Number: ");
            y = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter Operator( +, -, *, /): ");
            op = scanner.nextLine();

            z = calculator.calculate(x, y,  op );;

            System.out.println("Result: " + z);


        } while (true);

        calculator.getHistory().forEach(System.out::println);
    }

    public void ex7(){
        //redact last name
        var personList = Arrays.asList(
                new Person(1, "Peter", "Jones"),
                new Person(2, "John", "Smith"),
                new Person(3, "Sue", "Anderson")
        );

        List<Person> newPersonList = personList.stream().map(p -> {
                    p.setLastname("xxxx");
                    return p;
                })
                .collect(Collectors.toList());

        for (Person p : newPersonList) {
            System.out.println(p);
        }
    }

    public void ex8(){
        //sort people by first name
        var personList = Arrays.asList(
                new Person(1, "Charlie", "Jones"),
                new Person(2, "Zoey", "Smith"),
                new Person(3, "Adam", "Anderson")
        );


        //Collections.sort(personList);
        personList.sort(Comparator.comparing((Person p) -> p.getFirstname()));

        for(Person p : personList){
            System.out.println(p);
        }
    }

    public void ex9(){
        //filter people by name
        var personList = Arrays.asList(
                new Person(1, "Charlie", "Jones"),
                new Person(2, "Zoey", "Smith"),
                new Person(3, "Adam", "Anderson")
        );

        var filteredList = personList.stream()
                .filter(p -> p.getLastname().equals("Smith") )
                .collect(Collectors.toList());

        for (Person p : filteredList) {
            System.out.println(p);
        }
    }

    public void ex10() throws InterruptedException {
        //cat
        Queue<Cat> queue = new LinkedList<>();

        queue.add(new Cat("Alice"));
        queue.add(new Cat("Bob"));
        queue.add(new Cat("Charlie"));
        queue.add(new Cat("Dan"));

        while (true){
            System.out.println(queue);
            queue.remove();
            Thread.sleep(3000);
            if (queue.isEmpty())
                break;
        }

    }

}