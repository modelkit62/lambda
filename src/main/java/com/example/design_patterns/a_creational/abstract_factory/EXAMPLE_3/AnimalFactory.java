package com.example.design_patterns.a_creational.abstract_factory.EXAMPLE_3;

import com.example.design_patterns.a_creational.abstract_factory.EXAMPLE_3.choices.Animal;
import com.example.design_patterns.a_creational.abstract_factory.EXAMPLE_3.choices.Dog;
import com.example.design_patterns.a_creational.abstract_factory.EXAMPLE_3.choices.Duck;

public class AnimalFactory implements AbstractFactory<Animal> {

    @Override
    public Animal create(String animalType) {
        if ("Dog".equalsIgnoreCase(animalType)) {
            return new Dog();
        } else if ("Duck".equalsIgnoreCase(animalType)) {
            return new Duck();
        }
        return null;
    }

}