package com.xpanxion.assignments.student9;

import com.xpanxion.assignments.instructor.Person;

import java.util.ArrayList;
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

}
