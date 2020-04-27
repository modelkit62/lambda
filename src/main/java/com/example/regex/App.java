package com.example.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {


    public static void main(String[] args) {
        System.out.println(compara_1(" Hello!"));
        System.out.println(compara_2());
    }

    private static boolean compara_1(String s) {
        return s.matches("^[ ]{1}Hello!$");
    }

    private static boolean compara_2() {
        Pattern pattern = Pattern.compile("^[ ]{1}Hello!$");
        Matcher matcher = pattern.matcher(" Hello!");
        return matcher.matches();
    }
}
