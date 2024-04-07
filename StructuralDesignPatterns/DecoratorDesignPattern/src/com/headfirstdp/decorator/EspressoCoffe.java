package com.headfirstdp.decorator;

/* Concrete Component */
public class EspressoCoffe extends Beverage {

	public EspressoCoffe() {
		super.setDescription("Espresso Coffe");
	}

	@Override
	public double cost() {
		return 20;
	}

}
