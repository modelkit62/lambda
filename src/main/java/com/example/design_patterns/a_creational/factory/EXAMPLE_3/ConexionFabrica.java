package com.example.design_patterns.a_creational.factory.EXAMPLE_3;


import com.example.design_patterns.a_creational.factory.EXAMPLE_3.intermedio.IConexion;
import com.example.design_patterns.a_creational.factory.EXAMPLE_3.intermedio.impl.*;

public class ConexionFabrica {

	public IConexion getConexion(String motor) {
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
}
