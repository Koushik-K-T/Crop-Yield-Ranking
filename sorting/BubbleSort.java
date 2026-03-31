package sorting;

import model.Field;

public class BubbleSort {

    // Bubble sort algorithm - O(n²) time complexity
    public static void sort(Field[] fields) {
        int n = fields.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Compare yields (higher yield first)
                if (fields[j].getYield() < fields[j + 1].getYield()) {
                    // Swap
                    Field temp = fields[j];
                    fields[j] = fields[j + 1];
                    fields[j + 1] = temp;
                }
            }
        }
    }
}