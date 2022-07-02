package Main.Vehicles;

public abstract class GroundVehicle extends Vehicle {
    private double cargoCapacity;
    private boolean camera;
    private double efficiency;


    public GroundVehicle(double price, double capacity, String factory, double cargoCapacity, boolean camera, double efficiency) {
        super(price, capacity, factory);
        this.cargoCapacity = cargoCapacity;
        this.camera = camera;
        this.efficiency = efficiency;
    }

    @Override
    public String toString() {
        return  "cargoCapacity: " + cargoCapacity + '\n' +
                "camera: " + camera + '\n' +
                "efficiency: " + efficiency + '\n' +
                super.toString();
    }

    public double getCargoCapacity() {
        return this.cargoCapacity;
    }

    public void setCargoCapacity(double cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public boolean isCamera() {
        return this.camera;
    }

    public boolean getCamera() {
        return this.camera;
    }

    public void setCamera(boolean camera) {
        this.camera = camera;
    }

    public double getEfficiency() {
        return this.efficiency;
    }

    public void setEfficiency(double efficiency) {
        this.efficiency = efficiency;
    }

}
