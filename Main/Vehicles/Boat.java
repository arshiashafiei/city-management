package Main.Vehicles;

public class Boat extends SeaVehicle {
    private double weight;
    private boolean engine;

    public Boat(double price, double capacity, String factory, String fuelType, double lowestDepth, double weight, boolean engine) {
        super(price, capacity, factory, fuelType, lowestDepth);
        this.weight = weight;
        this.engine = engine;

    }


    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean hasEngine() {
        return this.engine;
    }

    public void setEngine(boolean engine) {
        this.engine = engine;
    }
}