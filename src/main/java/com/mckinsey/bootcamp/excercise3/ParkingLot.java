package com.mckinsey.bootcamp.excercise3;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {

    private int capacity;
    private ArrayList<Object> vehicles = new ArrayList<>();
    private List<ParkingLotListener> listeners = new ArrayList();
//    ParkingLotListener parkingLotListener = null;

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

        if (isFull())
            notifyListeners();

        return true;
    }

    private void notifyListeners() {
        listeners.forEach(ParkingLotListener :: notifyParkingLotFull);
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
        this.listeners.add(parkingLotListener);
    }

    public boolean attendantPark(Object vehicle) {
        return false;
    }
}
