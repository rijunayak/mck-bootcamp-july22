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
        Object carOne = new Object();
        parkingLot.Park(carOne);
        Object carTwo = new Object();

        boolean carTwoResult = parkingLot.Park(carTwo);

        assertFalse(carTwoResult);
    }

    @Test
    public void unParkingShouldBeSuccessfulWhenVehicleIsParked() {
        ParkingLot parkingLot = new ParkingLot(1);
        Object carOne = new Object();
        parkingLot.Park(carOne);

        boolean carOneUnParkingResult = parkingLot.unPark(carOne);

        assertTrue(carOneUnParkingResult);
    }

    @Test
    public void shouldNotifyWhenParkingLotFull(){
        ParkingLot parkingLot = new ParkingLot(1);

        class Owner implements  ParkingLotListener {
            boolean isNotified;
            @Override
            public void notifyParkingLotFull() {
                    isNotified = true;
            }
            public boolean wasNotified(){
                return isNotified;
            }
        };
        Owner owner = new Owner();
        parkingLot.addListener(owner);

        Object carOne = new Object();
        parkingLot.Park(carOne);

        assertTrue(owner.wasNotified());


    }

}
