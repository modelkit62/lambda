package com.example.gameoflife;

import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppGameTest {

    AppGame appGame;

    @Before
    public void setUp(){
        appGame = new AppGame(6, 8);
    }

    @Test
    public void testTieneDosVecinosVivos(){
        appGame.setAlive(2, 2);
        appGame.setAlive(2, 3);
        appGame.setAlive(2, 4);
        assertEquals(2, appGame.getVecinosVivos(2, 3));
    }

    @Test
    public void testMutacion(){
        appGame.setAlive(2, 2);
        appGame.setAlive(2, 3);
        appGame.setAlive(2, 4);
        appGame.setAlive(3, 2);
        appGame.setAlive(3, 3);

        assertEquals(4, appGame.getVecinosVivos(2, 3));
        appGame.siguientePaso();
        assertEquals(5, appGame.getVecinosVivos(2, 3));
        appGame.siguientePaso();
        assertEquals(3, appGame.getVecinosVivos(2, 3));
    }

}
