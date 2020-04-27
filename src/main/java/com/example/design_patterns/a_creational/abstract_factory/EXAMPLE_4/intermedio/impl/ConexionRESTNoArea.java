package com.example.design_patterns.a_creational.abstract_factory.EXAMPLE_4.intermedio.impl;


import com.example.design_patterns.a_creational.abstract_factory.EXAMPLE_4.intermedio.IConexionREST;

public class ConexionRESTNoArea implements IConexionREST {

	@Override
	public void leerURL(String url) {
		System.out.println("AREA NO ELEGIDA");
	}

}
