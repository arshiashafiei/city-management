package Main.Exceptions;

public class NotEnoughPassengers extends CancelTravelException {
    public NotEnoughPassengers(String message) {
        super(message);
    }
}
