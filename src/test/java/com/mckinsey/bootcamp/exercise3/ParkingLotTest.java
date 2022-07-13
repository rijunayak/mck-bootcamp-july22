package com.mckinsey.bootcamp.exercise3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ParkingLotTest {

    @Test
    public void parkingShouldBeSuccessfulWhenLotIsEmpty()
    {
        ParkingLot parkingLot = new ParkingLot(1);

        boolean carOneResult = parkingLot.Park(new Car());

        boolean carTwoResult = parkingLot.Park(new Car());

        assertEquals(false,carTwoResult);
    }
}
