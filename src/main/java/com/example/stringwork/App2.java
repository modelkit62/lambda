package com.example.stringwork;

import java.util.SplittableRandom;
import java.util.StringTokenizer;

public class App2 {


    private static final String SAMPLE_STRING = "Hola hola esto es Carrusel Deportivo";

    public static void main(String[] args) {

        // Method using regexp split
        StringBuilder sb1 = new StringBuilder();
        for (String word : SAMPLE_STRING.split(" ")) {
            if (sb1.length() > 0) {
                sb1.append(", ");
            }
            sb1.append(word);
        }
        System.out.println(sb1);
        // Method using a StringTokenizer
        StringTokenizer st = new StringTokenizer(SAMPLE_STRING);
        StringBuilder sb2 = new StringBuilder();
        while (st.hasMoreElements()) {
            sb2.append(st.nextToken());
            if (st.hasMoreElements()) {
                sb2.append(", ");
            }
        }
        System.out.println(sb2);
    }
}
