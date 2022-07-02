package Main;

import java.util.ArrayList;
import java.util.Scanner;

import Main.Buildings.*;
import Main.Vehicles.*;


public class City {
    private ArrayList<Person> persons;
    private ArrayList<Hotel> hotels;
    private final ArrayList<Vehicle> vehicles;
    private final ArrayList<Terminal> terminals;
    private int population;
    private double budget;
    private static final Scanner input = new Scanner(System.in);


    public City(double budget) {
        this.persons = new ArrayList<>();
        this.hotels = new ArrayList<>();
        this.terminals = new ArrayList<>();
        this.vehicles = new ArrayList<>();
        this.population = 0;
        this.budget = budget;
    }

    @Override
    public String toString() {
        return  "population: " + population + '\n' +
                "budget: " + budget;
    }

    public void showData() {
        System.out.println(this);
        System.out.println("Terminals:=============");
        this.showTerminals();
        System.out.println("Vehicles:================");
        this.showVehicles();
        System.out.println("Hotels:================");
        this.showHotels();
        System.out.println("//////////////////////////");
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
        boolean international = input.nextLine().equals("1");
        System.out.print("Enter number of runways:");
        int numberOfRunways = input.nextInt();
        input.nextLine();

        return new Airport(cost, this, name, address, area, international, numberOfRunways);
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


        return new BusTerminal(cost, this, name, address, area);
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

        return new Port(cost, this, name, address, area, numberOfDocks);
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

        return new TrainStation(cost, this, name, address, area, inRails, outRails);
    }

    public void chooseTerminal() {
        System.out.println("""
                What kind of terminal do you want to build?
                1. Airport
                2. Bus Terminal
                3. Port
                4. Train Station""");
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

    public void showTerminals() {
        int i = 1;
        for (Terminal terminal : this.terminals) {
            if (terminal instanceof Airport airport) {
                System.out.print(i++ + ". ");
                System.out.println(airport);
            } else if (terminal instanceof BusTerminal busTerminal) {
                System.out.print(i++ + ". ");
                System.out.println(busTerminal);
            } else if (terminal instanceof Port port) {
                System.out.print(i++ + ". ");
                System.out.println(port);
            } else if (terminal instanceof TrainStation trainStation) {
                System.out.print(i++ + ". ");
                System.out.println(trainStation);
            }
            System.out.println("=========");
        }
    }

    public Terminal selectTerminal() {
        showTerminals();
        System.out.println("select a terminal:");
        String choice = input.nextLine();
        return this.terminals.get(Integer.parseInt(choice) - 1);
    }

    public void showVehicles() {
        int i = 1;
        for (Vehicle vehicle : this.vehicles) {
            System.out.print(i++ + ". ");
            System.out.println(vehicle.toString());
            System.out.println("=============");
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

     public void showTerminalVehicles() {
         Terminal terminal = selectTerminal();
         if (terminal instanceof Airport airport) {
             int i = 1;
             for (Vehicle vehicle : airport.getAirVehicles()) {
                 System.out.print(i++ + ". ");
                 System.out.println(vehicle.toString());
                 System.out.println("=============");
             }
         } else if (terminal instanceof BusTerminal busTerminal) {
             int i = 1;
             for (Vehicle vehicle : busTerminal.getBuses()) {
                 System.out.print(i++ + ". ");
                 System.out.println(vehicle.toString());
                 System.out.println("=============");
             }
         } else if (terminal instanceof Port port) {
             int i = 1;
             for (Vehicle vehicle : port.getSeaVehicles()) {
                 System.out.print(i++ + ". ");
                 System.out.println(vehicle.toString());
                 System.out.println("=============");
             }
         } else if (terminal instanceof TrainStation trainStation) {
             int i = 1;
             for (Vehicle vehicle : trainStation.getTrains()) {
                 System.out.print(i++ + ". ");
                 System.out.println(vehicle.toString());
                 System.out.println("=============");
             }
         }
     }

    public void showPeople() {
        int i = 1;
        for (Person person : this.persons) {
            System.out.print(i++ + ". ");
            System.out.println(person.toString());
            System.out.println("==============");
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
        if (person.getSalary() > this.budget) {
            System.out.println("low on budget cannot afford salary");
            return;
        }
        terminal.addEmployee(person);
        this.persons.remove(person);
        System.out.println("Successfully hired");
    }

    public void showEmployees(Terminal terminal) {
        for (Person person : terminal.getEmployees()) {
            System.out.println(person.toString());
            System.out.println("===========");
        }
    }

     public void buildHotel() {
         Hotel hotel = getHotelFromUser();
         if (hotel.getCost() > this.budget) {
             System.out.println("low on budget");
         } else {
             this.budget -= hotel.getCost();
             hotels.add(hotel);
             System.out.println("successfully built");
         }
     }

    public void showHotels() {
        int i = 1;
        for (Hotel hotel : this.hotels) {
            System.out.print(i++ + ". ");
            System.out.println(hotel.toString());
            System.out.println("==========");
        }
    }

     public Hotel getHotelFromUser() {
         System.out.print("Please Enter Hotel info:\nenter cost:");
         double cost = input.nextDouble();
         input.nextLine();
         System.out.print("Enter the name:");
         String name = input.nextLine();
         System.out.print("Enter address:");
         String address = input.nextLine();
         System.out.print("Enter the stars:");
         int stars = input.nextInt();
         input.nextLine();

         return new Hotel(name, cost, address, stars, Facilities.RESTAURANT);
     }

    public HotelRoom getHotelRoomFromUser() {
        System.out.print("Please Enter Hotel Room info:\nenter cost: ");
        double price = input.nextDouble();
        input.nextLine();
        System.out.print("Enter the room number: ");
        int roomNumber = input.nextInt();
        input.nextLine();
        System.out.print("Enter bed count: ");
        int bedCount = input.nextInt();
        input.nextLine();
        System.out.print("Enter the area: ");
        double area = input.nextDouble();
        input.nextLine();

        return new HotelRoom(roomNumber, bedCount, area, price);
    }

    public Hotel selectHotel() {
        showHotels();
        System.out.println("select a hotel:");
        String choice = input.nextLine();
        return this.hotels.get(Integer.parseInt(choice) - 1);
    }

    public void buyHotelRoom() {
        Hotel hotel = selectHotel();
        HotelRoom hotelRoom = getHotelRoomFromUser();
        if (hotelRoom.getPrice() > this.budget) {
            System.out.println("you are low on budget");
        } else {
            hotel.addHotelRoom(hotelRoom);
            this.budget -= hotelRoom.getPrice();
            System.out.println("Successfully added");
        }
    }

    public void showHotelRooms() {
        Hotel hotel = selectHotel();
        for (HotelRoom hotelRoom : hotel.getRooms()) {
            System.out.println(hotelRoom.toString());
            System.out.println("===========");
        }
    }

    public void vehicleBuyingPanel(Terminal terminal) {
        if (terminal instanceof Airport) {
            this.buyAirVehicle((Airport) terminal);
        } else if (terminal instanceof BusTerminal) {
            this.buyBus((BusTerminal) terminal);
        } else if (terminal instanceof Port) {
            this.buySeaVehicle((Port) terminal);
        } else if (terminal instanceof TrainStation) {
            this.buyTrain((TrainStation) terminal);
        }
    }
}
