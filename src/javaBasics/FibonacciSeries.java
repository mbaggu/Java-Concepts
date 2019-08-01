package javaBasics;

public class FibonacciSeries {

	public static void main(String[] args) {
		
//		Fibonacci Series 0 1 1 2 3 5 8 
		
		int k=0, a=1, b=1;
		System.out.print("1 1 ");
		while(k<=150){
			k=a+b;
			a=b;
			b=k;
			System.out.print(k + " ");
		}
		

	}

}
