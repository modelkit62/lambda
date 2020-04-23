package com.example.design_patterns.c_behavourial.comand.EXAMPLE_2;

import java.util.List;

public class AllLightsCommand implements Command {

	private List<Light> lights;
	
	public AllLightsCommand(List<Light> lights) {
		this.lights = lights;
	}
	
	@Override
	public void execute() {
		for (Light light : lights) {
			if(light.isOn()) {
				light.toggle();
			}
		}
	}

}
