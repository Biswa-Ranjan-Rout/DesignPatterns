package com.adp;

public class Client {
	public static void main(String[] args) {
		showTemprature(759001);
	}

	private static void showTemprature(int pin) {
		WeatherAdapter adapter = new WeatherAdapter();
		int temp = adapter.findTemprature(pin);
		System.out.println("Temprature: " + temp);
	}
}
