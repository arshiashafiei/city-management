package Main;

import java.util.ArrayList;
import java.util.Scanner;

public class Country {
    private static ArrayList<City> cities = new ArrayList<>();
    private static int population = 0;
    private static double budget = 0;
    private static final Scanner input = new Scanner(System.in);

    public static void addCity(City newCity) {
        Country.cities.add(newCity);
        Country.population += newCity.getPopulation();
        Country.budget += newCity.getBudget();
    }

    public static ArrayList<City> getCities() {
        return cities;
    }

    public static void setCities(ArrayList<City> cities) {
        Country.cities = cities;
    }

    public static int getPopulation() {
        return population;
    }

    public static void setPopulation(int population) {
        Country.population = population;
    }

    public static double getBudget() {
        return budget;
    }

    public static void setBudget(double budget) {
        Country.budget = budget;
    }

    public static City getCityFromUser() {
        System.out.print("Please Enter City budget: ");
        double budget = input.nextDouble();
        input.nextLine();

        return new City(budget);
    }

    public static void showCities() {
        int i = 1;
        for (City city : Country.cities) {
            System.out.print(i++ + ". ");
            city.showData();
        }
    }

    public static City selectCity() {
        showCities();
        System.out.println("select a City:");
        String choice = input.nextLine();
        return Country.cities.get(Integer.parseInt(choice) - 1);
    }
}
