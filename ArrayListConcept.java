package javaBasics;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {

		// Arraylist is used to build an empty array list , no need to fix a
		// size like Array
		// ArrayList inherits AbstractList class and implements List interface.

		ArrayList<Integer> ar = new ArrayList<Integer>();

		ar.add(10);
		ar.add(20);

		System.out.println(ar.get(0));

		ArrayList<String> as = new ArrayList<String>();

		as.add("Mani");
		System.out.println(as.size());

	}

}
