package oopsConcept;

public class Functions {

	public static void main(String[] args) {

		Functions f = new Functions();
		f.test();
		int l = f.test1();
		System.out.println(l);
	}

	// non static methods concept
	// Object creation is must to call the non static methods	

	public void test() {
		// void doesn't return any value
		System.out.println("Test method");

	}

	public int test1() {

		System.out.println("test1 method");
		int a = 10;
		int b = 20;
		int c = a + b;
		return c;
	}
}
