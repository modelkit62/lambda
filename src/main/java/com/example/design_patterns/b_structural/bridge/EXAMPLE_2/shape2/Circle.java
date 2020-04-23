package com.example.design_patterns.b_structural.bridge.EXAMPLE_2.shape2;

public class Circle extends Shape {

	public Circle(Color color) {
		super(color);
	}
	
	@Override
	public void applyColor() {
		color.applyColor();
	}

}
