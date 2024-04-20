package headfirst.designpatterns.observer.client;

import headfirst.designpatterns.observer.impl.CurrentConditionsDisplay;
import headfirst.designpatterns.observer.impl.ForeCastDisplay;
import headfirst.designpatterns.observer.interfaces.Observer;
import headfirst.designpatterns.observer.subject.impl.WeatherData;

public class Test {
	public static void main(String[] args) {
		WeatherData wd = new WeatherData();
		Observer observer1 = new CurrentConditionsDisplay(wd);
		ForeCastDisplay fcd = new ForeCastDisplay(wd);

		wd.setMeasurements(26, 21);

	}
}
