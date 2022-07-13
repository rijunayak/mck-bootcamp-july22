package com.mckinsey.bootcamp.exercise3;

public class ParkingLot {

    private final int capacity;
    private int filledSlots;

    public ParkingLot(int capacity) {
        this.capacity = capacity;
        this.filledSlots = 0;
    }

    public boolean park() {
        if (isFull())
            return false;

        this.filledSlots += 1;

        return true;
    }

    private boolean isFull() {
        return this.filledSlots == this.capacity;
    }

    public boolean unPark() {
        if (isEmpty())
            return false;

        this.filledSlots -= 1;

        return true;
    }

    private boolean isEmpty() {
        return this.filledSlots == 0;
    }
}
