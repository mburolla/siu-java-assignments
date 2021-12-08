package com.xpanxion.assignments.student8;

public class Repository implements DataAccess {

    public Person getPerson() {
        return new Person(1, "John", "Doe");
    }

}