package com.alexcode.javatests.discounts;

import org.junit.Test;

import static org.junit.Assert.*;

public class PriceCalculatorShould {

    @Test
    public void total_zero_when_there_are_not_prices() {

        PriceCalculator priceCalculator = new PriceCalculator();

        assertEquals(0.0, priceCalculator.getTotal(), 0.1 );
    }

    @Test
    public void total_is_the_sum_of_prices() {
        PriceCalculator priceCalculator = new PriceCalculator();

        priceCalculator.addPrice(10.2);
        priceCalculator.addPrice(15.5);

        assertEquals(25.7, priceCalculator.getTotal(), 0.1 );
    }

    @Test
    public void apply_discount() {
        PriceCalculator priceCalculator = new PriceCalculator();

        priceCalculator.addPrice(100);
        priceCalculator.addPrice(50);
        priceCalculator.addPrice(50);


        priceCalculator.setDiscount(25);

        assertEquals(150.0, priceCalculator.getTotal(), 0.1 );
    }
}