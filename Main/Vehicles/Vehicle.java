package Main.Vehicles;

import java.util.Objects;

public abstract class Vehicle {
    private double price;
    private double capacity;
    private static int vehicleCount = 0;
    private String ID;
    private String factory;

    public Vehicle(double price, double capacity, String factory) {
        this.price = price;
        this.capacity = capacity;
        vehicleCount++;
        this.ID = String.valueOf(vehicleCount);
        this.factory = factory;
    }

    @Override
    public String toString() {
        return  "price: " + price + '\n' +
                "capacity: " + capacity + '\n' +
                "ID: " + ID + '\n' +
                "factory: " + factory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vehicle vehicle = (Vehicle) o;

        return Objects.equals(ID, vehicle.ID);
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getCapacity() {
        return this.capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public String getFactory() {
        return this.factory;
    }

    public void setFactory(String factory) {
        this.factory = factory;
    }

    public static int getVehicleCount() {
        return vehicleCount;
    }

    public static void setVehicleCount(int vehicleCount) {
        Vehicle.vehicleCount = vehicleCount;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
}
