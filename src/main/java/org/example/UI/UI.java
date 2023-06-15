package org.example.UI;

import org.example.Estate;
import org.example.service.EstateService;

import java.util.List;
import java.util.Scanner;

public class UI {

    public void printOutput(List<Estate> estateList){
        // Crated estate service use to functions
        EstateService estateService = new EstateService(estateList);
        System.out.println("Please select:" +
                "\n1-House List" +
                "\n2-Summerhouse List" +
                "\n3-Villa List" +
                "\n4-All Houses Details" +
                "\n5-Filter House ");
        Scanner input = new Scanner(System.in);
        int selected;
        selected = input.nextInt();
        // Created select menu
        while(true){
            switch (selected){

                // Print house properties
                case 1:
                    System.out.println("-HOUSE LIST-");
                    printCase(estateService, estateList, "House");

                    break;

                // Print summerhouse properties
                case 2:
                    System.out.println("-SUMMERHOUSE LIST-");
                    printCase(estateService, estateList, "SummerHouse");
                    break;

                // Print villa properties
                case 3:
                    System.out.println("-VILLA LIST-");
                    printCase(estateService, estateList, "Villa");

                    break;

                // Print all house properties
                case 4:

                    System.out.println("-----------------------------------------------------");
                    System.out.println("Total price of all houses: $" + estateService.getTotalPrice());
                    System.out.println("Average square meters of all houses: " + estateService.getAverageArea());
                    System.out.println("-----------------------------------------------------");

                    break;

                // Print filtered house
                case 5:

                    Scanner count = new Scanner(System.in);
                    System.out.println("-----------------------------------------------------");
                    System.out.println("Select room count: ");
                    int roomCount = count.nextInt();
                    System.out.println("Select living room count: ");
                    int livingRoomCount = count.nextInt();
                    List<Estate> filteredHouses = estateService.filterByRoomAndLivingRoom(estateList,roomCount, livingRoomCount);
                    System.out.println("Houses with " + roomCount + " rooms and " + livingRoomCount + " living rooms:");
                    for (Estate estate : filteredHouses) {
                        System.out.println(estate.getType() + " : $" + estate.getPrice() + " - " + estate.getArea() + " square meters");
                    }
                    System.out.println("-----------------------------------------------------");

                    break;
                default :
                    System.out.println("Please select:" +
                            "\n1-House List" +
                            "\n2-Summerhouse List" +
                            "\n3-Villa List" +
                            "\n4-All Houses Details" +
                            "\n5-Filter House ");
                    selected = input.nextInt();
                    break;
            }
            System.out.println("Please select:" +
                    "\n1-House List" +
                    "\n2-Summerhouse List" +
                    "\n3-Villa List" +
                    "\n4-All Houses Details" +
                    "\n5-Filter House ");

            selected = input.nextInt();
        }

    }

    // Created print function for estate types
    public void printCase(EstateService estateService, List<Estate> estateList, String type){
        for (Estate estate : estateService.getListByType(estateList, type)) {

            System.out.println("-----------------------------------------------------");
            System.out.println("Price : $" + estate.getPrice());
            System.out.println("Square Meter : " + estate.getArea());
            System.out.println("Room Count : " + estate.getRoomCount());
            System.out.println("Living Room Count : " + estate.getLivingRoomCount());
        }
        System.out.println("-----------------------------------------------------");
        System.out.println("Total price of houses: $" + estateService.getTotalPriceByType(type));
        System.out.println("Average square meters of houses: " + estateService.getAverageAreaByType(type));
        System.out.println("-----------------------------------------------------");
    }
}
