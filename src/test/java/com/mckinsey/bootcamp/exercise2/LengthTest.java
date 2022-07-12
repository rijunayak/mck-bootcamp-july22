package com.mckinsey.bootcamp.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LengthTest {
    @Test
    public void oneMeterIsNotEqualToTwoMeters(){
        Length oneMeter = new Length(1,"meters");
        Length twoMeters = new Length(2,"meters");
        boolean result = oneMeter.equals(twoMeters);
        assertEquals(false,result);
    }

    @Test
    public void thousandMetersEqualstoOneKilometer(){
        Length thousandMeters = new Length(1000, "meters");
        Length oneKilometers = new Length(1,"kilometers");
        boolean result = oneKilometers.equals(oneKilometers);
        assertEquals(true,result);
    }
}
