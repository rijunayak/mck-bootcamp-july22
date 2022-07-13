package com.mckinsey.bootcamp.exercise2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LengthTest {
    @Test
    public void oneMeterIsEqualToAnotherOneMeter(){
        Length oneMeter = new Length(1,"meters");
        Length anotherOneMeter = new Length(1,"meters");

        boolean result = oneMeter.equals(anotherOneMeter);

        assertTrue(result);
    }
    @Test
    public void oneMeterIsNotEqualToTwoMeters(){
        Length oneMeter = new Length(1,"meters");
        Length twoMeters = new Length(2,"meters");

        boolean result = oneMeter.equals(twoMeters);

        assertFalse(result);
    }
}
