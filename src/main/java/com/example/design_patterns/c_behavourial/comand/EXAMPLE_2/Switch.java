package com.example.design_patterns.c_behavourial.comand.EXAMPLE_2;

//invoker
public class Switch {

	public void storeAndExecute(Command command) {
		command.execute();
	}
}
