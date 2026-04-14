import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TrainApp {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");
        System.out.println("--- UC9: Grouping Bogies with groupingBy() ---\n");

        // 1. Initialize the list with multiple bogies of the same and different types
        List<Coach> trainConsist = new ArrayList<>();
        trainConsist.add(new Coach("Sleeper", 72));
        trainConsist.add(new Coach("AC Chair", 60));
        trainConsist.add(new Coach("Sleeper", 72));
        trainConsist.add(new Coach("First Class", 24));
        trainConsist.add(new Coach("AC Chair", 60));

        System.out.println("Original Flat List of Bogies:");
        trainConsist.forEach(System.out::println);

        // 2. Apply Stream pipeline: Grouping bogies by their 'type'
        // This creates a Map where Key = Type (String) and Value = List of Coaches
        Map<String, List<Coach>> groupedBogies = trainConsist.stream()
                .collect(Collectors.groupingBy(Coach::getType));

        // 3. Display the structured grouped results
        System.out.println("\n--- Grouped Bogie Report ---");
        groupedBogies.forEach((type, list) -> {
            System.out.println("Category: [" + type + "] -> Count: " + list.size());
            list.forEach(bogie -> System.out.println("   " + bogie));
        });

        // 4. Verification of original list integrity
        System.out.println("\nVerification: Original list remains unchanged (Size: " + trainConsist.size() + ")");
    }
}