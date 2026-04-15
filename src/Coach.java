public class Coach {
    private String type; // Cylindrical or Rectangular
    private String cargo;

    public Coach(String type) {
        this.type = type;
    }

    public void assignCargo(String newCargo) {
        // Business Rule: Petroleum requires Cylindrical bogies
        if (newCargo.equalsIgnoreCase("Petroleum") && !type.equalsIgnoreCase("Cylindrical")) {
            throw new CargoSafetyException("UNSAFE ASSIGNMENT: Petroleum cannot be loaded into " + type + " bogie!");
        }
        this.cargo = newCargo;
    }

    @Override
    public String toString() {
        return "[Bogie: " + type + " | Cargo: " + (cargo == null ? "Empty" : cargo) + "]";
    }
}