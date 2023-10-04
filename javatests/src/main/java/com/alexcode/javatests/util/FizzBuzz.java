package com.alexcode.javatests.util;

public class FizzBuzz {

    public static String fizzBuzz(int numero) {

        String result = "";

        if (numero%3 == 0 && numero%5 == 0) {
            result = "FizzBuzz";
        } else if (numero % 5 == 0) {
            result = "Buzz";
        }else if (numero%3 == 0 ) {
            result = "Fizz";
        } else {
           result = String.valueOf(numero);
            return result;
        }

        return result;
    }
}
