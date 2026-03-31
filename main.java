import java.util.Scanner;
import model.Field;
import utils.PerformanceAnalyzer;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("CROP YIELD PRODUCTION RANKING SYSTEM");
        System.out.println("========================================\n");

        // Get number of fields
        System.out.println("Enter number of fields: ");
        int numFields = scanner.nextInt();
        scanner.nextLine();

        // Create array to store fields
        Field[] fields = new Field[numFields];

        // Input field data
        System.out.println("\nEnter field details:");
        for (int i = 0; i < numFields; i++) {
            System.out.print("Field " + (i + 1) + " name: ");
            String name = scanner.nextLine();

            System.out.print("Crop type: ");
            String crop = scanner.nextLine();

            System.out.print("Yield (tons): ");
            double yield = scanner.nextDouble();
            scanner.nextLine();

            fields[i] = new Field(name, crop, yield);
        }

        // Create copies for sorting
        Field[] bubbleSortData = PerformanceAnalyzer.copyArray(fields);
        Field[] quickSortData = PerformanceAnalyzer.copyArray(fields);

        System.out.println("\n========================================");
        System.out.println("SORTING IN PROGRESS...");
        System.out.println("========================================\n");

        // Measure sorting times
        long bubbleTime = PerformanceAnalyzer.measureBubbleSort(bubbleSortData);
        long quickTime = PerformanceAnalyzer.measureQuickSort(quickSortData);

        // Display results
        System.out.println("CROP YIELD RANKING (Highest to Lowest):");
        System.out.println("-----------------------------------------");
        System.out.printf("%-4s | %-10s | %-12s | %s\n",
                "Rank", "Field", "Crop", "Yield (tons)");
        System.out.println("-----------------------------------------");

        for (int i = 0; i < bubbleSortData.length; i++) {
            System.out.printf("%-4d | %s\n", (i + 1), bubbleSortData[i]);
        }

        // Performance comparison
        System.out.println("\n========================================");
        System.out.println("PERFORMANCE COMPARISON");
        System.out.println("========================================");
        System.out.printf("Bubble Sort:  %d ms\n", bubbleTime);
        System.out.printf("Quick Sort:   %d ms\n", quickTime);
        if (quickTime > 0) {
            System.out.printf("Quick Sort is %.1fx faster\n",
                    (double) bubbleTime / quickTime);
        }
        System.out.println("========================================\n");

        scanner.close();
    }
}