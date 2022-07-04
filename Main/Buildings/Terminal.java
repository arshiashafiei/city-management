package Main.Buildings;

import java.util.ArrayList;
import java.util.Collections;

import Main.City;
import Main.Person;
import Main.Travel.Travel;
import Main.Travel.Travelable;
import Main.Vehicles.Vehicle;

public abstract class Terminal implements Travelable {
    private double cost;
    private City city;
    private String name;
    private String address;
    private double area;
    private int numberOfVehicles;
    private ArrayList<Person> employees;
    private ArrayList<Travel> inTravels;
    private ArrayList<Travel> outTravels;

    public Terminal(double cost, City city, String name, String address, double area) {
        this.cost = cost;
        this.city = city;
        this.name = name;
        this.address = address;
        this.area = area;
        this.numberOfVehicles = 0;
        this.employees = new ArrayList<>();
        this.outTravels = new ArrayList<>();
        this.inTravels = new ArrayList<>();
    }

    @Override
    public String toString() {
        return  "cost: " + cost + '\n' +
                "city: " + city + '\n' +
                "name: " + name + '\n' +
                "address: " + address + '\n' +
                "area: " + area + '\n' +
                "number Of Vehicles: " + numberOfVehicles;
    }

    @Override
    public void newTravel(Terminal originTerminal, Terminal destinationTerminal, ArrayList<Person> travellers, Person driver, Vehicle vehicle, String date) {
        Travel newTravel = new Travel(originTerminal, destinationTerminal, travellers, driver, vehicle, calculateTravelCost(travellers, vehicle), date);
        originTerminal.getOutTravels().add(newTravel);
        destinationTerminal.getInTravels().add(newTravel);
        originTerminal.getEmployees().remove(driver);
        destinationTerminal.getEmployees().add(driver);
        originTerminal.getCity().getPersons().removeAll(travellers);
        destinationTerminal.getCity().getPersons().addAll(travellers);
        double budget = originTerminal.getCity().getBudget();
        originTerminal.getCity().setBudget(budget + calculateTravelCost(travellers, vehicle));
        if (originTerminal instanceof Airport airport) {
            airport.getAirVehicles().remove(vehicle);
        } else if (originTerminal instanceof BusTerminal busTerminal) {
            busTerminal.getBuses().remove(vehicle);
        } else if (originTerminal instanceof Port port) {
            port.getSeaVehicles().remove(vehicle);
        } else if (originTerminal instanceof TrainStation trainStation) {
            trainStation.getTrains().remove(vehicle);
        }
    }

    @Override
    public double calculateTravelCost(ArrayList<Person> travellers, Vehicle vehicle) {
        return vehicle.getPrice() + travellers.size() * 10;
    }

    @Override
    public void sortTravels() {
        Collections.sort(this.inTravels);
        Collections.sort(this.outTravels);
    }

    @Override
    public void travelsHistory(int type) {
        sortTravels();
        if (type == 0) {
            for (Travel travel : outTravels) {
                System.out.println(travel.toString());
                System.out.println("==========");
            }
        } else if (type == 1) {
            for (Travel travel : inTravels) {
                System.out.println(travel.toString());
                System.out.println("==========");
            }
        } else if (type == 2) {
            ArrayList<Travel> allTravels = (ArrayList<Travel>) outTravels.clone();
            allTravels.addAll(inTravels);
            for (Travel travel : allTravels) {
                System.out.println(travel.toString());
                System.out.println("==========");
            }
        }
    }

    public double getCost() {
        return this.cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public City getCity() {
        return this.city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getArea() {
        return this.area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getNumberOfVehicles() {
        return this.numberOfVehicles;
    }

    public void setNumberOfVehicles(int numberOfVehicles) {
        this.numberOfVehicles = numberOfVehicles;
    }

    public ArrayList<Person> getEmployees() {
        return this.employees;
    }

    public void setEmployees(ArrayList<Person> employees) {
        this.employees = employees;
    }

    public void addEmployee(Person newEmployee) {
        this.employees.add(newEmployee);
    }

    public void increaseNumberOfVehicles() {
        this.numberOfVehicles++;
    }

    public ArrayList<Travel> getOutTravels() {
        return outTravels;
    }

    public void setOutTravels(ArrayList<Travel> outTravels) {
        this.outTravels = outTravels;
    }

    public ArrayList<Travel> getInTravels() {
        return inTravels;
    }

    public void setInTravels(ArrayList<Travel> inTravels) {
        this.inTravels = inTravels;
    }
}
