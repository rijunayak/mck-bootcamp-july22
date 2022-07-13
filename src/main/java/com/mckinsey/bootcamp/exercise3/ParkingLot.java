package com.mckinsey.bootcamp.exercise3;

public class ParkingLot {

    private final int capacity = 1;
    private int occupiedSlots;
    public ParkingLot(int occupiedSlots) {
        this.occupiedSlots = occupiedSlots;
    }



    public boolean park() {

        if (this.occupiedSlots !=capacity)
        {
            this.occupiedSlots++;
            return true;
        }

        else
            return false;
        //this.occupiedSlots++;

    }
}
