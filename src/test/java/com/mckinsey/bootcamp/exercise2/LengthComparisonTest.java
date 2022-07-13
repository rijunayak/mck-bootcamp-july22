package com.mckinsey.bootcamp.exercise2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LengthComparisonTest {


    @Test
    public void oneMetersShouldNotEqualToTwoMeters() {

        Length oneMeter = new Length(1, Unit.Meter);
        Length twoMeter = new Length(2, Unit.Meter);

        assertNotEquals(oneMeter, twoMeter);

    }

    @Test
    public void fiveMetersShouldEqualFiveMeters() {

        Length fiveMeter = new Length(5, Unit.Meter);
        Length fiveMeter1 = new Length(5, Unit.Meter);

        assertEquals(fiveMeter, fiveMeter1);
    }

    @Test
    public void oneThousandMetersShouldEqualOneKiloMeter() {

        Length oneThousandMeter = new Length(1000, Unit.Meter);
        Length oneKilometer = new Length(1, Unit.Kilometer);

        assertEquals(oneThousandMeter, oneKilometer);
    }

    @Test
    public void hundredCentimetersShouldEqualOneMeter() {

        Length hundredCentimeter = new Length(100, Unit.Centimeter);
        Length oneMeter = new Length(1, Unit.Meter);

        assertEquals(hundredCentimeter, oneMeter);
    }


    @Test
    public void oneKilometersShouldNotEqualFiveHundredMeter() {

        Length oneKilometer = new Length(1, Unit.Kilometer);
        Length fiveHundredMeter = new Length(500, Unit.Meter);

        assertNotEquals(oneKilometer, fiveHundredMeter);
    }

    @Test
    public void twoMetersShouldEqualAdditionOfOneMeterAndAnotherOneMeter() {
        Length oneMeter = new Length(1, Unit.Meter);
        Length anotherOneMeter = new Length(1, Unit.Meter);

        Length actual = oneMeter.add(anotherOneMeter);

        Length expected = new Length(2, Unit.Meter);
        assertEquals(expected, actual);
    }


    @Test
    public void twoKilometersShouldEqualAdditionOfOneKilometerAndOneThousandMeter() {
        Length oneKilometer = new Length(1, Unit.Kilometer);
        Length oneThousandMeter = new Length(1000, Unit.Meter);

        Length actual = oneKilometer.add(oneThousandMeter);

        Length expected = new Length(2, Unit.Kilometer);
        assertEquals(expected, actual);
    }


    @Test
    public void fifteenHundredMetersShouldEqualAdditionOfFiveHundredMeterAndOneKilometer() {
        Length oneKilometer = new Length(500, Unit.Meter);
        Length oneThousandMeter = new Length(1, Unit.Kilometer);

        Length actual = oneKilometer.add(oneThousandMeter);

        Length expected = new Length(1500, Unit.Meter);
        assertEquals(expected, actual);
    }


    @Test
    public void twoHundredCentimetersShouldEqualAdditionOfOneHundredCentimeterAndOneMeter() {
        Length oneKilometer = new Length(100, Unit.Centimeter);
        Length oneThousandMeter = new Length(1, Unit.Meter);

        Length actual = oneKilometer.add(oneThousandMeter);

        Length expected = new Length(200, Unit.Centimeter);
        assertEquals(expected, actual);
    }
}

