package com.alexcode.javatests.validatepassword;

import org.junit.Assert;
import org.junit.Test;

import static com.alexcode.javatests.validatepassword.PasswordUtil.SecurityLevel.*;
import static org.junit.Assert.*;

public class PasswordUtilTest {

    @Test
    public void weakHasLessThanEightLetters() {
       assertEquals(WEAK ,PasswordUtil.assessPassword("asjv12!"));
    }

    @Test
    public void weakHasOnlyLetters() {
        assertEquals(WEAK ,PasswordUtil.assessPassword("akjdjgakjgbkjghsfcb"));
    }

    @Test
    public void mediumHasLettersAndNumbers() {
        assertEquals(MEDIUM ,PasswordUtil.assessPassword("abcd1234"));
    }

    @Test
    public void strongHasLettersNumbersAndSymbols() {
        assertEquals(STRONG ,PasswordUtil.assessPassword("abcd1234!"));
    }


}