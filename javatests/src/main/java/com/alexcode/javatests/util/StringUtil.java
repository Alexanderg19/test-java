package com.alexcode.javatests.util;

public class StringUtil {
    public static boolean isEmpty(String str) {
        return str == null || str.trim().equals("");
    }
}
