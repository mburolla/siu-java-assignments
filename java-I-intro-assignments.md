# Java I Intro Assignments

# Ex. 1
Consider the following array:

```java
int[] ints = {1, 2, 3};
```

Implement the following function, which returns the sum of all the numbers in the array.

```java
private static Integer addNumbers(ArrayList<Integer> numList) {
    // TODO: Implement this function.
    return 0; 
}
```

Note: The array of ints must be converted to an ArrayList of type Integer first.

# Ex. 2
Consider the following array:

```java
int[] ints = {1, 2, 3};
```

Implement the following function, which returns the average of all the numbers in the array.

```java
private static Float avgNumbers(ArrayList<Integer> numList) {
    // TODO: Implement this function.
    return 0; 
}
```

Note: The array of ints must be converted to an ArrayList of type Integer first.

# Ex. 3
Write a function with the following signature:

```java
private static void doubleNumbers(ArrayList<Integer> numList)
```

This function doubles every number in numList;

# Ex. 4
Write a function with the following signature:

```java
private static ArrayList<Integer> createList(Integer maxNumber)
```

This function returns an ArrayList of Integers no greater than `maxNumber`.

Example:
```java
createList(5);
```

Output:
```java
[1,2,3,4,5]
```

# Ex. 5
Consider the following array:

```java
int[] ints = {1, 2, 3, 5, 6, 9, 11};
```

Write a function that returns the number of missing numbers from this array.

Example:
```
var missingNumbers = findMissingNumbers(ints);
System.out.println(missingNumbers);
```
Output
```
4,7,8,10
```

# Ex. 6
Consider the following array:
```java
int[] ints = {0,1,1,1,0,0,1,0,0,1,0,0,0};
```

Write a Java function that returs a `String` with all the zeros on the left side and all the ones on the right side:

Example:
```java
0000000011111
```

# Ex. 7
Write a Java function that retuns a random number from `ArrayList` of type `Integer`.

# Ex. 8
Write a function that calculates the total cost of a shopping cart.  The items
in the shopping cart are contained in an `ArrayList` of type `BigDecimal`.

The total cost is calculated by the following:
- Sum the cost of all the items in the `ArrayList`
- Apply 10% sales tax
- Apply shipping and handling fees:
    - Add $5.00 for orders under $10.00
    - Add $4.00 for orders > $10.00 and < $20.00
    - Free shipping and handling for orders > $20.00

# Ex. 9
Write a function that returns a `String` if an `ArrayList` of type `Integer` is even or odd.

Example:
```java
var result = checkArray(myArray);
System.out.println(result);
```

Output:
```java
Odd
```

# Ex. 10
Write a Java function to determine if a password is valid using the following validation rules:

- A password must have at least ten characters
- A password consists of only letters and digits
- A password must contain at least two digits

The function returns a `Boolean` `true` if the password is valid, otherwise `false`.
