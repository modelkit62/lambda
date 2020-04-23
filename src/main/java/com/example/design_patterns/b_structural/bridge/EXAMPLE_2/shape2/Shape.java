package com.example.design_patterns.b_structural.bridge.EXAMPLE_2.shape2;

public abstract class Shape {

	protected Color color;
	
	public Shape(Color color) {
		this.color = color;
	}
	
	abstract public void applyColor();
}
