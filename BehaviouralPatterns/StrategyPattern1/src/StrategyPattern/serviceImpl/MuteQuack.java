package StrategyPattern.serviceImpl;

import StrategyPattern.IService.QuackingBehaviour;

public class MuteQuack implements QuackingBehaviour{

	@Override
	public void quack() {
		System.out.println("Silence..");
	}

}
