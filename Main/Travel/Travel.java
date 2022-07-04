package Main.Travel;

import Main.Buildings.Terminal;
import Main.Person;
import Main.Vehicles.Vehicle;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Travel implements Comparable<Travel> {
    private Terminal originTerminal;
    private Terminal destinationTerminal;
    private ArrayList<Person> travellers;
    private Person driver;
    private Vehicle vehicle;
    private static int travelCount = 0;
    private String ID;
    private double cost;
    private String date;

    public Travel(Terminal originTerminal, Terminal destinationTerminal, ArrayList<Person> travellers, Person driver, Vehicle vehicle, double cost, String date) {
        this.originTerminal = originTerminal;
        this.destinationTerminal = destinationTerminal;
        this.travellers = travellers;
        this.driver = driver;
        this.vehicle = vehicle;
        travelCount++;
        this.ID = String.valueOf(travelCount);
        this.cost = cost;
        this.date = date;
    }

    @Override
    public int compareTo(Travel o) {
        if (LocalDate.parse(this.date).isAfter(LocalDate.parse(o.date))) {
            return 1;
        } else if (LocalDate.parse(this.date).isBefore(LocalDate.parse(o.date))) {
            return -1;
        } else return Double.compare(this.cost, o.cost);
    }

    @Override
    public String toString() {
        return  "--------originTerminal--------\n" + originTerminal.toString() + '\n' +
                "--------destinationTerminal--------\n" + destinationTerminal.toString() + '\n' +
                "--------driver--------\n" + driver.toString() + '\n' +
                "--------vehicle--------\n" + vehicle.toString() + '\n' +
                "ID: " + ID + '\n' +
                "cost: " + cost + '\n' +
                "date: " + date + '\n';
    }

    public Terminal getOriginTerminal() {
        return originTerminal;
    }

    public void setOriginTerminal(Terminal originTerminal) {
        this.originTerminal = originTerminal;
    }

    public Terminal getDestinationTerminal() {
        return destinationTerminal;
    }

    public void setDestinationTerminal(Terminal destinationTerminal) {
        this.destinationTerminal = destinationTerminal;
    }

    public ArrayList<Person> getTravellers() {
        return travellers;
    }

    public void setTravellers(ArrayList<Person> travellers) {
        this.travellers = travellers;
    }

    public Person getDriver() {
        return driver;
    }

    public void setDriver(Person driver) {
        this.driver = driver;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public static int getTravelCount() {
        return travelCount;
    }

    public static void setTravelCount(int travelCount) {
        Travel.travelCount = travelCount;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
