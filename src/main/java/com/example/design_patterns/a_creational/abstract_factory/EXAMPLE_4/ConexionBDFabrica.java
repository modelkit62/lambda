package com.example.design_patterns.a_creational.abstract_factory.EXAMPLE_4;


import com.example.design_patterns.a_creational.abstract_factory.EXAMPLE_4.intermedio.FabricaAbstracta;
import com.example.design_patterns.a_creational.abstract_factory.EXAMPLE_4.intermedio.IConexionBD;
import com.example.design_patterns.a_creational.abstract_factory.EXAMPLE_4.intermedio.IConexionREST;
import com.example.design_patterns.a_creational.abstract_factory.EXAMPLE_4.intermedio.impl.*;

public class ConexionBDFabrica implements FabricaAbstracta {

	@Override
	public IConexionBD getBD(String motor) {
		if (motor == null) {
			return new ConexionVacia();
		}
		if (motor.equalsIgnoreCase("MYSQL")) {
			return new ConexionMySQL();
		} else if (motor.equalsIgnoreCase("ORACLE")) {
			return new ConexionOracle();
		} else if (motor.equalsIgnoreCase("POSTGRE")) {
			return new ConexionPostgreSQL();
		} else if (motor.equalsIgnoreCase("SQL")) {
			return new ConexionSQLServer();
		}

		return new ConexionVacia();
	}

	@Override
	public IConexionREST getREST(String area) {
		return null;
	}
}
