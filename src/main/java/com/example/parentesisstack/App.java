package com.example.parentesisstack;

import java.util.Stack;

public class App {


    private static String check(String s) throws IllegalArgumentException {

        Stack<Character> stack = new Stack();

        if (s.isEmpty()) {
            return "Sorry, not valid String";
            // throw new IllegalArgumentException("Error!");
        }
        String clean = s.trim();
        String sanitized = clean.replaceAll("//s+", "");

        for (int i = 0; i < sanitized.length(); i++) {
            char primero = sanitized.charAt(i);
            if (primero == '{') {
                stack.push(primero);
            } else if (primero == '}') {
                if (stack.isEmpty()) {
                    return "Espejo desigual";
                } else {
                    stack.pop();
                }
            }
        }
        return stack.empty() ? "Balanceado" : "Quedaba 1";
    }

    public static void main(String[] args) throws IllegalArgumentException {
        System.out.println(check("{}}"));
    }


}
