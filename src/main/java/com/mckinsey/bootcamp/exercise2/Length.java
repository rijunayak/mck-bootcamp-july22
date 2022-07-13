package com.mckinsey.bootcamp.exercise2;

enum Unit {
    Centimeter(1),
    Meter(100),
    Kilometer(100000);

    private int conversionFactor;

    Unit(int conversionFactor) {
        this.conversionFactor = conversionFactor;
    }

    public int getConversionFactor() {
        return conversionFactor;
    }

    int convertToCentimeter(int magnitude) {
        return magnitude * getConversionFactor();
    }
}

public class Length {

    private final int magnitude;
    private final Unit unit;

    public Length(int magnitude, Unit unit) {
        this.magnitude = magnitude;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object anotherObject) {

        if (this == anotherObject)
            return true;
        if (anotherObject.getClass() != this.getClass())
            return false;

        Length other = (Length) anotherObject;

        return this.convertToCentimeter() == other.convertToCentimeter();
    }

    private int convertToCentimeter() {
        return unit.convertToCentimeter(this.magnitude);
    }

    public Length add(Length other) {
        return new Length(this.magnitude + other.magnitude, this.unit);
    }
}