package com.mckinsey.bootcamp.exercise3;

public class ParkingLot {

    private  int capacity;
    private int occupiedSlots = 0;
    public ParkingLot(int capacity) {

        this.capacity = capacity;
    }



    public boolean park() {

        if (this.occupiedSlots !=capacity)
        {
            this.occupiedSlots++;
            return true;
        }
        else
            return false;

    }

    public boolean unPark() {
        if(this.occupiedSlots == 0)
            return false;
        else
            this.occupiedSlots --;
        return true;
    }
}
