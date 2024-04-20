package com.cp.string;
import java.util.HashMap;
import java.util.Map;

public class CountingDuplicateCharacters {
	public static void main(String[] args) {
		String str = "Hello, World!";
		Map<Character, Integer> frequencyMap = new HashMap<>();
		str = str.toLowerCase();
		char[] chArr = str.toCharArray();

		for (char ch : chArr) {
			frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
		}
		System.out.println(frequencyMap);
	}
}
