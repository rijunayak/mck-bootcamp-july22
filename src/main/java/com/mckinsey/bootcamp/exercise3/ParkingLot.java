package com.mckinsey.bootcamp.exercise3;

import java.util.ArrayList;

public class ParkingLot {
    private final int capacity;
    ArrayList<Integer> parking = new ArrayList<>();

    ParkingLotListener parkingLotListener = null;
    //private int lotsOccupied;



    public ParkingLot(int capacity) {
        this.capacity = capacity;
        //this.lotsOccupied = 0;

        parking.ensureCapacity(capacity);
    }

    public boolean Park(Object object) {
        if (isFull())
            return false;

        //lotsOccupied++;

        int objectID = object.hashCode();

        parking.add(objectID);

        if(parkingLotListener != null)
            notifyOwner();

        return true;

    }

    private void notifyOwner() {
        parkingLotListener.notifyParkingLotFull();
    }

    public boolean unPark(Object object) {
        if (parking.isEmpty())
            return false;

        int objectID = object.hashCode();


        return parking.remove(Integer.valueOf(objectID));

    }

    public boolean isFull() {
        return parking.size() == capacity;
    }

    public void addListener(ParkingLotListener parkingLotListener) {
        this.parkingLotListener = parkingLotListener;
    }
}
