
public class Coach {
    private String coachId;
    private String type;
    private int capacity;

    public Coach(String coachId, String type, int capacity) {
        this.coachId = coachId;
        this.type = type;
        this.capacity = capacity;
    }

    public String getCoachId() { return coachId; }
    public String getType() { return type; }
    public int getCapacity() { return capacity; }

    @Override
    public String toString() {
        return String.format("[ID: %-5s | Type: %-10s | Cap: %d]", coachId, type, capacity);
    }
}