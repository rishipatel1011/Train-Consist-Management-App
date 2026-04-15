import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TrainApp {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");
        System.out.println("--- UC13: Benchmarking Loops vs Streams ---\n");

        // 1. Prepare a large dataset for realistic benchmarking
        List<Coach> largeConsist = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            largeConsist.add(new Coach("Sleeper", i % 100));
        }

        // 2. Measure Loop-Based Processing
        long loopStart = System.nanoTime();
        List<Coach> loopResult = new ArrayList<>();
        for (Coach coach : largeConsist) {
            if (coach.getCapacity() > 60) {
                loopResult.add(coach);
            }
        }
        long loopEnd = System.nanoTime();
        long loopDuration = loopEnd - loopStart;

        // 3. Measure Stream-Based Processing
        long streamStart = System.nanoTime();
        List<Coach> streamResult = largeConsist.stream()
                .filter(c -> c.getCapacity() > 60)
                .collect(Collectors.toList());
        long streamEnd = System.nanoTime();
        long streamDuration = streamEnd - streamStart;

        // 4. Display Results
        System.out.println("--- Performance Results (for 10,000 bogies) ---");
        System.out.println("Loop Processing Time   : " + loopDuration + " ns");
        System.out.println("Stream Processing Time : " + streamDuration + " ns");

        System.out.println("\nResult Validation:");
        System.out.println("Loop result size  : " + loopResult.size());
        System.out.println("Stream result size: " + streamResult.size());

        if (loopResult.size() == streamResult.size()) {
            System.out.println("SUCCESS: Both methods produced identical results.");
        }
    }
}