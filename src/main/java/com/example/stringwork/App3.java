package com.example.stringwork;

import java.util.regex.Pattern;

public class App3 {

    public static void main(String[] args) {

        String pattern = "^Q[^u]\\d+\\.";
        String[] input = {
                "QA777. is the next flight. It is on time.",
                "Quack, Quack, Quack!"
        };
        Pattern p = Pattern.compile(pattern);
        for (String in : input) {
            boolean found = p.matcher(in).lookingAt();
            System.out.println("'" + pattern + "'" +
                    (found ? " matches '" : " doesn't match '") + in + "'");
        }

    }


}
