package com.xpanxion.assignments.student6;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
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

    public void ex11() {
        //Declare a hashmap of string string
        //write a while with scanner and conditionals
        //Write add user function
        //Write password checker which uses the getHash function
        HashMap<String, String> hashMap = new HashMap<>();

        while(true) {
            System.out.println("Action [add|login|done]: ");
            Scanner sc = new Scanner(System.in);
            String inputString = sc.nextLine().trim();

            if(inputString.equals("add")) {
                System.out.println("Enter username, password: ");
                inputString = sc.nextLine();
                addUser(hashMap, inputString);
            }
            if(inputString.equals("login")) {
                System.out.println("Enter username, password: ");
                inputString = sc.nextLine().trim();
                if(passwordCheck(hashMap, inputString))
                    System.out.println("OK");
                else
                    System.out.println("Incorrect username or password");
            }
            if(inputString.equals("done")) {
                break;
            }
        }


    }

    private void addUser(HashMap<String, String> hashMap, String inputString) {
        String[] inputArray = inputString.split(",");
        String userName = inputArray[0].trim();
        String password = inputArray[1].trim();

        String hashedPassword = getHash(password);
        hashMap.put(userName, hashedPassword);
    }

    private boolean passwordCheck(HashMap<String,String> hashMap, String inputString) {
        boolean isAuthenticated = false;

        String[] inputArray = inputString.split(",");
        String userName = inputArray[0].trim();
        String password = inputArray[1].trim();

        if(hashMap.containsKey(userName)) {
            String originalHashedPass = hashMap.get(userName);
            String currentHashedPass = getHash(password);
            if(originalHashedPass.equals(currentHashedPass)) {
                isAuthenticated = true;
            }
        }
        return isAuthenticated;
    }

    private String getHash(String inputString) {
        String hashValue = "";
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.reset();
            messageDigest.update(inputString.getBytes(StandardCharsets.UTF_8));
            hashValue = String.format("%040x", new BigInteger(1, messageDigest.digest()));
        } catch (Exception e) {
            e.printStackTrace();
        }

        return hashValue;
    }
}
