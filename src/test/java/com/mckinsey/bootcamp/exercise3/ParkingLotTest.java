package com.mckinsey.bootcamp.exercise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ParkingLotTest {

    @Test
    public void ShouldBeParkWhenSpaceWillAvailable() {
        ParkingLot parking = new ParkingLot(0);

        boolean actual = parking.park();

        Assertions.assertTrue(actual);
    }



    @Test
    public void ShouldNotParkWhenSpaceWillFull(){
        ParkingLot parking = new ParkingLot(0);

        boolean actual = parking.park();

        Assertions.assertTrue(actual);
    }
    @Test
    public void shouldParkIfTwoCarsAreParkedAlready(){

    }



}
