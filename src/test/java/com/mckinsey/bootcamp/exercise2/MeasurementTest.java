package com.mckinsey.bootcamp.exercise2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class MeasurementTest {
    @Test
    public void oneMetersShouldBeEqualToAnotherOneMeters() {
        Measurement oneMeter = new Measurement(1, Unit.Meter);
        Measurement anotherOneMeter = new Measurement(1, Unit.Meter);

        //boolean comparisonResult = oneMeter.equalTo(anotherOneMeter);

//        boolean comparisonResult = oneMeter.equals(anotherOneMeter);
//        assertTrue(comparisonResult);

        assertEquals(oneMeter, anotherOneMeter);
    }

    @Test
    public void hundredMetersShouldBeEqualToAnotherHundredMeters() {
        Measurement hundredMeter = new Measurement(100, Unit.Meter);
        Measurement anotherHundredMeter = new Measurement(100, Unit.Meter);

        //boolean comparisonResult = hundredMeter.equalTo(anotherHundredMeter);
//        boolean comparisonResult = hundredMeter.equals(anotherHundredMeter);
//
//        assertTrue(comparisonResult);

        assertEquals(hundredMeter, anotherHundredMeter);
    }

    @Test
    public void hundredMetersShouldBeNotEqualToThousandMeters() {
        Measurement hundredMeter = new Measurement(100, Unit.Meter);
        Measurement thousandMeter = new Measurement(1000, Unit.Meter);

        //boolean comparisonResult = hundredMeter.equalTo(anotherHundredMeter);
//        boolean comparisonResult = hundredMeter.equals(thousandMeter);
//
//        assertFalse(comparisonResult);

        assertNotEquals(hundredMeter, thousandMeter);
    }

    @Test
    public void oneKilometerShouldBeEqualToOneThousandMeters() {
        Measurement oneKilometer = new Measurement(1, Unit.Kilometer);
        Measurement oneThousandMeters = new Measurement(1000, Unit.Meter);

        //boolean comparisonResult = oneKilometer.equalTo(anotherHundredMeter);
//            boolean comparisonResult = oneKilometer.equals(oneThousandMeters);
//
//            assertTrue(comparisonResult);

        assertEquals(oneKilometer, oneThousandMeters);
    }

    @Test
    public void oneMeterShouldBeEqualToOneHundredCentimeters() {
        Measurement oneMeter = new Measurement(1, Unit.Meter);
        Measurement oneHundredCentimeters = new Measurement(100, Unit.Centimeter);

        //boolean comparisonResult = oneMeter.equalTo(anotherHundredMeter);
//            boolean comparisonResult = oneMeter.equals(oneHundredCentimeters);
//
//            assertTrue(comparisonResult);

        assertEquals(oneMeter, oneHundredCentimeters);
    }

    @Test
    public void oneKilometerShouldBeEqualToOneLakhCentimeters() {
        Measurement oneKilometer = new Measurement(1, Unit.Kilometer);
        Measurement oneLakhCentimeters = new Measurement(100000, Unit.Centimeter);

        //boolean comparisonResult = oneKilometer.equalTo(anotherHundredMeter);
//            boolean comparisonResult = oneKilometer.equals(oneLakhCentimeters);
//
//            assertTrue(comparisonResult);

        assertEquals(oneKilometer, oneLakhCentimeters);
    }

    @Test
    public void oneMeterPlusAnotherOneMeterShouldBeEqualToTwoMeters() throws Exception {
        Measurement oneMeter = new Measurement(1, Unit.Meter);
        Measurement anotherOneMeter = new Measurement(1, Unit.Meter);

        Measurement actual = oneMeter.add(anotherOneMeter);

        Measurement expected = new Measurement(2, Unit.Meter);

        assertEquals(expected, actual);
    }

    @Test
    public void hundredCentimeterPlusOneMeterShouldBeEqualToTwoHundredCentimeters() throws Exception {
        Measurement hundredCentimeters = new Measurement(100, Unit.Centimeter);
        Measurement oneMeter = new Measurement(1, Unit.Meter);

        Measurement actual = hundredCentimeters.add(oneMeter);

        Measurement expected = new Measurement(200, Unit.Centimeter);

        assertEquals(expected, actual);
    }

    @Test
    public void fiveHundredMetersPlusOneKilometerShouldBeEqualToFifteenHundredMeters() throws Exception {
        Measurement fiveHundredMeters = new Measurement(500, Unit.Meter);
        Measurement oneKilometer = new Measurement(1, Unit.Kilometer);

        Measurement actual = fiveHundredMeters.add(oneKilometer);

        Measurement expected = new Measurement(1500, Unit.Meter);

        assertEquals(expected, actual);
    }

    @Test
    public void fiveHundredGramsPlusOneKilogramShouldBeEqualToFifteenHundredGrams() throws Exception {
        Measurement fiveHundredGrams = new Measurement(500, Unit.Gram);
        Measurement oneKilogram = new Measurement(1, Unit.Kilogram);

        Measurement expected = new Measurement(1500, Unit.Gram);
        Measurement actual = fiveHundredGrams.add(oneKilogram);

        assertEquals(expected, actual);
    }


    @Test
    public void thousandGramsShouldBeEqualToOneKilogram() {
        Measurement thousandGrams = new Measurement(1000, Unit.Gram);
        Measurement oneKilogram = new Measurement(1, Unit.Kilogram);

        assertEquals(thousandGrams, oneKilogram);
    }

/*
    @Test
    public void fiveHundredGramsPlusOneKilometerShouldNotBeValid() throws Exception {
        Measurement fiveHundredGrams = new Measurement(500,Unit.Gram);
        Measurement oneKilometer = new Measurement(1, Unit.Kilometer);


        Measurement actual = fiveHundredGrams.add(oneKilometer);

    }

 */

}
