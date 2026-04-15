import java.util.Arrays;

public class TrainApp {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");
        System.out.println("--- UC20: Defensive State Validation ---\n");

        // Test Scenario 1: Searching an empty array
        String[] emptyConsist = {};
        try {
            System.out.println("Action: Searching in an empty train consist...");
            performSafeSearch(emptyConsist, "BG101");
        } catch (IllegalStateException e) {
            System.out.println("CAUGHT EXCEPTION: " + e.getMessage());
        }

        // Test Scenario 2: Searching a valid array
        String[] validConsist = {"BG101", "BG205", "BG309"};
        System.out.println("\nAction: Searching in a valid train consist...");
        performSafeSearch(validConsist, "BG205");
    }

    /**
     * Performs a search only if the train state is valid (not empty)
     */
    public static void performSafeSearch(String[] arr, String key) {
        // 1. State Validation (Defensive Check)
        if (arr == null || arr.length == 0) {
            throw new IllegalStateException("Search Failed: Cannot search a train with no bogies attached.");
        }

        // 2. Proceed with search logic if valid
        boolean found = false;
        for (String id : arr) {
            if (id.equals(key)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("SUCCESS: Bogie " + key + " located.");
        } else {
            System.out.println("INFO: Bogie " + key + " not found.");
        }
    }
}