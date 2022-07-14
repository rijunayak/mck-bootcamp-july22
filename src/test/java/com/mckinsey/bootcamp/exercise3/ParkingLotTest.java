package com.mckinsey.bootcamp.exercise3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ParkingLotTest {
    class TestParkingLotListener implements ParkingLotListener {
        boolean isNotified;
        @Override
        public void parkingLotListener() {
            isNotified = true;
        }
        public boolean wasNotified() {
            return isNotified;
        }
    }

    @Test
    public void parkingShouldBeSuccessfulWhenLotIsEmpty() {
        ParkingLot parkingLot = new ParkingLot(1);

        boolean parkResult = parkingLot.park(new Object());

        assertTrue(parkResult);
    }

    @Test
    public void parkingShouldBeUnSuccessfulWhenLotIsNotEmpty() {
        ParkingLot parkingLot = new ParkingLot(1);

        parkingLot.park(new Object());
        boolean carTwoResult = parkingLot.park(new Object());

        assertFalse(carTwoResult);
    }

    @Test
    public void unParkingShouldBeSuccessFullIfLotIsNotEmpty() {
        ParkingLot parkingLot = new ParkingLot(1);
        Object carOne = new Object();
        parkingLot.park(carOne);

        boolean carOneUnParkingResult = parkingLot.unPark(carOne);

        assertTrue(carOneUnParkingResult);
    }

    @Test
    public void ownerShouldBeNotifiedWhenParkingLotIsFull() {
        ParkingLot parkingLot = new ParkingLot(1);
        TestParkingLotListener owner = new TestParkingLotListener();
        parkingLot.addListener(owner);
        Object carOne = new Object();
        parkingLot.park(carOne);

        assertTrue(owner.wasNotified());
    }
    @Test
    public void ownerShouldNotBeNotifiedWhenParkingLotIsNotFull() {
        ParkingLot parkingLot = new ParkingLot(2);
        TestParkingLotListener owner = new TestParkingLotListener();
        parkingLot.addListener(owner);
        Object carOne = new Object();
        parkingLot.park(carOne);

        assertFalse(owner.wasNotified());
    }
    @Test
    public void trafficPoliceShouldBeNotifiedWhenParkingLotIsFull() {
        ParkingLot parkingLot = new ParkingLot(1);
        TestParkingLotListener owner = new TestParkingLotListener();
        TestParkingLotListener trafficPolice = new TestParkingLotListener();
        parkingLot.addListener(owner);
        parkingLot.addListener(trafficPolice);
        Object carOne = new Object();
        parkingLot.park(carOne);

        assertTrue(owner.wasNotified());
        assertTrue(trafficPolice.wasNotified());
    }
}
