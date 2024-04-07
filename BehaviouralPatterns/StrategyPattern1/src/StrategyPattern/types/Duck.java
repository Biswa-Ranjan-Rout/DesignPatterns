package StrategyPattern.types;

import StrategyPattern.IService.FlyingBehaviour;
import StrategyPattern.IService.QuackingBehaviour;

public abstract class Duck {
	FlyingBehaviour flyBehaviour;
	QuackingBehaviour quackBehaviour;

	public void performFly() {
		flyBehaviour.fly();
	}

	public void performQuack() {
		quackBehaviour.quack();
	}

	abstract void display();

	public void swim() {
		System.out.println("All docks can swim");
	}

	public void setFlyBehaviour(FlyingBehaviour flyBehaviour) {
		this.flyBehaviour = flyBehaviour;
	}

	public void setQuackBehaviour(QuackingBehaviour quackBehaviour) {
		this.quackBehaviour = quackBehaviour;
	}
	
}
