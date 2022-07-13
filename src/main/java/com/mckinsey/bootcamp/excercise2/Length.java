package com.mckinsey.bootcamp.excercise2;

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

    int convertToBase(int magnitude) {

        return magnitude * getConversionFactor();
    }

    int convertUnits(int magnitude, Unit actualUnit, Unit expectedUnit) {
        return (magnitude * actualUnit.getConversionFactor()) / expectedUnit.getConversionFactor();
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

        return unit.convertToBase(this.magnitude);
    }

    private int convertUnits(Unit expectedUnit) {
        return unit.convertUnits(this.magnitude, this.unit, expectedUnit);
    }

    public Length add(Length other) {
        int magnitude = this.magnitude + other.convertUnits(this.unit);
        return new Length(magnitude, this.unit);
    }
}