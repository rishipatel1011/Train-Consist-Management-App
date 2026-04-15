public class TrainApp {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");
        System.out.println("--- UC16: Manual Sorting (Bubble Sort) ---\n");

        // 1. Create an array of passenger bogie capacities
        int[] capacities = {72, 56, 24, 70, 60};

        System.out.print("Unsorted Capacities: ");
        printArray(capacities);

        // 2. Bubble Sort Algorithm Implementation
        // Outer loop handles the number of passes
        for (int i = 0; i < capacities.length - 1; i++) {
            // Inner loop handles adjacent comparisons
            for (int j = 0; j < capacities.length - 1 - i; j++) {
                // 3. Swap values if the left element is greater than the right
                if (capacities[j] > capacities[j + 1]) {
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }

        // 4. Display the sorted results
        System.out.print("Sorted Capacities:   ");
        printArray(capacities);

        System.out.println("\nUC16 Completed: Sorting logic implemented manually.");
    }

    // Helper method to print array contents
    private static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + (i == arr.length - 1 ? "" : ", "));
        }
        System.out.println("]");
    }
}