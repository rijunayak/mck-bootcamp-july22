package com.mckinsey.bootcamp.excercise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class AttendantTest {

    @Test
    public void attendantShouldBeAbleToParkTheCarInTheOnlyParkingLot(){
        ParkingLot parkingLot = new ParkingLot(1);
        Attendant attendant = new Attendant();
        attendant.manageParkingLot(parkingLot);
        Object vehicle= new Object();

        boolean parkingResult = attendant.park(vehicle);
        Assertions.assertTrue(parkingResult);

    }

    @Test
    public void attendantShouldNotBeAbleToParkTheCarWhenParkingLotIsFull(){
        ParkingLot parkingLot = new ParkingLot(1);
        Attendant attendant = new Attendant();
        attendant.manageParkingLot(parkingLot);
        Object vehicle= new Object();
        attendant.park(vehicle);

        Object vehicle2 = new Object();
        boolean parkingResult = attendant.park(vehicle2);
        Assertions.assertFalse(parkingResult);
    }

//    @Test
//    public void attendantShouldBeAbleToParkInSecondParkingLotWhenFirstIsFull(){
//        ParkingLot firstParkingLot = new ParkingLot(1);
//        ParkingLot secondParkingLot = new ParkingLot(1);
//
//        Attendant attendant = new Attendant();
//        attendant.manageParkingLot(parkingLot);
//        Object vehicle= new Object();
//        attendant.park(vehicle);
//
//        Object vehicle2 = new Object();
//        boolean parkingResult = attendant.park(vehicle2);
//        Assertions.assertFalse(parkingResult);
//    }

}
