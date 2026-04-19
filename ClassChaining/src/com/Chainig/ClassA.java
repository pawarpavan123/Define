package com.Chainig;

public class ClassA {
	public void M1() {
		System.out.println("M1----A");
		 ClassB classB = new ClassB();
		 classB.M1();
		 classB.M2();
	}
	public void M2() {
		System.out.println("M2----A");
		
	}

}
