package javaBasics;

public class Arrays {
	public static void main(String[] args) {

		// One Dimensional Array- static array
		// Size is fixed, data type is fixed
		int i[] = new int[4];
		i[0] = 1;
		i[1] = 2;
		i[2] = 3;
		i[3] = 4;
		// System.out.println(i[3]);
		System.out.println("Length of the Array is " + i.length);
		for (int j = 0; j < i.length; j++) {
			System.out.println(i[j]);
		}

		// Object Array concept -- used to store different data types

		Object ob[] = new Object[5];
		ob[0] = "Tom";
		ob[1] = 23.45;
		ob[2] = "1/1/2009";
		System.out.println(ob[2]);

		int x[][] = new int[2][2];
		x[0][0] = 11;
		x[0][1] = 22;

		x[1][0] = 44;
		x[1][1] = 55;

		System.out.println(x[1][1]);
		
		for (int row=0; row<x.length; row++)
		{
			for(int col=0; col<x[0].length; col++)
			{
				System.out.println(x[row][col]);
			}
		}

	}

}
