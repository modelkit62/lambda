package com.example.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceExample {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);


        Optional<Integer> integer = list.stream().reduce(Integer::max);
        System.out.println(integer);
        System.out.println(integer.get());

    }


}
