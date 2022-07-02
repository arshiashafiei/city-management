package Main.Buildings;

import java.util.ArrayList;

import Main.City;
import Main.Vehicles.Train;

public class TrainStation extends Terminal {
    private int inRails;
    private int outRails;
    private ArrayList<Train> trains;


    public TrainStation(double cost, City city, String name, String address, double area, int inRails, int outRails) {
        super(cost, city, name, address, area);
        this.inRails = inRails;
        this.outRails = outRails;
        this.trains = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "TrainStation" + '\n' +
                "inRails: " + inRails + '\n' +
                "outRails: " + outRails + '\n' +
                super.toString();
    }

    public int getInRails() {
        return this.inRails;
    }

    public void setInRails(int inRails) {
        this.inRails = inRails;
    }

    public int getOutRails() {
        return this.outRails;
    }

    public void setOutRails(int outRails) {
        this.outRails = outRails;
    }

    public ArrayList<Train> getTrains() {
        return this.trains;
    }

    public void setTrains(ArrayList<Train> trains) {
        this.trains = trains;
    }

    public void addVehicle(Train train) {
        this.trains.add(train);
        increaseNumberOfVehicles();
    }
    
}
