package StrategyPattern.types;

import StrategyPattern.IService.Duck;
import StrategyPattern.serviceImpl.flyAlgoFamily.FlyWithWings;
import StrategyPattern.serviceImpl.quackAlgoFamily.Quack;

public class MallardDuck extends Duck {

	// constructor is not required when we use setter in Duck class to set the
	// runtime object
	public MallardDuck() {
		// flyBehaviour = new FlyWithWings();
		// quackBehaviour = new Quack();
	}

	@Override
	public void display() {
		System.out.println("I'm a real Mallard Duck");
	}

}
