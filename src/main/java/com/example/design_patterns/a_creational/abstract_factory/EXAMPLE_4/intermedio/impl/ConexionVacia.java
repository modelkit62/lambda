package com.example.design_patterns.a_creational.abstract_factory.EXAMPLE_4.intermedio.impl;


import com.example.design_patterns.a_creational.abstract_factory.EXAMPLE_4.intermedio.IConexionBD;

public class ConexionVacia implements IConexionBD {

	@Override
	public void conectar() {
		System.out.println("NO SE ESPECIFIC� PROVEEDOR");		
	}

	@Override
	public void desconectar() {
		System.out.println("NO SE ESPECIFIC� PROVEEDOR");		
	}

}
