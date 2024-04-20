package com.headfirstdp.decorator.concreteComponent;

import com.headfirstdp.decorator.interfaces.Beverage;

/* Concrete Component */
public class HouseBlendCoffe extends Beverage{
	
	public HouseBlendCoffe() {
		super.setDescription("House Blend Coffe");
	}

	@Override
	public double cost() {
		return 10;
	}

}
