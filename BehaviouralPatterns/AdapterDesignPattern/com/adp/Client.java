package com.adp;

// Step-4
public class Client {
	
	private static void showTemprature(int pin) {
		WeatherAdapter adapter = new WeatherAdapter();
		int temp = adapter.findTemprature(pin);
		System.out.println("Temprature: " + temp);
	}

	public static void main(String[] args) {
		showTemprature(759001);
	}
}
