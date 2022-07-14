package com.mckinsey.bootcamp.exercise3;

import java.util.ArrayList;
import java.util.List;

public class Attendant {

    private ParkingLot parkingLot;

    public boolean park(Object car) {
        return parkingLot.park(car);
    }

    public void manageParkingLot(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }
}
