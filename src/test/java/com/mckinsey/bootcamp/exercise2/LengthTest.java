package com.mckinsey.bootcamp.exercise2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LengthTest {
    @Test
    public void OneMeterShouldNotBeEqualToTwoMeters() {
        //arrange
        Length oneMeter = new Length(1, "meter");
        Length twoMeter = new Length(2, "meter");
        //act
        boolean result = oneMeter.equals(twoMeter);
        //assert
        assertFalse(result);
    }

    @Test
    public void thousandMetersEqualsToAnotherThousandMeters() {
        //arrange
        Length thousandMeter = new Length(1000, "meters");
        Length anotherThousandMeter = new Length(1000, "meters");
        //act
        boolean result = thousandMeter.equals(anotherThousandMeter);
        //assert
        assertTrue(result);
    }

    @Test
    public void hundredCentimetersEqualsToOneMeter() {
        //arrange
        Length hundredCentimeters = new Length(100, "centimeters");
        Length oneMeter = new Length(1, "meters");
        //act
        boolean result = hundredCentimeters.equals(oneMeter);
        //assert
        assertFalse(result);
    }
}
