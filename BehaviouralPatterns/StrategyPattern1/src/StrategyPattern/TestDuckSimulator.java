package StrategyPattern;

import StrategyPattern.serviceImpl.FlyRocketPowered;
import StrategyPattern.types.Duck;
import StrategyPattern.types.MallardDuck;
import StrategyPattern.types.RubberDuck;

public class TestDuckSimulator {
	public static void main(String[] args) {
		System.out.println("---------MallardDuck---------");
		Duck mallardDuck = new MallardDuck();
		mallardDuck.performFly();
		mallardDuck.performQuack();
		
		System.out.println("---------RubberDuck---------");
		
		Duck rubberDuck = new RubberDuck();
		rubberDuck.performFly();
		rubberDuck.performQuack();
		
		System.out.println("---------Dynamic MallardDuck FlyRocketPowered---------");
		
		Duck mDuck = new MallardDuck();
		mDuck.performFly();
		mDuck.setFlyBehaviour(new FlyRocketPowered()); // Dynamically changing FlyingBehaviour
		mDuck.performFly();
		
	}
}
