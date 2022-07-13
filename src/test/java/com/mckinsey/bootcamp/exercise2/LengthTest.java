package com.mckinsey.bootcamp.exercise2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class LengthTest {
    @Test
    public void oneMetersShouldBeEqualToAnotherOneMeters() {
        Length oneMeter = new Length(1, "meter");
        Length anotherOneMeter = new Length(1, "meter");

        //boolean comparisonResult = oneMeter.equalTo(anotherOneMeter);

        boolean comparisonResult = oneMeter.equals(anotherOneMeter);
        assertTrue(comparisonResult);
    }

    @Test
    public void hundredMetersShouldBeEqualToAnotherHundredMeters() {
        Length hundredMeter = new Length(100, "meter");
        Length anotherHundredMeter = new Length(100, "meter");

        //boolean comparisonResult = hundredMeter.equalTo(anotherHundredMeter);
        boolean comparisonResult = hundredMeter.equals(anotherHundredMeter);

        assertTrue(comparisonResult);
    }

    @Test
    public void hundredMetersShouldBeNotEqualToThousandMeters() {
        Length hundredMeter = new Length(100, "meter");
        Length thousandMeter = new Length(1000, "meter");

        //boolean comparisonResult = hundredMeter.equalTo(anotherHundredMeter);
        boolean comparisonResult = hundredMeter.equals(thousandMeter);

        assertFalse(comparisonResult);
    }


}
