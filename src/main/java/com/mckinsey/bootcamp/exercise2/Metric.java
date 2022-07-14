package com.mckinsey.bootcamp.exercise2;

import java.util.ArrayList;

enum Unit {
    Centimeter(1), Meter(100), Kilometer(100000), Milligrams(1), Grams(1000), Kilograms(1000000);
    private int conversionFactor;

    Unit(int conversionFactor) {
        this.conversionFactor = conversionFactor;
    }

    public double getConversionFactor() {
        return this.conversionFactor;
    }

    public double convertToBase(double magnitude) {
        return magnitude * this.conversionFactor;
    }


    public boolean isAdditionPossible(Unit unit1, Unit unit2) {
        ArrayList<Unit> distanceUnits = new ArrayList<Unit>();
        distanceUnits.add(Unit.Meter);
        distanceUnits.add(Unit.Kilometer);
        distanceUnits.add(Unit.Centimeter);
        ArrayList<Unit> weightUnits = new ArrayList<Unit>();
        weightUnits.add(Unit.Milligrams);
        weightUnits.add(Unit.Grams);
        weightUnits.add(Unit.Kilograms);
        return (distanceUnits.contains(unit1) && distanceUnits.contains(unit2)) || (weightUnits.contains(unit1) && weightUnits.contains(unit2));

    }
    public  static double addMetric(Metric firstMetric , Metric secondMetric){
        return firstMetric.convertToBase() + secondMetric.convertToBase();
    }
}

public class Metric {
    private final double magnitude;
    private final Unit unit;

    public Metric(double magnitude, Unit unit) {
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
        Metric otherMetric = (Metric) other;
        return this.convertToBase() == otherMetric.convertToBase();
    }

    public double convertToBase() {
        return unit.convertToBase(this.magnitude);
    }

    public Metric add(Metric other) {
        if (!unit.isAdditionPossible(this.unit, other.unit)) {
            return new Metric(-1, this.unit);
        }
        return new Metric(Unit.addMetric(this,other)/this.unit.getConversionFactor(), this.unit);
    }
}
