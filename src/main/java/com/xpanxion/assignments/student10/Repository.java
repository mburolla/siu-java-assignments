package com.xpanxion.assignments.student10;

public class Repository implements DataAccess {
    int id;
    String name;

    public Person getPerson(){
        Person person = new Person(1, "John", "Doe");
        return person;
    }
}
