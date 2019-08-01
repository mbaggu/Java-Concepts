package javaBasics;

public class PerfectNumber {
	/*
	 * Perfect Number 28 == Factorial are 1,2,4,7,14 Add all factorial should
	 * return same number
	 */

	public static void main(String[] args) {
		int n = 28;
		boolean b = isPerfect(n);
		if (b)
			System.out.println("Perfect Number");
		else
			System.out.println("Not Perfect Number");

	}

	public static boolean isPerfect(int n) {

		int temp = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 0)
				temp = temp + i;
		}
		if (n == temp)
			return true;
		return false;
	}

}
