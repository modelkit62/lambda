package com.example.design_patterns.c_behavourial.strategy.EXAMPLE_2;

public class AmexStrategy extends ValidationStrategy {

	@Override
	public boolean isValid(CreditCard creditCard) {
		boolean isValid = true;
		
		isValid = creditCard.getNumber().startsWith("37") ||
				creditCard.getNumber().startsWith("34");
		
		if(isValid) {
			isValid = creditCard.getNumber().length() == 15;
		}
		
		if(isValid) {
			isValid = passesLuhn(creditCard.getNumber());
		}
		
		return isValid;
	}

}
