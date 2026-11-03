# Assignment 11 – Bubble Sort and Selection Sort

## 1. Experiment Title
Bubble Sort and Selection Sort

## 2. Aim
To sort integer arrays using Bubble Sort and Selection Sort algorithms and count the number of swaps performed during Bubble Sort.

## 3. Software / Tools Required
- Java Development Kit (JDK)
- Visual Studio Code
- Java Extension Pack
- macOS Terminal
- Git and GitHub

## 4. Theory

Sorting is the process of arranging elements in a particular order, such as ascending or descending order.

**Bubble Sort:**
Bubble Sort repeatedly compares adjacent elements and swaps them if they are in the wrong order. After each pass, the largest unsorted element moves to its correct position.

**Selection Sort:**
Selection Sort repeatedly finds the smallest element from the unsorted portion of an array and places it at the beginning of that portion.

**Swap:**
A swap is the process of exchanging the positions of two elements in an array.

The `Arrays.toString()` method is used to display array elements in a readable format.

## 5. Algorithm / Procedure

### Question 1: Bubble Sort
1. Declare and initialize the integer array with 5, 1, 4, 2, 8.
2. Use an outer loop to control the number of passes.
3. Use an inner loop to compare adjacent elements.
4. If the current element is greater than the next element, swap them.
5. Repeat until the array is sorted.
6. Print the sorted array using Arrays.toString().

### Question 2: Selection Sort
1. Declare and initialize the integer array with 64, 25, 12, 22, 11.
2. Use an outer loop to select the current position.
3. Assume the current position contains the minimum element.
4. Use an inner loop to find the smallest element in the remaining array.
5. Swap the smallest element with the current position.
6. Print the sorted array.

### Question 3: Count Swaps in Bubble Sort
1. Declare and initialize the integer array with 5, 1, 4, 2, 8.
2. Initialize a counter variable named swaps to 0.
3. Apply Bubble Sort using nested loops.
4. Compare adjacent elements.
5. Whenever two elements are swapped, increment the swaps counter.
6. Print the total number of swaps.

## 6. Input

### Question 1
```text
5, 1, 4, 2, 8
```

### Question 2
```text
64, 25, 12, 22, 11
```

### Question 3
```text
5, 1, 4, 2, 8
```

## 7. Output

### Question 1
```text
Sorted: [1, 2, 4, 5, 8]
```

### Question 2
```text
Sorted: [11, 12, 22, 25, 64]
```

### Question 3
```text
Swaps: 4
```

## 8. Result
Successfully implemented Bubble Sort and Selection Sort algorithms in Java to arrange array elements in ascending order and count the swaps performed during Bubble Sort.