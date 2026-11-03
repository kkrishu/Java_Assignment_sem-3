# Assignment 3: Star and Number Patterns

## Aim
To use a loop inside another loop to print stars and numbers in rows.

## Software / Tools Required
- Java Development Kit (JDK)
- Visual Studio Code
- Java Extension Pack
- macOS Terminal
- Git and GitHub

## Theory

Patterns in Java are created using loops, especially nested loops.

**1. For Loop:** A for loop is used to execute a block of code repeatedly for a specified number of iterations.

**2. Nested Loop:** A loop inside another loop is called a nested loop. The outer loop controls the rows, while the inner loop controls the elements printed in each row.

**3. print() Method:** Prints output on the same line.

**4. println() Method:** Prints output and moves the cursor to the next line.

Nested loops are commonly used to create star patterns, number patterns, triangles, and square patterns.

---

## Algorithm / Procedure

### Question 1: Square of Stars
1. Start the program.
2. Use an outer for loop to control four rows.
3. Use an inner for loop to print four stars in each row.
4. Move to the next line after printing each row.
5. Stop the program.

### Question 2: Right Triangle of Stars
1. Start the program.
2. Use an outer for loop from 1 to 4.
3. Use an inner loop from 1 to the current row number.
4. Print one star in each inner loop iteration.
5. Move to the next line after each row.
6. Stop the program.

### Question 3: Number Triangle
1. Start the program.
2. Use an outer for loop from 1 to 4.
3. Use an inner loop from 1 to the current row number.
4. Print the current inner loop variable.
5. Move to the next line after each row.
6. Stop the program.

### Question 4: Upside-Down Triangle
1. Start the program.
2. Use an outer for loop starting from 4 and decreasing to 1.
3. Use an inner loop to print stars according to the current row number.
4. Move to the next line after each row.
5. Stop the program.

---

## Input

### Question 1
No console/runtime input required. The number of rows and columns is predefined as 4.

### Question 2
No console/runtime input required. The number of rows is predefined as 4.

### Question 3
No console/runtime input required. The number of rows is predefined as 4.

### Question 4
No console/runtime input required. The number of rows is predefined as 4.

---

## Output

### Question 1: Square of Stars
```text
****
****
****
****
```

### Question 2: Right Triangle of Stars
```text
*
**
***
****
```

### Question 3: Number Triangle

1
12
123
1234

### Question 4: Upside-Down Triangle

****
***
**
*


---

## Result

Successfully implemented and executed four Java programs using nested for loops to print different star and number patterns, including a square pattern, right triangle, number triangle, and upside-down triangle.