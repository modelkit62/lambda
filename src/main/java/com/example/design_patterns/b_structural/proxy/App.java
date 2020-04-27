package com.example.design_patterns.b_structural.proxy;


import com.example.design_patterns.b_structural.proxy.inter.ICuenta;
import com.example.design_patterns.b_structural.proxy.inter.impl.CuentaBancoBImpl;
import com.example.design_patterns.b_structural.proxy.model.Cuenta;
import com.example.design_patterns.b_structural.proxy.proxy.CuentaProxy;

/* Tener un envoltorio para el objeto real o final que quiero manipular */
public class App {

	public static void main(String[] args) {
		Cuenta c = new Cuenta(1, "mitocode", 100);
		
		ICuenta cuentaProxy = new CuentaProxy(new CuentaBancoBImpl());
		cuentaProxy.mostrarSaldo(c);
		c = cuentaProxy.depositarDinero(c, 50);
		c = cuentaProxy.retirarDinero(c, 20);
		cuentaProxy.mostrarSaldo(c);
		
	}

}
