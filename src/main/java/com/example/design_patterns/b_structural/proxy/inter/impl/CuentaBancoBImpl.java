package com.example.design_patterns.b_structural.proxy.inter.impl;


import com.example.design_patterns.b_structural.proxy.inter.ICuenta;
import com.example.design_patterns.b_structural.proxy.model.Cuenta;

public class CuentaBancoBImpl implements ICuenta {

	@Override
	public Cuenta retirarDinero(Cuenta cuenta, double monto) {
		double saldoActual = cuenta.getSaldoInicial() - monto;
		cuenta.setSaldoInicial(saldoActual);
		System.out.println("Saldo actual: " + cuenta.getSaldoInicial());
		return cuenta;
	}

	@Override
	public Cuenta depositarDinero(Cuenta cuenta, double monto) {
		double saldoActual = cuenta.getSaldoInicial() + monto + 0.20;
		cuenta.setSaldoInicial(saldoActual);
		System.out.println("Saldo actual: " + cuenta.getSaldoInicial());
		return cuenta;
	}

	@Override
	public void mostrarSaldo(Cuenta cuenta) {
		System.out.println("Saldo actual: " + cuenta.getSaldoInicial());
	}

}
