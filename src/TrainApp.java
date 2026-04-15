import java.util.ArrayList;
import java.util.List;

public class TrainApp {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");
        System.out.println("--- UC10: Total Seating Capacity with reduce() ---\n");

        // 1. Initialize the list of bogies
        List<Coach> trainConsist = new ArrayList<>();
        trainConsist.add(new Coach("Sleeper", 72));
        trainConsist.add(new Coach("AC Chair", 60));
        trainConsist.add(new Coach("First Class", 24));
        trainConsist.add(new Coach("General", 90));

        System.out.println("Current Train Composition:");
        trainConsist.forEach(System.out::println);

        // 2. Apply Stream pipeline: map() to extract capacity, reduce() to sum them
        // The '0' is the identity (starting value), and Integer::sum handles the addition
        int totalCapacity = trainConsist.stream()
                .map(Coach::getCapacity)     // Extracts the integer capacities
                .reduce(0, Integer::sum);    // Sums them all together

        // 3. Display the aggregated result
        System.out.println("\n--- Train Capacity Report ---");
        System.out.println("Total Seating Capacity: " + totalCapacity + " seats");

        // 4. Test Case Simulation: Empty List Handling
        List<Coach> emptyConsist = new ArrayList<>();
        int emptyTotal = emptyConsist.stream()
                .map(Coach::getCapacity)
                .reduce(0, Integer::sum);
        System.out.println("Empty Consist Test (Should be 0): " + emptyTotal + " seats");
    }
}