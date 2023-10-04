package com.alexcode.javatests.util;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringUtilTest {

    @Test
    public void string_is_empty_when_have_not_space() {
        assertTrue(StringUtil.isEmpty(""));
    }

    @Test
    public void string_is_empty_when_is_null() {
        assertTrue(StringUtil.isEmpty(null));
    }

    @Test
    public void string_is_empty_when_have_space() {
        assertTrue(StringUtil.isEmpty(" "));
    }

    @Test
    public void string_not_empty_when_have_characters() {

        assertFalse(StringUtil.isEmpty("Hola"));
    }
}