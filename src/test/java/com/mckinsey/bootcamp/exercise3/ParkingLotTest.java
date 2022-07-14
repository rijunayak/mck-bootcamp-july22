package com.mckinsey.bootcamp.exercise3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ParkingLotTest {
    @Test
    public void parkingShouldBeSuccessFullIfLotIsEmpty() {
        ParkingLot parkingLot = new ParkingLot(10);
        assertTrue(parkingLot.park(2));
    }

    @Test
    public void parkingShouldFailIfLotIsNotEmpty() {
        ParkingLot parkingLot = new ParkingLot(5);
        assertFalse(parkingLot.park(6));
    }

    @Test
    public void unParkingShouldBeSuccessFullIfLotIsNotEmpty() {
        ParkingLot parkingLot = new ParkingLot(5);
        parkingLot.park(5);

        assertFalse(parkingLot.unPark());
    }
}
