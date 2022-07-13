package com.mckinsey.bootcamp.exercise3;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ParkingLotTest {

    @Test
    public void parkingShouldBeSuccessfulWhenLotIsEmpty() {
        //Arrange
        ParkingLot parkingLot = new ParkingLot(10);

        //Assert
        assertTrue(parkingLot.park());
    }

    @Test
    public void parkingLotWithCapacityFiveShouldBeNotBeAbleToParkMoreThanFiveVehicles() {
        //Arrange
        ParkingLot parkingLot = new ParkingLot(5);

        for(int i=1;i<=5;i++) {
            assertTrue(parkingLot.park());
        }

        //Assert
        assertFalse(parkingLot.park());
    }

    @Test
    public void parkedVehicleShouldBeAbleToUnPark() {
        //Arrange
        ParkingLot parkingLot = new ParkingLot(5);
        assertTrue(parkingLot.park());

        //Assert
        assertTrue(parkingLot.unPark());
    }

    @Test
    public void shouldNotBeAbleToUnParkWhenNoVehicleIsParked() {
        //Arrange
        ParkingLot parkingLot = new ParkingLot(5);

        //Assert
        assertFalse(parkingLot.unPark());
    }

}
