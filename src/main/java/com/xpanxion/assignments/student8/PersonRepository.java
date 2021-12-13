package com.xpanxion.assignments.student8;

import com.xpanxion.assignments.student8.Person;

import java.util.HashMap;
import java.util.Optional;

public class PersonRepository {

    //
    // Data members
    //

    private final HashMap<Integer, Person> personHashMap;

    //
    // Constructors
    //

    public PersonRepository() {
        personHashMap = new HashMap<Integer, Person>();
        personHashMap.put(1, new Person(1, "Alice", "Jones"));
        personHashMap.put(2, new Person(2, "Bob", "Smith"));
        personHashMap.put(3, new Person(3, "Charlie", "Brown"));
    }

    //
    // Methods
    //

    public Optional<Person> getPerson(Integer personId) {
        return Optional.ofNullable(personHashMap.get(personId));
    }
}
