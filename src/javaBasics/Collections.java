package javaBasics;

import java.util.TreeSet;

public class Collections {

	public static void main(String[] args) {
		//ArrayList<Integer> ar = new ArrayList<Integer>();
		TreeSet<Integer> ar=new TreeSet<Integer>();
		
		ar.add(56);
		ar.add(2);
		ar.add(100);
		ar.add(78);
			for (int i : ar) {
			System.out.println(i);
		}

	}

}
