public class Coach {
    private String name;
    private int capacity;

    public Coach(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String getName() { return name; }
    public int getCapacity() { return capacity; }

    @Override
    public String toString() {
        return String.format("[Bogie: %-12s | Capacity: %d seats]", name, capacity);
    }
}