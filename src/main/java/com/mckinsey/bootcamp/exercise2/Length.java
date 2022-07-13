package com.mckinsey.bootcamp.exercise2;

public class Length {
    private int magnitude;
    private final String unit;

    public Length(int magnitude, String unit) {
        this.magnitude = magnitude;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object other) {
        Length typeCastOther = (Length) other;
        if (this.unit.equals(typeCastOther.unit)) {
            return this.magnitude == typeCastOther.magnitude;
        }
        switch (this.unit) {
            case "meters":
                this.magnitude = this.magnitude * 100;
                break;
            case "kilometer":
                this.magnitude = this.magnitude * 100000;
                break;
        }
        switch (typeCastOther.unit) {
            case "meters":
                this.magnitude = typeCastOther.magnitude * 100;
                break;
            case "kilometer":
                this.magnitude = typeCastOther.magnitude * 100000;
        }
        return this.magnitude == typeCastOther.magnitude;
    }
}
