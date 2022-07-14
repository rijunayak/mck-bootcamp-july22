package com.mckinsey.bootcamp.exercise3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ParkingLotTest {

    class TestParkingLotListener implements ParkingLotListener {
        boolean isNotified = false;

        @Override
        public void NotifyFullParkingListener() {
            isNotified = true;
        }

        public boolean wasNotified() {
            return isNotified;
        }
    }

    ;

    @Test
    public void ShouldBeParkWhenSpaceWillAvailable() {
        ParkingLot parking = new ParkingLot(1);

        boolean actual = parking.park();

        assertTrue(actual);
    }


    @Test
    public void ShouldNotParkWhenSpaceWillFull() {
        ParkingLot parking = new ParkingLot(1);

        boolean actual = parking.park();

        assertTrue(actual);
        actual = parking.park();

        assertFalse(actual);
    }


    @Test
    public void shouldUnParkWhenVehicleAvailable() {
        ParkingLot parking = new ParkingLot(1);

        boolean actual = parking.park();

        assertTrue(actual);
        actual = parking.unPark();

        assertTrue(actual);
    }


    @Test
    public void shouldNotUnParkWhenVehicleNotAvailable() {
        ParkingLot parking = new ParkingLot(0);

        boolean actual = parking.unPark();

        assertFalse(actual);
    }

    @Test
    public void shouldNotUnParkWhenOneVehicleParkAndTwoVehicleTryToUnPark() {
        ParkingLot parking = new ParkingLot(2);

        assertTrue(parking.park());
        assertTrue(parking.unPark());

        assertFalse(parking.unPark());
    }

    @Test
    public void shouldNotifyWhenParkingLotIsFull() {
        //Assign
        ParkingLot parking = new ParkingLot(1);
        TestParkingLotListener owner = new TestParkingLotListener();
        parking.addListener(owner);
        parking.park();
        assertTrue(owner.wasNotified());
    }


    @Test
    public void shouldNotNotifyOnParkWhenParkingLotIsNotFull() {
        //Assign
        ParkingLot parking = new ParkingLot(2);
        TestParkingLotListener owner = new TestParkingLotListener();
        parking.addListener(owner);
        parking.park();
        assertFalse(owner.wasNotified());
    }
    @Test
    public void shouldNotNotifyOnParkWhenParkingLotIsEmpty() {
        //Assign
        ParkingLot parking = new ParkingLot(2);
        TestParkingLotListener owner = new TestParkingLotListener();
        parking.addListener(owner);
        assertFalse(owner.wasNotified());
    }
    @Test
    public void shouldNotifyToTrafficPoliceAndOwnerWhenParkingLotIsFull() {
        //Assign
        ParkingLot parking = new ParkingLot(1);
        TestParkingLotListener owner = new TestParkingLotListener();
        TestParkingLotListener trafficPolice = new TestParkingLotListener();
        parking.addListener(owner);
        parking.addListener(trafficPolice);

        parking.park();

        assertTrue(owner.wasNotified());
        assertTrue(trafficPolice.wasNotified());
    }


}
