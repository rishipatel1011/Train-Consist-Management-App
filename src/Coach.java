public class Coach {
    private String type;
    private String cargo;

    public Coach(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    public String getType() { return type; }
    public String getCargo() { return cargo; }

    @Override
    public String toString() {
        return String.format("[Type: %-12s | Cargo: %-10s]", type, cargo);
    }
}