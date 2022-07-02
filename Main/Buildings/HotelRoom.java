package Main.Buildings;

public class HotelRoom {
    private int roomNumber;
    private int bedCount;
    private double area;
    private double price;


    public HotelRoom(int roomNumber, int bedCount, double area, double price) {
        this.roomNumber = roomNumber;
        this.bedCount = bedCount;
        this.area = area;
        this.price = price;
    }

    @Override
    public String toString() {
        return  "roomNumber=" + roomNumber + '\n' +
                ", bedCount=" + bedCount + '\n' +
                ", area=" + area + '\n' +
                ", price=" + price;
    }

    public int getRoomNumber() {
        return this.roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getBedCount() {
        return this.bedCount;
    }

    public void setBedCount(int bedCount) {
        this.bedCount = bedCount;
    }

    public double getArea() {
        return this.area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    
}
