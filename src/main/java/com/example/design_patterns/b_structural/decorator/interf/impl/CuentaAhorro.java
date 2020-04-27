package com.example.design_patterns.b_structural.decorator.interf.impl;


import com.example.design_patterns.b_structural.decorator.interf.ICuentaBancaria;
import com.example.design_patterns.b_structural.decorator.model.Cuenta;

public class CuentaAhorro implements ICuentaBancaria {

	@Override
	public void abrirCuenta(Cuenta c) {
		System.out.println("-------------------------");
		System.out.println("Se abri� una cuenta de Ahorros");
		System.out.println("Cliente: " + c.getCliente());		
	}

}
