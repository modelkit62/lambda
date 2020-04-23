package com.example.design_patterns.a_creational.abstract_factory.EXAMPLE_3;

import com.example.design_patterns.a_creational.abstract_factory.EXAMPLE_3.choices.Brown;
import com.example.design_patterns.a_creational.abstract_factory.EXAMPLE_3.choices.Color;
import com.example.design_patterns.a_creational.abstract_factory.EXAMPLE_3.choices.White;

public class ColorFactory implements AbstractFactory<Color> {

    @Override
    public Color create(String colorType) {
        if ("Brown".equalsIgnoreCase(colorType)) {
            return new Brown();
        } else if ("White".equalsIgnoreCase(colorType)) {
            return new White();
        }

        return null;
    }

}
