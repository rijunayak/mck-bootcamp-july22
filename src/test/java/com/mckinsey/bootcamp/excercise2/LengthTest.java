package com.mckinsey.bootcamp.excercise2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LengthTest {

    @Test
    @DisplayName("One Meter Should Be Equal To One Meter")
    public void oneMeterShouldBeEqualToOneMeter() {

//      Arrange
        Length oneMeter = new Length(1, "meter");
        Length anotherOneMeter = new Length(1, "meter");

//        Act
        Boolean result = oneMeter.isEqual(anotherOneMeter);

//        Assert
        assertEquals(true, result);

    }

    @Test
    public void tenMeterShouldNotBeEqualToFiveMeter() {

//      Arrange
        Length tenMeter = new Length(10, "meter");
        Length anotherFiveMeter = new Length(5, "meter");

//        Act
        Boolean result = tenMeter.isEqual(anotherFiveMeter);

//        Assert
        assertEquals(false, result);

    }
}
