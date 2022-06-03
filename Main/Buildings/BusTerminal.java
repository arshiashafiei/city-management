package Main.Buildings;

import java.util.ArrayList;

import Main.Vehicles.Bus;

public class BusTerminal extends Terminal {
    private ArrayList<Bus> buses;

    public BusTerminal(double cost, String city, String name, String address, double area) {
        super(cost, city, name, address, area);
        this.buses = new ArrayList<>();
    }


    public ArrayList<Bus> getBuses() {
        return this.buses;
    }

    public void setBuses(ArrayList<Bus> buses) {
        this.buses = buses;
    }

    public void addVehicle(Bus bus) {
        this.buses.add(bus);
        
    }
}
