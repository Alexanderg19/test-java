package com.alexcode.javatests.util;

import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {

    @Test
    public void when_is_divisible_by_3() {

        assertEquals("Fizz", FizzBuzz.fizzBuzz(3));
    }

    @Test
    public void when_is_divisible_by_5() {
        assertEquals("Buzz", FizzBuzz.fizzBuzz(5));
    }

    @Test
    public void when_is_divisible_by_6() {
        assertEquals("Fizz", FizzBuzz.fizzBuzz(6));
    }

    @Test
    public void when_is_divisible_by_10() {
        assertEquals("Buzz", FizzBuzz.fizzBuzz(10));
    }

    @Test
    public void when_is_divisible_by_15() {
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(15));
    }

    @Test
    public void when_is_divisible_by_2() {
        assertEquals("2", FizzBuzz.fizzBuzz(2));
    }

    @Test
    public void when_is_divisible_by_30() {
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(30));
    }

}