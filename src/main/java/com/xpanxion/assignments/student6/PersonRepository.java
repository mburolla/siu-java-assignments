package com.xpanxion.assignments.student6;

import java.util.HashMap;
import java.util.Optional;

public class PersonRepository {

    //MEM VARS
    private final HashMap<Integer, Person> personHashMap;

    //CONSTRUCTORS
     public PersonRepository() {
         personHashMap = new HashMap<>();
         personHashMap.put(1, new Person(1, "Alice", "Jones"));
         personHashMap.put(2, new Person(2, "Bob", "Smith"));
         personHashMap.put(3, new Person(3, "Charlie", "Brown"));
     }

     //OPTIONAL (METHODS)
    public Optional<Person> getPerson(Integer personId) {
         return Optional.ofNullable(personHashMap.get(personId));
    }


}
