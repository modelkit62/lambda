package com.example.pruebacollections;

import java.util.Objects;

public class Person {

    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = Objects.requireNonNull(name, "GILIPOLLAS");
        // this.name = name;
    }

    public String getName() {
        return name;
    }

    public Person setName(String name) {
        this.name = name;
        return this;
    }
}
