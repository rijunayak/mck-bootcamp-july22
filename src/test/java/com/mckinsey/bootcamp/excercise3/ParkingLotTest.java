package com.mckinsey.bootcamp.excercise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ParkingLotTest {

    @Test
    @DisplayName("Parking Should be successful when lot is empty")
    public void parkingShouldBeSuccessfulWhenLotIsEmpty() {
        ParkingLot parkinglot = new ParkingLot(10);
        Object vehicle = new Object();

        assertTrue(parkinglot.park(vehicle));
    }

    @Test
    public void parkingShouldBeSuccessfulWithExistingVehicles() {
        ParkingLot parkinglot = new ParkingLot(1);
        Object vehicle = new Object();

        assertTrue(parkinglot.park(vehicle));
    }

    @Test
    public void unParkingShouldFailWhenVehicleIsNotParked() {
        ParkingLot parkinglot = new ParkingLot(1);
        Object vehicle = new Object();

        assertFalse(parkinglot.unPark(vehicle));
    }

    @Test
    public void unParkingShouldBeSuccessfulWhenCarIsParked() {
        ParkingLot parkinglot = new ParkingLot(1);
        Object vehicle = new Object();

        parkinglot.park(vehicle);

        assertTrue(parkinglot.unPark(vehicle));
    }
//    ParkingLotListener parkingLotListener = new owner();

    @Test
    public void notifyOwnerWhenParkingIsFull() {
        ParkingLot parkingLot = new ParkingLot(1);

        class Owner implements ParkingLotListener {
            boolean isNotified;

            @Override
            public void notifyParkingLotFull() {
                isNotified = true;
            }

            public boolean wasNotified() {
                return isNotified;
            }
        }
        ;
        Owner owner = new Owner();
        parkingLot.addListener(owner);

        Object vehicle = new Object();
        parkingLot.park(vehicle);

        assertTrue(owner.wasNotified());
    }


}
