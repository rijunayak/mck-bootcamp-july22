package com.mckinsey.bootcamp.excercise2;

public class Length {

    private final int measurement;
    private final Units unit;

    enum Units {
        CentiMeter,
        Meter,
        KiloMeter
    }

    public Length(int measurement, Units unit) {
        this.measurement = measurement;
        this.unit = unit;
    }
    @Override
    public boolean equals(Object other) {

        Length anotherLength = (Length) other;

        if(!this.unit.equals(anotherLength.unit)){

            switch (this.unit)
            {
                case CentiMeter: {
                    switch (anotherLength.unit) {
                        case Meter:   return this.measurement == anotherLength.measurement * 100;
                        default: return this.measurement == anotherLength.measurement;

                    }
                }

                case KiloMeter : {
                    switch (anotherLength.unit){
                        case Meter: return this.measurement == anotherLength.measurement * 100;
                        default:
                    }
                }
            }

        }

        return this.measurement == anotherLength.measurement;
        }

    }
}
