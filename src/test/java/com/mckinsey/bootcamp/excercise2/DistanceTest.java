package com.mckinsey.bootcamp.excercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DistanceTest {

    @Test

    public void checkIfDistance1000metersIsEqualTo1000meters(){

        Distance distance = new Distance(1000,1000);
        boolean result = distance.checkEquality();
        assertEquals(true,result);


    }
}
