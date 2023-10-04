package com.alexcode.javatests.util;

import org.junit.Test;

import static org.junit.Assert.*;

public class RomanNumeralsTest {

    @Test
    public void valid_conversion_of_1_to_romans() {
        assertEquals("I", RomanNumerals.arabicToRoman(1));
    }

    @Test
    public void valid_conversion_of_9_to_romans() {
        assertEquals("IX", RomanNumerals.arabicToRoman(9));
    }

    @Test
    public void valid_conversion_10_to_rommans() {
        assertEquals("X", RomanNumerals.arabicToRoman(10));

    }

    @Test
    public void valid_conversion_120_to_rommans() {
        assertEquals("CXX", RomanNumerals.arabicToRoman(120));

    }

    @Test
    public void valid_conversion_1206_to_rommans() {
        assertEquals("MCCVI", RomanNumerals.arabicToRoman(1206));

    }

    @Test
    public void valid_conversion_2384_to_rommans() {
        assertEquals("MMCCCLXXXIV", RomanNumerals.arabicToRoman(2384));

    }
}