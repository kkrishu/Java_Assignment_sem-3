# Assignment 5: Arrays – Traversal and Counting

## Aim
Create an array, visit every element with a loop, and add up or count the values.

## Software / Tools Required
- Java Development Kit (JDK)
- Visual Studio Code
- Java Extension Pack
- macOS Terminal
- Git and GitHub

## Theory
An array is a collection of elements of the same data type stored under a single variable name. Each element can be accessed using its index, starting from 0.

A `for` loop is used to traverse an array and perform operations on its elements. The `arr.length` property returns the total number of elements in an array.

Arrays can be used to calculate the sum, find the largest value, and count elements that satisfy a particular condition.

## Algorithm / Procedure

### Question 1: Traverse an Array
1. Declare an integer array named `arr` with values 3, 4 and 5.
2. Use a `for` loop starting from index 0.
3. Continue the loop while the index is less than `arr.length`.
4. Print the index and its corresponding element.

### Question 2: Sum and Largest Value
1. Declare an integer array with values 12, 45, 7, 33 and 21.
2. Initialize `sum` to 0.
3. Initialize `largest` with the first array element.
4. Traverse the array using a `for` loop.
5. Add each element to `sum`.
6. Compare each element with `largest` and update it if a greater value is found.
7. Print the sum and largest value.

### Question 3: Count Values Greater Than 10
1. Declare an integer array with values 5, 12, 2, 14 and 7.
2. Initialize a counter variable to 0.
3. Traverse the array using a `for` loop.
4. Check whether each element is greater than 10.
5. If the condition is true, increment the counter.
6. Print the final count.

## Input

- **Question 1:** Predefined array: `{3, 4, 5}`
- **Question 2:** Predefined array: `{12, 45, 7, 33, 21}`
- **Question 3:** Predefined array: `{5, 12, 2, 14, 7}`

No runtime input is required.

## Output

### Question 1

Index 0: 3
Index 1: 4
Index 2: 5


### Question 2

Sum: 118
Largest: 45


### Question 3

Count greater than 10: 2

## Result
All three questions of Assignment 5 were implemented using Java arrays and loops. The programs demonstrate array traversal, calculating the sum, finding the largest element, and counting values greater than a specified number.