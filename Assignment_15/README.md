# Assignment 15: StringBuilder Methods

## Aim
Build and change text with StringBuilder, using append, insert and deleteCharAt.

## Software / Tools Required
- Java Development Kit (JDK)
- Visual Studio Code
- Java Extension Pack
- macOS Terminal
- Git and GitHub

## Theory
StringBuilder is a Java class used to create and modify mutable sequences of characters.

Unlike String objects, StringBuilder objects can be modified without creating a new object every time.

Important StringBuilder methods:
- `append()` – Adds text or values at the end.
- `insert()` – Inserts text or values at a specified position.
- `deleteCharAt()` – Removes a character at a specified index.
- `length()` – Returns the total number of characters.

## Algorithm / Procedure

### Question 1: Append Text and Print Length
1. Create a StringBuilder object initialized with "Hello".
2. Use `append()` to add " World".
3. Print the updated StringBuilder.
4. Use `length()` to calculate the total number of characters.
5. Print the length.

### Question 2: Build Comma-Separated Numbers
1. Create an empty StringBuilder object.
2. Use a for loop from 1 to 5.
3. Append each number followed by a comma.
4. Use `deleteCharAt()` to remove the last comma.
5. Print the final result.

### Question 3: Insert Greeting
1. Create a StringBuilder object initialized with "Java".
2. Use `insert()` to add "Hello " at index 0.
3. Print the updated StringBuilder.

## Input

### Question 1
Initial text: `Hello`

Text to append: ` World`

### Question 2
Numbers: `1, 2, 3, 4, 5`

### Question 3
Initial text: `Java`

Text to insert: `Hello `

No console input is required for these questions.

## Output

### Question 1
```text
Hello World
Length: 11
```

### Question 2
```text
1,2,3,4,5
```

### Question 3
```text
Hello Java
```

## Result
All three programs were implemented using Java StringBuilder methods. The programs successfully append text, remove unwanted characters and insert text at a specified position.