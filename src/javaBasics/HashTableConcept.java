package javaBasics;

import java.util.Hashtable;

public class HashTableConcept {

	public static void main(String[] args) {
		
		Hashtable<String, String> h= new Hashtable<String, String>();
		h.put("A", "test");
		h.put("B", "MyName");
		h.put("C", "World");
		
		System.out.println(h.size());
		
		Hashtable<Integer, Integer> hi = new Hashtable<Integer, Integer>();
		hi.put(1, 100);
		hi.put(2, 200);
		System.out.println(hi.get(1));
		
	}

}
