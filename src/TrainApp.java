public class TrainApp {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");
        System.out.println("--- UC14: Custom Exception Handling ---\n");

        // 1. Attempt to create a valid bogie
        try {
            System.out.println("Action: Creating valid Sleeper bogie (72 seats)...");
            Coach sleeper = new Coach("Sleeper", 72);
            System.out.println("SUCCESS: " + sleeper);
        } catch (InvalidCapacityException e) {
            System.err.println("ERROR: " + e.getMessage());
        }

        // 2. Attempt to create an invalid bogie (Zero capacity)
        try {
            System.out.println("\nAction: Creating invalid bogie (0 seats)...");
            Coach brokenBogie = new Coach("Economy", 0);
        } catch (InvalidCapacityException e) {
            System.out.println("CAUGHT EXPECTED EXCEPTION: " + e.getMessage());
        }

        // 3. Attempt to create an invalid bogie (Negative capacity)
        try {
            System.out.println("\nAction: Creating invalid bogie (-10 seats)...");
            Coach ghostBogie = new Coach("Freight", -10);
        } catch (InvalidCapacityException e) {
            System.out.println("CAUGHT EXPECTED EXCEPTION: " + e.getMessage());
        }

        System.out.println("\nUC14 Completed: System is protected from invalid capacity values.");
    }
}