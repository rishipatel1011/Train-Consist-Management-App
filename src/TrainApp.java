import java.util.LinkedList;

public class TrainApp {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");
        System.out.println("--- UC4: Ordered Chaining with LinkedList ---\n");

        // 1. Create a LinkedList<String> for the consist
        // LinkedList is ideal for head/tail operations (shunting)
        LinkedList<String> trainConsist = new LinkedList<>();

        // 2. Add bogies: Engine, Sleeper, AC, Cargo, Guard
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC Coach");
        trainConsist.add("Cargo");
        trainConsist.add("Guard Van");

        System.out.println("Initial Sequence: " + trainConsist);

        // 3. Insert a Pantry Car at position 2 (index starts at 0)
        System.out.println("\nAction: Inserting 'Pantry Car' in the middle...");
        trainConsist.add(2, "Pantry Car");
        System.out.println("After Insertion: " + trainConsist);

        // 4. Remove the first and last bogie
        System.out.println("\nAction: Detaching Engine (Head) and Guard Van (Tail)...");
        trainConsist.removeFirst();
        trainConsist.removeLast();

        // 5. Display the final ordered train consist
        System.out.println("\nFinal Ordered Train Consist:");
        System.out.println(trainConsist);

        System.out.println("\nUC4 Completed: Physical chaining modeled successfully.");
    }
}