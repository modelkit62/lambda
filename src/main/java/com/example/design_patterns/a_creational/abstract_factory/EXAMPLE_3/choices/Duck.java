package com.example.design_patterns.a_creational.abstract_factory.EXAMPLE_3.choices;

public class Duck implements Animal {

    @Override
    public String getType() {
        return "Duck";
    }

    @Override
    public String makeSound() {
        return "Squeks";
    }
}
