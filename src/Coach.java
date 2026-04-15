public class Coach {
    private String type;
    private int capacity;

    public Coach(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    public String getType() { return type; }
    public int getCapacity() { return capacity; }

    @Override
    public String toString() {
        return String.format("[Type: %-12s | Capacity: %d seats]", type, capacity);
    }
}