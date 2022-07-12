package com.mckinsey.bootcamp.exercise2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UnitComparisonTest {
    @Test
    public void OneMeterShouldNotBeEqualToTwoMeters() {
        //arrange
        UnitComparison unitComparison;
        unitComparison = new UnitComparison();
        //act
        boolean comparison = unitComparison.compare(1.0, 2.0);
        //assert
        assertEquals(false, comparison);

    }
}
