package Main.Vehicles;

public abstract class Vehicle {
    private double price;
    private double capacity;
    private static int ID = 0;
    private String factory;

    public Vehicle(double price, double capacity, String factory) {
        this.price = price;
        this.capacity = capacity;
        ID++;
        this.factory = factory;
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

    public int getID() {
        return ID;
    }

    public static void setID(int newID) {
        ID = newID;
    }

    public String getFactory() {
        return this.factory;
    }

    public void setFactory(String factory) {
        this.factory = factory;
    }

}
