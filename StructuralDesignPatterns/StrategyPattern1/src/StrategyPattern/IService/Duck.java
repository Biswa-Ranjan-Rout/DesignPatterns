package StrategyPattern.IService;

/*
 Strategy D.P:
 -------------
	Strategy D.P defines family of algorithms, encapsulates each one, and makes them
	interchangeable. Strategy lets the algorithm vary independently from
	clients that use it.
 */
public abstract class Duck {

	private FlyingBehaviour flyBehaviour;
	private QuackingBehaviour quackBehaviour;

	public void performFly() {
		flyBehaviour.fly();
	}

	public void performQuack() {
		quackBehaviour.quack();
	}

	abstract public void display();

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
