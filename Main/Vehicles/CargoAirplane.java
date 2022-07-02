package Main.Vehicles;

public class CargoAirplane extends AirVehicle {
    private double transportWeight;
    
    public CargoAirplane(double price, double capacity, String factory, double maxAltitude, double runwayLength, double transportWeight) {
        super(price, capacity, factory, maxAltitude, runwayLength);
        this.transportWeight = transportWeight;

    }

    @Override
    public String toString() {
        return "CargoAirplane" + '\n' +
                "transportWeight: " + transportWeight + '\n' +
                super.toString();
    }

    public double getTransportWeight() {
        return this.transportWeight;
    }

    public void setTransportWeight(double transportWeight) {
        this.transportWeight = transportWeight;
    }

}
