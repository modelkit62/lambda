package com.example.design_patterns.a_creational.abstract_factory.EXAMPLE_3.choices;

public class Dog implements Animal {


    @Override
    public String getType() {
        return "Dog";
    }

    @Override
    public String makeSound() {
        return "Barks";
    }
}
