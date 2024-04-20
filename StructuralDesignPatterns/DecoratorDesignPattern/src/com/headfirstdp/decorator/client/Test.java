package com.headfirstdp.decorator.client;

import com.headfirstdp.decorator.ExtraBeansCoffe;
import com.headfirstdp.decorator.ExtraSugarCoffe;
import com.headfirstdp.decorator.Milk;
import com.headfirstdp.decorator.concreteComponent.EspressoCoffe;
import com.headfirstdp.decorator.concreteComponent.HouseBlendCoffe;
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
