package Main;

import java.util.Scanner;

import Main.Buildings.*;
import Main.Vehicles.*;

public class Main {
    private final static Scanner input = new Scanner(System.in);
    private final static City city = new City(100000);

    public static void menu() {
        city.addPerson(new Person("jesus", "christ", 1380, "landOfGod", Jobs.BUS_DRIVER, "Male", 90));
        city.addPerson(new Person("Elon", "Musk", 2020, "Texas", Jobs.PILOT, "Male", 23000));

        city.addVehicle(new Train(200, 12, "tesla", 20, false, 25, 2, 4, Facilities.JACUZZI));
        city.addVehicle(new Boat(400, 21, "sdf", "diesle", 23, 24, true));
        city.addVehicle(new Boat(400, 21, "sdf", "diesle", 23, 24, true));
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
                vehicleBuyingPanel(city.selectTerminal());
                break;
            case "4":
                city.showPeople();
                break;
            case "5":
                city.hireEmployee(city.selectTerminal());
                break;
            case "6":
                city.showEmployees(city.selectTerminal());
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
                city.showHotelRooms();
                break;
            case "11":
                city.buyHotelRoom();
                break;
            case "12":
                city.showTerminalVehicles();
                break;
            default:
                System.out.println("Try again");
                break;
        }
        menu();

    }

    public static void vehicleBuyingPanel(Terminal terminal) {
        if (terminal instanceof Airport) {
            city.buyAirVehicle((Airport) terminal);
        } else if (terminal instanceof BusTerminal) {
            city.buyBus((BusTerminal) terminal);
        } else if (terminal instanceof Port) {
            city.buySeaVehicle((Port) terminal);
        } else if (terminal instanceof TrainStation) {
            city.buyTrain((TrainStation) terminal);
        }
    }

    public static void main(String[] args) {
        menu();
    }

}
