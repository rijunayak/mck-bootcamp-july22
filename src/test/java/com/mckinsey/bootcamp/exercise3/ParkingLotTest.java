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
        Object maruti = new Object();
        boolean actual = parking.park(maruti);

        assertTrue(actual);
    }


    @Test
    public void ShouldNotParkWhenSpaceWillFull() {
        ParkingLot parking = new ParkingLot(1);
        Object maruti = new Object();
        boolean actual = parking.park(maruti);
        assertTrue(actual);

        Object ford = new Object();
        actual = parking.park(ford);

        assertFalse(actual);
    }


    @Test
    public void shouldUnParkWhenVehicleAvailable() {
        ParkingLot parking = new ParkingLot(1);
        Object maruti = new Object();
        boolean actual = parking.park(maruti);

        assertTrue(actual);
        actual = parking.unPark(maruti);

        assertTrue(actual);
    }


    @Test
    public void shouldNotUnParkWhenVehicleNotAvailable() {
        ParkingLot parking = new ParkingLot(0);

        Object maruti = new Object();
        boolean actual = parking.unPark(maruti);

        assertFalse(actual);
    }

    @Test
    public void shouldNotUnParkWhenOneVehicleParkAndTwoVehicleTryToUnPark() {
        ParkingLot parking = new ParkingLot(2);
        Object maruti = new Object();
        assertTrue(parking.park(maruti));
        assertTrue(parking.unPark(maruti));

        Object ford = new Object();
        assertFalse(parking.unPark(ford));
    }

    @Test
    public void shouldNotifyWhenParkingLotIsFull() {
        //Assign
        ParkingLot parking = new ParkingLot(1);
        TestParkingLotListener owner = new TestParkingLotListener();
        parking.addListener(owner);
        Object maruti = new Object();
        parking.park(maruti);
        assertTrue(owner.wasNotified());
    }


    @Test
    public void shouldNotNotifyOnParkWhenParkingLotIsNotFull() {
        //Assign
        ParkingLot parking = new ParkingLot(2);
        TestParkingLotListener owner = new TestParkingLotListener();
        parking.addListener(owner);

        Object maruti = new Object();
        parking.park(maruti);
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

        Object maruti = new Object();
        parking.park(maruti);

        assertTrue(owner.wasNotified());
        assertTrue(trafficPolice.wasNotified());
    }



}
