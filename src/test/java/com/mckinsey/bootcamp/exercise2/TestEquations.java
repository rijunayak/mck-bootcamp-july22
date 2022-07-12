package com.mckinsey.bootcamp.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestEquations {
    @Test
    @DisplayName("Testing Equations when Inputs are 1000 mtrs and 1000 mtrs")
    public void testEquationsWhenInputsAre1000MetersAnd1000Meters() {
        TestEquations testEquations = new TestEquations();
        boolean compare = testEquations.equals();
        Assertions.assertEquals(false,compare);
    }
}
