package com.alexcode.javatests.util;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringHelpfulTest {
    @Test
    public void testRepeatStringOnce() {
        Assert.assertEquals("Hola", StringHelpful.repeat("Hola", 1));
    }

    @Test
    public void testRepeatStringMultipliesTimes() {
        Assert.assertEquals("HolaHolaHola", StringHelpful.repeat("Hola", 3));
    }

    @Test
    public void testRepeatStringZeroTimes() {
        Assert.assertEquals("", StringHelpful.repeat("Hola", 0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRepeatStringNegativeTimes() {
        StringHelpful.repeat("Hola", -1);
    }
}