package com.mckinsey.bootcamp.exercise3;

public class ParkingLot {

    private int capacity;
    private int emptySlots;

    public ParkingLot(int capacity) {
        this.capacity = capacity;
        this.emptySlots = capacity;
    }

    public boolean park(int requiredSlots) {
        if (this.emptySlots == 0 || requiredSlots > this.emptySlots)
            return false;

        this.emptySlots -= requiredSlots;
        return true;
    }

    public boolean unPark() {
        if (emptySlots == 0) {
            return false;
        }

        return true;
    }
}
