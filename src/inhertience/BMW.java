package inhertience;

public class BMW extends Car {

	public void start() {

		System.out.println("BMW----Start"); // method overriding-- here child
											// class will be preferred over
											// parent class, same no of arguments
	}

	public void theftstop() {

		System.out.println("BMW----theftstop");
	}

}
