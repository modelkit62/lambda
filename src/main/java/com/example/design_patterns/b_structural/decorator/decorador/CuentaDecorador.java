package com.example.design_patterns.b_structural.decorator.decorador;

import com.example.design_patterns.b_structural.decorator.interf.ICuentaBancaria;
import com.example.design_patterns.b_structural.decorator.model.Cuenta;

public abstract class CuentaDecorador implements ICuentaBancaria {

	protected ICuentaBancaria cuentaDecorada;
	
	public CuentaDecorador(ICuentaBancaria cuentaDecorada) {
		this.cuentaDecorada = cuentaDecorada;
	}

	@Override
	public void abrirCuenta(Cuenta c) {
		this.cuentaDecorada.abrirCuenta(c);
	}	
	
}
