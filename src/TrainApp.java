import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TrainApp {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");
        System.out.println("--- UC11: Input Validation with Regex ---\n");

        // 1. Define Regex Patterns
        // Train ID format: TRN- followed by exactly 4 digits
        String trainIdRegex = "TRN-\\d{4}";

        // Cargo Code format: PET- followed by exactly 2 uppercase letters
        String cargoCodeRegex = "PET-[A-Z]{2}";

        // 2. Compile Patterns
        Pattern trainIdPattern = Pattern.compile(trainIdRegex);
        Pattern cargoCodePattern = Pattern.compile(cargoCodeRegex);

        // 3. Test Cases for Train IDs
        String[] trainIdTests = {"TRN-1234", "TRAIN12", "TRN-9999", "1234-TRN", "TRN-12A4"};
        System.out.println("--- Validating Train IDs ---");

        for (String id : trainIdTests) {
            Matcher matcher = trainIdPattern.matcher(id);
            // .matches() ensures the ENTIRE string fits the pattern
            if (matcher.matches()) {
                System.out.println("[VALID]   " + id);
            } else {
                System.out.println("[INVALID] " + id + " (Must be TRN-XXXX)");
            }
        }

        // 4. Test Cases for Cargo Codes
        String[] cargoCodeTests = {"PET-AB", "PET-ab", "PET-XYZ", "PET-XY", "AB-PET"};
        System.out.println("\n--- Validating Cargo Codes ---");

        for (String code : cargoCodeTests) {
            Matcher matcher = cargoCodePattern.matcher(code);
            if (matcher.matches()) {
                System.out.println("[VALID]   " + code);
            } else {
                System.out.println("[INVALID] " + code + " (Must be PET-XX in uppercase)");
            }
        }

        System.out.println("\nUC11 Completed: Data integrity enforced via Regex.");
    }
}