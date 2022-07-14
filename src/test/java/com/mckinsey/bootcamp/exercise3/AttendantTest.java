package com.mckinsey.bootcamp.exercise3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AttendantTest {

    @Test
    public void attendantShouldBeAbleToParkAVehicleInTheOnlyParkingLot() {
        //Arrange
        ParkingLot parkingLot = new ParkingLot(5);
        Attendant attendant = new Attendant();
        attendant.manageParkingLot(parkingLot);
        Object car = new Object();

        //Assert
        assertTrue(attendant.park(car));
    }

    @Test
    public void attendantShouldNotBeAbleToParkAVehicleWhenTheOnlyParkingLotIsFull() {
        //Arrange
        ParkingLot parkingLot = new ParkingLot(1);
        Attendant attendant = new Attendant();
        attendant.manageParkingLot(parkingLot);
        Object carOne = new Object();
        Object carTwo = new Object();

        //Act
        assertTrue(attendant.park(carOne));

        //Assert
        assertFalse(attendant.park(carTwo));
    }


}
