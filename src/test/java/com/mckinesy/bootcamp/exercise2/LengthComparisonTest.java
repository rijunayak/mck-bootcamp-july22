package com.mckinesy.bootcamp.exercise2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LengthComparisonTest  {

    @Test
    public void oneMetersShouldNotEqualTwoMeters(){
        Length oneMeter = new Length(1 , "meters");
        Length twoMeter = new Length(2 , "meters");
        boolean comparisonResult = oneMeter.isEqual(twoMeter);
        assertFalse(comparisonResult);

    }

    @Test
    public void fiveMetersShouldEqualFiveMeters(){
        Length fiveMeter = new Length(5, "meters");
        Length fiveMeter1 = new Length(5 , "meters");
        boolean comparisonResult = fiveMeter.isEqual(fiveMeter1);
        assertTrue(comparisonResult);

    }


}

