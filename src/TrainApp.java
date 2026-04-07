import java.util.ArrayList;
import java.util.List;

public class TrainApp {
    public static void main(String[] args) {
        // 1. Display Welcome Message
        System.out.println("=== Train Consist Management App ===");
        System.out.println("System Status: Initializing Engine and Infrastructure...");

        // 2. Dynamic Initialization 
        // We use the List interface for abstraction and ArrayList for resizable storage
        List<Coach> trainConsist = new ArrayList<>();

        // 3. Display Initial Summary
        // size() returns 0 because no bogies have been coupled yet
        System.out.println("Initial Bogie Count: " + trainConsist.size());

        System.out.println("\nUC1 Completed: Ready for coach allocation.");
    }
}