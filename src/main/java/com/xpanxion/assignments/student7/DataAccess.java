package com.xpanxion.assignments.student7;

public interface DataAccess {

    public default Person getPerson() {
      Person john = new Person(1, "John", "Doe");
      return john;
    }
}
