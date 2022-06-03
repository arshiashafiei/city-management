package Main;

import java.util.ArrayList;
import java.util.Scanner;

import Main.Buildings.*;
import Main.Vehicles.*;


public class City {
    private ArrayList<Person> persons;
    private ArrayList<Hotel> hotels;
    private ArrayList<Vehicle> vehicles;
    private ArrayList<Terminal> terminals;
    private int population;
    private double budget;
    private static Scanner input = new Scanner(System.in);


    public City(double budget) {
        this.persons = new ArrayList<>();
        this.hotels = new ArrayList<>();
        this.terminals = new ArrayList<>();
        this.vehicles = new ArrayList<>();
        this.population = 0;
        this.budget = budget;
    }

    public ArrayList<Person> getPersons() {
        return this.persons;
    }

    public void setPersons(ArrayList<Person> persons) {
        this.persons = persons;
    }

    public void addPerson(Person person) {
        this.persons.add(person);
        this.population++;
    }

    public ArrayList<Hotel> getHotels() {
        return this.hotels;
    }

    public void setHotels(ArrayList<Hotel> hotels) {
        this.hotels = hotels;
    }

    public int getPopulation() {
        return this.population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public double getBudget() {
        return this.budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public void addVehicle(Vehicle vehicle) {
        this.vehicles.add(vehicle);
    }

    public Airport getAirportFromUser() {
        System.out.print("Please Enter Terminal info:\nenter cost:");
        double cost = input.nextDouble();
        input.nextLine();
        System.out.print("Enter city:");
        String city = input.nextLine();
        System.out.print("Enter the name:");
        String name = input.nextLine();
        System.out.print("Enter address:");
        String address = input.nextLine();
        System.out.print("Enter the area:");
        double area = input.nextDouble();
        input.nextLine();

        System.out.println("Is this an international Airport?\n1. YES\n2. NO");
        boolean international = false;
        if (input.nextLine().equals("1")) {
            international = true;
        }
        System.out.print("Enter number of runways:");
        int numberOfRunways = input.nextInt();
        input.nextLine();

        return new Airport(cost, city, name, address, area, international, numberOfRunways);  
    }

    public BusTerminal getBusTerminalFromUser() {
        System.out.print("Please Enter Terminal info:\nenter cost:");
        double cost = input.nextDouble();
        input.nextLine();
        System.out.print("Enter city:");
        String city = input.nextLine();
        System.out.print("Enter the name:");
        String name = input.nextLine();
        System.out.print("Enter address:");
        String address = input.nextLine();
        System.out.print("Enter the area:");
        double area = input.nextDouble();
        input.nextLine();


        return new BusTerminal(cost, city, name, address, area);  
    }

    public Port getPortFromUser() {
        System.out.print("Please Enter Terminal info:\nenter cost:");
        double cost = input.nextDouble();
        input.nextLine();
        System.out.print("Enter city:");
        String city = input.nextLine();
        System.out.print("Enter the name:");
        String name = input.nextLine();
        System.out.print("Enter address:");
        String address = input.nextLine();
        System.out.print("Enter the area:");
        double area = input.nextDouble();
        input.nextLine();

        System.out.print("Enter number of docks:");
        int numberOfDocks = input.nextInt();
        input.nextLine();

        return new Port(cost, city, name, address, area, numberOfDocks);  
    }

    public TrainStation getTrainStationFromUser() {
        System.out.print("Please Enter Terminal info:\nenter cost:");
        double cost = input.nextDouble();
        input.nextLine();
        System.out.print("Enter city:");
        String city = input.nextLine();
        System.out.print("Enter the name:");
        String name = input.nextLine();
        System.out.print("Enter address:");
        String address = input.nextLine();
        System.out.print("Enter the area:");
        double area = input.nextDouble();
        input.nextLine();

        System.out.print("Enter number of inRails:");
        int inRails = input.nextInt();
        input.nextLine();
        System.out.print("Enter number of outRails:");
        int outRails = input.nextInt();
        input.nextLine();

        return new TrainStation(cost, city, name, address, area, inRails, outRails);  
    }

    public void chooseTerminal() {
        System.out.println("What kind of terminal do you want to build?\n1. Airport\n2. Bus Terminal\n3. Port\n4. Train Station");
        String choice = input.nextLine();
        switch (choice) {
            case "1":
                buildAirport();
                break;
            case "2":
                buildBusTerminal();
                break;
            case "3":
                buildPort();
                break;
            case "4":
                buildTrainStation();
                break;        
            default:
                System.out.println("Try again");
                chooseTerminal();
                break;
        }
    }

    public void buildAirport() {
        Airport newAirport = getAirportFromUser();
        if (newAirport.getCost() > this.budget) {
            System.out.println("you are low on budget");
        } else {
            this.terminals.add(newAirport);
            this.budget -= newAirport.getCost();
            System.out.println("Successfully built");
        }      
    }

    public void buildBusTerminal() {
        BusTerminal newBusTerminal = getBusTerminalFromUser();
        if (newBusTerminal.getCost() > this.budget) {
            System.out.println("you are low on budget");
        } else {
            this.terminals.add(newBusTerminal);
            this.budget -= newBusTerminal.getCost();
            System.out.println("Successfully built");
        }      
    }
    public void buildPort() {
        Port newPort = getPortFromUser();
        if (newPort.getCost() > this.budget) {
            System.out.println("you are low on budget");
        } else {
            this.terminals.add(newPort);
            this.budget -= newPort.getCost();
            System.out.println("Successfully built");
        }      
    }
    public void buildTrainStation() {
        TrainStation newTrainStation = getTrainStationFromUser();
        if (newTrainStation.getCost() > this.budget) {
            System.out.println("you are low on budget");
        } else {
            this.terminals.add(newTrainStation);
            this.budget -= newTrainStation.getCost();
            System.out.println("Successfully built");
        }      
    }

    // public void showAirports() {
    //     int i = 1;
    //     for (Airport airport : this.airports) {
    //         System.out.print(i++ + ". ");
    //         System.out.println(airport.getName());
    //     }
    // }

    public void showTerminals() {
        int i = 1;
        for (Terminal terminal : this.terminals) {
            if (terminal instanceof Airport) {
                Airport airport = (Airport) terminal;
                System.out.print(i++ + ". ");
                System.out.println(airport.getName());   
            } else if (terminal instanceof BusTerminal) {
                BusTerminal busTerminal = (BusTerminal) terminal;
                System.out.print(i++ + ". ");
                System.out.println(busTerminal.getName()); 
            } else if (terminal instanceof Port) {
                Port port = (Port) terminal;
                System.out.print(i++ + ". ");
                System.out.println(port.getName()); 
            } else if (terminal instanceof TrainStation) {
                TrainStation trainStation = (TrainStation) terminal;
                System.out.print(i++ + ". ");
                System.out.println(trainStation.getName()); 
            }
        }
    }

    public Terminal selectTerminal() {
        showTerminals();
        System.out.println("select a terminal:");
        String choice = input.nextLine();
        return this.terminals.get(Integer.parseInt(choice) - 1);
    }

    // public Airport selectAirport() {
    //     showAirports();
    //     System.out.println("select an airport:");
    //     String choice = input.nextLine();
    //     return this.airports.get(Integer.parseInt(choice) - 1);
    // }


    public void showVehicles() {
        int i = 1;
        for (Vehicle vehicle : this.vehicles) {
            System.out.print(i++ + ". ");
            System.out.println(vehicle.getID());
        }
    }

    public AirVehicle selectAirVehicle() {
        int i = 1;
        for (Vehicle vehicle : this.vehicles) {
            i++;
            if (vehicle instanceof AirVehicle) {
                System.out.print(i + ". ");
                System.out.println(vehicle.getID());
            }
        }
        System.out.println("select an air vehicle:");
        String choice = input.nextLine();
        return ((AirVehicle) this.vehicles.get(Integer.parseInt(choice) - 1));
    }

    public Bus selectBus() {
        int i = 1;
        for (Vehicle vehicle : this.vehicles) {
            i++;
            if (vehicle instanceof Bus) {
                System.out.print(i + ". ");
                System.out.println(vehicle.getID());
            }
        }
        System.out.println("select a bus:");
        String choice = input.nextLine();
        return ((Bus) this.vehicles.get(Integer.parseInt(choice) - 1));
    }

    public Train selectTrain() {
        int i = 1;
        for (Vehicle vehicle : this.vehicles) {
            i++;
            if (vehicle instanceof Train) {
                System.out.print(i + ". ");
                System.out.println(vehicle.getID());
            }
        }
        System.out.println("select an air vehicle:");
        String choice = input.nextLine();
        return ((Train) this.vehicles.get(Integer.parseInt(choice) - 1));
    }

    public SeaVehicle selectSeaVehicle() {
        int i = 1;
        for (Vehicle vehicle : this.vehicles) {
            i++;
            if (vehicle instanceof SeaVehicle) {
                System.out.print(i + ". ");
                System.out.println(vehicle.getID());
            }
        }
        System.out.println("select an air vehicle:");
        String choice = input.nextLine();
        return ((SeaVehicle) this.vehicles.get(Integer.parseInt(choice) - 1));
    }

    public void buyAirVehicle(Airport airport) {
        AirVehicle airVehicle = selectAirVehicle();
        if (airVehicle.getPrice() > this.budget) {
            System.out.println("you are low on budget");
        } else {
            airport.addVehicle(airVehicle);
            this.budget -= airVehicle.getPrice();
            System.out.println("Successfully added");
        }
    }

    public void buyBus(BusTerminal busTerminal) {
        Bus bus = selectBus();
        if (bus.getPrice() > this.budget) {
            System.out.println("you are low on budget");
        } else {
            busTerminal.addVehicle(bus);
            this.budget -= bus.getPrice();
            System.out.println("Successfully added");
        }
    }

    public void buyTrain(TrainStation trainStation) {
        Train train = selectTrain();
        if (train.getPrice() > this.budget) {
            System.out.println("you are low on budget");
        } else {
            trainStation.addVehicle(train);
            this.budget -= train.getPrice();
            System.out.println("Successfully added");
        }
    }

    public void buySeaVehicle(Port port) {
        SeaVehicle seaVehicle = selectSeaVehicle();
        if (seaVehicle.getPrice() > this.budget) {
            System.out.println("you are low on budget");
        } else {
            port.addVehicle(seaVehicle);
            this.budget -= seaVehicle.getPrice();
            System.out.println("Successfully added");
        }
    }
    // public void showAirportAirVehicles(Airport airport) {
    //     for (AirVehicle airVehicle : airport.getAirVehicles()) {
    //         System.out.println(airVehicle.getID());
    //     }
    // }



    // public void showAirportAirVehicles(Airport airport) {
    //     for (AirVehicle airVehicle : airport.getAirVehicles()) {
    //         System.out.println(airVehicle.getID());
    //     }
    // }


    public void showPeople() {
        int i = 1;
        for (Person person : this.persons) {
            System.out.print(i + ". ");
            System.out.println(person.getLastName());
        }
    }

    public Person selectPerson() {
        showPeople();
        System.out.println("select a person:");
        String choice = input.nextLine();
        return this.persons.get(Integer.parseInt(choice) - 1);
    }

    public void hireEmployee(Terminal terminal) {
        Person person = selectPerson();
        terminal.addEmployee(person);
        System.out.println("Successfully hired");
    }

    public void showEmployees(Terminal terminal) {
        for (Person person : terminal.getEmployees()) {
            System.out.println(person.getLastName());
        }
    }

    // public void buildHotel() {
    //     Hotel hotel = getHotelFromUser();
    //     if (hotel.getCost() > this.budget) {
    //         System.out.println("low on budget");
    //     } else {
    //         this.budget -= hotel.getCost();
    //         hotels.add(hotel);
    //         System.out.println("successfully built");
    //     }
        
    // }

    public void showHotels() {
        int i = 1;
        for (Hotel hotel : this.hotels) {
            System.out.print(i + ". ");
            System.out.println(hotel.getName());
        }
    }

//     public Hotel getHotelFromUser() {
//         System.out.print("Please Enter Hotel info:\nenter cost:");
//         double cost = input.nextDouble();
//         input.nextLine();
//         System.out.print("Enter city:");
//         String city = input.nextLine();
//         System.out.print("Enter the name:");
//         String name = input.nextLine();
//         System.out.print("Enter address:");
//         String address = input.nextLine();
//         System.out.print("Enter the area:");
//         double area = input.nextDouble();
//         input.nextLine();

//         System.out.println("Is this an international Airport?\n1. YES\n2. NO");
//         boolean international = false;
//         if (input.nextLine().equals("1")) {
//             international = true;
//         }
//         System.out.print("Enter number of runways:");
//         int numberOfRunways = input.nextInt();
//         input.nextLine();

//         return new Hotel(name, cost, address, stars, roomCount, rooms, facilities);  
//     }
}
