import java.util.LinkedHashSet;
import java.util.Set;

public class TrainApp {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");
        System.out.println("--- UC5: Unique Formation with LinkedHashSet ---\n");

        // 1. Create a LinkedHashSet<String> for the train formation
        // This ensures uniqueness AND preserves the insertion order
        Set<String> trainFormation = new LinkedHashSet<>();

        // 2. Attach bogies in physical sequence
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard Van");

        // 3. Attempt to attach a duplicate bogie (Sleeper)
        System.out.println("Action: Attempting to attach duplicate 'Sleeper'...");
        trainFormation.add("Sleeper");

        // 4. Display the final formation order
        System.out.println("\nFinal Train Formation (Order Preserved):");
        for (String bogie : trainFormation) {
            System.out.println("Attached: " + bogie);
        }

        // 5. Verification
        System.out.println("\nTotal Bogies: " + trainFormation.size());
        System.out.println("Result: Duplicates were ignored, and the original sequence was maintained.");
    }
}