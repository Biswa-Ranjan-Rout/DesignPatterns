package StrategyPattern.serviceImpl.flyAlgoFamily;

import StrategyPattern.IService.FlyingBehaviour;

public class FlyWithWings implements FlyingBehaviour{

	@Override
	public void fly() {
		System.out.println("I'm Flying Using my wings..");
	}

}
