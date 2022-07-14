package com.mckinsey.bootcamp.excercise3;

import java.util.ArrayList;

public class Attendant {

    private ParkingLot parkingLot;
    ArrayList<ParkingLot> availableLots = new ArrayList<>();

    public boolean park(Object vehicle) {

        if(parkingLot.park(vehicle)){
            return true;
        }
        return false;
    }

    public void manageParkingLot(ParkingLot parkingLot) {

//        this.parkingLot = parkingLot;
        availableLots.add(parkingLot);
    }
}
