package com.example.design_patterns.a_creational.abstract_factory.EXAMPLE_2;

//AbstractProduct
public abstract class CreditCard {

	protected int cardNumberLength;
	
	protected int cscNumber;

	public int getCardNumberLength() {
		return cardNumberLength;
	}

	public void setCardNumberLength(int cardNumberLength) {
		this.cardNumberLength = cardNumberLength;
	}

	public int getCscNumber() {
		return cscNumber;
	}

	public void setCscNumber(int cscNumber) {
		this.cscNumber = cscNumber;
	}
	
}
