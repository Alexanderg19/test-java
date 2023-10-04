package com.alexcode.javatests.player;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class PlayerTest {

    @Test
    public void loseWhenDiceNumberIsTooLow() {
        //Dice dice = new Dice(6);

        Dice dice = Mockito.mock(Dice.class);
        Mockito.when(dice.roll()).thenReturn(2);

        Player player = new Player(dice, 2);
        assertFalse(player.play());
    }

    @Test
    public void winsWhenDiceNumberIsBig() {
        //Dice dice = new Dice(6);

        Dice dice = Mockito.mock(Dice.class);
        Mockito.when(dice.roll()).thenReturn(4);

        Player player = new Player(dice, 2);
        assertTrue(player.play());
    }
}