package com.mckinsey.bootcamp.exercise3;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ParkingLotTest {
    class TestParkingLotListener implements ParkingLotListener {
        boolean isNotified = false;
        @Override
        public void notifyParkingLotFull() {
            isNotified = true;
        }
        public boolean wasNotified() {
            return isNotified;
        }
    }

    @Test
    public void parkingShouldBeSuccessfulWhenLotIsEmpty() {
        //Arrange
        ParkingLot parkingLot = new ParkingLot(10);
        Object car = new Object();

        //Assert
        assertTrue(parkingLot.park(car));
    }

    @Test
    public void parkingLotWithCapacityFiveShouldBeNotBeAbleToParkMoreThanFiveVehicles() {
        //Arrange
        ParkingLot parkingLot = new ParkingLot(2);
        Object carOne = new Object();
        Object carTwo = new Object();
        Object carThree = new Object();

        assertTrue(parkingLot.park(carOne));
        assertTrue(parkingLot.park(carTwo));

        //Assert
        assertFalse(parkingLot.park(carThree));
    }

    @Test
    public void parkedVehicleShouldBeAbleToUnPark() {
        //Arrange
        ParkingLot parkingLot = new ParkingLot(5);
        Object car = new Object();
        parkingLot.park(car);

        //Assert
        assertTrue(parkingLot.unPark(car));
    }

    @Test
    public void userShouldNotBeAbleToUnParkWhenNoVehicleIsParked() {
        //Arrange
        ParkingLot parkingLot = new ParkingLot(5);
        Object car = new Object();

        //Assert
        assertFalse(parkingLot.unPark(car));
    }
    @Test
    public void ownerShouldBeNotifiedWhenTheLotBecomesFull() {
        //Arrange
        TestParkingLotListener testParkingLotListener = new TestParkingLotListener();
        ParkingLot parkingLot = new ParkingLot(2);
        parkingLot.addListener(testParkingLotListener);
        Object carOne = new Object();
        Object carTwo = new Object();

        //Act
        parkingLot.park(carOne);
        parkingLot.park(carTwo);

        //Assert
        assertTrue(testParkingLotListener.wasNotified());
    }
    @Test
    public void ownerShouldNotBeNotifiedWhenTheLotIsNotFull() {
        //Arrange
        TestParkingLotListener owner = new TestParkingLotListener();
        ParkingLot parkingLot = new ParkingLot(2);
        parkingLot.addListener(owner);
        Object car = new Object();

        //Act
        parkingLot.park(car);

        //Assert
        assertFalse(owner.wasNotified());
    }
    @Test
    public void trafficPoliceAndOwnerShouldBeNotifiedWhenTheLotIsFull() {
        //Arrange
        TestParkingLotListener owner = new TestParkingLotListener();
        TestParkingLotListener trafficPolice = new TestParkingLotListener();
        ParkingLot parkingLot = new ParkingLot(2);
        parkingLot.addListener(owner);
        parkingLot.addListener(trafficPolice);
        Object carOne = new Object();
        Object carTwo = new Object();

        //Act
        parkingLot.park(carOne);
        parkingLot.park(carTwo);

        //Assert
        assertTrue(owner.wasNotified());
        assertTrue(trafficPolice.wasNotified());
    }


}
