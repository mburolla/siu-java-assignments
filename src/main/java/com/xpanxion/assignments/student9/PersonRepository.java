package com.xpanxion.assignments.student9;

import java.util.HashMap;
import java.util.Optional;

public class PersonRepository {


    private final HashMap<Integer, Person> personHashMap;


    public PersonRepository() {
        personHashMap = new HashMap<Integer, Person>();
        personHashMap.put(1, new Person(1, "Alice", "Jones"));
        personHashMap.put(2, new Person(2, "Bob", "Smith"));
        personHashMap.put(3, new Person(3, "Charlie", "Brown"));
    }

    public Optional<Person> getPerson(int id){
       return Optional.ofNullable(this.personHashMap.get(id));
    }


    public Person getPerson(Integer personId) {
        return personHashMap.get(personId);
    }
}