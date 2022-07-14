package com.mckinsey.bootcamp.exercise2;

enum Unit {
    Centimeter(1, "Length"),
    Meter(100, "Length"),
    Kilometer(100000, "Length"),
    Milligram(1, "Weight"),
    Gram(1000, "Weight"),
    Kilogram(1000000, "Weight");


    private final int conversionFactor;
    private final String measurement;


    Unit(int conversionFactor, String measurement) {
        this.conversionFactor = conversionFactor;
        this.measurement = measurement;
    }

    public int getConversionFactor() {
        return conversionFactor;
    }

    int convertToBase(int magnitude, Unit unit) {
        return magnitude * this.getConversionFactor();
    }

    public boolean isMeasurementSimilar(Unit unit) {
        return this.measurement == unit.measurement;
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

        if (this.unit.isMeasurementSimilar(other.unit))
            return this.convertToBaseUnit() == other.convertToBaseUnit();

        return false;
    }

    private int convertToBaseUnit() {
        return unit.convertToBase(this.magnitude, this.unit);
    }

    public Measurement add(Measurement other) throws Exception {

        if (this.unit.isMeasurementSimilar(other.unit)) {

//            int result = this.magnitude + other.convertToBaseUnit();

//        if(this.unit == Unit.Kilometer)
//            return new Length(result/Unit.Kilometer.getConversionFactor(),this.unit);
//
//        else if(this.unit == Unit.Meter)
//            return new Length(result/Unit.Meter.getConversionFactor(),this.unit);

            return new Measurement(this.magnitude + other.convertToBaseUnit() / this.unit.getConversionFactor(), this.unit);

        } else
            throw new Exception("Failed to add two different Measurements");
    }
}
