package Main.Vehicles;

public abstract class AirVehicle extends Vehicle {
    private double maxAltitude;
    private double runwayLength;

    public AirVehicle(double price, double capacity, String factory, double maxAltitude, double runwayLength) {
        super(price, capacity, factory);
        this.maxAltitude = maxAltitude;
        this.runwayLength = runwayLength;
    }

    public double getMaxAltitude() {
        return this.maxAltitude;
    }

    public void setMaxAltitude(double maxAltitude) {
        this.maxAltitude = maxAltitude;
    }

    public double getRunwayLength() {
        return this.runwayLength;
    }

    public void setRunwayLength(double runwayLength) {
        this.runwayLength = runwayLength;
    }

}
