package com.headfirstdp.decorator;

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
