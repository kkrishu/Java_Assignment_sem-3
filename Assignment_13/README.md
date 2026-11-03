# Assignment 13: Strings – Methods and Palindromes

## Aim
Use common String methods, reverse a word, check a palindrome and print substrings.

## Software / Tools Required
- Java Development Kit (JDK)
- Visual Studio Code
- Java Extension Pack
- macOS Terminal
- Git and GitHub

## Theory
A String in Java is a sequence of characters. Java provides built-in methods to perform operations on strings.

Some commonly used String methods are:
- `length()` – Returns the number of characters in a string.
- `indexOf()` – Returns the index of the first occurrence of a character.
- `toUpperCase()` – Converts all characters into uppercase.
- `charAt()` – Returns the character at a specified index.
- `equals()` – Compares the content of two strings.
- `substring()` – Extracts a part of a string.

A palindrome is a word that reads the same forward and backward.

## Algorithm / Procedure

### Question 1: String Methods
1. Declare a String variable and initialize it with "Programming".
2. Use `length()` to find the number of characters.
3. Use `indexOf()` to find the first occurrence of 'g'.
4. Use `toUpperCase()` to convert the word into uppercase.
5. Print all three results.

### Question 2: Reverse a Word
1. Declare a String variable and initialize it with "Java".
2. Create an empty String named `reversed`.
3. Start a loop from the last character to the first character.
4. Use `charAt()` to access each character.
5. Append each character to the reversed String.
6. Print the reversed word.

### Question 3: Palindrome Check
1. Declare a String variable and initialize it with "racecar".
2. Create an empty String to store the reversed word.
3. Reverse the original word using a loop and `charAt()`.
4. Compare the original and reversed strings using `equals()`.
5. Print whether the word is a palindrome or not.

### Question 4: Print All Substrings
1. Declare a String variable and initialize it with "abc".
2. Use an outer loop to select the starting index.
3. Use an inner loop to select the ending index.
4. Use `substring()` to extract each substring.
5. Print every substring on a separate line.

## Input

### Question 1
Predefined String: `Programming`

### Question 2
Predefined String: `Java`

### Question 3
Predefined String: `racecar`

### Question 4
Predefined String: `abc`

No console input is required for these questions.

## Output

### Question 1
```text
Length: 11
Position of g: 3
Upper case: PROGRAMMING
```

### Question 2
```text
Reversed: avaJ
```

### Question 3
```text
racecar is a palindrome
```

### Question 4
```text
a
ab
abc
b
bc
c
```

## Result
All four programs were implemented using Java String methods, loops and conditional statements. The expected outputs demonstrate string length, character positions, uppercase conversion, string reversal, palindrome checking and substring extraction.