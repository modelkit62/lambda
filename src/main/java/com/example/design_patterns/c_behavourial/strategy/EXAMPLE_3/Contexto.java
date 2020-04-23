package com.example.design_patterns.c_behavourial.strategy.EXAMPLE_3;

public class Contexto {
	
	private IEstrategia estrategia;
	
	public Contexto(IEstrategia estrategia) {
		this.estrategia = estrategia;
	}
	
	public void ejecutar() {
		this.estrategia.analizar();
	}

}
