package StrategyPattern.types;

import StrategyPattern.IService.Duck;
import StrategyPattern.serviceImpl.flyAlgoFamily.FlyNoFly;
import StrategyPattern.serviceImpl.quackAlgoFamily.Squeak;

public class RubberDuck extends Duck {

	// constructor is not required when we use setter in Duck class to set the
	// runtime object
	public RubberDuck() {
		// flyBehaviour = new FlyNoFly();
		// quackBehaviour = new Squeak();
	}

	@Override
	public void display() {
		System.out.println("I'm a real Mallard Duck");
	}
}
