# Assignment 9 – Matrices: Rows and Columns

## 1. Experiment Title
Matrices: Rows and Columns

## 2. Aim
To visit the rows and columns of a matrix using nested loops to print, add, and count its values.

## 3. Software / Tools Required
- Java Development Kit (JDK)
- Visual Studio Code
- Java Extension Pack
- macOS Terminal
- Git and GitHub

## 4. Theory
A matrix is a rectangular arrangement of elements in rows and columns. In Java, a matrix can be represented using a two-dimensional array.

A two-dimensional array is declared using two pairs of square brackets. Nested loops are commonly used to access and process its elements.

- The outer loop is generally used to traverse rows or columns.
- The inner loop accesses individual elements.
- Matrix indexing starts from 0.
- A counter variable can be used to count elements satisfying a condition.
- A sum variable can be used to calculate the total of matrix elements.

## 5. Algorithm / Procedure

### Question 1: Print First and Last Row
1. Declare and initialize a 3×3 matrix.
2. Access the first row using index 0.
3. Use a loop to print all elements of the first row.
4. Access the last row using index 2.
5. Use another loop to print all elements of the last row.

### Question 2: Sum of Each Column
1. Declare and initialize a 3×3 matrix.
2. Initialize a loop to traverse each column.
3. Set the sum variable to 0 for each column.
4. Use an inner loop to access every row of the selected column.
5. Add each element to the sum.
6. Display the sum of each column.

### Question 3: Count Values Greater Than 5
1. Declare and initialize a 3×3 matrix.
2. Initialize a counter variable to 0.
3. Use nested loops to traverse all matrix elements.
4. Check whether each element is greater than 5.
5. If the condition is true, increment the counter.
6. Display the final count.

## 6. Input

### Question 1
A 3×3 matrix:

1 2 3
4 5 6
7 8 9


### Question 2
A 3×3 matrix:

1 2 3
4 5 6
7 8 9


### Question 3
A 3×3 matrix:

1 2 3
4 5 6
7 8 9

Condition: Count elements greater than 5.

## 7. Output

### Question 1

First row: 1 2 3
Last row: 7 8 9


### Question 2

Column 1 sum: 12
Column 2 sum: 15
Column 3 sum: 18


### Question 3

Values greater than 5: 4

## 8. Result
Successfully implemented Java programs using two-dimensional arrays and nested loops to print the first and last rows, calculate the sum of each column, and count elements greater than a specified value.