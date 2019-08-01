package javaBasics;

public class ConstructorConcept {
	// class var declared
	String name;
	int age;

	public ConstructorConcept() {

		System.out.println("Default Constructor");
	}

	// Constructor can be overloaded
	public ConstructorConcept(int i) {

		System.out.println("1 param constructor");
	}

	public ConstructorConcept(String name, int age) {

		this.name = name; // this.classvar= localvar
		this.age = age;
	}

	public static void main(String[] args) {

		ConstructorConcept obj = new ConstructorConcept();
		ConstructorConcept obj1 = new ConstructorConcept(10);
		ConstructorConcept obj2 = new ConstructorConcept("TOM", 35);

		System.out.println(obj2.name);
	}

}
