package com.headfirstdp.decorator;

import com.headfirstdp.decorator.interfaces.Beverage;
import com.headfirstdp.decorator.interfaces.FlavouredCoffeDecorator;

public class ExtraBeansCoffe extends FlavouredCoffeDecorator {
	Beverage beverage;

	public ExtraBeansCoffe(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + " , extra coffe beans added";
	}

	@Override
	public double cost() {
		return beverage.cost() + 10;
	}
}
