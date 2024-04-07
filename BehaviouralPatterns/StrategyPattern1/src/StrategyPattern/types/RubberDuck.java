package StrategyPattern.types;

import StrategyPattern.serviceImpl.FlyNoFly;
import StrategyPattern.serviceImpl.Squeak;

public class RubberDuck extends Duck {

	// constructor is not required when we use setter in Duck class to set the
	// runtime object
	public RubberDuck() {
		flyBehaviour = new FlyNoFly();
		quackBehaviour = new Squeak();
	}

	@Override
	void display() {
		System.out.println("I'm a real Mallard Duck");
	}
}
