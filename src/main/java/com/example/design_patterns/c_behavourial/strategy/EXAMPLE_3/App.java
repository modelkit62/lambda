package com.example.design_patterns.c_behavourial.strategy.EXAMPLE_3;

public class App {
	
	public static void main(String[] args) {
		Contexto contexto = new Contexto(new AntivirusAvanzado());
		contexto.ejecutar();
	}

}
