package com.xpanxion.assignments.student6;

public class Repository implements DataAccess{

    @Override
    public Person getPerson() {
        return new Person(1, "John", "Doe");
    }
}
