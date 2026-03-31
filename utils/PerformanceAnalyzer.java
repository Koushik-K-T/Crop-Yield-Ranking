package utils;

import model.Field;
import sorting.BubbleSort;
import sorting.QuickSort;

public class PerformanceAnalyzer {

    // Measure bubble sort execution time
    public static long measureBubbleSort(Field[] fields) {
        long startTime = System.nanoTime();
        BubbleSort.sort(fields);
        long endTime = System.nanoTime();
        return (endTime - startTime) / 1_000_000;
    }

    // Measure quick sort execution time
    public static long measureQuickSort(Field[] fields) {
        long startTime = System.nanoTime();
        QuickSort.sort(fields);
        long endTime = System.nanoTime();
        return (endTime - startTime) / 1_000_000;
    }

    // Copy array for testing
    public static Field[] copyArray(Field[] original) {
        Field[] copy = new Field[original.length];
        for (int i = 0; i < original.length; i++) {
            copy[i] = original[i];
        }
        return copy;
    }
}