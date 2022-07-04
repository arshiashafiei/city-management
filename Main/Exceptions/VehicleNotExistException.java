package Main.Exceptions;

public class VehicleNotExistException extends InvalidInputException {
    public VehicleNotExistException(String message) {
        super(message);
    }
}
