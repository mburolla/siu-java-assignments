package com.xpanxion.assignments.student10;


import java.math.BigInteger;
import java.text.NumberFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.security.*;

public class JavaTwo {



    JavaTwo() {
    }

    public void ex1 () {
        System.out.println("Student 10: ex1.");
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
        System.out.println("Student 10: ex2.");
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
        System.out.println("Student 10: ex3.");
        var invoice =  new Invoice(1);
        invoice.addProduct(new Product(111,"Mustard", 2.00));
        invoice.addProduct(new Product(222,"Ketchup", 3.00));
        invoice.addProduct(new Product(333,"Franks Hot Sauce", 4.00));
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        System.out.println("Total cost: " + formatter.format(invoice.getTotalCost()));
    }

    public void ex4 () {
        System.out.println("Student 10: ex4.");
        var invoice =  new Invoice(1);
        invoice.addProduct(new Product(111,"Mustard", 2.00));
        invoice.addProduct(new Product(222,"Ketchup", 3.00));
        invoice.addProduct(new Product(333,"Franks Hot Sauce", 4.00));
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        System.out.println("Total cost: " + formatter.format(invoice.getTotalCost()));
    }

    public void ex5 () {
        System.out.println("Student 10: ex5.");
        var repository = new Repository();
        var p = repository.getPerson();
        System.out.println(p);
    }

    public void ex6 () throws CalculatorException {
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
                System.out.print("Enter another number: ");
                int num2 = scanner.nextInt();
                System.out.print("Enter an operation(add, sub, mul, div): ");
                String operator = scanner.next();
                int result = calc.calculate(num1, num2, operator);
                System.out.println("Result: " + result);
            }
        }
        for (String operation : calc.getCalcList()){
            System.out.println(operation);
        }
    }

    public void ex7 () {
        System.out.println("Student 10: ex7.");
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

    public void ex8 () {
        System.out.println("Student 10: ex8.");
        var personList = Arrays.asList(
                new Person(1, "Charlie", "Jones"),
                new Person(2, "Zoey", "Smith"),
                new Person(3, "Adam", "Anderson")
        );

        personList = personList.stream()
                .sorted(Comparator.comparing(Person::getFirstName))
                .collect(Collectors.toList());

        for (Person p : personList) {
            System.out.println(p);
        }
    }

    public void ex9 () {
        System.out.println("Student 10: ex9.");

        var personList = Arrays.asList(
                new Person(1, "Charlie", "Jones"),
                new Person(2, "Zoey", "Smith"),
                new Person(3, "Adam", "Anderson")
        );

        var filteredList = personList.stream()
                .filter(person -> person.getLastName().equals("Smith"))
                .collect(Collectors.toList());


        for (Person p : filteredList) {
            System.out.println(p);
        }
    }

    public void ex10 () throws InterruptedException {
        System.out.println("Student 10: ex10.");

        Queue<Cat> catQ = new LinkedList<>();

        catQ.add(new Cat("Alice"));
        catQ.add(new Cat("Bob"));
        catQ.add(new Cat("Charlie"));
        catQ.add(new Cat("Dan"));


        while(true) {
            if (catQ.isEmpty()){
                break;
            }
            System.out.println(catQ);
            catQ.remove();
            TimeUnit.SECONDS.sleep(3);

        }



    }

    public void ex11 () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Student 10: ex11.");
        HashMap<String, String> loginMap = new HashMap<>();

        while(true) {
            System.out.print("Action [add|login|done]: ");
            String action = scanner.nextLine();
            if (action.equals("done")){
                break;
            }
            else if (action.equals("add")) {
                System.out.print("Enter username, password: ");
                String info = scanner.nextLine();
                String infoList [] = info.split(", ");
                String username = infoList[0];
                String password = hashPassword(infoList[1]);
                infoList[1] = password;
                loginMap.put(username, password);
            }
            else {
                System.out.print("Enter username, password: ");
                String info = scanner.nextLine();
                String infoList [] = info.split(", ");
                String username = infoList[0];
                String password = hashPassword(infoList[1]);
                infoList[1] = password;
                String hash = loginMap.get(username);
                if (hash!=null && hash.equals(password)) {
                    System.out.println("OK");
                } else {
                    System.out.println("Incorrect username or password");
                }
            }
        }
    }

    public void ex12 () {
        //Marty, I ended up using a 2D Array for this project. I just didn't think another
        //data structure would be as suitable. Let me know if there was a better one to use
        //though, and I'll try to refactor the code.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Student 10: ex12.");

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of seats: ");
        int seats = scanner.nextInt();

        //Create array of rows and seats
        String rowSeatList [][] = new String [rows][seats];
        rowSeatList = createSeats(rowSeatList, rows, seats);
        printSeats(rowSeatList, rows, seats);
        double total = 0.00;
        scanner.nextLine();

        while (true) {
            System.out.print("Purchase seat (row,seat): ");
            String choice = scanner.nextLine();
            if (choice.equals("done")){
                break;
            }
            total = calculatePrice(rowSeatList, choice, total);
            rowSeatList = updateSeats(rowSeatList, choice);
            printSeats(rowSeatList, rows, seats);
            System.out.println(String.format("Total sales: %s", NumberFormat.getCurrencyInstance().format(total)));
        }


    }

    public void ex13 () {
        var shapeList = new ArrayList<Shape>();
        var s = new Square("red");
        var c = new Circle("green");
        shapeList.add(s);
        shapeList.add(c);

        for (Shape shape : shapeList) {
            System.out.println(shape.draw());
        }
    }

    public void ex14 () {
        var p1 = new MyPoint(12,14);
        var p2 = new MyPoint(10,10);
        System.out.println(p1.distance(p2));

        var p3 = new MyPoint(12,14);
        var p4 = new MyPoint(10,10);
        System.out.println(p3.distance(p4));
    }
    
    //Helper Functions

    private static String hashPassword(String password){
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-1");
            byte[] messageDigest = md.digest(password.getBytes());
            BigInteger no = new BigInteger(1, messageDigest);
            String hashtext = no.toString(16);
            while (hashtext.length()<32){
                hashtext = "0" + hashtext;
            }
            return hashtext;
        }
        catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    private static void printSeats(String[][] list, int rows, int seats) {
        for (int row=0; row<rows; row++){
            for(int seat=0; seat<seats; seat++){
                System.out.print(list[row][seat]);
            }
            System.out.println("");
        }
    }
    private static String [][] createSeats(String[][] list, int rows, int seats){
        for (int row=0; row<rows; row++){
            for(int seat=0; seat<seats; seat++){
                list[row][seat]= "0";
            }
        }
        return list;
    }
    private static String[][] updateSeats(String[][] list, String selection){
        String selectionList [] = selection.split(",");
        int row = Integer.parseInt(selectionList[0]);
        int seat = Integer.parseInt(selectionList[1]);
        list[row-1][seat-1] = "X";
        return list;
    }
    private static double calculatePrice(String[][] list, String selection, double total) {
        String selectionList [] = selection.split(",");
        int row = Integer.parseInt(selectionList[0]);
        int seat = Integer.parseInt(selectionList[1]);
        if (list[row-1][seat-1].equals("0")){
            double price = (double) row;
            total = total + price;
        }
        return total;
    }
}
