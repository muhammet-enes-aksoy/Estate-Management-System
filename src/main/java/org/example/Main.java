package org.example;

import org.example.UI.UI;
import org.example.estate.types.House;
import org.example.estate.types.SummerHouse;
import org.example.estate.types.Villa;
import org.example.service.EstateService;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        UI ui = new UI();

        // Created estate list and added estate types
        List<Estate> estateList = new ArrayList<>();

        estateList.add(new House(140000, 100, 1, 1));
        estateList.add(new House(160000, 120, 2, 1));
        estateList.add(new House(180000, 140, 3, 2));

        estateList.add(new Villa(300000, 200, 4, 2));
        estateList.add(new Villa(320000, 300, 6, 3));
        estateList.add(new Villa(340000, 400, 7, 4));

        estateList.add(new SummerHouse(200000, 160, 2, 1));
        estateList.add(new SummerHouse(260000, 180, 4, 2));
        estateList.add(new SummerHouse(280000, 200, 4, 3));

        // Component-based architecture
        ui.printOutput(estateList);


    }
}