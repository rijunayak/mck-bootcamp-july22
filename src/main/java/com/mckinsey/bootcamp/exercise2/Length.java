package com.mckinsey.bootcamp.exercise2;

public class Length {

    private final int magnitude;
    private final String unit;

    public Length(int magnitude, String unit) {


        this.magnitude = magnitude;
        this.unit = unit;
    }


    /*
    public boolean equalTo(Length anotherOneMeter) {

        return this.magnitude == anotherOneMeter.magnitude && this.unit.equals(anotherOneMeter.unit);
    }
    */


    @Override
    public boolean equals(Object anotherObject) {
        Length anotherLengthObject = (Length) anotherObject;

        return this.magnitude == anotherLengthObject.magnitude;
    }
}
