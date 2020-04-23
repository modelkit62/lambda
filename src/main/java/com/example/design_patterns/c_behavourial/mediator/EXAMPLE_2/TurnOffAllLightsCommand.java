package com.example.design_patterns.c_behavourial.mediator.EXAMPLE_2;

//concrete command
public class TurnOffAllLightsCommand implements Command {

	private Mediator med;
	
	public TurnOffAllLightsCommand(Mediator med) {
		this.med = med;
	}
	
	@Override
	public void execute() {
		med.turnOffAllLights();
	}
}