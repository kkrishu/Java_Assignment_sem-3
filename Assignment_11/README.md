# Assignment 10 – Switch and ArrayList

## 1. Experiment Title
Switch and ArrayList

## 2. Aim
To choose a branch using a switch statement and store, access, update, and remove elements from an ArrayList.

## 3. Software / Tools Required
- Java Development Kit (JDK)
- Visual Studio Code
- Java Extension Pack
- macOS Terminal
- Git and GitHub

## 4. Theory
A switch statement is a decision-making statement in Java. It executes a particular block of code based on the value of an expression.

An ArrayList is a resizable collection in Java that can store elements dynamically. Unlike a normal array, its size can increase or decrease when elements are added or removed.

Important ArrayList methods:

- `add()` – Adds an element to the list.
- `get()` – Retrieves an element using its index.
- `size()` – Returns the number of elements.
- `set()` – Updates an element at a specified index.
- `remove()` – Removes an element from the list.

ArrayList indexing starts from 0.

## 5. Algorithm / Procedure

### Question 1: Switch Statement
1. Declare an integer variable named day and initialize it with 3.
2. Use a switch statement to check the value of day.
3. Print Monday for 1, Tuesday for 2, and Wednesday for 3.
4. Use default to print Invalid day for other values.
5. Use break statements to exit each case.

### Question 2: Create and Access ArrayList
1. Import the ArrayList class.
2. Create an ArrayList of Integer named list.
3. Add 10, 20, 30, and 40 using add().
4. Print the complete list.
5. Display the list size using size().
6. Display the element at index 2 using get().

### Question 3: Update and Remove Elements
1. Import the ArrayList class.
2. Create an ArrayList of Integer named list.
3. Add 10, 20, 30, and 40.
4. Use set() to replace the element at index 1 with 25.
5. Use remove() to delete the element at index 3.
6. Print the updated list and its size.

## 6. Input

### Question 1
Predefined integer value:
```text
day = 3
```

### Question 2
Predefined ArrayList values:
```text
10, 20, 30, 40
```

### Question 3
Predefined ArrayList values:
```text
10, 20, 30, 40
```
Update index 1 to 25 and remove index 3.

## 7. Output

### Question 1
```text
Wednesday
```

### Question 2
```text
[10, 20, 30, 40]
Size: 4
Item at index 2: 30
```

### Question 3
```text
[10, 25, 30]
Size: 3
```

## 8. Result
Successfully implemented Java programs using switch statements and ArrayList methods to perform decision-making, add elements, access elements, update values, and remove elements.