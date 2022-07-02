package Main.Vehicles;

public abstract class SeaVehicle extends Vehicle {
    private String fuelType;
    private double lowestDepth;


    public SeaVehicle(double price, double capacity, String factory, String fuelType, double lowestDepth) {
        super(price, capacity, factory);
        this.fuelType = fuelType;
        this.lowestDepth = lowestDepth;
    }

    @Override
    public String toString() {
        return  "fuelType: " + fuelType +  '\n' +
                "lowestDepth: " + lowestDepth + '\n' +
                super.toString();
    }

    public String getFuelType() {
        return this.fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public double getLowestDepth() {
        return this.lowestDepth;
    }

    public void setLowestDepth(double LowestDepth) {
        this.lowestDepth = LowestDepth;
    }
    
}
