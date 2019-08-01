package javaBasics;

import java.util.Scanner;

public class PalindromNumber {

	/*
	 * the reverse of the number should be the same Example : 121
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value to check Palindrome: ");
		int n = sc.nextInt();
		int r, s = 0, temp = n;
		while (n > 0) {
			r = n % 10;
			n = n / 10;
			s = s * 10 + r;
		}
		if (temp == s) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}

		sc.close();

	}

}
