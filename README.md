**Crop Yield Production Ranking System**

|__> This project has been created for understanding of Algorithm Concepts and Time Complexity.
|__> We hereby submit this Project as a Mini Project for our Design and Analysis of Algorithm Course.

A Java application that sorts farm fields by crop yield using different sorting algorithms and compares their performance.

--> Features
* Input multiple farm fields with name, crop type, and yield
* Sort fields by yield (highest to lowest)
* Compare Bubble Sort and Quick Sort performance
* Display execution time for each algorithm

## Project Structure
```
src/
├── model/
│   └── Field.java --> Stores the Field Data
├── sorting/
│   ├── BubbleSort.java --> Slower Sorting
│   └── QuickSort.java --> Faster Sorting
├── utils/
│   └── PerformanceAnalyzer.java --> Calculates the Time Taken
└── Main.java
```


## Example Usage
```
CROP YIELD PRODUCTION RANKING SYSTEM
========================================

Enter number of fields: 4
Enter field details:
Field 1 name: Field A
Crop type: Rice
Yield (tons): 50
Field 2 name: Field B
Crop type: Wheat
Yield (tons): 75
...

CROP YIELD RANKING (Highest to Lowest):
-----------------------------------------
Rank | Field      | Crop         | Yield (tons)
-----------------------------------------
1    | Field B    | Wheat        | 75.00 tons
2    | Field A    | Rice         | 50.00 tons
...

PERFORMANCE COMPARISON
========================================
Bubble Sort:  2 ms
Quick Sort:   0 ms
Quick Sort is 2.0x faster
========================================
```

## Time Complexity
- **Bubble Sort:** O(n²)
- **Quick Sort:** O(n log n) average case

## Author
Koushik-K-T
