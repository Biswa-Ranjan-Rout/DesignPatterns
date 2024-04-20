package StrategyPattern.types;

import StrategyPattern.IService.Duck;
import StrategyPattern.serviceImpl.flyAlgoFamily.FlyNoFly;
import StrategyPattern.serviceImpl.quackAlgoFamily.MuteQuack;

public class WoodenDuck extends Duck {

	// constructor is not required when we use setter in Duck class to set the
	// runtime object
	public WoodenDuck() {
		// flyBehaviour = new FlyNoFly();	
		// quackBehaviour = new MuteQuack();
	}

	@Override
	public void display() {
		System.out.println("I'm a Wooden Duck");
	}

	

}
