package Main;

import Main.Buildings.Hotel;
import Main.Buildings.Terminal;
import Main.Vehicles.Facilities;
import Main.Vehicles.Vehicle;

import java.util.ArrayList;
import java.util.Scanner;

public class Country {
    private ArrayList<City> cities;
    private int population;
    private double budget;
    private static final Scanner input = new Scanner(System.in);

    public Country() {
        this.cities = new ArrayList<>();
        this.population = 0;
        this.budget = 0;
    }

    public void addCity(City newCity) {
        this.cities.add(newCity);
        this.population += newCity.getPopulation();
        this.budget += newCity.getBudget();
    }

    public ArrayList<City> getCities() {
        return cities;
    }

    public void setCities(ArrayList<City> cities) {
        this.cities = cities;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public City getCityFromUser() {
        System.out.print("Please Enter City budget: ");
        double budget = input.nextDouble();
        input.nextLine();

        return new City(budget);
    }

    public void showCities() {
        int i = 1;
        for (City city : this.cities) {
            System.out.print(i++ + ". ");
            city.showData();
        }
    }

    public City selectCity() {
        showCities();
        System.out.println("select a City:");
        String choice = input.nextLine();
        return this.cities.get(Integer.parseInt(choice) - 1);
    }
}
