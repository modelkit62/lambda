package com.example.design_patterns.a_creational.abstract_factory.EXAMPLE_4;

import com.example.design_patterns.a_creational.abstract_factory.EXAMPLE_4.intermedio.FabricaAbstracta;
import com.example.design_patterns.a_creational.abstract_factory.EXAMPLE_4.intermedio.IConexionBD;
import com.example.design_patterns.a_creational.abstract_factory.EXAMPLE_4.intermedio.IConexionREST;
import com.example.design_patterns.a_creational.abstract_factory.EXAMPLE_4.intermedio.impl.ConexionRESTCompras;
import com.example.design_patterns.a_creational.abstract_factory.EXAMPLE_4.intermedio.impl.ConexionRESTNoArea;
import com.example.design_patterns.a_creational.abstract_factory.EXAMPLE_4.intermedio.impl.ConexionRESTVentas;

public class ConexionRESTFabrica implements FabricaAbstracta {

	@Override
	public IConexionREST getREST(String area) {
		if (area == null) {
			return new ConexionRESTNoArea();
		}
		if (area.equalsIgnoreCase("COMPRAS")) {
			return new ConexionRESTCompras();
		} else if (area.equalsIgnoreCase("VENTAS")) {
			return new ConexionRESTVentas();
		}

		return new ConexionRESTNoArea();
	}

	@Override
	public IConexionBD getBD(String motor) {
		return null;
	}
}
