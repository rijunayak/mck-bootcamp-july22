package com.mckinsey.bootcamp.exercise3;

import java.util.ArrayList;

public class Attendant {

    private ArrayList<ParkingLot> parkingLots = new ArrayList<>();

    public void manageParkingLot(ParkingLot parkingLot) {
        this.parkingLots.add(parkingLot);
    }

    public int parkAtParkingLot(Object vehicle) {
        int parkingLotNo = 0;
        for(ParkingLot parkingLot : parkingLots){
            parkingLotNo += 1;
            if(parkingLot.park(vehicle)){
                return parkingLotNo;
            }
        }
        return 0;
    }
}
