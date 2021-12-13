package com.xpanxion.assignments.student5;

public class Repository implements DataAccess{
    private Person person;

    public Repository() {
        this.person = new Person(1, "John", "Doe");
    }

    public Person getPerson(){
        return person;
    }
}
