package org.example;

public abstract class Estate {
    double price;
    double area;
    int roomCount;
    int livingRoomCount;

    public Estate(double price, double area, int roomCount, int livingRoomCount) {
        this.price = price;
        this.area = area;
        this.roomCount = roomCount;
        this.livingRoomCount = livingRoomCount;
    }

    // Created getter functions
    public double getPrice() {
        return price;
    }

    public double getArea() {
        return area;
    }

    public abstract String getType();

    public int getRoomCount() {
        return roomCount;
    }

    public int getLivingRoomCount() {
        return livingRoomCount;
    }
}