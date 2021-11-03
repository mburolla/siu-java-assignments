# Java II: Exercises

### Ex 1. Person list
Write a Java program that prompts the user to enter a list of people. The user input is used to create a Person object which is added
to the list of people (of type Person).  The program runs forever until the user types "done" at which the list of 
people is displayed on the console.

Example:
```
Enter Person: 1, John Smith
Enter Person: 2, Mary Joe
Enter Person: 3, Peter Griffen
Enter Person: done
Person{id=1, firstName='John', lastName='Smith'}
Person{id=2, firstName='Mary', lastName='Joe'}
Person{id=3, firstName='Peter', lastName='Griffen'}

Process finished with exit code 0
```
HINT: Implement the `toString()` method on the `Person` class.

### Ex 2. Person Hash Map
Write a Java program that creates a HashMap whose key is an `Integer` and whose value is a `Person`.
The prompt prompts the user to enter a person id, and looks up the `Person` object from the `HashMap`.

The program contains the following data:
- 1, Peter Jones
- 2, John Smith
- 3, Mary Jane

Example:
```
Enter Person ID: 1
Person{id=1, firstName='Peter', lastName='Jones'}
Enter Person ID: 2
Person{id=2, firstName='John', lastName='Smith'}
Enter Person ID: 3
Person{id=3, firstName='Mary', lastName='Jane'}
Enter Person ID: done

Process finished with exit code 0
```

### Ex. 3 Invoice and Products
Consider the following relationship: One invoice can contain one to many products. An 
invoice has an id, and a product has an id, name, and cost. Given these facts, write a 
Java program that contains an `Invoice` class and a `Product` class,  that contains the 
following code:

Code:
```
var invoice =  new Invoice(1);
invoice.addProduct(new Product(111,"Mustard", 2.00));
invoice.addProduct(new Product(222,"Ketchup", 3.00));
invoice.addProduct(new Product(333,"Franks Hot Sauce", 4.00));
NumberFormat formatter = NumberFormat.getCurrencyInstance();
System.out.println("Total cost: " + formatter.format(invoice.getTotalCost()));
```

Output:
```
Total cost: $9.00

Process finished with exit code 0
```

### Ex 4. Refactor Invoice and Products
The `Invoice` and `Product` classes in Ex. 3 share a common attribute: id.  Create an 
abstract class called `Base` that contains an attribute called id.  Modifiy the `Invoice` and 
`Product` class to subclass the `Base` class.  Modify the constructors for the `Invoice` and 
`Product` classes to call the `Base` class constructor. The program should produce the same 
output as observed in Ex 3.

Output:
```
Total cost: $9.00

Process finished with exit code 0
```

### Ex. 5 Repository Interface
Create an interface called `DataAccess` that contains a method called `getPerson()`.  Create a
class called `Repository` that impelments the `DataAccess` interface that returns a person
object who has an id of 1, and a name of John Doe.

Code:
```
var repository = new Repository();
var p = repository.getPerson();
System.out.println(p);
```

Output:
``` 
Person{id=1, firstName='John', lastName='Doe'}

Process finished with exit code 0
```

### Ex. 6 OOP Calclator
Write a Java Program that contains a class called `Calculator`.  This program performs the
functionality found in Java I Ex. 7, with the additional capability:
- The program displays the history of all the calculations and terminates when "done" is 
entered by the user

Examples:
```
Enter first number: 10
Enter second number: 2
Enter operation (add, sub, mul, div): sub
Result: 8
Enter first number: done
10 - 2 = 8

Process finished with exit code 0
```

```
Enter first number: 1
Enter second number: 2
Enter operation (add, sub, mul, div): add
Result: 3
Enter first number: 2
Enter second number: 2
Enter operation (add, sub, mul, div): mul
Result: 4
Enter first number: done
1 + 2 = 3
2 * 2 = 4

Process finished with exit code 0
```

HINT: The `Calculator` class contains a list of Strings that contains the previously entered
calculations.

### Ex. 7 Redact Last Name
Given the following code:

```
var personList = Arrays.asList(
        new Person(1, "Peter", "Jones"),
        new Person(2, "John", "Smith"),
        new Person(3, "Sue", "Anderson")
);

// TODO: YOUR CODE HERE...

for (Person p : newPersonList) {
    System.out.println(p);
}
```
Write a Java program that uses `stream().map()` to replace the last name of the people in the list.

Output:
```
Person{id=1, firstName='Peter', lastName='xxx'}
Person{id=2, firstName='John', lastName='xxx'}
Person{id=3, firstName='Sue', lastName='xxx'}

Process finished with exit code 0
```

### Ex. 8 Sort People
Given the following code:

```
var personList = Arrays.asList(
        new Person(1, "Charlie", "Jones"),
        new Person(2, "Zoey", "Smith"),
        new Person(3, "Adam", "Anderson")
);

// TODO: Your code here

for (Person p : personList) {
    System.out.println(p);
}
```

Write a Java program that sorts the person list by first name.

Output:
```
Person{id=3, firstName='Adam', lastName='Anderson'}
Person{id=1, firstName='Charlie', lastName='Jones'}
Person{id=2, firstName='Zoey', lastName='Smith'}

Process finished with exit code 0
```

### Ex. 9 Filter People
Given the following code:
```
var personList = Arrays.asList(
        new Person(1, "Charlie", "Jones"),
        new Person(2, "Zoey", "Smith"),
        new Person(3, "Adam", "Anderson")
);

// TODO: Your code here

for (Person p : filteredList) {
    System.out.println(p);
}
```
Write a Java program that returns only the people whose last name is "Smith".

Output:
```
Person{id=2, firstName='Zoey', lastName='Smith'}

Process finished with exit code 0
```

### Ex. 10 Cat Queue
Create a `Cat` class that contains one attribute called name of type String.  Create a 
queue of type `Cat` that is implemented with a `LinkedList`. 

Write a Java program that adds four cats to the queue:
- Alice
- Bob
- Charlie
- Dan

After the cats have been added to the queue, create a while loop that prints the contents
of the queue, removes an item from the queue and pauses for three seconds.  The loop repeats
until the queue is empty.

Example:
```
[Cat{name='Alice'}, Cat{name='Bob'}, Cat{name='Charlie'}, Cat{name='Dan'}]
[Cat{name='Bob'}, Cat{name='Charlie'}, Cat{name='Dan'}]
[Cat{name='Charlie'}, Cat{name='Dan'}]
[Cat{name='Dan'}]

Process finished with exit code 0
```
