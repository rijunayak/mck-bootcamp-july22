package com.mckinsey.bootcamp.exercise3;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {

    private int capacity;
    private int occupiedSlots = 0;
    private List<ParkingLotListener> ListListeners = new ArrayList<ParkingLotListener>();

    public ParkingLot(int capacity) {

        this.capacity = capacity;
    }


    public boolean park() {
        if (this.occupiedSlots != capacity) {
            this.occupiedSlots++;
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


    public boolean unPark() {
        if (this.occupiedSlots == 0)
            return false;
        else
            this.occupiedSlots--;
        return true;
    }


    public boolean isFull() {
        return this.occupiedSlots == this.capacity;
    }


    public void addListener(ParkingLotListener parkingLotListener) {

        this.ListListeners.add(parkingLotListener);
    }
}
