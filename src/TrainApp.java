import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TrainApp {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");
        System.out.println("--- UC7: Sorting by Capacity with Comparator ---\n");

        // 1. Create a List to store Coach objects
        List<Coach> passengerBogies = new ArrayList<>();

        // 2. Add bogies with different capacities
        passengerBogies.add(new Coach("Sleeper", 72));
        passengerBogies.add(new Coach("AC Chair", 60));
        passengerBogies.add(new Coach("First Class", 24));
        passengerBogies.add(new Coach("General", 90));

        System.out.println("Before Sorting (Insertion Order):");
        passengerBogies.forEach(System.out::println);

        // 3. Apply Comparator to sort by capacity (Ascending)
        // Using Lambda expression for concise logic
        passengerBogies.sort(Comparator.comparingInt(Coach::getCapacity));

        System.out.println("\nAfter Sorting (By Capacity - Ascending):");
        passengerBogies.forEach(System.out::println);

        // 4. Bonus: Sorting by capacity (Descending) for high-capacity planning
        passengerBogies.sort(Comparator.comparingInt(Coach::getCapacity).reversed());

        System.out.println("\nAfter Sorting (By Capacity - Descending):");
        passengerBogies.forEach(System.out::println);
    }
}