package com.adp;

import java.util.HashMap;
import java.util.Map;

// Step-3
public class WeatherAdapter {

	public int findTemprature(int pincode) {
		String city = null;
		Map<Integer, String> map = new HashMap<>();
		map.put(759001, "Dkl");
		map.put(759002, "Cuttack");
		map.put(759003, "BBSR");

		if (pincode == 759001) {
			city = map.get(pincode);
		} else if (pincode == 759002) {
			city = map.get(pincode);
		} else if (pincode == 759003) {
			city = map.get(759003);
		}

		IWeatherFinder wf = new WeatherFinder();
		return wf.getTemprature(city);
	}
}
