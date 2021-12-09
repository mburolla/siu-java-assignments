package com.xpanxion.assignments.student3;

import java.awt.*;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.NumberFormat;
import java.util.*;
import java.util.List;
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

    public void ex11(){
        //Tiny Auth
        HashMap<String, String> login = new HashMap<String, String>();
        Scanner scanner = new Scanner(System.in);
        String action;

        label:
        while (true){
            System.out.print("Action [add|login|done]: ");
            action = scanner.nextLine();
            action = action.toLowerCase();

            switch (action) {
                case "add":
                    addUser(login);
                    break;
                case "login":
                    loginUser(login);
                    break;
                case "done":
                    break label;
                default:
                    System.out.println("Enter Proper Action.");
                    break;
            }
        }
    }

    public void ex12(){

    }

    public void ex13(){
        //shapes
        var shapeList = new ArrayList<Shape>();
        var s = new Square("red");
        var c = new Circle("green");
        shapeList.add(s);
        shapeList.add(c);

        for (Shape shape : shapeList) {
            System.out.println(shape.draw());
        }

    }

    public void ex14(){
        //distance
        var p1 = new Point(12,14);
        var p2 = new Point(10,10);
        System.out.println(p1.distance(p2));

        var p3 = new MyPoint(12,14);
        var p4 = new MyPoint(10,10);
        System.out.println(p3.distance(p4));

    }
    private String createHash(String inString) {
        var retval = "";
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-1");
            digest.reset();
            digest.update(inString.getBytes(StandardCharsets.UTF_8));
            retval = String.format("%040x", new BigInteger(1, digest.digest()));
        }
        catch (NoSuchAlgorithmException nsae) {
            nsae.printStackTrace();
        }
        return retval;
    }

    private HashMap addUser(HashMap login){
        var scanner = new Scanner(System.in);
        System.out.print("Enter username, password: ");
        var info = scanner.nextLine();
        StringTokenizer stringTokenizer = new StringTokenizer(info);
        var username = stringTokenizer.nextToken().replace(",", "");
        var passWord = stringTokenizer.nextToken();
        var passwordHash = createHash(passWord);
        login.put(username, passwordHash);
        return login;
    }

    private HashMap loginUser(HashMap login){
        var scanner = new Scanner(System.in);
        System.out.print("Enter username, password: ");
        var info = scanner.nextLine();
        StringTokenizer stringTokenizer = new StringTokenizer(info);

        var username = stringTokenizer.nextToken().replace(",", "");
        var passInput = stringTokenizer.nextToken();
        var passwordHash = createHash(passInput);
        if (login.containsKey(username)) {
            if (login.get(username).equals(passwordHash)) {
                System.out.println("Ok");
            } else
                System.out.println("Incorrect username or password.");
        }else
            System.out.println("Username or password don't exist");
        return login;
    }

}
