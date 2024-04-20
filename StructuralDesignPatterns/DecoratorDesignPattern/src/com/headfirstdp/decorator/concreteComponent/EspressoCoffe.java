package com.headfirstdp.decorator.concreteComponent;

import com.headfirstdp.decorator.interfaces.Beverage;

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
