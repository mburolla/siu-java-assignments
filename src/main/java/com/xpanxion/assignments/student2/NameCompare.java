package com.xpanxion.assignments.student2;

import java.util.Comparator;

public class NameCompare implements Comparator<Person>
{
    public int compare(Person p1, Person p2)
    {
        return p1.getFirstName().compareTo(p2.getFirstName());
    }
}
