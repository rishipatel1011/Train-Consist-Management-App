import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TrainApp {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");
        System.out.println("--- UC8: Filtering Bogies with Stream API ---\n");

        // 1. Initialize the list of bogies
        List<Coach> trainConsist = new ArrayList<>();
        trainConsist.add(new Coach("Sleeper", 72));
        trainConsist.add(new Coach("AC Chair", 60));
        trainConsist.add(new Coach("First Class", 24));
        trainConsist.add(new Coach("General", 90));
        trainConsist.add(new Coach("Sleeper Extra", 72));

        System.out.println("Original Train Consist:");
        trainConsist.forEach(System.out::println);

        // 2. Apply Stream pipeline: filter() bogies with capacity > 60
        // We use .stream() to start, .filter() to apply logic, and .collect() to save results
        List<Coach> highCapacityBogies = trainConsist.stream()
                .filter(bogie -> bogie.getCapacity() > 60)
                .collect(Collectors.toList());

        // 3. Display the filtered results
        System.out.println("\n--- High-Capacity Bogies (Seats > 60) ---");
        if (highCapacityBogies.isEmpty()) {
            System.out.println("No bogies match the criteria.");
        } else {
            highCapacityBogies.forEach(System.out::println);
        }

        // 4. Verify Original List Integrity
        System.out.println("\nVerification: Original list size is still " + trainConsist.size());
    }
}