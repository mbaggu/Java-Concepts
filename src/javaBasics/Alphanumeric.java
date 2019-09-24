package javaBasics;

public class Alphanumeric {

	public static void main(String[] args) {
		int total = calcSum("aksdjf4kasjdf8kajsdf9aksf0");
		System.out.println(total);
	}

	public static int calcSum(String str) {
		int i, num = 0, sum = 0;
		char[] ch = str.toCharArray();
		for (i = 0; i < ch.length; i++) {
			if (Character.isDigit(ch[i])) {
				num = num * 10 + Character.getNumericValue(ch[i]);
			} else {
				sum += num;
				num = 0;
			}
		}
		return sum;

	}

}
