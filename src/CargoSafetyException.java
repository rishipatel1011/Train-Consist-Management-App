// Extending RuntimeException makes this an unchecked exception
public class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}