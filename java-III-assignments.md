# Java III: Exercises

### Ex. 1 Divide by Zero
Consider the following line of code:
```
var result = 10 / 0;
```
Use a `try`/`catch` block to catch this error and write the following to the console:

Output:
```
Cannot divide by zero.
```

### Ex. 2 
Create a class called `CalculatorException` that extends the `Exception` class.  Modifiy the `Calculator`
object created in Java II Ex. 6 to throw a `CalculatorException` when a user attempts to divide by 
zero.  

Code:
```
var calculator = new Calculator();
var result = calculator.calculate(10, 0, "div"); // Catch this error.
```

Ouput:
```
Cannot divide by zero: 10 / 0.
```

### Ex. 3 Read File
Write a Java program that reads a file named `input-1.txt` and displays the contents of the file on the 
console:

Output:
```
This is line 1 from input-1.txt.
This is line 2 from input-1.txt.
This is line 3 from input-1.txt.
This is line 4 from input-1.txt.
This is line 5 from input-1.txt.

Process finished with exit code 0
```

### Ex. 4 File to People
Write a Java program that reads a file named `input-2.txt`.  This file contains data to create
objects of type `Person`.  The program reads data from this file, creates a list of type `Person` and
displays the list on the console.

Output:
```
Person{id=1, firstName='John', lastName='Doe'}
Person{id=2, firstName='Mary', lastName='Smith'}
Person{id=3, firstName='Peter', lastName='Jones'}
Person{id=4, firstName='Bill', lastName='Gates'}
Person{id=5, firstName='Steve', lastName='Jobs'}

Process finished with exit code 0
```

### Ex. 5 People to File
Write a Java Program that contains the list of people (below) and writes this data to a file 
named `output-1.txt`.

People:
```
var peopleList = Arrays.asList(
        new Person(1, "Alice", "Jones"),
        new Person(2, "Bob", "Smith"),
        new Person(3, "Charlie", "Brown")
);
```

Output file:
```
1, Alice Jones
2, Bob Smith
3, Charlie Brown
```

### Ex. 6 Optional Person
The following code returns a `NullPointerException`:

Client code:
```
var personRepository = new PersonRepository();
var person = personRepository.getPerson(4);
System.out.println(person.getFirstName());
```

This is because a person with an id of 4 does not exsist in the `PersonRepository`.

Copy the `PersonRepository` from the shared package into your student package, and modify it to 
return an `Optional` `Person`.

Modify the client code (above) to display the first name of the person on the console only if it 
is not `null`.

### Ex. 7 Unit Testing
Create a unit test in your student directory (`test/java/student{id}`) that tests that the first 
name of a Person object is getting created correctly.

Output
```
Process finished with exit code 0
```

### Ex. 8 Logging



### Ex. 9 TODO

### Ex. 10 TODO