package com.mckinsey.bootcamp.exercise3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ParkingLotTest {


    @Test
    public void parkingShouldBeSuccessfulWhenLotIsEmpty() {
        ParkingLot parkingLot = new ParkingLot(1);

        boolean parkResult = parkingLot.Park(new Object());

        assertTrue(parkResult);
    }

    @Test
    public void parkingShouldBeUnSuccessfulWhenLotIsNotEmpty() {
        ParkingLot parkingLot = new ParkingLot(1);

        boolean carOneResult = parkingLot.Park(new Object());

        boolean carTwoResult = parkingLot.Park(new Object());

        assertFalse(carTwoResult);
    }

    @Test
    public void unParkingShouldBeSuccessfulWhenVehicleIsParked() {
        ParkingLot parkingLot = new ParkingLot(1);

        Object carOne = new Object();

        boolean carOneParkingResult = parkingLot.Park(carOne);

        boolean carOneUnParkingResult = parkingLot.unPark(carOne);

        assertTrue(carOneParkingResult);
        assertTrue(carOneUnParkingResult);
    }


}