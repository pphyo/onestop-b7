package com.jdc.recap;

public class RecapApp {

	public static void main(String[] args) {
		
		var a = new A();
		var b = new B();
		a.work();
		a = b;
		a.work();		
		b.work();
		
		var app = new RecapApp();
		app.overload(a);
		app.overload(b);
				
	}
	
	void overload(A a) {
		System.out.println("A version");
	}
	
	void overload(B b) {
		System.out.println("B version");
	}

}

class A {
	
	public void work() {
		System.out.println("A works");
	}
	
}

class B extends A {
	
	@Override
	public void work() {
		System.out.println("B works");
	}
	
}










