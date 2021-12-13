package com.xpanxion.assignments.student8;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.NumberFormat;
import java.util.*;
import java.util.stream.Collectors;

public class JavaTwo {

    JavaTwo() {}

    Scanner scanner = new Scanner(System.in);

    public void ex1() {

        ArrayList<Person> listOfPersons = new ArrayList<>();
        String userInput;

        while(true) {
            System.out.print("Enter Person: ");
            userInput = scanner.nextLine();

            if (userInput.equals("done")) {
                break;
            }

            StringTokenizer stringTokenizer = new StringTokenizer(userInput);
            int id = Integer.parseInt(stringTokenizer.nextToken().replace(",", ""));
            String firstName = stringTokenizer.nextToken();
            String lastName = stringTokenizer.nextToken();

            listOfPersons.add(new Person(id, firstName, lastName));
        }

//        for (Person person : listOfPersons) {
//            System.out.println(person);
//        }
        listOfPersons.forEach(System.out::println);

    }

    public void ex2() {

        HashMap<Integer, Person> hashMapOfPersons = new HashMap<>();

        Person p1 = new Person(1, "Peter", "Jones");
        Person p2 = new Person(2, "John", "Smith");
        Person p3 = new Person(3, "Mary", "Jane");

        hashMapOfPersons.put(p1.getId(), p1);
        hashMapOfPersons.put(p2.getId(), p2);
        hashMapOfPersons.put(p3.getId(), p3);

        while(true) {
            System.out.print("Enter Person ID: ");
            String userInput = scanner.nextLine();

            if (userInput.equals("done"))
                break;

            int requestedID = Integer.parseInt(userInput);

            System.out.println(hashMapOfPersons.get(requestedID));
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

    public void ex6() throws CalculatorException {
        Calculator calculator = new Calculator();

        while(true) {
            System.out.print("Enter first number: ");
            String inputA = scanner.next();
            if (inputA.equals("done")) {
                break;
            }
            System.out.print("Enter second number: ");
            String inputB = scanner.next();
            if (inputB.equals("done")) {
                break;
            }
            System.out.print("Enter operation (add, sub, mul, div): ");
            String operation = scanner.next();
            if (operation.equals("done")) {
                break;
            }

            int a = Integer.parseInt(inputA);
            int b = Integer.parseInt(inputB);

            int result = calculator.calculate(a, b, operation);
            System.out.printf("Result: %s\n", result);
        }

        calculator.getHistory();

    }

    public void ex7() {
        var personList = Arrays.asList(
                new Person(1, "Peter", "Jones"),
                new Person(2, "John", "Smith"),
                new Person(3, "Sue", "Anderson")
        );

        List<Person> newPersonList = personList.stream()
                .map(p -> new Person(p.getId(), p.getFirstName(), "x".repeat(p.getLastName().length())))
                .collect(Collectors.toList());

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

        personList.sort(Comparator.comparing(p -> p.getFirstName()));

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

        var filteredList = personList
                .stream()
                .filter(p -> p.getLastName().equalsIgnoreCase("smith"))
                .collect(Collectors.toList());

        for (Person p : filteredList) {
            System.out.println(p);
        }


    }

    public void ex10() throws InterruptedException {
        Queue<Cat> catsInAQ = new LinkedList<Cat>();

        catsInAQ.add(new Cat("Alice"));
        catsInAQ.add(new Cat("Bob"));
        catsInAQ.add(new Cat("Charlie"));
        catsInAQ.add(new Cat("Dan"));

        while(!catsInAQ.isEmpty()) {
            System.out.println(catsInAQ);
            catsInAQ.poll();
            Thread.sleep(3000);
        }
    }

    public void ex11() {

        HashMap<String,String> db = new HashMap<String, String>();

        while(true) {
            System.out.print("Action [add|login|done]: ");
            String userAction = scanner.nextLine().trim();

            switch(userAction) {
                case "add" -> {
                    System.out.print("Enter username, password: ");
                    String addUser = scanner.nextLine();
                }
                case "login" -> {
                    System.out.print("Enter username, password: ");
                    String logIn = scanner.nextLine();
                }
                case "done" -> {
                    break;
                }
            }
        }
    }

    private void addUser(HashMap<String, String> db, String addUser) {
        String[] addUserArray = addUser.split(",");
        String username = addUserArray[0].trim();
        String pw = addUserArray[1].trim();

    }

    private String createHash(String inString) {
        String hashed = "";
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-1");
            digest.reset();
            digest.update(inString.getBytes(StandardCharsets.UTF_8));
            hashed = String.format("%040x", new BigInteger(1, digest.digest()));
        }
        catch (NoSuchAlgorithmException nsae) {
            nsae.printStackTrace();
        }
        return hashed;
    }
}

