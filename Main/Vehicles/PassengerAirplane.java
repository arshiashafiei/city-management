package Main.Vehicles;

public class PassengerAirplane extends AirVehicle {
    private int numberOfPersonnel;
    private String seatClass;

    public PassengerAirplane(double price, double capacity, String factory, double maxAltitude, double runwayLength, int numberOfPersonnel, String seatClass) {
        super(price, capacity, factory, maxAltitude, runwayLength);
        this.numberOfPersonnel = numberOfPersonnel;
        this.seatClass = seatClass;

    }

    @Override
    public String toString() {
        return "PassengerAirplane" + '\n' +
                "numberOfPersonnel: " + numberOfPersonnel + '\n' +
                "seatClass: " + seatClass + '\n' +
                super.toString();
    }

    public String getSeatClass() {
        return this.seatClass;
    }

    public void setSeatClass(String seatClass) {
        this.seatClass = seatClass;
    }

    public int getNumberOfPersonnel() {
        return this.numberOfPersonnel;
    }

    public void setNumberOfPersonnel(int numberOfPersonnel) {
        this.numberOfPersonnel = numberOfPersonnel;
    }

}
