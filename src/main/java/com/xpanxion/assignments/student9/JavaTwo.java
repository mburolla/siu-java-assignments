package com.xpanxion.assignments.student9;

import org.w3c.dom.ls.LSOutput;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLOutput;
import java.text.NumberFormat;
import java.util.*;
import java.util.stream.Collectors;

public class JavaTwo {

    JavaTwo() {};

    public void ex1() {
        var list = new ArrayList<Person>();
        while(true) {
            System.out.print("Enter Person > ");
            var scanner = new Scanner(System.in);
            var tempString = scanner.nextLine();
            if(tempString.equals("done")){
                break;
            } else {
                String[] splits = tempString.split(",");
                var tempId = Integer.parseInt(splits[0]);
                var fullName = splits[1];

                String[] splitName = fullName.trim().split(" ");
                var firstName = splitName[0];
                var lastName = splitName[1];
                list.add(new Person(tempId,firstName,lastName));
            }
        }
        list.forEach(System.out::println);
    }

    public void ex2() {
        HashMap<Integer,Person>map = new HashMap<>();
        map.put(1,new Person(1,"Peter","Jones"));
        map.put(2,new Person(2,"John","Smith"));
        map.put(3,new Person(3,"Mary","Jane"));
        while(true) {
            System.out.print("Enter Person ID > ");
            var scanner = new Scanner(System.in);
            var userId = scanner.next();
            if (userId.equals("done")) {
                break;
            } else {
                try{
                    var tempId = Integer.parseInt(userId);
                    if(map.containsKey(tempId)){
                        System.out.println(map.get(tempId));
                    } else {
                        System.out.println("Invalid id. Try again");
                    }
                } catch (NumberFormatException ex){
                    System.out.println("Must be an integer value");
                }
            }
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

    public void ex4(){
        // Base Class created and extended to Invoice and Product
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
        var calculationList = new ArrayList<Calculator>();
        while(true) {
            System.out.print("Enter first number > ");
            var scanner = new Scanner(System.in);
            var firstNumber = scanner.next();
            if(firstNumber.equals("done")){
                break;
            } else {
                System.out.print("Enter the second number > ");
                var secondNumber = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Enter operation > ");
                var operationString = scanner.nextLine();

                if (operationString.equals("add") || operationString.equals("sub") || operationString.equals("mul") || operationString.equals("div")) {
                    var calculation = new Calculator(Integer.parseInt(firstNumber), secondNumber, operationString);
                    calculationList.add(calculation);
                    System.out.printf("Result > %d%n",calculation.getResult());
                } else {
                    System.out.println("Invalid operation");
                }
            }
            }

        calculationList.forEach(System.out::println);
    }

    public void ex7() {
        var personList = Arrays.asList(
                new Person(1, "Peter", "Jones"),
                new Person(2, "John", "Smith"),
                new Person(3, "Sue", "Anderson")
        );

        List<Person> newPersonList = personList.stream().map(p -> new Person(p.getId(),p.getFirstName(),"xxx")).toList();

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

        Collections.sort(personList);
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

        var filteredList = personList.stream().filter(p -> p.getLastName().contains("Smith")).toList();
        for (Person p : filteredList) {
            System.out.println(p);
        }
    }

    public void ex10() {
       Queue<Cat> catList = new LinkedList<>();
        catList.add(new Cat("Alice"));
        catList.add(new Cat("Bob"));
        catList.add(new Cat("Charlie"));
        catList.add(new Cat("Dan"));

      while(!catList.isEmpty()){
          System.out.println(catList);
          try {
              Thread.sleep(3000);
          } catch (InterruptedException e) {
              e.printStackTrace();
          }
          catList.poll();
      }
    }

    public void ex11() {
        var userAccounts = new HashMap<String,String>();
        while(true) {
            System.out.print("Action [Add|login|Done] > ");
            var scanner = new Scanner(System.in);
            var tempString = scanner.nextLine();
            if(tempString.equalsIgnoreCase("done")){
                break;
            } else if(tempString.equalsIgnoreCase("add")){
                System.out.print("Enter username and password (username,password) > ");
                var tempAddUser = scanner.nextLine();
                String[] splits = tempAddUser.split(",");
                var tempName = splits[0];
                var tempPass = splits[1];
                var encryptedPassword = hashPassword(tempPass);
                userAccounts.put(tempName,encryptedPassword);
            } else if(tempString.equalsIgnoreCase("login")){
                System.out.print("Enter username and password to login (username,password) > ");
                var tempLogin = scanner.nextLine();
                String[] splits = tempLogin.split(",");
                var tempName = splits[0];
                var tempPass = splits[1];
                var encryptedPassword = hashPassword(tempPass);
                if(userAccounts.containsKey(tempName)){
                    if(userAccounts.containsValue(encryptedPassword)){
                        System.out.println("OK");
                    } else {
                        System.out.println("Invalid Password");
                    }
                } else {
                    System.out.println("Invalid username");
                }
            } else {
                System.out.print("Invalid choice. Try Again");
                scanner.nextLine();
            }
        }
    }

    public void ex12() {

        System.out.print("Enter the number of rows > ");
        var scanner = new Scanner(System.in);
        var numberOfRows = scanner.nextInt();
        System.out.print("Enter the number of seats > ");
        var numberOfSeats = scanner.nextInt();

        var seats = new Character[numberOfRows][numberOfSeats];

        for(var rows = 0; rows < numberOfRows; rows++){
            for(var seat = 0; seat < numberOfSeats; seat++){
                seats[rows][seat] = 'O';
            }
        }
        System.out.println(Arrays.deepToString(seats).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));
        var totalSales = 0;
        System.out.printf("Total Sales : $%d%n",totalSales );
        while(true){
            scanner.nextLine();
            System.out.print("Purchase seat (row,seat) > ");
            var seatPurchased = scanner.nextLine();
            if(seatPurchased.equalsIgnoreCase("done")){
                break;
            } else {
                System.out.println(seatPurchased);
                String[] splits = seatPurchased.split(",");
                var purchasedRow = Integer.parseInt(splits[0]);
                var purchasedSeat = Integer.parseInt(splits[1]);
                if(purchasedRow > numberOfRows || purchasedSeat > numberOfSeats){
                    System.out.println("Invalid. Seat or Row are out of bounds");
                    System.out.print("Enter to continue >");
                } else {
                    totalSales += purchasedRow;
                    seats[purchasedRow - 1][purchasedSeat - 1] = 'x';
                    System.out.println(Arrays.deepToString(seats).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));
                    System.out.printf("Total Sales : $%d%n", totalSales);
                    System.out.print("Enter to continue >");
                }
            }
        }
    }

    public void ex13(){
        var shapeList = new ArrayList<Shape>();
        var s = new Square("red");
        var c = new Circle("green");
        shapeList.add(s);
        shapeList.add(c);

        for (Shape shape : shapeList) {
            shape.draw();
            System.out.println();
        }
    }

    public void ex14() {
        var p1 = new MyPoint(12,14);
        var p2 = new MyPoint(10,10);
        System.out.println(p1.distance(p2));

        var p3 = new MyPoint(12,14);
        var p4 = new MyPoint(10,10);
        System.out.println(p3.distance(p4));
    }



    public static String hashPassword(String password){
        try{
            MessageDigest md = MessageDigest.getInstance("SHA-1");
            byte[] messageDigest = md.digest(password.getBytes());

            BigInteger num = new BigInteger(1,messageDigest);
            var hashText = num.toString(16);
            while(hashText.length() < 32){
                hashText = "0" + hashText;
            }
            return  hashText;
        } catch (NoSuchAlgorithmException ex) {
            throw new RuntimeException(ex);
        }
    }



}
