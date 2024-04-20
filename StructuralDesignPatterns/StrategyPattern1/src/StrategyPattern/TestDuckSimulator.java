package StrategyPattern;

import StrategyPattern.IService.Duck;
import StrategyPattern.serviceImpl.flyAlgoFamily.FlyNoFly;
import StrategyPattern.serviceImpl.flyAlgoFamily.FlyRocketPowered;
import StrategyPattern.serviceImpl.quackAlgoFamily.Quack;
import StrategyPattern.serviceImpl.quackAlgoFamily.Squeak;
import StrategyPattern.types.MallardDuck;
import StrategyPattern.types.RubberDuck;

public class TestDuckSimulator {
	public static void main(String[] args) {
		// System.out.println("---------MallardDuck---------");
		// Duck mallardDuck = new MallardDuck();
		// mallardDuck.performFly();
		// mallardDuck.performQuack();
		
		System.out.println("---------RubberDuck---------");
		
		Duck rubberDuck = new RubberDuck();
		rubberDuck.setFlyBehaviour(new FlyNoFly());
		rubberDuck.setQuackBehaviour(new Squeak());
		rubberDuck.performFly();
		rubberDuck.performQuack();
		
		System.out.println("---------Dynamic MallardDuck FlyRocketPowered---------");
		
		Duck mDuck = new MallardDuck();
		mDuck.setFlyBehaviour(new FlyRocketPowered()); // Dynamically changing FlyingBehaviour
		mDuck.setQuackBehaviour(new Quack());
		mDuck.performFly();
		mDuck.performQuack();
		
	}
}
