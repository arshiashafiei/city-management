package Main.Buildings;

import java.util.ArrayList;

import Main.Vehicles.Facilities;

public class Hotel {
    private String name;
    private double cost;
    private String address;
    private int stars;
    private int roomCount;
    private ArrayList<HotelRoom> rooms;
    private Facilities facilities;


    public Hotel(String name, double cost, String address, int stars, int roomCount, ArrayList<HotelRoom> rooms, Facilities facilities) {
        this.name = name;
        this.cost = cost;
        this.address = address;
        this.stars = stars;
        this.roomCount = roomCount;
        this.rooms = rooms;
        this.facilities = facilities;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return this.cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getStars() {
        return this.stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public int getRoomCount() {
        return this.roomCount;
    }

    public void setRoomCount(int roomCount) {
        this.roomCount = roomCount;
    }

    public ArrayList<HotelRoom> getRooms() {
        return this.rooms;
    }

    public void setRooms(ArrayList<HotelRoom> rooms) {
        this.rooms = rooms;
    }

    public Facilities getFacilities() {
        return this.facilities;
    }

    public void setFacilities(Facilities facilities) {
        this.facilities = facilities;
    }




}
