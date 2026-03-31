package sorting;

import model.Field;

// Overall Code for Quicksorting
public class QuickSort {

    public static void sort(Field[] fields) {
        if (fields.length == 0)
            return;
        quickSort(fields, 0, fields.length - 1);
    }

    private static void quickSort(Field[] fields, int low, int high) {
        if (low < high) {
            int pi = partition(fields, low, high);
            quickSort(fields, low, pi - 1);
            quickSort(fields, pi + 1, high);
        }
    }

    private static int partition(Field[] fields, int low, int high) {
        Field pivot = fields[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (fields[j].getYield() > pivot.getYield()) {
                i++;
                // Swap
                Field temp = fields[j];
                fields[j] = fields[i];
                fields[i] = temp;
            }
        }

        Field temp = fields[i + 1];
        fields[i + 1] = fields[high];
        fields[high] = temp;

        return i + 1;
    }
}