package com.mckinsey.bootcamp.excercise2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LengthTest {

    @Test
    @DisplayName("One Meter Should Be Equal To One Meter")
    public void oneMeterShouldBeEqualToOneMeter() {

//      Arrange
        Length oneMeter = new Length(1, "meter");
        Length anotherOneMeter = new Length(1, "meter");

//        Assert
        assertEquals(oneMeter, anotherOneMeter);
    }

    @Test
    public void tenMeterShouldNotBeEqualToFiveMeter() {

//      Arrange
        Length tenMeter = new Length(10, "meter");
        Length FiveMeter = new Length(5, "meter");

//        Assert
        assertNotEquals(tenMeter, FiveMeter);
    }
}
