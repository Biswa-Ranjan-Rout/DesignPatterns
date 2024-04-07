package StrategyPattern.serviceImpl;

import StrategyPattern.IService.FlyingBehaviour;

public class FlyRocketPowered implements FlyingBehaviour{

	@Override
	public void fly() {
		System.out.println("Flying with ROcket Enginee");
	}

}
