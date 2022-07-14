package com.mckinsey.bootcamp.exercise3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AttendantTest {
    @Test
    public void attendantShouldParkVehicleWhenParkingLotIsNotFull() {
        ParkingLot parkingLot = new ParkingLot(1);
        Attendant attendant = new Attendant();
        attendant.manageParkingLot(parkingLot);
        Object vehicle = new Object();

        boolean parkingResult = attendant.park(vehicle);

        assertTrue(parkingResult);
    }

    @Test
    public void attendantShouldNotBeAbleToParkVehicleWhenParkingLotIsFull() {
        ParkingLot parkingLot = new ParkingLot(1);
        Attendant attendant = new Attendant();
        attendant.manageParkingLot(parkingLot);
        Object maruti = new Object();
        attendant.park(maruti);
        Object honda = new Object();

        boolean parkingResult = attendant.park(honda);

        assertFalse(parkingResult);
    }
}
