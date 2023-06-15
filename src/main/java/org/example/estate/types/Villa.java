package org.example.estate.types;

public class Villa extends House {

    // Extended class all parameters
    public Villa(double price, double area, int roomCount, int livingRoomCount) {
        super(price, area, roomCount, livingRoomCount);
    }

    // Cretead override funcitons for string type
    @Override
    public String getType() {
        return "Villa";
    }
}