package com.mckinsey.bootcamp.excercise2;

enum Unit {
    Centimeter(1, "Distance"),
    Meter(100, "Distance"),
    Kilometer(100000, "Distance"),

    Milligram(1, "Weight"),
    Gram(1000, "Weight"),
    Kilogram(1000000, "Weight");

    private final int conversionFactor;
    private final String measurementType;

    Unit(int conversionFactor, String measurementType) {

        this.conversionFactor = conversionFactor;
        this.measurementType = measurementType;
    }

    public boolean isUnitsSimilar(Unit unit){
        return measurementType == unit.measurementType;
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

public class Measurement {

    private final int magnitude;
    private final Unit unit;

    public Measurement(int magnitude, Unit unit) {
        this.magnitude = magnitude;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object anotherObject) {

        if (this == anotherObject)
            return true;

        if (anotherObject.getClass() != this.getClass())
            return false;

        Measurement other = (Measurement) anotherObject;


        return this.convertToCentimeter() == other.convertToCentimeter();

    }

    private int convertToCentimeter() {

        return unit.convertToBase(this.magnitude);
    }

    private int convertUnits(Unit expectedUnit) {
        return unit.convertUnits(this.magnitude, this.unit, expectedUnit);
    }

    public Measurement add(Measurement other) throws Exception{
        if(this.unit.isUnitsSimilar(other.unit)){
            int magnitude = this.magnitude + other.convertUnits(this.unit);
            return new Measurement(magnitude,this.unit);
        }
        throw new Exception("Measurement units are different");
    }
}