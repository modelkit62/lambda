package com.example.design_patterns.b_structural.decorator;


import com.example.design_patterns.b_structural.decorator.decorador.BlindajeDecorador;
import com.example.design_patterns.b_structural.decorator.interf.ICuentaBancaria;
import com.example.design_patterns.b_structural.decorator.interf.impl.CuentaAhorro;
import com.example.design_patterns.b_structural.decorator.model.Cuenta;

/* clase abierta para la extension de funcionalidades extras OPCIONALES a traves de un intermediario */
public class App {

	public static void main(String[] args) {
		Cuenta c = new Cuenta(1, "MitoCode");
		
		ICuentaBancaria cuenta = new CuentaAhorro();
		ICuentaBancaria cuentaBlindada = new BlindajeDecorador(cuenta);
		
		//cuenta.abrirCuenta(c);
		cuentaBlindada.abrirCuenta(c);
	}

}
