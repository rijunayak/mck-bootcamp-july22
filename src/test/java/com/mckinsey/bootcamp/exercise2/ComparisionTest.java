package com.mckinsey.bootcamp.exercise2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class ComparisionTest {
    @Test
    @DisplayName("Comparison between 1 meter should not equal to 2 meters")
    public void OneMeterShouldNotEqualToTwoMeters() {
        Comparision comparision = new Comparision();
        boolean ComparisonResult = comparision.ComparisionResult();
        assertFalse(ComparisonResult);




    }
}
