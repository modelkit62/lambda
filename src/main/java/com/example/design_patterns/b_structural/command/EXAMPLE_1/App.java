package com.example.design_patterns.b_structural.command.EXAMPLE_1;


import com.example.design_patterns.b_structural.command.EXAMPLE_1.commands.Cuenta;
import com.example.design_patterns.b_structural.command.EXAMPLE_1.commands.DepositarImpl;
import com.example.design_patterns.b_structural.command.EXAMPLE_1.commands.Invoker;
import com.example.design_patterns.b_structural.command.EXAMPLE_1.commands.RetirarImpl;

public class App {

	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta(1, 200);

		DepositarImpl opDepositar = new DepositarImpl(cuenta, 100);
		RetirarImpl opRetirar = new RetirarImpl(cuenta, 50);

		Invoker ivk = new Invoker();
		ivk.recibirOperacion(opDepositar);
		ivk.recibirOperacion(opRetirar);
		
		ivk.realizarOperaciones();
	}

}
