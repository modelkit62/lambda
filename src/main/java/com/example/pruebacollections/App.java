package com.example.pruebacollections;

import java.util.Objects;

public class App {
    public static void main(String[] args) {

        String name = null;

        Person person = null;
        try {
            person = new Person(name);
        } catch (Exception e) {
            System.out.println("Te jodes");
            e.printStackTrace();

        }
        //person.setName("Alan");
        //System.out.println(person.getName());


        /*String str = null;
        str = Objects.requireNonNull(str);*/


    }
}
