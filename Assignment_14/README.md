# Assignment 14: Characters – Counting and Positions

## Aim
Use charAt to count vowels and a letter, and print each letter with its position.

## Software / Tools Required
- Java Development Kit (JDK)
- Visual Studio Code
- Java Extension Pack
- macOS Terminal
- Git and GitHub

## Theory
A String is a sequence of characters in Java. The `charAt()` method is used to access an individual character at a specified index.

Character counting can be performed using loops and conditional statements.

Important concepts:
- `charAt(index)` – Returns the character at the specified position.
- `length()` – Returns the total number of characters in a String.
- `if` statement – Checks a condition.
- `count++` – Increases the counter by one.

In Java, String positions (indexes) start from 0.

## Algorithm / Procedure

### Question 1: Count Vowels
1. Declare a String variable `s` and initialize it with "programming".
2. Initialize an integer counter to 0.
3. Use a for loop to traverse the String.
4. Access each character using `charAt()`.
5. Check whether the character is a vowel (a, e, i, o, u).
6. Increase the counter whenever a vowel is found.
7. Print the total vowel count.

### Question 2: Count Occurrences of g
1. Declare a String variable `s` and initialize it with "programming".
2. Initialize an integer counter to 0.
3. Use a for loop to traverse the String.
4. Check whether each character is equal to 'g'.
5. Increase the counter whenever 'g' is found.
6. Print the total count of 'g'.

### Question 3: Print Characters with Positions
1. Declare a String variable `s` and initialize it with "hello".
2. Use a for loop starting from index 0.
3. Continue the loop until the last character.
4. Use `charAt()` to access each character.
5. Print the index followed by the character.

## Input

### Question 1
Predefined String: `programming`

### Question 2
Predefined String: `programming`

### Question 3
Predefined String: `hello`

No console input is required for these questions.

## Output

### Question 1
```text
Vowels: 3
```

### Question 2
```text
Count of g: 2
```

### Question 3
```text
0: h
1: e
2: l
3: l
4: o
```

## Result
All three programs were implemented using Java String methods, loops and conditional statements. The programs successfully count vowels, count occurrences of a specific character and display each character with its corresponding position.