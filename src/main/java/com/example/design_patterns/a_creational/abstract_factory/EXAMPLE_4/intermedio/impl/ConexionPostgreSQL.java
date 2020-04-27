package com.example.design_patterns.a_creational.abstract_factory.EXAMPLE_4.intermedio.impl;

import com.example.design_patterns.a_creational.abstract_factory.EXAMPLE_4.intermedio.IConexionBD;

public class ConexionPostgreSQL implements IConexionBD {

	private String host;
	private String puerto;
	private String usuario;
	private String contrasena;

	public ConexionPostgreSQL() {
		this.host = "localhost";
		this.puerto = "5433";
		this.usuario = "postgres";
		this.contrasena = "123";
	}

	@Override
	public void conectar() {
		// Aqui puede ir c�digo JDBC
		System.out.println("Se conect� a PostgreSQL");

	}

	@Override
	public void desconectar() {
		System.out.println("Se desconect� de PostgreSQL");
	}

	@Override
	public String toString() {
		return "ConexionPostgreSQL [host=" + host + ", puerto=" + puerto + ", usuario=" + usuario + ", contrasena="
				+ contrasena + "]";
	}

}
