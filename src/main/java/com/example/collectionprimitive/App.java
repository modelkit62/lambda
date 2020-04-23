package com.example.collectionprimitive;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        List list = new ArrayList<>();
        list.add("Hello");
        list.add(1);
        list.add(new Object().getClass().getSimpleName());
        list.add(12d);

        list.forEach(System.out::println);


    }



}
