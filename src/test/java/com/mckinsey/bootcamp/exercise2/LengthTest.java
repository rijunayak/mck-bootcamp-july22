package com.mckinsey.bootcamp.exercise2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class LengthTest {
    @Test
    public void oneMetersShouldBeEqualToAnotherOneMeters() {
        Length oneMeter = new Length(1, Unit.Meter);
        Length anotherOneMeter = new Length(1, Unit.Meter);

        assertEquals(oneMeter,anotherOneMeter);
    }

    @Test
    public void hundredMetersShouldBeEqualToAnotherHundredMeters() {
        Length hundredMeter = new Length(100, Unit.Meter);
        Length anotherHundredMeter = new Length(100, Unit.Meter);

        assertEquals(hundredMeter,anotherHundredMeter);
    }

    @Test
    public void hundredMetersShouldBeNotEqualToThousandMeters() {
        Length hundredMeter = new Length(100, Unit.Meter);
        Length thousandMeter = new Length(1000, Unit.Meter);

        assertNotEquals(hundredMeter,thousandMeter);
    }
    @Test
    public void oneKilometerShouldBeEqualToOneThousandMeters() {
        Length oneKilometer = new Length(1, Unit.Kilometer);
        Length oneThousandMeters = new Length(1000, Unit.Meter);

        assertEquals(oneKilometer,oneThousandMeters);
    }

    @Test
    public void oneMeterShouldBeEqualToOneHundredCentimeters() {
        Length oneMeter = new Length(1, Unit.Meter);
        Length oneHundredCentimeters = new Length(100, Unit.Centimeter);

        assertEquals(oneMeter,oneHundredCentimeters);
    }

    @Test
    public void oneKilometerShouldBeEqualToOneLacCentimeters() {
        Length oneKilometer = new Length(1, Unit.Kilometer);
        Length oneLacCentimeters = new Length(100000, Unit.Centimeter);

        assertEquals(oneKilometer,oneLacCentimeters);
    }
    
    @Test
    public void twoMetersShouldBeEqualToOneMeterPlusOneMeter() {
        Length oneMeter = new Length(1, Unit.Meter);
        Length anotherOneMeter = new Length(1, Unit.Meter);
        Length expected = oneMeter.add(anotherOneMeter);
        Length twoMeters = new Length(2, Unit.Meter);
        assertEquals(twoMeters, expected);
    }
}