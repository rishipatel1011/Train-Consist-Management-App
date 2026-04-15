public class Coach {
    private String type;
    private int capacity;

    public Coach(String type, int capacity) throws InvalidCapacityException {
        // Business Rule: Capacity must be > 0
        if (capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be greater than zero for: " + type);
        }
        this.type = type;
        this.capacity = capacity;
    }

    public String getType() { return type; }
    public int getCapacity() { return capacity; }

    @Override
    public String toString() {
        return "[Type: " + type + " | Capacity: " + capacity + "]";
    }
}