package com.example.design_patterns.c_behavourial.strategy.EXAMPLE_3;

public abstract class AnalisisSimple implements IEstrategia {

	@Override
	public void analizar() {
		iniciar();
		saltarZip();
		detener();
	}

	abstract void iniciar();

	abstract void saltarZip();

	abstract void detener();
}
