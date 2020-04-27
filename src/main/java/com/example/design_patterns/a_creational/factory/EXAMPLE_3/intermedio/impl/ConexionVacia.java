package com.example.design_patterns.a_creational.factory.EXAMPLE_3.intermedio.impl;

import com.example.design_patterns.a_creational.factory.EXAMPLE_3.intermedio.IConexion;

public class ConexionVacia implements IConexion{

	@Override
	public void conectar() {
		System.out.println("NO SE ESPECIFIC� PROVEEDOR");		
	}

	@Override
	public void desconectar() {
		System.out.println("NO SE ESPECIFIC� PROVEEDOR");		
	}

}
