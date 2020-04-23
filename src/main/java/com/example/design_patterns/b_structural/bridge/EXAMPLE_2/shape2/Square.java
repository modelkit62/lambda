package com.example.design_patterns.b_structural.bridge.EXAMPLE_2.shape2;

public class Square extends Shape {

	public Square(Color color) {
		super(color);
	}
	
	@Override
	public void applyColor() {
		color.applyColor();
	}

}
