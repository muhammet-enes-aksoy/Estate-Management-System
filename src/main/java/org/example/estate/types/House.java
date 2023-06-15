package org.example.estate.types;

import org.example.Estate;

public class House extends Estate {

    // Extended class all parameters
    public House(double price, double area, int roomCount, int livingRoomCount) {
        super(price, area, roomCount, livingRoomCount);
    }

    // Cretead override funcitons for string type
    @Override
    public String getType() {
        return "House";
    }
}