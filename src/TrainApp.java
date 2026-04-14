import java.util.HashMap;
import java.util.Map;

public class TrainApp {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");
        System.out.println("--- UC6: Bogie-Capacity Mapping with HashMap ---\n");

        // 1. Create a HashMap<String, Integer> to store bogie-capacity information
        // Key: Bogie Name (String), Value: Capacity (Integer)
        Map<String, Integer> bogieCapacities = new HashMap<>();

        // 2. Insert capacity values using the put() method
        bogieCapacities.put("Sleeper", 72);
        bogieCapacities.put("AC Chair", 60);
        bogieCapacities.put("First Class", 24);
        bogieCapacities.put("General", 90);

        // 3. Display individual lookup example
        System.out.println("Capacity lookup for 'Sleeper': " + bogieCapacities.get("Sleeper") + " seats");

        // 4. Iterate over the map using entrySet() to display all mappings
        System.out.println("\n--- Full Bogie Capacity Report ---");
        for (Map.Entry<String, Integer> entry : bogieCapacities.entrySet()) {
            System.out.println("Bogie Type: " + entry.getKey() + " | Seat Capacity: " + entry.getValue());
        }

        System.out.println("\nUC6 Completed: Key-Value association established.");
    }
}