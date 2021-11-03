package com.xpanxion.assignments.instructor;

public class Repository implements DataAccess {

    @Override
    public Person getPerson() {
        return new Person(1, "John", "Doe");
    }
}
