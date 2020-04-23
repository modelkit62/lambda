package com.example.design_patterns.a_creational.abstract_factory.EXAMPLE_3;

public class FactoryProvider {

    public static AbstractFactory getFactory(String choice){

        if("Animal".equalsIgnoreCase(choice)){
            return new AnimalFactory();
        }
        else if("Color".equalsIgnoreCase(choice)){
            return new ColorFactory();
        }

        return null;
    }
}