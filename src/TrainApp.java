import java.util.HashSet;
import java.util.Set;

public class TrainApp {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");
        System.out.println("--- UC3: Ensuring Unique Bogie IDs ---\n");

        // 1. Create a HashSet<String> for bogie IDs
        // HashSet automatically handles deduplication
        Set<String> bogieIds = new HashSet<>();

        // 2. Add bogie IDs (including intentional duplicates)
        System.out.println("Action: Adding Bogie IDs [B101, B102, B103, B101]...");
        bogieIds.add("B101");
        bogieIds.add("B102");
        bogieIds.add("B103");

        // This duplicate entry will be ignored by the HashSet
        bogieIds.add("B101");

        // 3. Print the final set
        System.out.println("Current Unique Bogie IDs in System:");
        System.out.println(bogieIds);

        // 4. Observe that duplicates are removed automatically
        System.out.println("\nSystem Report: Total unique bogies registered: " + bogieIds.size());
        System.out.println("Note: Duplicate entry 'B101' was automatically rejected.");
    }
}