package oopsConcept;

public class Car {

	int mod;
	int wheel;

	public static void main(String[] args) {

		Car a = new Car(); // new Car is the object here
		// 'a' is the reference of that object;
		Car b = new Car();
		Car c = new Car();

		a.mod = 2010;
		b.mod = 2018;
		c.mod = 2020;

		a.wheel = 4;
		b.wheel = 4;
		c.wheel = 3;

		System.out.println(a.mod);
		System.out.println(b.wheel);

		System.out.println("shifting of obj references");

		a = b;
		b = c;
		c = a;

		a.mod = 10;
		System.out.println(a.mod);
		c.mod = 20;
		System.out.println(a.mod);
	}

}
