package Main.Vehicles;

public class Bus extends GroundVehicle {
    private String wheelType;
    private double topSpeed;

    public Bus(double price, double capacity, String factory, double cargoCapacity, boolean camera, double efficiency, String wheelType, double topSpeed) {
        super(price, capacity, factory, cargoCapacity, camera, efficiency);
        this.topSpeed = topSpeed;
        this.wheelType = wheelType;
    }

    @Override
    public String toString() {
        return  "Bus" +  '\n' +
                "wheelType: " + wheelType +  '\n' +
                "topSpeed: " + topSpeed + '\n' +
                super.toString();
    }

    public String getWheelType() {
        return this.wheelType;
    }

    public void setWheelType(String wheelType) {
        this.wheelType = wheelType;
    }

    public double getTopSpeed() {
        return this.topSpeed;
    }

    public void setTopSpeed(double topSpeed) {
        this.topSpeed = topSpeed;
    }

}
