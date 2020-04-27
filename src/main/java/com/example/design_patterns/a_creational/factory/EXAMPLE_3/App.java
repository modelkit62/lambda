package com.example.design_patterns.a_creational.factory.EXAMPLE_3;

import com.example.design_patterns.a_creational.factory.EXAMPLE_3.intermedio.IConexion;


/* Pattern Fabrica devuelve instancias de un objeto particular por medio de un identificador */
public class App {

	public static void main(String[] args) {
		ConexionFabrica fabrica = new ConexionFabrica();

		IConexion cx1 = fabrica.getConexion("ORACLE");
		cx1.conectar();
		cx1.desconectar();

		IConexion cx2 = fabrica.getConexion("MYSQL");
		cx2.conectar();
		cx2.desconectar();

		IConexion cx3 = fabrica.getConexion("H2");
		cx3.conectar();
		cx3.desconectar();
	}
}
