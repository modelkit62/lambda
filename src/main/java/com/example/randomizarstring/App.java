package com.example.randomizarstring;

public class App {

    public static void main(String[] args) {

        String[] frases = {"frase uno: %s", "frase dos: %s", "frase tres: %s"};
        String[] espacios = {"polla", "vinagre", "cojones", "vinagreta"};

        for (int i = 0; i < 10; i++) {

            String frase = frases[i % frases.length];
            String espacio = espacios[i % espacios.length];

            String definitivo = String.format(frase, espacio);

            System.out.println(definitivo);

        }

        String base = "Yo soy la base y este es el parametro: %s";
        String parametro = "QUE TE DEN POR EL KK!";
        System.out.println(String.format(base, parametro));
    }
}
