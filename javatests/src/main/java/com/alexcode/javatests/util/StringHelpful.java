package com.alexcode.javatests.util;

public class StringHelpful {
    
    public static String repeat(String str, int times) {

        if (times < 0) {
            throw new IllegalArgumentException("Negative time not allowed");
        }

        String result = "";

        for (int i = 0; i < times; i++) {
            result += str;
        }
        return result;
    }


}
