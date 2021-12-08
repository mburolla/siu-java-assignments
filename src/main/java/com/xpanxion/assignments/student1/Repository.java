package com.xpanxion.assignments.student1;

import java.util.HashMap;

public class Repository implements DataAccess {
    public Person getPerson(HashMap<Integer, Person> map) {
//        map.forEach((k, person) -> System.out.println(k + " " + person));
        var retrievePerson = map.get(1);
        return retrievePerson;
    }
}
