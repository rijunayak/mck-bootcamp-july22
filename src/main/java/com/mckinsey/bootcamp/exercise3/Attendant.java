package com.mckinsey.bootcamp.exercise3;

import java.util.ArrayList;
import java.util.List;

public class Attendant {
    private List<ParkingLot> parkingLotList = new ArrayList<>();

    public boolean park(Object car) {
        for (ParkingLot parkingLot : parkingLotList) {
            if (parkingLot.Park(car))
                return true;
        }
        return false;
    }

    public void manageParkingLot(ParkingLot parkingLot) {
        this.parkingLotList.add(parkingLot);
    }
}
