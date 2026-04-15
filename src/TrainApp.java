import java.util.Arrays;

public class TrainApp {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");
        System.out.println("--- UC19: Binary Search (Divide & Conquer) ---\n");

        // 1. Data must be SORTED for Binary Search to work
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};
        Arrays.sort(bogieIds);

        String target = "BG412";
        System.out.println("Searching for Bogie ID: " + target);

        // 2. Perform Binary Search
        int resultIndex = performBinarySearch(bogieIds, target);

        // 3. Display Result
        if (resultIndex != -1) {
            System.out.println("SUCCESS: Bogie found at index " + resultIndex);
        } else {
            System.out.println("NOT FOUND: Bogie does not exist in the consist.");
        }
    }

    /**
     * Implementation of Binary Search for Strings
     */
    public static int performBinarySearch(String[] arr, String key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            // Find the middle index
            int mid = low + (high - low) / 2;

            // compareTo() returns 0 if equal, <0 if key is smaller, >0 if key is larger
            int comparison = key.compareTo(arr[mid]);

            if (comparison == 0) {
                return mid; // Key found!
            }

            if (comparison > 0) {
                low = mid + 1; // Key is in the right half
            } else {
                high = mid - 1; // Key is in the left half
            }
        }

        return -1; // Key not found after exhausting the range
    }
}