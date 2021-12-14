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

    public void ex6() throws CalculatorException {
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

    public void ex9() {
        var personList = Arrays.asList(
        new Person(1, "Charlie", "Jones"),
                new Person(2, "Zoey", "Smith"),
                new Person(3, "Adam", "Anderson")
        );

        List<Person> filteredList = personList.stream()
                .filter(p -> p.getLastName().equals("Smith"))
                .collect(Collectors.toList());

        for (Person p : filteredList) {
            System.out.println(p);
        }

    }

    public void ex10()  {


        Queue<Cat> catQueue = new LinkedList<Cat>();
        catQueue.add(new Cat("Alice"));
        catQueue.add(new Cat("Bob"));
        catQueue.add(new Cat("Charlie"));
        catQueue.add(new Cat("Dan"));

        while(catQueue.size() > 0) {
           var catName = catQueue.stream()
                    .map(Cat::toString)
                   .collect(Collectors.toList());

            System.out.println(catName);

            catQueue.remove();

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    public void ex11() {

        var scanner = new Scanner(System.in);
        String userInput;
        HashMap<String,String> users = new HashMap<>();

        while(true) {
            System.out.print("Action [add|login|done]: ");
            userInput = scanner.nextLine();

            if (userInput.equalsIgnoreCase("DONE")) {
                break;
            }

            if (userInput.equalsIgnoreCase("add")) {
                System.out.print("Enter username, password: ");
                String createUser = scanner.nextLine();

                String[] createUserSplit = createUser.split(",");
                String userName = createUserSplit[0];

                String[] preSHAPassword = createUserSplit[1].split(" ");
                String password = preSHAPassword[1];

                String hashedPassword = SHA1.hash(password);
                users.put(userName, hashedPassword);

            }

            if (userInput.equalsIgnoreCase("login")) {
                System.out.print("Enter username, password: ");
                String createUser = scanner.nextLine();

                String[] createUserSplit = createUser.split(",");
                String userName = createUserSplit[0];

                String[] preSHAPassword = createUserSplit[1].split(" ");
                String password = preSHAPassword[1];

                String hashedPassword = SHA1.hash(password);

                if (users.get(userName).equals(hashedPassword)) {
                    System.out.println("OK");
                }
                else
                    System.out.println("Incorrect username or password");

            }

        }





    }


}