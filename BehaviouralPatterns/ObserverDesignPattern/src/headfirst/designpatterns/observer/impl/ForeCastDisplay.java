package headfirst.designpatterns.observer.impl;

import headfirst.designpatterns.observer.interfaces.DisplayElement;
import headfirst.designpatterns.observer.interfaces.Observer;
import headfirst.designpatterns.observer.interfaces.Subject;

public class ForeCastDisplay implements Observer, DisplayElement {
	private float temperature;
	private float pressure;

	private Subject weatherData;

	public ForeCastDisplay(Subject wd) {
		this.weatherData = wd;
		weatherData.registerObserver(this);
	}

	@Override
	public void update(float temperature, float pressure) {
		this.temperature = temperature;
		this.pressure = pressure;

		display();
	}

	@Override
	public void display() {
		System.out.println("Current Condition Display. temp: " + temperature + 2+ " , pressure: " + pressure + 5);
	}

}
