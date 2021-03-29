package com.sparta.ben;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class NumberFactorsTest {
    NumberFactors numberFactors = new NumberFactors();

    @Test
    @DisplayName("Testing Number of Factors")
    void testingNumberOfFactors() {
        Assertions.assertEquals(4,numberFactors.numberFactors(6).size());
    }

    @Test
    @DisplayName("Testing Correct Factors")
    void testingCorrectFactors() {
        Assertions.assertTrue(numberFactors.numberFactors(20).contains(10));
    }
    @Test
    @DisplayName("Testing Negative Number Exception")
    void testingNegativeNumber() {
       Throwable exception = Assertions.assertThrows(IllegalArgumentException.class, () -> numberFactors.numberFactors(-4));
       Assertions.assertEquals("Only positive numbers are accepted.",exception.getMessage());
    }

    @Test
    @DisplayName("Testing 0 Exception")
    void testing0Exception() {
        Throwable exception = Assertions.assertThrows(IllegalArgumentException.class, () -> numberFactors.numberFactors(0));
        Assertions.assertEquals("Only positive numbers are accepted.",exception.getMessage());
    }








}
