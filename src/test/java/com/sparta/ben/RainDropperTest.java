package com.sparta.ben;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;


public class RainDropperTest {
    NumberFactors numberFactors = new NumberFactors();
    Raindropper raindropper = new Raindropper();

    @Test
    @DisplayName("Testing Pling")
    void testingPling() {
        Assertions.assertEquals("Pling", raindropper.rainDropper(numberFactors.numberFactors(9)));
    }

    @Test
    @DisplayName("Testing Plang")
    void testingPlang() {
        Assertions.assertEquals("Plang", raindropper.rainDropper(numberFactors.numberFactors(10)));
    }

    @Test
    @DisplayName("Testing Plong")
    void testingPlong() {
        Assertions.assertEquals("Plong", raindropper.rainDropper(numberFactors.numberFactors(14)));
    }

    @Test
    @DisplayName("TestingANumberThatMeetsNoCriteria")
    void testingANumberThatMeetsNoCriteria() {
        Assertions.assertEquals("23", raindropper.rainDropper(numberFactors.numberFactors(23)));
    }

    @Nested
    @DisplayName("Testing Combinations of Pling, Plang & Plong")
    class testingCombinations {
        @Test
        @DisplayName("PlingPlang")
        void testingPlingPlang() {
            Assertions.assertEquals("PlingPlang", raindropper.rainDropper(numberFactors.numberFactors(15)));
        }

        @Test
        @DisplayName("PlingPlong")
        void testingPlingPlong() {
            Assertions.assertEquals("PlingPlong", raindropper.rainDropper(numberFactors.numberFactors(21)));
        }
        @Test
        @DisplayName("PlangPlong")
        void testingPlangPlong() {
            Assertions.assertEquals("PlangPlong", raindropper.rainDropper(numberFactors.numberFactors(35)));
        }
        @Test
        @DisplayName("PlingPlangPlong")
        void testingPlingPlangPlong() {
            Assertions.assertEquals("PlingPlangPlong", raindropper.rainDropper(numberFactors.numberFactors(105)));
        }

    }

    }



