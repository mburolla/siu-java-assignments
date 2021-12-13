package com.xpanxion.assignments.student4;

import java.util.HashMap;
import java.util.Optional;

public class PersonRepository {

    //
    // Data members
    //

    private final HashMap<Integer, com.xpanxion.assignments.student4.Person> personHashMap;

    //
    // Constructors
    //

    public PersonRepository() {
        personHashMap = new HashMap<Integer, com.xpanxion.assignments.student4.Person>();
        personHashMap.put(1, new Person(1, "Alice", "Jones"));
        personHashMap.put(2, new Person(2, "Bob", "Smith"));
        personHashMap.put(3, new Person(3, "Charlie", "Brown"));
    }

    //
    // Methods
    //

   public Optional<Person> getPerson(Integer personId) {
      return Optional.ofNullable(personHashMap.get(personId));// Note: we could use getOrDefault() here

    }
}
