package com.xpanxion.assignments.student9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

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

    }

}
