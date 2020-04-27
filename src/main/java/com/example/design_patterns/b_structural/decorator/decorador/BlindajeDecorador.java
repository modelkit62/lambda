package com.example.design_patterns.b_structural.decorator.decorador;

import com.example.design_patterns.b_structural.decorator.interf.ICuentaBancaria;
import com.example.design_patterns.b_structural.decorator.model.Cuenta;

public class BlindajeDecorador extends CuentaDecorador {

	public BlindajeDecorador(ICuentaBancaria cuentaDecorada) {
		super(cuentaDecorada);
	}

	@Override
	public void abrirCuenta(Cuenta c) {
		cuentaDecorada.abrirCuenta(c);

		// aqui le anade la funcionalidad extra!!!
		agregarBlindaje(c);
	}

	public void agregarBlindaje(Cuenta c) {		
		System.out.println("Se agreg� blindaje a la cuenta del cliente " + c.getCliente());
	}

}
