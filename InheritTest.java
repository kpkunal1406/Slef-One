package com.general;

public class InheritTest {

	public static void main(String... strings) {

//		Parent p = new Parent();
//		Parent c = (Parent) p;
//		c.doSomething();
//
//		Parent p1 = new Parent();
//		Child c1 = (Child) p1;
//		c1.doSomething();

		String s = "Hello";
		String sq = new String("Hello");
		
		System.out.println(s.equals(sq));

		System.out.println(s==sq);
	}

}

class Parent {

	void doSomething() {
		System.out.println("IN Parent");
	}
}

class Child extends Parent {
	void doSomething() {
		System.out.println("IN Child");
	}
}
