package com.mckinesy.bootcamp.exercise2;

public class Length {
    private final int magnitude;
    private final String unit;
    public Length(int magnitude, String unit) {
        this.magnitude = magnitude;
        this.unit = unit;
    }


    public boolean isEqual(Length otherLength){
        return this.unit.equals(otherLength.unit) && this.magnitude == otherLength.magnitude;
    }
}
