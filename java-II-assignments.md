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

### Ex 3. Invoice and Products
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
The `Invoice` and `Product` class in Excerise 3 both share a common attribute: id.  Create a 
class called `Base` that contains this this id.  Modifiy the `Invoice` and `Product` class to
extend the `Base` class to use the id in the `Base` class.



### Ex 5. TODO

### Ex 6. TODO

### Ex 7. TODO

### Ex 8. TODO

### Ex 9. TODO

### Ex 10. TODO