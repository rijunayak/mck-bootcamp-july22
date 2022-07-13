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
        return this.conversionFactor;
    }

    public int convertToCentimeter(int magnitude) {
        return magnitude * this.conversionFactor;
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
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || this.getClass() != other.getClass()) {
            return false;
        }
        Length otherLength = (Length) other;
        return this.convertToCentimeter() == otherLength.convertToCentimeter();
    }

    public int convertToCentimeter() {
        return unit.convertToCentimeter(this.magnitude);
    }

    public Length add(Length other) {
          return new Length((this.convertToCentimeter() + other.convertToCentimeter())/this.unit.getConversionFactor(), this.unit);
    }
}
