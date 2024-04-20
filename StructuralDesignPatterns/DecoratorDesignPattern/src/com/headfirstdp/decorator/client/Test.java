package com.headfirstdp.decorator.client;

import com.headfirstdp.decorator.concreteBaseType.EspressoCoffe;
import com.headfirstdp.decorator.concreteBaseType.HouseBlendCoffe;
import com.headfirstdp.decorator.concreteDecoratorType.ExtraBeansCoffe;
import com.headfirstdp.decorator.concreteDecoratorType.ExtraSugarCoffe;
import com.headfirstdp.decorator.concreteDecoratorType.Milk;
import com.headfirstdp.decorator.interfaces.Beverage;

public class Test {
	public static void main(String[] args) {
		Beverage beverage = new EspressoCoffe();
		System.out.println(beverage.cost());

		System.out.println("Decorate House Bleand with Milk: " + new Milk(new HouseBlendCoffe()).cost());
		System.out.println("Decorate Espresso with Extra Beans and extra sugar: "
				+ new ExtraSugarCoffe(new ExtraBeansCoffe(new EspressoCoffe())).cost());

	}
}
