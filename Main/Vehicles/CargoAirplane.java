package Main.Vehicles;

public class CargoAirplane extends AirVehicle {
    private double transportWeight;
    
    public CargoAirplane(double price, double capacity, String factory, double maxAltitude, double runwayLength, double transportWeight) {
        super(price, capacity, factory, maxAltitude, runwayLength);
        this.transportWeight = transportWeight;

    }

    public double getTransportWeight() {
        return this.transportWeight;
    }

    public void setTransportWeight(double transportWeight) {
        this.transportWeight = transportWeight;
    }

}
