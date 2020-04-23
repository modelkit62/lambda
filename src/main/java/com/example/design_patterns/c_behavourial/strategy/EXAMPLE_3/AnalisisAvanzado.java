package com.example.design_patterns.c_behavourial.strategy.EXAMPLE_3;

public abstract class AnalisisAvanzado implements IEstrategia{

	@Override
	public void analizar() {
		iniciar();
		analizarMemoria();
		analizarKeyloggers();
		analizarRootKits();
		descomprimirZip();
		detener();
	}

	abstract void iniciar();

	abstract void analizarMemoria();

	abstract void analizarKeyloggers();
	
	abstract void analizarRootKits();
	
	abstract void descomprimirZip();	

	abstract void detener();
}
