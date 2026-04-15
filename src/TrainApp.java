import java.util.ArrayList;
import java.util.List;

public class TrainApp {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");
        System.out.println("--- UC12: Safety Compliance Audit (allMatch) ---\n");

        // 1. Prepare a list of goods bogies
        List<Coach> goodsBogies = new ArrayList<>();
        goodsBogies.add(new Coach("Open", "Coal"));
        goodsBogies.add(new Coach("Cylindrical", "Petroleum"));
        goodsBogies.add(new Coach("Box", "Grain"));
        goodsBogies.add(new Coach("Cylindrical", "Petroleum"));

        System.out.println("Current Goods Composition:");
        goodsBogies.forEach(System.out::println);

        // 2. allMatch() checks every bogie against safety rules
        // Rule: If type is 'Cylindrical', cargo MUST be 'Petroleum'
        boolean isSafe = goodsBogies.stream().allMatch(bogie -> {
            if (bogie.getType().equalsIgnoreCase("Cylindrical")) {
                return bogie.getCargo().equalsIgnoreCase("Petroleum");
            }
            return true; // Non-cylindrical bogies are safe by default here
        });

        // 3. Display Result
        System.out.println("\n--- Safety Audit Report ---");
        if (isSafe) {
            System.out.println("STATUS: [SAFE] - All safety constraints satisfied.");
        } else {
            System.out.println("STATUS: [UNSAFE] - Violation detected: Cylindrical bogies must only carry Petroleum!");
        }

        // 4. Demonstrate a Violation
        System.out.println("\nAction: Adding unsafe bogie (Cylindrical carrying Coal)...");
        goodsBogies.add(new Coach("Cylindrical", "Coal"));

        boolean recheckSafe = goodsBogies.stream().allMatch(bogie ->
                !bogie.getType().equalsIgnoreCase("Cylindrical") || bogie.getCargo().equalsIgnoreCase("Petroleum")
        );

        System.out.println("Re-check Status: " + (recheckSafe ? "[SAFE]" : "[UNSAFE]"));
    }
}