package com.mckinsey.bootcamp.excercise2;

enum UnitType {
    Length,
    Weight
}

enum Unit {
    Centimeter(1, UnitType.Length),
    Meter(100, UnitType.Length),
    Kilometer(100000, UnitType.Length),
    Milligrams(1, UnitType.Weight),
    Grams(1000, UnitType.Weight),
    Kilograms(1000000, UnitType.Weight);

    private int conversionFactor;
    private UnitType type;

    Unit(int conversionFactor, UnitType type) {

        this.conversionFactor = conversionFactor;
        this.type = type;
    }

    public int getConversionFactor() {
        return conversionFactor;
    }

    double convertUnitTo(double magnitude, Unit other) {
        return (magnitude * getConversionFactor()) / other.getConversionFactor();
    }

    public boolean isSameType(Unit other) {
        return this.type == other.type;
    }
}

public class Length {

    private final double magnitude;
    private final Unit unit;

    public Length(double magnitude, Unit unit) {
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
        if (!(this.unit.isSameType(other.unit)))
            return false;

        return this.magnitude == other.convertUnitTo(this.unit);
    }

    private double convertUnitTo(Unit other) {
        return unit.convertUnitTo(this.magnitude, other);
    }

    public Length add(Length other) {
        if (!(this.unit.isSameType(other.unit)))
            return new Length(0, this.unit);

        double magnitude = this.magnitude + other.convertUnitTo(this.unit);
        return new Length(magnitude, this.unit);
    }
}