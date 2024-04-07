package com.headfirstdp.decorator;

/* ExtraSugarCoffe is a decorator, so it's extending FlavouredDecorator */ 
public class ExtraSugarCoffe extends FlavouredCoffeDecorator {
	Beverage beverage;

	public ExtraSugarCoffe(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Extra Sugar";
	}

	public double cost() {
		return beverage.cost() + 3;
	}
}
