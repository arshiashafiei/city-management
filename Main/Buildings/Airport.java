package Main.Buildings;

import java.util.ArrayList;

import Main.City;
import Main.Vehicles.AirVehicle;

public class Airport extends Terminal {
    private boolean international;
    private int numberOfRunways;
    private ArrayList<AirVehicle> airVehicles;


    public Airport(double cost, City city, String name, String address, double area, boolean international, int numberOfRunways) {
        super(cost, city, name, address, area);
        this.international = international;
        this.numberOfRunways = numberOfRunways;
        this.airVehicles = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Airport" + '\n' +
                "international: " + international + 'n' +
                "number Of Runways: " + numberOfRunways + '\n'
                + super.toString();
    }

    public boolean isInternational() {
        return this.international;
    }

    public void setInternational(boolean international) {
        this.international = international;
    }

    public int getNumberOfRunways() {
        return this.numberOfRunways;
    }

    public void setNumberOfRunways(int numberOfRunways) {
        this.numberOfRunways = numberOfRunways;
    }

    public ArrayList<AirVehicle> getAirVehicles() {
        return this.airVehicles;
    }

    public void setAirVehicles(ArrayList<AirVehicle> airVehicles) {
        this.airVehicles = airVehicles;
    }

    public void addVehicle(AirVehicle airVehicle) {
        this.airVehicles.add(airVehicle);
        increaseNumberOfVehicles();
    }
}
