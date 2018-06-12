package javaBasics;

public class StaticArray {

	public static void main(String[] args) {
		
		
		int i[]=new int[3];
		
		i[0]=1;
		i[1]=2;
		i[2]=3;
		
		System.out.println(i.length);
		
		System.out.println("********************");
		for (int j=2; j>=0; j--)
		{
			
			System.out.println(i[j]);
		}

	}

}
