package javaBasics;

import java.util.Scanner;

public class AmstrongNumber {

	/*
	 * Amstrong number is = 153 1*1*1 + 5*5*5 + 3*3*3 should give the same value
	 * *
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value to verify: ");
		int n = sc.nextInt();
		int temp = n;
		int r, sum = 0;

		while (n > 0) {
			r = n % 10;
			n = n / 10;
			sum = sum + r * r * r;
		}

		if (temp == sum)
			System.out.println("Amstrong Number");
		else
			System.out.println("Not Amstrong Number");
		sc.close();
	}
}
