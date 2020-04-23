package com.example.design_patterns.a_creational.abstract_factory.EXAMPLE_3;

import com.example.design_patterns.a_creational.abstract_factory.EXAMPLE_3.choices.Animal;
import com.example.design_patterns.a_creational.abstract_factory.EXAMPLE_3.choices.Color;

public class App {

    public static void main(String[] args) {
        AbstractFactory abstractFactory;

        //creating a brown toy dog
        abstractFactory = FactoryProvider.getFactory("Animal");
        Animal toy =(Animal) abstractFactory.create("Dog");

        abstractFactory = FactoryProvider.getFactory("Color");
        Color color =(Color) abstractFactory.create("Brown");

        String result = "A " + toy.getType() + " with " + color.getColor() + " color " + toy.makeSound();

        System.out.println(result);
    }

}
