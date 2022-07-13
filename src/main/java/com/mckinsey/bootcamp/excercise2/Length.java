package com.mckinsey.bootcamp.excercise2;

public class Length {

    private final int measurement;
    private final String unit;

    public Length(int measurement, String unit) {
        this.measurement = measurement;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object other) {
        Length anotherOneMeter = (Length) other;
        return this.measurement == anotherOneMeter.measurement;
    }
}
