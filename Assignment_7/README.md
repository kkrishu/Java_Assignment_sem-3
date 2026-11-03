# Assignment 7: Counting Steps and Complexity

## Aim
Count the steps a program takes, and write its time complexity as a comment.

## Software / Tools Required
- Java Development Kit (JDK)
- Visual Studio Code
- Java Extension Pack
- macOS Terminal
- Git and GitHub

## Theory
Time complexity describes how the number of operations performed by an algorithm changes as the input size increases.

A single loop generally has linear time complexity, represented by O(n).

Nested loops, where one loop executes inside another, generally have quadratic time complexity, represented by O(n²).

A loop that repeatedly divides its value by 2 has logarithmic time complexity, represented by O(log n).

These complexity notations help analyze the efficiency of algorithms.

## Algorithm / Procedure

### Question 1: Count Single-Loop Steps
1. Initialize an integer variable `steps` to 0.
2. Create a `for` loop that runs from 1 to 10.
3. Increment `steps` by 1 during each iteration.
4. Write the time complexity as a comment above the loop.
5. Print the total number of steps.

### Question 2: Count Nested-Loop Steps
1. Initialize an integer variable `steps` to 0.
2. Create an outer `for` loop that runs from 1 to 10.
3. Create an inner `for` loop inside the outer loop that also runs from 1 to 10.
4. Increment `steps` every time the inner loop body executes.
5. Write the time complexity as a comment above the loops.
6. Print the total number of steps.

### Question 3: Count Halving Steps
1. Declare an integer variable `n` and initialize it to 1024.
2. Initialize an integer variable `steps` to 0.
3. Create a `while` loop that runs while `n` is greater than 1.
4. Divide `n` by 2 during each iteration.
5. Increment `steps` after each division.
6. Write the time complexity as a comment above the loop.
7. Print the total number of halving steps.

## Input

- **Question 1:** Loop range from 1 to 10.
- **Question 2:** Both loops run from 1 to 10.
- **Question 3:** Initial value of `n` is 1024.

No runtime input is required.

## Output

### Question 1
Steps: 10

### Question 2
Steps: 100

### Question 3
Halving steps: 10

## Result
All three questions of Assignment 7 were implemented using Java loops. The programs demonstrate step counting and the concepts of linear O(n), quadratic O(n²), and logarithmic O(log n) time complexity.