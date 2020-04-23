package com.example.practica;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppGame2Test {

    AppGame2 app= new AppGame2(6, 8);

    @Test
    public void getVecinitosVivosTest() {
        app.setVivo(2, 2);
        app.setVivo(2, 3);
        app.setVivo(2, 4);
        assertEquals(2, app.getVecinitosVivos(2, 3));
    }
}