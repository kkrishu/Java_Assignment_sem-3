# Assignment 8: Matrices – Transpose and Row Sums

## Aim
Create two-dimensional arrays, visit them row by row, and build a new matrix from one.

## Software / Tools Required
- Java Development Kit (JDK)
- Visual Studio Code
- Java Extension Pack
- macOS Terminal
- Git and GitHub

## Theory
A matrix is a rectangular arrangement of elements organized into rows and columns. In Java, a matrix can be represented using a two-dimensional array.

A two-dimensional array is declared using two pairs of square brackets (`[][]`). Nested loops are used to access and process matrix elements.

The transpose of a matrix is obtained by interchanging its rows and columns. Row-wise addition is performed by adding all elements present in each row.

## Algorithm / Procedure

### Question 1: Create and Print a 3 × 4 Matrix
1. Declare a two-dimensional integer array with 3 rows and 4 columns.
2. Initialize a variable `value` to 1.
3. Use nested loops to traverse the matrix.
4. Store values from 1 to 12 row by row.
5. Print the matrix using nested loops, displaying one row per line.

### Question 2: Transpose a Matrix
1. Declare a 3 × 3 matrix with values 1 to 9.
2. Create another 3 × 3 array to store the transpose.
3. Traverse the original matrix using nested loops.
4. Assign each element using `transpose[j][i] = matrix[i][j]`.
5. Print the transposed matrix row by row.

### Question 3: Sum Each Row
1. Declare a 3 × 3 matrix with values 1 to 9.
2. Use an outer loop to traverse each row.
3. Initialize a variable `sum` to 0 for every row.
4. Use an inner loop to add all elements of the current row.
5. Print the row number and its calculated sum.

## Input

- **Question 1:** A 3 × 4 matrix filled with values from 1 to 12.
- **Question 2:** A predefined 3 × 3 matrix:
  `{1, 2, 3}`, `{4, 5, 6}`, `{7, 8, 9}`.
- **Question 3:** A predefined 3 × 3 matrix:
  `{1, 2, 3}`, `{4, 5, 6}`, `{7, 8, 9}`.

No runtime input is required.

## Output

### Question 1
```text
1 2 3 4
5 6 7 8
9 10 11 12
```

### Question 2
```text
1 4 7
2 5 8
3 6 9
```

### Question 3
```text
Row 1 sum: 6
Row 2 sum: 15
Row 3 sum: 24
```

## Result
All three questions of Assignment 8 were implemented using Java two-dimensional arrays and nested loops. The programs demonstrate matrix creation, matrix transpose, and calculating the sum of individual rows.