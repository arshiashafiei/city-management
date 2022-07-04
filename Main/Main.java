package Main;

import java.util.Scanner;

import Main.Exceptions.*;
import Main.Vehicles.*;

public class Main {
    private final static Scanner input = new Scanner(System.in);

    public static void mainMenu() {
        System.out.println("BUDGET: " + Country.getBudget());
        System.out.println(
                """
                        -------Menu--------
                        Enter a number:
                        1. Build a City
                        2. Show Cities
                        3. Enter City Menu
                        ----------------""");
        String choice = input.nextLine();
        switch (choice) {
            case "1":
                Country.addCity(Country.getCityFromUser());
                break;
            case "2":
                Country.showCities();
                break;
            case "3":
                cityMenu(Country.selectCity());
                break;
            default:
                System.out.println("Try again");
                break;
        }
        mainMenu();

    }

    public static void cityMenu(City city) {
        System.out.println("BUDGET: " + city.getBudget());
        System.out.println(
                """
                        -------Menu--------
                        Enter a number:
                        1. Build a Terminal
                        2. Show Terminals
                        3. Buy Vehicle
                        4. Show people
                        5. hire a person
                        6. Show hired people
                        7. Show Available Vehicles
                        8. Build Hotel
                        9. Show Hotels
                        10. Show Hotel Rooms
                        11. Buy Hotel Rooms
                        12. Show Terminal Vehicles
                        13. Show data
                        14. Add Travel
                        15. Show All Travels
                        16. Show In Travels
                        17. Show Out Travels
                        18. Log Out
                        ----------------""");
        String choice = input.nextLine();
        switch (choice) {
            case "1":
                city.chooseTerminal();
                break;
            case "2":
                city.showTerminals();
                break;
            case "3":
                try {
                    city.vehicleBuyingPanel(city.selectTerminal());
                } catch (InvalidInputException e) {
                    System.out.println(e.getMessage());
                }
                break;
            case "4":
                city.showPeople();
                break;
            case "5":
                try {
                    city.hireEmployee(city.selectTerminal());
                } catch (InvalidInputException e) {
                    System.out.println(e.getMessage());
                }
                break;
            case "6":
                try {
                    city.showEmployees(city.selectTerminal());
                } catch (InvalidInputException e) {
                    System.out.println(e.getMessage());
                }
                break;
            case "7":
                city.showVehicles();
                break;
            case "8":
                city.buildHotel();
                break;
            case "9":
                city.showHotels();
                break;
            case "10":
                try {
                    city.showHotelRooms();
                } catch (InvalidInputException e) {
                    System.out.println(e.getMessage());
                }
                break;
            case "11":
                try {
                    city.buyHotelRoom();
                } catch (InvalidInputException e) {
                    System.out.println(e.getMessage());
                }
                break;
            case "12":
                try {
                    city.showTerminalVehicles(city.selectTerminal());
                } catch (InvalidInputException e) {
                    System.out.println(e.getMessage());
                }
                break;
            case "13":
                city.showData();
                break;
            case "14":
                try {
                    city.addTravel();
                } catch (InvalidInputException | WrongTerminalTypeException | NotEnoughPassengers e) {
                    System.out.println(e.getMessage());
                }
                break;
            case "15":
                city.showAllTravels();
                break;
            case "16":
                city.showInTravels();
                break;
            case "17":
                city.showOutTravels();
                break;
            case "18":
                return;
            default:
                System.out.println("Try again");
                break;
        }
        cityMenu(city);

    }

    public static void main(String[] args) {
        mainMenu();
    }

}
