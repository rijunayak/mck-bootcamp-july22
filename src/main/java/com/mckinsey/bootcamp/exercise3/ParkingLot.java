package com.mckinsey.bootcamp.exercise3;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {


    private final int capacity;
    ArrayList<Integer> parking = new ArrayList<>();

    private List<ParkingLotListener> listeners = new ArrayList<>();


    public ParkingLot(int capacity) {
        this.capacity = capacity;

        parking.ensureCapacity(capacity);
    }

    public boolean park(Object object) {
        if (isFull())
            return false;


        int objectID = object.hashCode();

        parking.add(objectID);

        if(isFull())
        {
            notifyListeners();
        }

        return true;

    }

    private void notifyListeners() {
        listeners.forEach(ParkingLotListener::notifyParkingLotFull);
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
        this.listeners.add(parkingLotListener);
    }
}
