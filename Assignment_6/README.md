# Assignment 6: Arrays – Reverse and Duplicates

## Aim
Print an array in reverse order, find the smallest value, and check an array for repeated values.

## Software / Tools Required
- Java Development Kit (JDK)
- Visual Studio Code
- Java Extension Pack
- macOS Terminal
- Git and GitHub

## Theory
An array is a collection of elements of the same data type. Each element is accessed using its index, starting from 0.

Array traversal can be performed in different ways using loops. A reverse loop allows us to access array elements from the last index to the first index.

The smallest element can be found by comparing each array element with the current smallest value. Nested loops can be used to compare array elements and identify duplicate values.

## Algorithm / Procedure

### Question 1: Print Array in Reverse
1. Declare an integer array with values 10, 20, 30, 40 and 50.
2. Start a `for` loop from the last index (`arr.length - 1`).
3. Continue the loop while the index is greater than or equal to 0.
4. Decrease the index by 1 in each iteration.
5. Print each array element.

### Question 2: Smallest Value and Index
1. Declare an integer array with values 2, 5, 1, 8, 3 and 4.
2. Initialize `smallest` with the first array element.
3. Initialize an index variable to 0.
4. Traverse the array using a `for` loop.
5. Compare each element with the current smallest value.
6. If a smaller value is found, update the smallest value and its index.
7. Print the smallest value and its index.

### Question 3: Find Repeated Value
1. Declare an integer array with values 4, 9, 2, 9 and 7.
2. Initialize a boolean variable `found` to false.
3. Use an outer loop to select each array element.
4. Use an inner loop to compare the selected element with the elements after it.
5. If two elements are equal, print the repeated value.
6. Set `found` to true and stop the loops.
7. If no repeated value is found, print an appropriate message.

## Input

- **Question 1:** Predefined array: `{10, 20, 30, 40, 50}`
- **Question 2:** Predefined array: `{2, 5, 1, 8, 3, 4}`
- **Question 3:** Predefined array: `{4, 9, 2, 9, 7}`

No runtime input is required.

## Output

### Question 1
```text
50
40
30
20
10
```

### Question 2
```text
Smallest: 1 at index 2
```

### Question 3
```text
Repeated value: 9
```

## Result
All three questions of Assignment 6 were implemented using Java arrays and loops. The programs demonstrate reverse array traversal, finding the smallest element and its index, and identifying repeated values using nested loops.