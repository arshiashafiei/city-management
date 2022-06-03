package Main.Vehicles;

public class Train extends GroundVehicle {
    private int numberOFWagons;
    private int stars;
    private Facilities facilities;

    public Train(double price, double capacity, String factory, double cargoCapacity, boolean camera, double efficiency, int numberOFWagons, int stars) {
        super(price, capacity, factory, cargoCapacity, camera, efficiency);
        this.numberOFWagons = numberOFWagons;
        this.stars = stars;
        // this.facilities = facilities;
    }

    public int getNumberOFWagons() {
        return this.numberOFWagons;
    }

    public void setNumberOFWagons(int numberOFWagons) {
        this.numberOFWagons = numberOFWagons;
    }

    public int getStars() {
        return this.stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public Facilities getFacilities() {
        return this.facilities;
    }

    public void setFacilities(Facilities facilities) {
        this.facilities = facilities;
    }
    
}
