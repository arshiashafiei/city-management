package Main.Buildings;

import java.util.ArrayList;

import Main.Person;

public abstract class Terminal {
    private double cost;
    private String city;
    private String name;
    private String address;
    private double area;
    private int numberOfVehicles;
    private ArrayList<Person> employees;


    public Terminal(double cost, String city, String name, String address, double area) {
        this.cost = cost;
        this.city = city;
        this.name = name;
        this.address = address;
        this.area = area;
        this.numberOfVehicles = 0;
        this.employees = new ArrayList<>();
    }


    public double getCost() {
        return this.cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
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

    
}
