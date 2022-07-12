package com.mckinsey.bootcamp.excercise2;

public class Length {

    private final int measurement;
    private final String unit;

    public Length(int measurement, String unit) {
        this.measurement = measurement;
        this.unit = unit;
    }

    public Boolean isEqual(Length other) {
        return this.measurement == other.measurement && this.unit.equals(other.unit);
    }
}
