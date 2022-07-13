package com.mckinsey.bootcamp.exercise2;

enum Unit{
    Centimeter,
    Meter,
    Kilometer
}
public class Length {

    private int magnitude;
    private final Unit unit;

    public Length(int magnitude, Unit unit) {
        this.magnitude = magnitude;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object anotherObject) {

        if(this == anotherObject)
            return true;

        if(anotherObject.getClass() != this.getClass())
            return false;

        Length anotherLengthObject = (Length) anotherObject;



        if(!(this.unit.equals(anotherLengthObject.unit)))
        {
            switch (this.unit)
            {
                case Meter:
                    this.magnitude = this.magnitude*100;
                    break;
                case Kilometer:
                    this.magnitude = this.magnitude*100000;
                    break;
            }

            switch (anotherLengthObject.unit)
            {
                case Meter:
                    anotherLengthObject.magnitude = anotherLengthObject.magnitude*100;
                    break;
                case Kilometer:
                    anotherLengthObject.magnitude = anotherLengthObject.magnitude*100000;
                    break;
            }

        }

        return this.magnitude == anotherLengthObject.magnitude;
    }
}
