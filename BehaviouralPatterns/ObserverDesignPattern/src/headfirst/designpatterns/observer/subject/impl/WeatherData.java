package headfirst.designpatterns.observer.subject.impl;

import java.util.ArrayList;
import java.util.List;

import headfirst.designpatterns.observer.interfaces.Observer;
import headfirst.designpatterns.observer.interfaces.Subject;

public class WeatherData implements Subject {

	private float temp;
	private float pressure;

	private List<Observer> observers;

	public WeatherData() {
		observers = new ArrayList<>();
	}

	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		observers.remove(o);
	}

	@Override
	public void notifyObservers() {
		for (Observer o : observers) {
			o.update(temp, pressure);
		}
	}

	public void setMeasurements(float temp, float pressure) {
		this.temp = temp;
		this.pressure = pressure;
		notifyObservers();
	}

}
