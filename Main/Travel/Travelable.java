package Main.Travel;

import Main.Buildings.Terminal;
import Main.Person;
import Main.Vehicles.Vehicle;

import java.util.ArrayList;

public interface Travelable {
    void newTravel(Terminal originTerminal, Terminal destinationTerminal, ArrayList<Person> travellers, Person driver, Vehicle vehicle, double cost, String date);
    void sortTravels();
    double calculateTravelCost(ArrayList<Person> travellers, Vehicle vehicle);
    void travelsHistory(int type);
}
