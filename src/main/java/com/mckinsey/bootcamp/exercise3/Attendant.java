package com.mckinsey.bootcamp.exercise3;

import java.util.ArrayList;
import java.util.List;

public class Attendant {

    private List<ParkingLot> parkingLot;

    public Attendant () {
        this.parkingLot = new ArrayList<>();
    }
    public boolean park(Object car) {
        for(int itr = 0;itr < this.parkingLot.size();itr++)
            if (parkingLot.get(itr).park(car))
                return true;
        return false;
    }

    public void manageParkingLot(ParkingLot parkingLot) {
        this.parkingLot.add(parkingLot);
    }
}
