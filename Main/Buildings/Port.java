package Main.Buildings;

import java.util.ArrayList;

import Main.Vehicles.SeaVehicle;

public class Port extends Terminal {
    private int numberOfDocks;
    private ArrayList<SeaVehicle> seaVehicles;


    public Port(double cost, String city, String name, String address, double area, int numberOfDocks) {
        super(cost, city, name, address, area);
        this.numberOfDocks = numberOfDocks;
        this.seaVehicles = new ArrayList<>();
    }


    public int getNumberOfDocks() {
        return this.numberOfDocks;
    }

    public void setNumberOfDocks(int numberOfDocks) {
        this.numberOfDocks = numberOfDocks;
    }

    public ArrayList<SeaVehicle> getSeaVehicles() {
        return this.seaVehicles;
    }

    public void setSeaVehicles(ArrayList<SeaVehicle> seaVehicles) {
        this.seaVehicles = seaVehicles;
    }

    public void addVehicle(SeaVehicle seaVehicle) {
        this.seaVehicles.add(seaVehicle);
        
    }

}
