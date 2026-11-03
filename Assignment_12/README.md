# Assignment 12 – Insertion Sort

## 1. Experiment Title
Insertion Sort

## 2. Aim
To sort integer arrays using the Insertion Sort algorithm and count the number of shifts performed during sorting.

## 3. Software / Tools Required
- Java Development Kit (JDK)
- Visual Studio Code
- Java Extension Pack
- macOS Terminal
- Git and GitHub

## 4. Theory
Insertion Sort is a simple sorting algorithm that builds a sorted array one element at a time.

It takes one element from the unsorted portion and inserts it into its correct position in the sorted portion.

The algorithm works by:
- Selecting an element called the key.
- Comparing the key with previous elements.
- Shifting larger elements one position to the right.
- Inserting the key into its correct position.

A shift occurs whenever an existing element moves one position to the right.

The average and worst-case time complexity of Insertion Sort is O(n²), while its best-case time complexity is O(n).

## 5. Algorithm / Procedure

### Question 1: Insertion Sort
1. Declare and initialize an integer array with 7, 3, 5, 1.
2. Start the outer loop from index 1.
3. Store the current element in a variable named key.
4. Compare the key with the elements before it.
5. Shift elements greater than the key one position to the right.
6. Insert the key at its correct position.
7. Repeat until the array is sorted.
8. Print the sorted array.

### Question 2: Insertion Sort on Another Array
1. Declare and initialize an integer array with 14, 3, 9, 21, 6.
2. Start the outer loop from index 1.
3. Store the current element in key.
4. Compare key with previous elements.
5. Shift larger elements one position to the right.
6. Insert key at its correct position.
7. Repeat until all elements are sorted.
8. Print the sorted array.

### Question 3: Count Shifts
1. Declare and initialize an integer array with 6, 5, 4, 3, 2, 1.
2. Initialize a counter variable named shifts to 0.
3. Apply the Insertion Sort algorithm.
4. Whenever an element moves one position to the right, increment shifts.
5. Insert the key at its correct position.
6. Repeat until the array is sorted.
7. Print the total number of shifts.

## 6. Input

### Question 1
```text
7, 3, 5, 1
```

### Question 2
```text
14, 3, 9, 21, 6
```

### Question 3
```text
6, 5, 4, 3, 2, 1
```

## 7. Output

### Question 1
```text
Sorted: [1, 3, 5, 7]
```

### Question 2
```text
Sorted: [3, 6, 9, 14, 21]
```

### Question 3
```text
Shifts: 15
```

## 8. Result
Successfully implemented the Insertion Sort algorithm in Java to arrange integer arrays in ascending order and count the number of shifts performed during sorting.