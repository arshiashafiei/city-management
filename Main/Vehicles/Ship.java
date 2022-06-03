package Main.Vehicles;

public class Ship extends SeaVehicle {
    private int numberOfRooms;

    public Ship(double price, double capacity, String factory, String fuelType, double lowestDepth, int numberOfRooms) {
        super(price, capacity, factory, fuelType, lowestDepth);
        this.numberOfRooms = numberOfRooms;
    }

    public int getNumberOfRooms() {
        return this.numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

}
