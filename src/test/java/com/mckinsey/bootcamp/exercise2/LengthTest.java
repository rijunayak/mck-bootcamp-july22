package com.mckinsey.bootcamp.exercise2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class LengthTest {
    @Test
    public void oneMetersShouldBeEqualToAnotherOneMeters() {
        Length  oneMeter = new Length(1,"meter");
        Length anotherOneMeter = new Length(1,"meter");

        boolean comparisonResult = oneMeter.equalTo(anotherOneMeter);
        assertEquals(true, comparisonResult);
    }
    @Test
    public void hundredMetersShouldBeEqualToAnotherHundredMeters() {
        Length  hundredMeter = new Length(100,"meter");
        Length anotherHundredMeter = new Length(100,"meter");

        boolean comparisonResult = hundredMeter.equalTo(anotherHundredMeter);
        assertEquals(true, comparisonResult);
    }


}
