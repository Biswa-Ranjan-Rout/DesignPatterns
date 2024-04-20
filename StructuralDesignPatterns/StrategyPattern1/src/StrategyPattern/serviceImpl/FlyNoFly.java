package StrategyPattern.serviceImpl;

import StrategyPattern.IService.FlyingBehaviour;

public class FlyNoFly implements FlyingBehaviour {

	@Override
	public void fly() {
		System.out.println("I can't fly..");
	}

}
