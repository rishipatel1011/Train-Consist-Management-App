public class TrainApp {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");
        System.out.println("--- UC18: Locating Bogies with Linear Search ---\n");

        // 1. Create an array of bogie IDs
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        // 2. Define the search keys (Test Cases)
        String searchKey1 = "BG309"; // Existing ID
        String searchKey2 = "BG999"; // Non-existing ID

        // 3. Perform Linear Search
        System.out.println("Search Operation 1: Looking for " + searchKey1);
        performLinearSearch(bogieIds, searchKey1);

        System.out.println("\nSearch Operation 2: Looking for " + searchKey2);
        performLinearSearch(bogieIds, searchKey2);

        System.out.println("\nUC18 Completed: Linear search logic verified.");
    }

    /**
     * Implementation of Linear Search Algorithm
     */
    public static void performLinearSearch(String[] arr, String target) {
        boolean found = false;
        int position = -1;

        // Traverse the array sequentially
        for (int i = 0; i < arr.length; i++) {
            // Equality Comparison using equals() for Strings
            if (arr[i].equals(target)) {
                found = true;
                position = i;
                break; // Early Termination: Stop searching once found
            }
        }

        if (found) {
            System.out.println("RESULT: Bogie " + target + " found at position " + (position + 1));
        } else {
            System.out.println("RESULT: Bogie " + target + " not found in the consist.");
        }
    }
}