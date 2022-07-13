package com.mckinsey.bootcamp.excercise2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.mckinsey.bootcamp.excercise2.Length.*;
import static org.junit.jupiter.api.Assertions.*;

public class LengthTest {

    @Test
    @DisplayName("One Meter Should Be Equal To One Meter")
    public void oneMeterShouldBeEqualToOneMeter() {

//      Arrange
        Length oneMeter = new Length(1, Units.Meter);
        Length anotherOneMeter = new Length(1, Units.Meter);

//        Assert
        assertEquals(oneMeter, anotherOneMeter);
    }

    @Test
    public void tenMeterShouldNotBeEqualToFiveMeter() {

//      Arrange
        Length tenMeter = new Length(10, Units.Meter);
        Length FiveMeter = new Length(5, Units.Meter);

//        Assert
        assertNotEquals(tenMeter, FiveMeter);
    }

    @Test
    public void thousandMeterShouldBeEqualToOneKiloMeter() {

//      Arrange
        Length thousandMeter = new Length(1000, Units.Meter);
        Length oneKiloMeter = new Length(1, Units.KiloMeter);

//        Assert
        assertEquals(thousandMeter, oneKiloMeter);
    }

    @Test
    public void oneMeterShouldBeEqualToHundredCentimeter() {

//      Arrange
        Length oneMeter = new Length(1, Units.Meter);
        Length hundredCentimeter = new Length(100, Units.CentiMeter);

//        Assert
        assertEquals(oneMeter, hundredCentimeter);
    }
}
