package com.mckinsey.bootcamp.excercise2;

enum Unit {
    Centimeter(1),
    Meter(100),
    Kilometer(100000),
    Milligrams(1),
    Grams(1000),
    Kilograms(1000000);

    private int conversionFactor;

    Unit(int conversionFactor) {

        this.conversionFactor = conversionFactor;
    }

    public int getConversionFactor() {
        return conversionFactor;
    }

    int convertUnit(int magnitude, Unit other) {

        return (magnitude * getConversionFactor()) / other.getConversionFactor();
    }

    public boolean isSameQuantity(Unit firstUnit, Unit secondUnit) {
        switch(firstUnit) {
            case Centimeter:
            case Meter:
            case Kilometer: {
                switch (secondUnit) {
                    case Centimeter:
                    case Meter:
                    case Kilometer: return true;
                }
            }
                break;
            case Milligrams:
            case Grams:
            case Kilograms: {
                switch (secondUnit) {
                    case Milligrams:
                    case Grams:
                    case Kilograms: return true;
                }
            }
        }
        return false;
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
        if(!(this.isSameQuantity(other.unit)))
            return false;

        return this.magnitude == other.convertUnit(this.unit);

    }

    private boolean isSameQuantity(Unit other) {
        return this.unit.isSameQuantity(this.unit, other);
    }

    private int convertUnit(Unit other) {

        return unit.convertUnit(this.magnitude, other);
    }

    public Length add(Length other) {
        if(!(this.isSameQuantity(other.unit)))
            return new Length(0, this.unit);

        int magnitude = this.magnitude + other.convertUnit(this.unit);
        return new Length(magnitude, this.unit);
    }
}