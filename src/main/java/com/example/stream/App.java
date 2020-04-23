package com.example.stream;

import java.util.Random;

public class App {


    public static void main(String[] args) {
        Random random = new Random();
        int sum = random.ints(1,10).limit(2).sorted().peek(System.out::println).sum();
        System.out.printf("La suma es %s ", sum);
    }

}
