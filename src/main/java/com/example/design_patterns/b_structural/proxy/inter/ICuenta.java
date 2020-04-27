package com.example.design_patterns.b_structural.proxy.inter;

import com.example.design_patterns.b_structural.proxy.model.Cuenta;

public interface ICuenta {

	Cuenta retirarDinero(Cuenta cuenta, double monto);
	Cuenta depositarDinero(Cuenta cuenta, double monto);
	void mostrarSaldo(Cuenta cuenta);
}
