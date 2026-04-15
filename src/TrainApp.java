public class TrainApp {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");
        System.out.println("--- UC15: Structured Error Handling (try-catch-finally) ---\n");

        Coach rectangularBogie = new Coach("Rectangular");
        Coach cylindricalBogie = new Coach("Cylindrical");

        // Test Scenario 1: Safe Assignment
        System.out.println("Scenario 1: Assigning Coal to Rectangular Bogie...");
        processAssignment(rectangularBogie, "Coal");

        // Test Scenario 2: Unsafe Assignment
        System.out.println("\nScenario 2: Assigning Petroleum to Rectangular Bogie...");
        processAssignment(rectangularBogie, "Petroleum");

        // Test Scenario 3: Safe Assignment
        System.out.println("\nScenario 3: Assigning Petroleum to Cylindrical Bogie...");
        processAssignment(cylindricalBogie, "Petroleum");
    }

    public static void processAssignment(Coach bogie, String cargo) {
        try {
            bogie.assignCargo(cargo);
            System.out.println("SUCCESS: Cargo assigned - " + bogie);
        } catch (CargoSafetyException e) {
            System.out.println("CAUGHT ERROR: " + e.getMessage());
        } finally {
            // This block ALWAYS runs, useful for logging or releasing resources
            System.out.println("LOG: Cargo assignment attempt completed for " + bogie);
        }
    }
}