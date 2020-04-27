package com.example.design_patterns.a_creational.abstract_factory.EXAMPLE_4;

import com.example.design_patterns.a_creational.abstract_factory.EXAMPLE_4.intermedio.FabricaAbstracta;

public class FabricaProductor {

	public static FabricaAbstracta getFactory(String tipoFabrica) {

		if (tipoFabrica.equalsIgnoreCase("BD")) {
			return new ConexionBDFabrica();

		} else if (tipoFabrica.equalsIgnoreCase("REST")) {
			return new ConexionRESTFabrica();
		}

		return null;
	}

}
