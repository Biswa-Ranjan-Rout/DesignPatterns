package StrategyPattern.types;

import StrategyPattern.serviceImpl.FlyWithWings;
import StrategyPattern.serviceImpl.Quack;

public class MallardDuck extends Duck {

	// constructor is not required when we use setter in Duck class to set the
	// runtime object
	public MallardDuck() {
		flyBehaviour = new FlyWithWings();
		quackBehaviour = new Quack();
	}

	@Override
	void display() {
		System.out.println("I'm a real Mallard Duck");
	}

}
