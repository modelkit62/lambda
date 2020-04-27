package com.example.design_patterns.a_creational.abstract_factory.EXAMPLE_4;

import com.example.design_patterns.a_creational.abstract_factory.EXAMPLE_4.intermedio.FabricaAbstracta;
import com.example.design_patterns.a_creational.abstract_factory.EXAMPLE_4.intermedio.IConexionBD;
import com.example.design_patterns.a_creational.abstract_factory.EXAMPLE_4.intermedio.IConexionREST;

public class App {

	public static void main(String[] args) {
		FabricaAbstracta fabricaBD = FabricaProductor.getFactory("BD");
		IConexionBD cxBD1 = fabricaBD.getBD("MYSQL");

		cxBD1.conectar();

		FabricaAbstracta fabricaREST = FabricaProductor.getFactory("REST");
		IConexionREST cxRS1 = fabricaREST.getREST("COMPRAS");

		cxRS1.leerURL("https://www.youtube.com/subscription_center?add_user=mitocode");
	}

}
