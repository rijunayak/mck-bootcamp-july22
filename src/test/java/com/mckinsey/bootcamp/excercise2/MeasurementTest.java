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
    public void twoMeterShouldBeOneMeterPlusAnotherOneMeter() {

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
    public void twoKilometerShouldBeOneKilometerPlusThousandMeter() {

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
    @DisplayName("One Gram Should Be Equal To One Gram")
    public void oneGramShouldBeEqualToAnotherOneGram() {

//      Arrange
        Measurement oneGram = new Measurement(1, Unit.Grams);
        Measurement anotherOneGram = new Measurement(1, Unit.Grams);

//        Assert
        assertEquals(oneGram, anotherOneGram);
    }

    @Test
    public void twentyLakhMilligramShouldBeEqualToTwoKilogram() {

//      Arrange
        Measurement twentyLakhMilligram = new Measurement(2000000, Unit.Milligrams);
        Measurement twoKilogram = new Measurement(2, Unit.Kilograms);

//      Assert
        assertEquals(twentyLakhMilligram, twoKilogram);
    }

    @Test
    public void fifteenHundredGramShouldBeFiveHundredGramPlusOneKilogram() {

//      Arrange
        Measurement fiveHundredGram = new Measurement(500, Unit.Grams);
        Measurement oneKilogram = new Measurement(1, Unit.Kilograms);

//      Act
        Measurement actual = fiveHundredGram.add(oneKilogram);

        Measurement expected = new Measurement(1500, Unit.Grams);
//      Assert
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotBeAbleToAddOneMeterAndOneGram() {

//      Arrange
        Measurement oneMeter = new Measurement(1, Unit.Meter);
        Measurement oneGram = new Measurement(1, Unit.Grams);

//      Act
        Measurement actual = oneMeter.add(oneGram);

        Measurement expected = new Measurement(0, Unit.Meter);
//        Assert
        assertEquals(expected, actual);
    }

    @Test
    public void onePointFiveKiloGramShouldBeOneKiloGramPlusThreeHundredGram() {

//      Arrange
        Measurement oneKiloGram = new Measurement(1, Unit.Kilograms);
        Measurement threeHundredGram = new Measurement(300, Unit.Grams);

//      Act
        Measurement actual = oneKiloGram.add(threeHundredGram);

        Measurement expected = new Measurement(1.3, Unit.Kilograms);
//        Assert
        assertEquals(expected, actual);
    }
}
