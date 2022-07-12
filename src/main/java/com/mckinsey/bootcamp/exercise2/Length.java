package com.mckinsey.bootcamp.exercise2;

public class Length {

    private int  magnitude;
    private String unit;

    public Length(int magnitude, String unit) {


        this.magnitude = magnitude;
        this.unit = unit;
    }


    public boolean equalTo(Length anotherOneMeter) {
       return true;
    }
}
