package com.xpanxion.assignments.student3;

public class Repository implements DataAccess {
    private Person person;

    public Repository(){
        this.person = new Person(1, "John", "Doe");
    }

    @Override
    public Person getPerson() {
        return person;
    }
}
