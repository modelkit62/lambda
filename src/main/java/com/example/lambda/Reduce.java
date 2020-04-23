package com.example.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reduce {

    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("uno", "dos", "tres");

        Optional<String> reduce = stringList.stream().reduce((s1, s2) -> " - " + s1 + " -- " + s2);
        System.out.println(reduce);

    }
}
