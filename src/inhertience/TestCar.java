package inhertience;

public class TestCar {

	public static void main(String[] args) {
		// polymorphism concept-- one to many
		BMW b = new BMW();
		b.start();
		b.stop();
		b.theftstop();
		System.out.println("****************");

		Car c = new Car();
		c.start();
		c.stop();
		System.out.println("****************");

		Car c1 = new BMW(); // Run time polymorphism or Top Casting
		c1.start();
		c1.stop();
		System.out.println("****************");

		// Down casting

		BMW b1 = (BMW) new Car();
		System.out.println("****************");
	}
}
