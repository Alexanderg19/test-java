package com.alexcode.javatests.util;

import java.util.Scanner;

public class RomanNumerals {

    public static String arabicToRoman(int numero) {

        if (numero < 1 && numero > 3999) {
            System.out.println("Número no permitido");
        }

        String[] units = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] thousandths = {"", "M", "MM", "MMM"};

        int indexUnit, indexTen, indexHundred, indexThounsandths;

        indexThounsandths = numero / 1000;
        numero = numero % 1000;
        indexHundred = numero / 100;
        numero = numero % 100;
        indexTen = numero / 10;
        numero = numero % 10;
        indexUnit = numero;

        return thousandths[indexThounsandths] + hundreds[indexHundred] + tens[indexTen] + units[indexUnit];

    }
}
