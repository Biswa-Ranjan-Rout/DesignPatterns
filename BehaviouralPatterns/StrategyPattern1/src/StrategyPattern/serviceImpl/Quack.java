package StrategyPattern.serviceImpl;

import StrategyPattern.IService.QuackingBehaviour;

public class Quack implements QuackingBehaviour{

	@Override
	public void quack() {
		System.out.println("Quack Quack");		
	}

}
