package com.mckinsey.bootcamp.exercise2;

public class Length {
    private final int magnitude;
    private final String unit;

    public Length(int magnitude, String unit) {
        this.magnitude = magnitude;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object other) {

        Length typeCastOther = (Length) other;
        return magnitude == typeCastOther.magnitude && unit.equals(typeCastOther.unit);
    }
}
