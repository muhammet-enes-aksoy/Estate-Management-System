package org.example.service;

import org.example.Estate;
import org.example.estate.types.House;
import org.example.estate.types.SummerHouse;
import org.example.estate.types.Villa;

import java.util.ArrayList;
import java.util.List;

public class EstateService {
    private List<Estate> estateList;
    public EstateService(List<Estate> estateList) {
        this.estateList = estateList;
    }

    public <T extends Estate>List<T> getListByType(List<T> estates, String type) {
        return estates.stream().filter(estate -> estate.getType() == type).toList();
    }

    // Created get total price by type functions and return total price by type
    public double getTotalPriceByType(String type) {
        return estateList.stream().filter(estate -> estate.getType() == type).mapToDouble(estate -> estate.getPrice()).sum();
    }

    // Created get total price functions and return total price
    public double getTotalPrice() {
        return estateList.stream().mapToDouble(estate -> estate.getPrice()).sum();
    }

    // Created get average area by type functions and return total area by type
    public double getAverageAreaByType(String type) {
        return estateList.stream().filter(estate -> estate.getType() == type).mapToDouble(estate -> estate.getArea()).sum() / estateList.stream().filter(estate -> estate.getType() == type).count();
    }

    // Created get average area functions and return total area
    public double getAverageArea() {
        return estateList.stream().mapToDouble(estate -> estate.getArea()).sum() / estateList.size() ;
    }

    // Created filter by room and living room functions and return filtered house
    public <T extends Estate>List<T> filterByRoomAndLivingRoom(List<T> houses, int roomCount, int livingRoomCount) {
        return houses.stream().filter(response -> response.getRoomCount() == roomCount && response.getLivingRoomCount() == livingRoomCount).toList();
    }
}
