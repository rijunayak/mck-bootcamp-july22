package com.mckinsey.bootcamp.exercise2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class LengthTest {
    @Test
    public void oneMetersShouldBeEqualToAnotherOneMeters() {
        Length oneMeter = new Length(1, Unit.Meter);
        Length anotherOneMeter = new Length(1, Unit.Meter);

        //boolean comparisonResult = oneMeter.equalTo(anotherOneMeter);

//        boolean comparisonResult = oneMeter.equals(anotherOneMeter);
//        assertTrue(comparisonResult);

        assertEquals(oneMeter, anotherOneMeter);
    }

    @Test
    public void hundredMetersShouldBeEqualToAnotherHundredMeters() {
        Length hundredMeter = new Length(100, Unit.Meter);
        Length anotherHundredMeter = new Length(100, Unit.Meter);

        //boolean comparisonResult = hundredMeter.equalTo(anotherHundredMeter);
//        boolean comparisonResult = hundredMeter.equals(anotherHundredMeter);
//
//        assertTrue(comparisonResult);

        assertEquals(hundredMeter, anotherHundredMeter);
    }

    @Test
    public void hundredMetersShouldBeNotEqualToThousandMeters() {
        Length hundredMeter = new Length(100, Unit.Meter);
        Length thousandMeter = new Length(1000, Unit.Meter);

        //boolean comparisonResult = hundredMeter.equalTo(anotherHundredMeter);
//        boolean comparisonResult = hundredMeter.equals(thousandMeter);
//
//        assertFalse(comparisonResult);

        assertNotEquals(hundredMeter, thousandMeter);
    }

    @Test
    public void oneKilometerShouldBeEqualToOneThousandMeters() {
        Length oneKilometer = new Length(1, Unit.Kilometer);
        Length oneThousandMeters = new Length(1000, Unit.Meter);

        //boolean comparisonResult = oneKilometer.equalTo(anotherHundredMeter);
//            boolean comparisonResult = oneKilometer.equals(oneThousandMeters);
//
//            assertTrue(comparisonResult);

        assertEquals(oneKilometer, oneThousandMeters);
    }

    @Test
    public void oneMeterShouldBeEqualToOneHundredCentimeters() {
        Length oneMeter = new Length(1, Unit.Meter);
        Length oneHundredCentimeters = new Length(100, Unit.Centimeter);

        //boolean comparisonResult = oneMeter.equalTo(anotherHundredMeter);
//            boolean comparisonResult = oneMeter.equals(oneHundredCentimeters);
//
//            assertTrue(comparisonResult);

        assertEquals(oneMeter, oneHundredCentimeters);
    }

    @Test
    public void oneKilometerShouldBeEqualToOneLakhCentimeters() {
        Length oneKilometer = new Length(1, Unit.Kilometer);
        Length oneLakhCentimeters = new Length(100000, Unit.Centimeter);

        //boolean comparisonResult = oneKilometer.equalTo(anotherHundredMeter);
//            boolean comparisonResult = oneKilometer.equals(oneLakhCentimeters);
//
//            assertTrue(comparisonResult);

        assertEquals(oneKilometer, oneLakhCentimeters);
    }

    @Test
    public void oneMeterPlusAnotherOneMeterShouldBeEqualToTwoMeters() {
        Length oneMeter = new Length(1, Unit.Meter);
        Length anotherOneMeter = new Length(1, Unit.Meter);

        Length actual = oneMeter.add(anotherOneMeter);

        Length expected = new Length(2,Unit.Meter);

        assertEquals(expected, actual);
    }

    @Test
    public void hundredCentimeterPlusOneMeterShouldBeEqualToTwoHundredCentimeters() {
        Length hundredCentimeters = new Length(100, Unit.Centimeter);
        Length oneMeter = new Length(1, Unit.Meter);

        Length actual = hundredCentimeters.add(oneMeter);

        Length expected = new Length(200,Unit.Centimeter);

        assertEquals(expected, actual);
    }
    @Test
    public void fiveHundredMetersPlusOneKilometerShouldBeEqualToFifteenHundredMeters() {
        Length fiveHundredMeters = new Length(500, Unit.Meter);
        Length oneKilometer = new Length(1, Unit.Kilometer);

        Length actual = fiveHundredMeters.add(oneKilometer);

        Length expected = new Length(1500,Unit.Meter);

        assertEquals(expected, actual);
    }



}
