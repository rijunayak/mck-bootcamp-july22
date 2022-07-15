package com.mckinsey.bootcamp.exercise3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AttendantTest {
    ParkingLot parkingLot;

    @BeforeEach
    public void calledBeforeEveryTestCase(){
        parkingLot = new ParkingLot(2);
    }

    @Test
    public void attendantShouldParkTheCarInTheOnlyParkingLot(){
        Attendant attendant = new Attendant();
        attendant.manageParkingLot(parkingLot);
        Object carOne = new Object();

        boolean parkingResult = attendant.park(carOne);

        assertTrue(parkingResult);
    }

    @Test
    public void attendantShouldNotParkTheCarIfTheOnlyParkingLotIsFull()
    {
        ParkingLot parkingLot = new ParkingLot(1);
        Attendant attendant = new Attendant();
        attendant.manageParkingLot(parkingLot);
        Object carOne = new Object();
        Object carTwo = new Object();

        attendant.park(carOne);

        boolean parkingResult = attendant.park(carTwo);

        assertFalse(parkingResult);
    }

    @Test
    public void attendantShouldParkTheCarIfAnyOfTheParkingLotsIsNotFull()
    {
        ParkingLot parkingLotOne = new ParkingLot(1);
        ParkingLot parkingLotTwo = new ParkingLot(1);
        Attendant attendant = new Attendant();
        attendant.manageParkingLot(parkingLotOne);
        attendant.manageParkingLot(parkingLotTwo);
        Object carOne = new Object();
        Object carTwo = new Object();

        boolean parkingResultCarOne = attendant.park(carOne);
        boolean parkingResultCarTwo = attendant.park(carTwo);

        assertTrue(parkingResultCarOne);
        assertTrue(parkingResultCarTwo);
    }
}
