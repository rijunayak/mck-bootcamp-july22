package com.mckinsey.bootcamp.excercise2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class MeasurementTest {

    @Test
    @DisplayName("One Meter Should Be Equal To One Meter")
    public void oneMeterShouldBeEqualToOneMeter() {

//      Arrange
        Measurement oneMeter = new Measurement(1, Unit.Meter);
        Measurement anotherOneMeter = new Measurement(1, Unit.Meter);

//        Assert
        assertEquals(oneMeter, anotherOneMeter);
    }

    @Test
    public void tenMeterShouldNotBeEqualToFiveMeter() {

//      Arrange
        Measurement tenMeter = new Measurement(10, Unit.Meter);
        Measurement FiveMeter = new Measurement(5, Unit.Meter);

//        Assert
        assertNotEquals(tenMeter, FiveMeter);
    }

    @Test
    public void thousandMeterShouldBeEqualToOneKiloMeter() {

//      Arrange
        Measurement thousandMeter = new Measurement(1000, Unit.Meter);
        Measurement oneKiloMeter = new Measurement(1, Unit.Kilometer);

//        Assert
        assertEquals(thousandMeter, oneKiloMeter);
    }

    @Test
    public void oneMeterShouldBeEqualToHundredCentimeter() {

//      Arrange
        Measurement oneMeter = new Measurement(1, Unit.Meter);
        Measurement hundredCentimeter = new Measurement(100, Unit.Centimeter);

//        Assert
        assertEquals(oneMeter, hundredCentimeter);
    }

    @Test
    public void twoMeterShouldBeOneMeterPlusAnotherOneMeter() throws Exception {

//      Arrange
        Measurement oneMeter = new Measurement(1, Unit.Meter);
        Measurement anotherOneMeter = new Measurement(1, Unit.Meter);

        Measurement Expected = new Measurement(2, Unit.Meter);
//        Act
        Measurement Actual = oneMeter.add(anotherOneMeter);
//        Assert
        assertEquals(Expected, Actual);
    }

    @Test
    public void twoKilometerShouldBeOneKilometerPlusThousandMeter() throws Exception {

//      Arrange
        Measurement oneKiloMeter = new Measurement(1, Unit.Kilometer);
        Measurement thousandMeter = new Measurement(1000, Unit.Meter);

        Measurement Expected = new Measurement(2, Unit.Kilometer);
//        Act
        Measurement Actual = oneKiloMeter.add(thousandMeter);
//        Assert
        assertEquals(Expected, Actual);
    }

    @Test
    public void fifteenHundredMeterShouldBeFiveHundredMeterPlusOneKiloMeter() throws Exception {

//      Arrange
        Measurement FiveHundredMeter = new Measurement(500, Unit.Meter);
        Measurement OneKiloMeter = new Measurement(1, Unit.Kilometer);

        Measurement Expected = new Measurement(1500, Unit.Meter);
//        Act
        Measurement Actual = FiveHundredMeter.add(OneKiloMeter);
//        Assert
        assertEquals(Expected, Actual);
    }

    @Test
    public void fifteenHundredGramsShouldBeFiveHundredGramPlusOneKiloGram() throws Exception {

//      Arrange
        Measurement fiveHundredGram = new Measurement(500, Unit.Gram);
        Measurement OneKiloGram = new Measurement(1, Unit.Kilogram);

        Measurement Expected = new Measurement(1500, Unit.Gram);
//        Act
        Measurement Actual = fiveHundredGram.add(OneKiloGram);
//        Assert
        assertEquals(Expected, Actual);
    }

    @Test
    public void thousandGramsShouldBeEqualToOneKiloGram() throws Exception {

//      Arrange
        Measurement thousandGrams = new Measurement(1000, Unit.Gram);
        Measurement oneKiloGram = new Measurement(1, Unit.Kilogram);

        Measurement Expected = new Measurement(1500, Unit.Gram);
//        Act
        Measurement Actual = thousandGrams.add(oneKiloGram);
//        Assert
        assertEquals(thousandGrams, oneKiloGram);
    }

    @Test
    public void shouldFailWhileAddingWeightAndDistance() throws Exception {

//      Arrange
        Measurement fiveHundredGram = new Measurement(500, Unit.Gram);
        Measurement oneKiloMeter = new Measurement(1, Unit.Kilometer);

//        Measurement Expected = new Measurement(1500, Unit.Gram);
////        Act
//        Measurement Actual = fiveHundredGram.add(oneKiloMeter);
////        Assert
//        assertEquals(Expected, Actual);

        assertThrows(Exception.class, () -> fiveHundredGram.add(oneKiloMeter), "Measurement units are different");
    }


}
