package Main;

import java.util.Scanner;

import Main.Buildings.*;
import Main.Vehicles.*;

public class Main {
    private static Scanner input = new Scanner(System.in);
    private static City city = new City(100000);

    public static void menu() {
        city.addPerson(new Person("jesus", "christ", 1380, "landOfGod", "guiding people towards god", "Male", 0));
        city.addPerson(new Person("Elon", "Musk", 2020, "Texas", "pilot", "Male", 2300000));

        city.addVehicle(new Train(200, 12, "tesla", 20, false, 25, 2, 4));
        city.addVehicle(new Boat(400, 21, "sdf", "diesle", 23, 24, true));

        System.out.println("Budget: " + city.getBudget());
        System.out.println(
                "Enter a number:\n1. Build a Terminal\n2. Show Terminals\n3. Buy Vehicle\n4. Show people\n5. hire a person\n6. Show hired people\n7. Show Vehicles");
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
            ;
        } else if (terminal instanceof TrainStation) {
            city.buyTrain((TrainStation) terminal);
            ;
        }
    }

    public static void main(String[] args) {
        menu();
    }

}
