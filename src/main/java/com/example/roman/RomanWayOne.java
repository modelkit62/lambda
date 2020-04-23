package com.example.roman;

public class RomanWayOne {
    public static String intToRoman(int num) {

        String[] teens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] units = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};

        System.out.println((62 % 100) / 10);
        System.out.println(62 % 10);
        return  teens[ (num % 100) / 10 ] + // esto es index 6
                units[num % 10];            // esto es index 2
    }

    public static void main(String[] args) {
        System.out.println(intToRoman(62));
    }
}
