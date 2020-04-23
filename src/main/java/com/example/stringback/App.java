package com.example.stringback;

public class App {

    public static void main(String[] args) {
        System.out.println(stringBack("hola"));
    }

    private static String stringBack(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        final char[] chars = string.toCharArray();
        for(int i = chars.length-1; i >= 0; i--) {
            stringBuilder.append(chars[i]);
        }
        return stringBuilder.toString();
    }
}
