package com.mckinsey.bootcamp.exercise3;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {

    private int capacity;
    private ArrayList<Object> parkedCar = new ArrayList<Object>();
    private List<ParkingLotListener> ListListeners = new ArrayList<ParkingLotListener>();

    public ParkingLot(int capacity) {

        this.capacity = capacity;
    }


    public boolean park(Object car) {
        if (this.parkedCar.size() != capacity) {
            this.parkedCar.add(car);
            if (ListListeners != null) {
                if (isFull())
                    this.notifyListeners();
            }
            return true;
        } else
            return false;

    }

    private void notifyListeners() {
        this.ListListeners.forEach(listener -> listener.NotifyFullParkingListener());
    }


    public boolean unPark(Object car) {
        if (this.parkedCar.size() == 0)
            return false;
        else
            this.parkedCar.remove(car);
        return true;
    }


    public boolean isFull() {
        return this.parkedCar.size() == this.capacity;
    }


    public void addListener(ParkingLotListener parkingLotListener) {

        this.ListListeners.add(parkingLotListener);
    }

    public boolean parkByAttendant() {
        return false;
    }
}
