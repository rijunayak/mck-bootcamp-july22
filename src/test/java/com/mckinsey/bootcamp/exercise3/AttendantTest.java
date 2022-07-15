package com.mckinsey.bootcamp.exercise3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AttendantTest {

    @Test
    public void attendantShouldParkTheCarAtTheFirstParkingLot(){

        ParkingLot parkingLot = new ParkingLot(1);
        Attendant attendant = new Attendant();

        Object vehicle = new Object();
        attendant.manageParkingLot(parkingLot);
        int parkingLotNo = attendant.parkAtParkingLot(vehicle);

        assertEquals(1,parkingLotNo);
    }



    @Test
    public void attendantShouldNotParkCarIfTheFirstParkingLotFull(){

        ParkingLot parkingLot = new ParkingLot(1);
        Attendant attendant = new Attendant();

        Object maruti = new Object();
        attendant.manageParkingLot(parkingLot);
        int parkingLotNo = attendant.parkAtParkingLot(maruti);
        assertEquals(1,parkingLotNo);

        Object tataMotor = new Object();
        parkingLotNo = attendant.parkAtParkingLot(maruti);

        assertEquals(0,parkingLotNo);
    }

    @Test
    public void attendantShouldParkCarAtSecondLotWhenFirstLotIsFull(){
        ParkingLot firstParkingLot = new ParkingLot(1);
        ParkingLot secondParkingLot = new ParkingLot(1);
        Attendant attendant = new Attendant();
        attendant.manageParkingLot(firstParkingLot);
        attendant.manageParkingLot(secondParkingLot);

        Object ford = new Object();
        int parkingLotNo = attendant.parkAtParkingLot(ford);
        assertEquals(1,parkingLotNo);
        Object tataMotors = new Object();
        parkingLotNo = attendant.parkAtParkingLot(tataMotors);

        assertEquals(2,parkingLotNo);
    }


}
