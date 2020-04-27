package com.example.design_patterns.a_creational.abstract_factory.EXAMPLE_4.intermedio;

public interface FabricaAbstracta {

	IConexionBD getBD(String motor);
	IConexionREST getREST(String area);
	
}
