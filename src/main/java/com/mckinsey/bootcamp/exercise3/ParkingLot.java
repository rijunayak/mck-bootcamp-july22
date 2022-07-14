package com.mckinsey.bootcamp.exercise3;

public class ParkingLot {

    private int capacity;
    private int occupiedSlots = 0;
    private ParkingLotListener parkingLotListener = null;

    public ParkingLot(int capacity) {

        this.capacity = capacity;
    }


    public boolean park() {
        if (this.occupiedSlots != capacity) {
            this.occupiedSlots++;
            if (parkingLotListener != null) {
                if (isFull())
                    this.notifyOwner();
            }

            return true;
        } else
            return false;

    }

    private void notifyOwner() {
        parkingLotListener.NotifyFullParkingListener();
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

    public void AddListener(ParkingLotListener parkingLotListener) {

        this.parkingLotListener = parkingLotListener;
    }
}
