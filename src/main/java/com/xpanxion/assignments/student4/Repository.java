package com.xpanxion.assignments.student4;

public class Repository implements DataAccess {
    @Override
    public Person getPerson() {
        return new Person(1,"john","Doe");
    }
}
