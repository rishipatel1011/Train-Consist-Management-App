import java.util.ArrayList;
import java.util.List;

public class TrainApp {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        // 1. Create an ArrayList<String> for passenger bogies
        List<String> passengerBogies = new ArrayList<>();

        // 2. Add bogies: Sleeper, AC Chair, First Class
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // 3. Print the list after insertion
        System.out.println("Bogies after addition: " + passengerBogies);

        // 4. Remove one bogie (AC Chair)
        System.out.println("\nAction: Removing 'AC Chair'...");
        passengerBogies.remove("AC Chair");

        // 5. Use contains() to check if Sleeper exists
        boolean hasSleeper = passengerBogies.contains("Sleeper");
        System.out.println("Does 'Sleeper' exist in consist? " + hasSleeper);

        // 6. Print final list state
        System.out.println("\nFinal Consist State: " + passengerBogies);
    }
}