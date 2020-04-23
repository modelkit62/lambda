package com.example.roman;

public class RomanWayTwo {

    public static void main(String[] args) {
        System.out.println( intToRoman(46));
    }

    public static String intToRoman(int figura) {
        StringBuilder sb = new StringBuilder();
        int veces = 0;
        int[] numeros = new int[] { 50, 40, 10, 9, 5, 4, 1 } ;
        String[] romanos = new String[] { "L", "XL", "X", "IX", "V", "IV", "I" };
        for (int i = 0; i < numeros.length ; i++) {
            veces = figura / numeros[i]; // 1a 46/50 = 0 --- 2a 46/40 = 1
            figura = figura % numeros[i]; // 1a 46%50 = 46 --- 2a 46%40 = 6
            while (veces > 0) {
                sb.append(romanos[i]);
                veces--;
            }
        }
        return sb.toString();
    }
}
