# Java I: Exercises

### Ex. 1 Uppercase Name
Write a Java program that prompts the user to enter their name, and returns their name in upper case.

Example:

```
Enter your name: John Smith
Your name in upper case is: JOHN SMITH.

Process finished with exit code 0
```



### Ex. 2 Count Uppers
Write a Java program that prompts the user to enter a string and counts the number of uppercase letters.

Example:

```
Enter a string: This is a Test.
Number of uppercase letters: 2.

Process finished with exit code 0
```

```
Enter a string: nothing to see here.
Number of uppercase letters: 0.

Process finished with exit code 0
```
### Ex. 3 Capitalize Words
Write a Java program that prompts the user to enter a string and capitalizes every other word, starting with the first word.
HINT: The `StringTokenizer` object or `String.split()` method might be useful.

Examples:
```
Enter a string: This is a test.
THIS is A test. 

Process finished with exit code 0
```
```
Enter a string: This is a longer string with more words.
THIS is A longer STRING with MORE words. 

Process finished with exit code 0
```

### Ex. 4 Classic Palidrome
A palidrome is a word, phrase, or sequence that reads the same backward as forward (e.g. radar, madam).

Write a Java program that tests if a word is a palidrome or not.

Examples:
```
Enter string: radar
YES

Process finished with exit code 0
```

```
Enter string: truck
NO

Process finished with exit code 0
```
HINT: The `StringBuilder` might be useful.


### Ex. 5 Consonant and Vowel Count
Write a Java program that prompts the user to enter a string and returns the number of vowels and constants.  The program loops forever until "quit" is entered.  The program does not count whitespace and punctuation.

Example:
```
Enter a string: test
Number of vowels: 1
Number of consonants: 3
Enter a string: TEST
Number of vowels: 1
Number of consonants: 3
Enter a string: This is a test.
Number of vowels: 4
Number of consonants: 7
Enter a string: quit

Process finished with exit code 0
```

### Ex. 6 Add Only Calculator
Write a Java program that prompts the user for two Integers and adds them.

Example:

```
Enter first number: 1
Enter second number: 2
Result: 3
```

### Ex. 7 Full Calculator
Write a Java program that prompts the user for two Integers and an operation and returns the result.

Examples:

```
Enter first number: 10
Enter second number: 2
Enter operation (add, sub, mul, div): sub
Result: 8
```

```
Enter first number: 3
Enter second number: 2
Enter operation (add, sub, mul, div): add
Result: 5
```

```
Enter first number: 2
Enter second number: 3
Enter operation (add, sub, mul, div): mul
Result: 6
```

```
Enter first number: 10
Enter second number: 5
Enter operation (add, sub, mul, div): div
Result: 2
```

### Ex. 8 Carpet Calculator
Write a Java program that calculates the total price for a carpet installation job.  The program prompts the user to
enter the price of the carpet per square feet, then prompts the user to enter the width and length of all 
the rooms.  When the user enters "done", the program returns the total price of the carpet installation job.

Examples
```
Enter price per square feet: 3.00
Enter room dimensions (width x height): 10 x 10
Enter room dimensions (width x height): done
Total cost: $300.00
```

```
Enter price per square feet: 4.00
Enter room dimensions (width x height): 10 x 10
Enter room dimensions (width x height): 10 x 10
Enter room dimensions (width x height): done
Total cost: $800.00
```
```
Enter price per square feet: 5.00
Enter room dimensions (width x height): 10 x 20
Enter room dimensions (width x height): 20 x 10
Enter room dimensions (width x height): done
Total cost: $2,000.00

```

### Ex. 9 Random Number Game
Write a Java program that generates a random number between 1 through 5.  The program prompts the user to 
guess the number.  The program loops forever until the number is guessed.

Example
```
Enter a number: 2
Try again...
Enter a number: 1
Try again...
Enter a number: 3
Try again...
Enter a number: 4
You guessed it!!!
```

### Ex. 10 Diagon Alley
Write a Java Program that prompts the user to a enter a string and prints every word diagonally to the console.

Example:
```
Enter a string: this is a test
t
 h
  i
   s
i
 s
a
t
 e
  s
   t

Process finished with exit code 0
```
