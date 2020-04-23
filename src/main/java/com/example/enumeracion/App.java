package com.example.enumeracion;

public class App {

    enum Level{
        UNO("1"), DOS("2");

        private String adjetivo;

        Level(String adjetivo) {
            this.adjetivo = adjetivo;
        }
    }

    // final static String NIVEL = new Level();

    public static void main(String[] args) {
        System.out.println(Level.UNO.adjetivo);
        System.out.println(Level.UNO);
        System.out.println(Level.UNO.name());
        System.out.println(Level.UNO.ordinal());
        System.out.println(Nivel.ONE);

        Level[] values = Level.values();
        for (int i = 0; i <= values.length -1 ; i++) {
            System.out.println(values[i]);

        }


    }

}
