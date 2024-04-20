package StrategyPattern.serviceImpl.quackAlgoFamily;

import StrategyPattern.IService.QuackingBehaviour;

public class Squeak implements QuackingBehaviour {

	@Override
	public void quack() {
		System.out.println("Squeak..");
	}

}