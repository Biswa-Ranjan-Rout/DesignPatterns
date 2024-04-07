package com.adp;

public class WeatherFinder implements IWeatherFinder {

	@Override
	public int getTemprature(String cityName) {
		if (cityName.equals("Dkl")) {
			return 37;
		} else if (cityName.equals("Cuttack")) {
			return 38;
		} else {
			return 40;
		}
	}

}
