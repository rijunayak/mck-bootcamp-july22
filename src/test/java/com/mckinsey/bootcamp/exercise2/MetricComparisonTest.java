package com.mckinsey.bootcamp.exercise2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MetricComparisonTest {


    @Test
    public void oneMetersShouldNotEqualToTwoMeters() {

        Metric oneMeter = new Metric(1, Unit.Meter);
        Metric twoMeter = new Metric(2, Unit.Meter);

        assertNotEquals(oneMeter, twoMeter);

    }

    @Test
    public void fiveMetersShouldEqualFiveMeters() {

        Metric fiveMeter = new Metric(5, Unit.Meter);
        Metric fiveMeter1 = new Metric(5, Unit.Meter);

        assertEquals(fiveMeter, fiveMeter1);
    }

    @Test
    public void oneThousandMetersShouldEqualOneKiloMeter() {

        Metric oneThousandMeter = new Metric(1000, Unit.Meter);
        Metric oneKilometer = new Metric(1, Unit.Kilometer);

        assertEquals(oneThousandMeter, oneKilometer);
    }

    @Test
    public void hundredCentimetersShouldEqualOneMeter() {

        Metric hundredCentimeter = new Metric(100, Unit.Centimeter);
        Metric oneMeter = new Metric(1, Unit.Meter);

        assertEquals(hundredCentimeter, oneMeter);
    }


    @Test
    public void oneKilometersShouldNotEqualFiveHundredMeter() {

        Metric oneKilometer = new Metric(1, Unit.Kilometer);
        Metric fiveHundredMeter = new Metric(500, Unit.Meter);

        assertNotEquals(oneKilometer, fiveHundredMeter);
    }

    @Test
    public void twoMetersShouldEqualAdditionOfOneMeterAndAnotherOneMeter() {
        Metric oneMeter = new Metric(1, Unit.Meter);
        Metric anotherOneMeter = new Metric(1, Unit.Meter);

        Metric actual = oneMeter.add(anotherOneMeter);

        Metric expected = new Metric(2, Unit.Meter);
        assertEquals(expected, actual);
    }


    @Test
    public void twoKilometersShouldEqualAdditionOfOneKilometerAndOneThousandMeter() {
        Metric oneKilometer = new Metric(1, Unit.Kilometer);
        Metric oneThousandMeter = new Metric(1000, Unit.Meter);

        Metric actual = oneKilometer.add(oneThousandMeter);

        Metric expected = new Metric(2, Unit.Kilometer);
        assertEquals(expected, actual);
    }


    @Test
    public void fifteenHundredMetersShouldEqualAdditionOfFiveHundredMeterAndOneKilometer() {
        Metric oneKilometer = new Metric(500, Unit.Meter);
        Metric oneThousandMeter = new Metric(1, Unit.Kilometer);

        Metric actual = oneKilometer.add(oneThousandMeter);

        Metric expected = new Metric(1500, Unit.Meter);
        assertEquals(expected, actual);
    }


    @Test
    public void twoHundredCentimetersShouldEqualAdditionOfOneHundredCentimeterAndOneMeter() {
        Metric oneKilometer = new Metric(100, Unit.Centimeter);
        Metric oneThousandMeter = new Metric(1, Unit.Meter);

        Metric actual = oneKilometer.add(oneThousandMeter);

        Metric expected = new Metric(200, Unit.Centimeter);
        assertEquals(expected, actual);
    }


    @Test
    public void oneKilogramShouldNotEqualTwoKilograms() {
        Metric oneKilogram = new Metric(1, Unit.Kilograms);
        Metric twoKilograms = new Metric(2, Unit.Kilograms);

        assertNotEquals(oneKilogram, twoKilograms);
    }

    @Test
    public void thousandGramsShouldEqualOneKilogram() {
        Metric thousandGrams = new Metric(1000, Unit.Grams);
        Metric oneKilogram = new Metric(1, Unit.Kilograms);

        assertEquals(thousandGrams, oneKilogram);
    }

    @Test
    public void twentyLakhsMilligramsShouldEqualTwoKilograms() {
        Metric twentyLakhsMilligrams = new Metric(2000000, Unit.Milligrams);
        Metric twoKilograms = new Metric(2, Unit.Kilograms);

        assertEquals(twentyLakhsMilligrams, twoKilograms);
    }


    @Test
    public void twoThousandShouldEqualAdditionOfThousandGramsAndAnotherThousandGrams() {
        Metric thousandGrams = new Metric(1000, Unit.Grams);
        Metric anotherThousandGrams = new Metric(1000, Unit.Grams);

        Metric actual = thousandGrams.add(anotherThousandGrams);

        Metric expected = new Metric(2000, Unit.Grams);
        assertEquals(expected, actual);
    }

    @Test
    public void fifteenHundredGramsShouldEqualsAdditionOfFiveHundredGramsAndOneKilogram() {
        Metric fiveHundredGrams = new Metric(500, Unit.Grams);
        Metric oneKilogram = new Metric(1, Unit.Kilograms);

        Metric actual = fiveHundredGrams.add(oneKilogram);

        Metric expected = new Metric(1500, Unit.Grams);
        assertEquals(expected, actual);
    }

    @Test
    public void onePointThreeKilogramsShouldEqualsAdditionOfOneKilogramAndThreeHundredGrams() {
        Metric oneKilogram = new Metric(1, Unit.Kilograms);
        Metric threeHundredGrams = new Metric(300, Unit.Grams);

        Metric actual = oneKilogram.add(threeHundredGrams);

        Metric expected = new Metric(1.3, Unit.Kilograms);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotAddOneMeterAndOneGram() {
        Metric oneMeter = new Metric(1, Unit.Meter);
        Metric oneGram = new Metric(1, Unit.Grams);

        Metric actual = oneMeter.add(oneGram);

        Metric expected = new Metric(-1, Unit.Meter);
        assertEquals(expected, actual);
    }
}

