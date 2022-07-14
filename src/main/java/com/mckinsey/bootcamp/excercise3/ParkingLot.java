package com.mckinsey.bootcamp.excercise3;

import java.util.ArrayList;

public class ParkingLot {

    private final int capacity;
    private ArrayList<Object> vehicles = new ArrayList<>();
    ParkingLotListener parkingLotListener = null;

    public ParkingLot(int capacity) {

        this.capacity = capacity;
    }

    private boolean isFull() {

        return vehicles.size() >= capacity;
    }

    private boolean isEmpty() {

        return vehicles.size() <= 0;
    }

    //    private boolean alreadyUnParkedTheVehicle(Object vehicle) {
//
//        return vehicles.contains(vehicle);
//    }
    public boolean park(Object vehicle) {

        if (isFull()) {
            return false;
        }

        vehicles.add(vehicle);


        if (parkingLotListener != null)
            notifyOwner();

        return true;
    }

    private void notifyOwner() {
        parkingLotListener.notifyParkingLotFull();
    }


    public boolean unPark(Object vehicle) {

        if (isEmpty()) {
            return false;
        }

//        if(!alreadyUnParkedTheVehicle(vehicle)){
//            return false;
//        }

        vehicles.remove(vehicle);

        return true;
    }


    public void addListener(ParkingLotListener parkingLotListener) {
        this.parkingLotListener = parkingLotListener;
    }
}
