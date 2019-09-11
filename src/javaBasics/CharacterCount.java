package javaBasics;

import java.util.HashMap;
import java.util.Map;

public class CharacterCount {

	static void characterCount(String inputString) {

		// Hashmap as a key and value
		HashMap<Character, Integer> h1 = new HashMap<Character, Integer>();

		// Converting string to array
		char[] cArray = inputString.toCharArray();

			//checking each char of cArray
		for (char c : cArray) {
			if (h1.containsKey(c)) {
				//If char is present in h1,
				//incrementing it's count by 1
				h1.put(c, h1.get(c) + 1);

			} else {
				h1.put(c, 1);
			}

		}

		for (@SuppressWarnings("rawtypes") Map.Entry entry : h1.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

	public static void main(String[] args) {
		String str = "Manikanta";
		characterCount(str);

	}

}
