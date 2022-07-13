package com.mckinsey.bootcamp.excercise2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class LengthTest {

    @Test
    @DisplayName("One Meter Should Be Equal To One Meter")
    public void oneMeterShouldBeEqualToOneMeter() {

//      Arrange
        Length oneMeter = new Length(1, Unit.Meter);
        Length anotherOneMeter = new Length(1, Unit.Meter);

//        Assert
        assertEquals(oneMeter, anotherOneMeter);
    }

    @Test
    public void tenMeterShouldNotBeEqualToFiveMeter() {

//      Arrange
        Length tenMeter = new Length(10, Unit.Meter);
        Length FiveMeter = new Length(5, Unit.Meter);

//        Assert
        assertNotEquals(tenMeter, FiveMeter);
    }

    @Test
    public void thousandMeterShouldBeEqualToOneKiloMeter() {

//      Arrange
        Length thousandMeter = new Length(1000, Unit.Meter);
        Length oneKiloMeter = new Length(1, Unit.Kilometer);

//        Assert
        assertEquals(thousandMeter, oneKiloMeter);
    }

    @Test
    public void oneMeterShouldBeEqualToHundredCentimeter() {

//      Arrange
        Length oneMeter = new Length(1, Unit.Meter);
        Length hundredCentimeter = new Length(100, Unit.Centimeter);

//        Assert
        assertEquals(oneMeter, hundredCentimeter);
    }

    @Test
    public void twoMeterShouldBeOneMeterPlusAnotherOneMeter() {

//      Arrange
        Length oneMeter = new Length(1, Unit.Meter);
        Length anotherOneMeter = new Length(1, Unit.Meter);

        Length Expected = new Length(2, Unit.Meter);
//        Act
        Length Actual = oneMeter.add(anotherOneMeter);
//        Assert
        assertEquals(Expected, Actual);
    }

    @Test
    public void twoKilometerShouldBeOneKilometerPlusThousandMeter() {

//      Arrange
        Length oneKiloMeter = new Length(1, Unit.Kilometer);
        Length thousandMeter = new Length(1000, Unit.Meter);

        Length Expected = new Length(2, Unit.Kilometer);
//        Act
        Length Actual = oneKiloMeter.add(thousandMeter);
//        Assert
        assertEquals(Expected, Actual);
    }

    @Test
    @DisplayName("One Gram Should Be Equal To One Gram")
    public void oneGramShouldBeEqualToAnotherOneGram() {

//      Arrange
        Length oneGram = new Length(1, Unit.Grams);
        Length anotherOneGram = new Length(1, Unit.Grams);

//        Assert
        assertEquals(oneGram, anotherOneGram);
    }

    @Test
    public void fifteenHundredGramShouldBeFiveHundredGramPlusOneKilogram() {

//      Arrange
        Length fiveHundredGram = new Length(500, Unit.Grams);
        Length oneKilogram = new Length(1, Unit.Kilograms);

//      Act
        Length actual = fiveHundredGram.add(oneKilogram);

        Length expected = new Length(1500, Unit.Grams);
//      Assert
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotBeAbleToAddOneMeterAndOneGram() {

//      Arrange
        Length oneMeter = new Length(1, Unit.Meter);
        Length oneGram = new Length(1, Unit.Grams);

//      Act
        Length actual = oneMeter.add(oneGram);

        Length expected = new Length(0, Unit.Meter);
//        Assert
        assertEquals(expected, actual);
    }


}
