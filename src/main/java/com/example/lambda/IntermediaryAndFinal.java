package com.example.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class IntermediaryAndFinal{

    public static void main(String[] args) {

        List<String> lista = new ArrayList<>();
        lista.add("one");
        lista.add("two");
        lista.add("three");

        System.out.println(lista.size());

        Predicate<String> p1 = Predicate.isEqual("two");
        Predicate<String> p2 = Predicate.isEqual("three");

        List<String> list = new ArrayList<>();

        lista.stream()
                .peek(System.out::println)
                .filter(p1.or(p2))
                .forEach(list::add);

        System.out.println("size list => " + list.size() + " instead of " + lista.size());
    }

}
