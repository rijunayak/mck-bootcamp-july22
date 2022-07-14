package com.mckinsey.bootcamp.exercise3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ParkingLotTest {

    class TestParkingLotListener implements ParkingLotListener {
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
    public void shouldNotifyOwnerWhenParkingLotFull() {
        ParkingLot parkingLot = new ParkingLot(1);

        TestParkingLotListener testParkingLotListener = new TestParkingLotListener();
        parkingLot.addListener(testParkingLotListener);

        Object carOne = new Object();
        parkingLot.Park(carOne);

        assertTrue(testParkingLotListener.wasNotified());
    }

    @Test
    public void shouldNotNotifyOwnerWhenParkingLotNotFull(){
        ParkingLot parkingLot = new ParkingLot(2);

        TestParkingLotListener testParkingLotListener = new TestParkingLotListener();
        parkingLot.addListener(testParkingLotListener);

        Object carOne = new Object();
        parkingLot.Park(carOne);

        assertFalse(testParkingLotListener.wasNotified());
    }

    @Test
    public void shouldNotifyTrafficPoliceAndOwnerWhenParkingLotFull(){

        ParkingLot parkingLot = new ParkingLot(1);

        TestParkingLotListener owner = new TestParkingLotListener();
        TestParkingLotListener trafficPolice = new TestParkingLotListener();

        parkingLot.addListener(owner);
        parkingLot.addListener(trafficPolice);

        Object carOne = new Object();
        parkingLot.Park(carOne);

        assertTrue(owner.wasNotified());
        assertTrue(trafficPolice.wasNotified());

    }
}
