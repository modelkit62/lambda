package com.example.design_patterns.a_creational.factory.EXAMPLE_3.intermedio.impl;

import com.example.design_patterns.a_creational.factory.EXAMPLE_3.intermedio.IConexion;

public class ConexionMySQL implements IConexion {

	private String host;
	private String puerto;
	private String usuario;
	private String contrasena;

	public ConexionMySQL() {
		this.host = "localhost";
		this.puerto = "3306";
		this.usuario = "root";
		this.contrasena = "123";
	}

	@Override
	public void conectar() {
		// Aqui puede ir c�digo JDBC
		System.out.println("Se conect� a MySQL");

	}

	@Override
	public void desconectar() {
		System.out.println("Se desconect� de MySQL");
	}

	@Override
	public String toString() {
		return "ConexionMySQL [host=" + host + ", puerto=" + puerto + ", usuario=" + usuario + ", contrasena="
				+ contrasena + "]";
	}
}
