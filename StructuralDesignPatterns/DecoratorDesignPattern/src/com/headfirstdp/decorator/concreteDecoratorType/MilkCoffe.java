package com.headfirstdp.decorator.concreteDecoratorType;

import com.headfirstdp.decorator.interfaces.Beverage;
import com.headfirstdp.decorator.interfaces.FlavouredCoffeDecorator;

/* Milk is a decorator, so it's extending FlavouredDecorator */ 
public class MilkCoffe extends FlavouredCoffeDecorator{

	Beverage beverage;
	
	public MilkCoffe(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Milk";
	}

	@Override
	public double cost() {
		
		return beverage.cost() + 5;
	}

}