package com.mckinesy.bootcamp.exercise2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LengthComparisonTest {

    @Test
    public void oneMetersShouldNotEqualTwoMeters(){
        LengthComparison lengthComparison = new LengthComparison("1meters","2meters");
        boolean comparisonResult = lengthComparison.comparison();
        assertEquals(false,comparisonResult);

    }
}
