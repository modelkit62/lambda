package com.example.design_patterns.b_structural.bridge.EXAMPLE_2;

import java.util.List;

public abstract class Printer {

	public String print(Formatter formatter) {
		return formatter.format(getHeader(), getDetails());
	}
	
	abstract protected List<Detail> getDetails();
	
	abstract protected String getHeader();
}
