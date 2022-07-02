package Main.Travel;

import Main.Buildings.Terminal;
import Main.Person;
import Main.Vehicles.Vehicle;

import java.time.LocalDate;
import java.time.LocalDateTime;
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
}
