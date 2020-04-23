package com.example.reduce;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;


public class App {

    private void method(){
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        /*int result = numbers
                .stream()
                .reduce(0, (subtotal, element) -> subtotal + element);*/
        int result = numbers.stream().reduce(0, Integer::sum);
        System.out.println(result);

        int result2 = numbers.stream().reduce(1, Integer::sum);
        System.out.println(result2);
        assert result2 == 22;

        /* WITH STRING */
        List<String> letters = Arrays.asList("a", "b", "c", "d", "e");
        String result3 = letters.stream().reduce("", String::concat);
        System.out.println(result3);
        assert result3.equals("abcde");

    }

    public static void main(String[] args) {
        new App().method();
    }

}
