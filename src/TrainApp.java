import java.util.Arrays;

public class TrainApp {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");
        System.out.println("--- UC17: Efficient Sorting with Arrays.sort() ---\n");

        // 1. Create an array of bogie type names
        String[] bogieNames = {"Sleeper", "AC Chair", "First Class", "General", "Luxury"};

        System.out.println("Original Bogie Names: " + Arrays.toString(bogieNames));

        // 2. Use Arrays.sort() for optimized alphabetical sorting
        // This replaces the nested loops used in Bubble Sort
        Arrays.sort(bogieNames);

        // 3. Print the sorted result
        System.out.println("Sorted Bogie Names:   " + Arrays.toString(bogieNames));

        // 4. Verification with Duplicate Handling
        String[] duplicates = {"Sleeper", "AC Chair", "Sleeper", "General"};
        Arrays.sort(duplicates);
        System.out.println("\nDuplicate Handling:   " + Arrays.toString(duplicates));

        System.out.println("\nUC17 Completed: Optimized library sorting applied.");
    }
}