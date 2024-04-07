package com.headfirstdp.decorator;

public class Test {
	public static void main(String[] args) {
		Beverage beverage = new EspressoCoffe();
		System.out.println(beverage.cost());

		System.out.println("Decorate House Bleand with Milk: " + new Milk(new HouseBlendCoffe()).cost());
		System.out.println("Decorate Espresso with Extra Beans and extra sugar: "
				+ new ExtraSugarCoffe(new ExtraBeansCoffe(new EspressoCoffe())).cost());

	}
}
